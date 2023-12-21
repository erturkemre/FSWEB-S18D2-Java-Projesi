package com.workintech.fruitandvegetable.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "vegetables", schema = "fsweb")
public class Vegetables extends Plant{

    @Column(name = "is_grown_on_tree")
    private boolean isGrownONTree;

}
