package com.example.springbasics.animals;

import org.springframework.stereotype.Component;

@FunctionalInterface
@Component
public interface Animal {
    String voice();
}
