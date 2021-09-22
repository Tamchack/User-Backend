package Tamchack.tamchack.exception;

import Tamchack.tamchack.error.BaseException;
import Tamchack.tamchack.error.ErrorCode;

public class StoreNotFoundException extends BaseException {
    public StoreNotFoundException() {
        super(ErrorCode.STORE_NOT_FOUND);
    }
}
