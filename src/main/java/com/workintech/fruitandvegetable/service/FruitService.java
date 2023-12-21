package com.workintech.fruitandvegetable.service;

import com.workintech.fruitandvegetable.entity.Fruit;

import java.util.List;

public interface FruitService {
    List<Fruit> getByPriceAsc();
    List<Fruit> getByPriceDesc();
    List<Fruit> searchByName(String name);
    Fruit getById(long id);

    Fruit save(Fruit fruit);
    Fruit delete(long id);
}
