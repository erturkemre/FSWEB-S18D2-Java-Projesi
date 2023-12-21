package com.workintech.fruitandvegetable.repository;

import com.workintech.fruitandvegetable.entity.Fruit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FruitRepository extends JpaRepository<Fruit,Long> {

    @Query(value = "SELECT f.id,f.name,f.price,f.fruit_type FROM fsweb.fruit as f ORDER BY f.price DESC", nativeQuery = true)
    List<Fruit> getByPriceDesc();
    @Query(value = "SELECT f.id,f.name,f.price,f.fruit_type FROM fsweb.fruit as f ORDER BY f.price ASC", nativeQuery = true)
    List<Fruit> getByPriceAsc();

    @Query(value = "SELECT f FROM fsweb.fruit as f WHERE f.name LIKE %:name%", nativeQuery = true)
    List<Fruit> searchByName(String name);
}
