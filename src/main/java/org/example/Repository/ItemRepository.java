package org.example.Repository;

import org.example.model.Item;

import java.util.List;

public interface ItemRepository {
    List<Item> findByUserId(Long userId);

    Item save(Item item);

    void deleteByUserIdAndItemId(Long userId, Long itemId);
}
