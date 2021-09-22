package Tamchack.tamchack.error;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorCode {

    INVALID_TOKEN(401,"Invalid Token"),
   USER_NOT_FOUND(404,"User Not Found"),
    IMAGE_NOT_FOUND(404, "Image Not Found"),
    STORE_NOT_FOUND(404, "Store Not Found"),
    BOOK_NOT_FOUND(404, "Book Not Found"),
    USER_ALREADY_EXISTS(409,"User Already Exists"),
    BOOK_ALREADY_EXISTS(409, "Book Already Exists");

    private final int status;
    private final String message;
}
