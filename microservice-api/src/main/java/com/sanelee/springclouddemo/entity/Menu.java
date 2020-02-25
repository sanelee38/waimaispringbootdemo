package com.sanelee.springclouddemo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@NoArgsConstructor
@Data
@Accessors(chain = true)
public class Menu {
    private long id;
    private String name;
    private double price;
    private String flavor;
    private Type type;
}
