package Tamchack.tamchack.exception;

import Tamchack.tamchack.error.BaseException;
import Tamchack.tamchack.error.ErrorCode;

public class UserNotFoundException extends BaseException {
    public UserNotFoundException() {
        super(ErrorCode.USER_NOT_FOUND);
    }
}
