package com.colecciones.colecciones.model;

import java.util.ArrayList;
import java.util.List;

public class NumbersCollection {

    public NumbersCollection() {
        numbers = new ArrayList<>();
    }

    public List<String> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<String> numbers) {
        this.numbers = numbers;
    }

    private List<String> numbers;

}
