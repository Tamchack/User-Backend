package Tamchack.tamchack.exception;

import Tamchack.tamchack.error.BaseException;
import Tamchack.tamchack.error.ErrorCode;

public class ImageNotFoundException extends BaseException {
    public ImageNotFoundException() {
        super(ErrorCode.IMAGE_NOT_FOUND);
    }
}
