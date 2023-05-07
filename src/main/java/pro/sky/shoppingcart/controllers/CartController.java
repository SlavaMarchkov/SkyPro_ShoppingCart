package pro.sky.shoppingcart.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.shoppingcart.models.Item;
import pro.sky.shoppingcart.services.CartService;

import java.util.Map;

@RestController
@RequestMapping(path = "/order")
public class CartController {
    private final CartService service;

    public CartController(final CartService service) {
        this.service = service;
    }

    @GetMapping(path = "/add")
    public String addItemToCart(@RequestParam("items") String items) {
        return service.add(items);
    }

    @GetMapping(path = "/get")
    public Map<Integer, Item> getItems() {
        return service.get();
    }

}
