package com.colecciones.colecciones.controller;
import com.colecciones.colecciones.model.NumbersCollection;
import com.colecciones.colecciones.service.NumbersCollectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NumbersCollectionController {
    @Autowired
    private NumbersCollectionService numbersCollectionService;

    @GetMapping("/")
    public String hello() {
        return "Hello";
    }

    @GetMapping("/api/sum post")
    public Integer add(@RequestBody NumbersCollection numbersCollection) {
        System.out.println(numbersCollection.getNumbers());
        return numbersCollectionService.add(numbersCollection);
    }

    @GetMapping("/api/largest")
    public Integer largest(@RequestBody NumbersCollection numbersCollection) {
        return numbersCollectionService.greaterThan(numbersCollection);
    }

    @GetMapping("/api/smallest")
    public Integer smallest(@RequestBody NumbersCollection numbersCollection) {
        return numbersCollectionService.smallestThan(numbersCollection);
    }

    @GetMapping("/api/count")
    public Integer count(@RequestBody NumbersCollection numbersCollection) {
        return numbersCollectionService.count(numbersCollection);
    }

    @GetMapping("/api/countPlus")
    public Integer countPlus(@RequestBody NumbersCollection numbersCollection) {
        return numbersCollectionService.countPlus(numbersCollection);
    }

}
