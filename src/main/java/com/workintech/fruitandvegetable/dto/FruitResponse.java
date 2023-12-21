package com.workintech.fruitandvegetable.dto;

import com.workintech.fruitandvegetable.entity.Fruit;

public record FruitResponse(String message, Fruit fruit) {
}
