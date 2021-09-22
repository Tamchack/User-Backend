package Tamchack.tamchack.exception;

import Tamchack.tamchack.error.BaseException;
import Tamchack.tamchack.error.ErrorCode;

public class BookNotFoundException extends BaseException {
    public BookNotFoundException() {
        super(ErrorCode.BOOK_NOT_FOUND);
    }
}
