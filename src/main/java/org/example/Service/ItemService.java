package org.example.Service;

import org.example.model.Item;

import java.util.List;

public interface ItemService {
    List<Item> getItems(Long userId);
    Item addNewItem(Long userId, Item item);
    void deleteItem(Long userId, Long itemId);
}
