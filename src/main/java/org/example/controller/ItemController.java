package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.Service.ItemService;
import org.example.model.Item;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/items")
@RequiredArgsConstructor
public class ItemController {
    private final ItemService itemService;

    @GetMapping
    public List<Item> get(@RequestHeader("X-Later-User-Id") Long userId) {
        return itemService.getItems(userId);
    }

    @PostMapping
    public Item add(@RequestHeader("X-Later-User-Id") Long userId, @RequestBody Item item) {
        return itemService.addNewItem(userId, item);
    }

    @DeleteMapping("/{itemId}")
    public void deleteItem(@RequestHeader("X-Later-User-Id") Long userId,
                           @PathVariable(name = "itemId") Long itemId) {
        itemService.deleteItem(userId, itemId);
    }
}