package homework_library;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class Book {

    @Getter
    private String name;
    @Getter
    private int year;
    @Getter
    private Author author;
    @Getter
    private double price;



}
