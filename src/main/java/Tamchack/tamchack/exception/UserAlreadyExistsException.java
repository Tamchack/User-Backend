package Tamchack.tamchack.exception;

import Tamchack.tamchack.error.BaseException;
import Tamchack.tamchack.error.ErrorCode;

public class UserAlreadyExistsException extends BaseException {
    public UserAlreadyExistsException() {
        super(ErrorCode.USER_ALREADY_EXISTS);
    }
}
