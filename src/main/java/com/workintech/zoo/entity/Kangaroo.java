package com.workintech.zoo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Kangaroo {
    private Integer id;
    private String name;
    private double height;
    private double weight;
    private String gender;
    private Boolean isAggressive;
}
