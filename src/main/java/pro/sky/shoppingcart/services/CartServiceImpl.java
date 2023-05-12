package pro.sky.shoppingcart.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pro.sky.shoppingcart.models.Cart;
import pro.sky.shoppingcart.models.Item;

import java.util.List;
import java.util.Map;

@Service
public class CartServiceImpl implements CartService {

    private final Cart cart;

    @Autowired
    public CartServiceImpl(final Cart cart) {
        this.cart = cart;
    }

    @Override
    public Map<Integer, Item> get() {
        return cart.getItems();
    }

    @Override
    public String addAll(List<Integer> items) {
        cart.addAll(items);
        return "Item(s) added successfully";
    }

}
