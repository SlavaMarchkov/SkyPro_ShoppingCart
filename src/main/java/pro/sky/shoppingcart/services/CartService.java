package pro.sky.shoppingcart.services;

import pro.sky.shoppingcart.models.Item;

import java.util.List;
import java.util.Set;

public interface CartService {

    List<Item> get();

    void add(Set<Integer> ids);

}
