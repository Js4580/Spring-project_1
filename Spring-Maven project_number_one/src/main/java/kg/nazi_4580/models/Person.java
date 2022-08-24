package kg.nazi_4580.models;

import javax.validation.constraints.*;

public class Person {
    private int id;
    @NotEmpty(message = "Ваше имя не должно быть пустным")
    @Size(min = 2, max = 100, message = "Ваше имя должно быть в пределах от 2 до 100")
    @Pattern(regexp = "[А-Я][а-я]+ [А-Я][а-я]+ [А-Я][а-я]+", message = "Ваше имя должно быть примерно такого шаблона, который описан тут: Амантурова Назар Алымбекович")
    private String full_name;
    @Min(value = 1900, message = "Год вашего рождения выше 1900")
    @Max(value = 2030, message = "Год вышего рождения не выше 2030")
    private int year_of_birth;

    public Person() {

    }

    public Person(String full_name, int year_of_birth) {
        this.full_name = full_name;
        this.year_of_birth = year_of_birth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public int getYear_of_birth() {
        return year_of_birth;
    }

    public void setYear_of_birth(int year_of_birth) {
        this.year_of_birth = year_of_birth;
    }
}
