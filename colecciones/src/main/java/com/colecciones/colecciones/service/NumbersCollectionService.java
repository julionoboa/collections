package com.colecciones.colecciones.service;

import com.colecciones.colecciones.model.NumbersCollection;
import org.springframework.stereotype.Repository;

@Repository
public interface NumbersCollectionService {
    Integer add(NumbersCollection numbers);
    Integer greaterThan(NumbersCollection numbers);
    Integer smallestThan(NumbersCollection numbers);
    Integer count(NumbersCollection numbers);
    Integer countPlus(NumbersCollection numbers);
}
