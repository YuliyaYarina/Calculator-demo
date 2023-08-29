package pro.sky.skyproStringCalculatorDemo.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandlerController {

    @ExceptionHandler({IllegalArgumentException.class, ArithmeticException.class})
    public String handleControllerNumsException(RuntimeException e){
        return e.getMessage();
    }
}
