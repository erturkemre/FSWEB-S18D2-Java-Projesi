package com.workintech.fruitandvegetable.repository;

import com.workintech.fruitandvegetable.entity.Vegetables;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VegetablesRepository extends JpaRepository<Vegetables,Long> {
}
