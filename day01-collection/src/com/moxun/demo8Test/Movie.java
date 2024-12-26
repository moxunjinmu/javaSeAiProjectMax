package com.moxun.demo8Test;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
    private String name;
    private String score;
    private String actor;
    private Double price;
}
