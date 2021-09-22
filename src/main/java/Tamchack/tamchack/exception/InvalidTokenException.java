package Tamchack.tamchack.exception;

import Tamchack.tamchack.error.BaseException;
import Tamchack.tamchack.error.ErrorCode;

public class InvalidTokenException extends BaseException {
    public InvalidTokenException() {
        super(ErrorCode.INVALID_TOKEN);
    }
}
