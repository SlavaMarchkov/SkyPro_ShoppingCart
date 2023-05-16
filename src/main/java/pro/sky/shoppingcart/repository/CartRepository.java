package pro.sky.shoppingcart.repository;

import org.springframework.stereotype.Repository;
import pro.sky.shoppingcart.models.Item;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class CartRepository {

    private int idCounter = 1;
    private final Map<Integer, Item> cart = new HashMap<>();

    @PostConstruct
    public void init() {
        cart.put(idCounter, new Item(idCounter++, "Ноутбук"));
        cart.put(idCounter, new Item(idCounter++, "Смартфон"));
        cart.put(idCounter, new Item(idCounter++, "Телевизор"));
    }

    public void add(Item item) {
        cart.put(item.getId(), item);
    }

    public Item get(int id) {
        return cart.get(id);
    }

    public List<Item> getAll() {
        return new ArrayList<>(cart.values());
    }

    public void update(int id, Item item) {
        if (cart.containsKey(id)) {
            cart.replace(id, item);
        }
    }

    public Item delete(int id) {
        return cart.remove(id);
    }

}
