package Tamchack.tamchack.entity.store;

import Tamchack.tamchack.entity.book.Book;
import Tamchack.tamchack.entity.member.User;
import lombok.Builder;

import java.io.Serializable;

@Builder
public class BookmarkKey implements Serializable {

    private Book book;

    private User user;

}
