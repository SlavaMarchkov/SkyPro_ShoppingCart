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
    public String add(String itemIDs) {
        List<String> ids = List.of(itemIDs.split(","));
        for (String id : ids) {
            int itemID = Integer.parseInt(id);
            cart.add(new Item(itemID));
        }
        return "Item(s) added successfully";
    }
}
