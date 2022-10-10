package guru.springframework.msscbrewery.exceptionHandlers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Incorrect format for beer id")
public class BeerNotFoundException extends  RuntimeException{

}
