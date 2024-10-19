package com.workintech.zoo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor


public class Koala {
    private Integer id;
    private String name;
    private double sleepHour;
    private double weight;
    private String gender;
}
