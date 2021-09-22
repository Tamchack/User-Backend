package Tamchack.tamchack.exception;

import Tamchack.tamchack.error.BaseException;
import Tamchack.tamchack.error.ErrorCode;

public class BookAlreadyExistsException extends BaseException {
    public BookAlreadyExistsException() {
        super(ErrorCode.BOOK_ALREADY_EXISTS);
    }
}
