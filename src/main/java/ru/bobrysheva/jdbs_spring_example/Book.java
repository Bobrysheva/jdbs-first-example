package ru.bobrysheva.jdbs_spring_example;

public class Book {
    private Long id;
    private String name;
    public Book (Long id, String name) {
        this.id = id;
        this.name = name;
    }
    public Book () {
    }

    public Long getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public void setId (Long id) {
        this.id = id;
    }
    public void setName (String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Book{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
