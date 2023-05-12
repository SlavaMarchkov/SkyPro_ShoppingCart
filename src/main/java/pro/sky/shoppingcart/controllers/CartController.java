package pro.sky.shoppingcart.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.shoppingcart.models.Item;
import pro.sky.shoppingcart.services.CartService;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(path = "/order")
public class CartController {
    private final CartService service;

    public CartController(final CartService service) {
        this.service = service;
    }

    @GetMapping
    public String welcome() {
        return "Welcome to the Cart";
    }

    @GetMapping(path = "/add")
    public String addItemsToCart(@RequestParam("id") List<Integer> items) {
        return service.addAll(items);
    }

    @GetMapping(path = "/get")
    public Map<Integer, Item> getItems() {
        return service.get();
    }

}
