package Tamchack.tamchack.entity.book;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    @Id
    private int id;

    private String name;

    private String author;

    private String publisher;

    private String content;

    private String imagePath;

    private boolean bestseller;

    private boolean report;

}
