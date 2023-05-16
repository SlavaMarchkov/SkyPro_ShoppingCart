package pro.sky.shoppingcart.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.shoppingcart.models.Item;
import pro.sky.shoppingcart.services.CartService;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping(path = "/order")
public class CartController {
    private final CartService service;

    @Autowired
    public CartController(final CartService service) {
        this.service = service;
    }

    @GetMapping
    public String welcome() {
        return "Welcome to the Cart";
    }

    @GetMapping(path = "/add")
    public void add(@RequestParam("id") Set<Integer> ids) {
        service.add(ids);
    }

    @GetMapping(path = "/get")
    public List<Item> get() {
        return service.get();
    }

}
