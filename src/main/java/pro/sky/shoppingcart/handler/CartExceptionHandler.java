package pro.sky.shoppingcart.handler;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;
import pro.sky.shoppingcart.controllers.CartController;

@RestControllerAdvice(basePackageClasses = CartController.class)
public class CartExceptionHandler {

    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
    public String handleMethodArgumentTypeMismatchException() {
        return "Некорректный параметр запроса";
    }

}
