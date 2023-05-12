package pro.sky.shoppingcart.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.*;

@Component
@SessionScope
public class Cart {

    private final Map<Integer, Item> cart;

    @Autowired
    public Cart() {
        this.cart = new HashMap<>();
    }

    @PostConstruct
    public void init() {
        System.out.println("Cart created: " + cart.size());
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Cart destroyed: " + cart.size());
    }

    private void add(final Item item) {
        cart.put(item.getId(), item);
    }

    public void addAll(List<Integer> items) {
        items.forEach(item -> add(new Item(item)));
    }

    public Map<Integer, Item> getItems() {
        return Collections.unmodifiableMap(cart);
    }

}
