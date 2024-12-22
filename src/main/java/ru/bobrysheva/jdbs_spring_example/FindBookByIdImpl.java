package ru.bobrysheva.jdbs_spring_example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Repository
public class FindBookByIdImpl implements FindBookById {
    @Autowired
    private final DataSource dataSource1;

    public FindBookByIdImpl(DataSource dataSource) {
        this.dataSource1 = dataSource;
    }

    @Override
    public String foundBooks(Long id) {
        String foundBooks;
        String SQL_findBookById = "select * from books where id = " + id;
        try (Connection connection = dataSource1.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet1 = statement.executeQuery(SQL_findBookById)) {
             Book book = convertRowToBook1(resultSet1);
             foundBooks = String.valueOf(book);
        } catch (SQLException e) {
            throw new IllegalStateException(e);
        }
        return foundBooks;
    }
    private Book convertRowToBook1(ResultSet resultSet1) throws SQLException {
        Long id = resultSet1.getLong("id");
        String name = resultSet1.getString("name");
        return new Book(id, name);
    }
}