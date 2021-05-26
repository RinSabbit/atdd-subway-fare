package wooteco.subway.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class InvalidPathException extends SubwayException {

    public InvalidPathException() {
        super();
    }

    public InvalidPathException(String message) {
        super(message);
    }
}