package kg.nazi_4580.models;

import javax.validation.constraints.*;

public class Book {
    private int id;
    @NotEmpty(message = "Название книги не должно быть пустным")
    @Size(min = 2, max = 100, message = "Название книги должно быть от 2 до 100")
    private String title;
    @NotEmpty(message = "Имя автора книги не должно быть пустым")
    @Size(min = 2, max = 100, message = "Имя автора книги должно быть в пределах от 2 до 100")
    @Pattern(regexp = "[А-Я][а-я]+ [А-Я][а-я]+", message = "Имя автора книги должно иметь такую форму: Амантурова Назари")
    private String author;
    @Min(value = 1500, message = "Год выхода книги выше 1500")
    @Max(value = 2025, message = "Год вызода книги не выше 2025")
    private int year;



    public Book() {

    }

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
