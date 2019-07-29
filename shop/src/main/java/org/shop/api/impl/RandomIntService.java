package org.shop.api.impl;

import org.shop.annotations.InjectRandomInt;
import org.springframework.stereotype.Component;

@Component
public class RandomIntService {
    @InjectRandomInt(minValue = 2, maxValue = 10)
    private int randomInt;

    public void printInjectedWithAnnotationInteger(){
        System.out.println("Average between min and max values is " + randomInt);
    }
}
