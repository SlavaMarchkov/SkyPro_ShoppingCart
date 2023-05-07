package pro.sky.shoppingcart.services;

import pro.sky.shoppingcart.models.Item;

import java.util.Map;

public interface CartService {
    Map<Integer, Item> get();

    String add(String itemIDs);
}
