package com.colecciones.colecciones.service;

import com.colecciones.colecciones.model.NumbersCollection;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class NumbersCollectionImpl implements NumbersCollectionService {
    private List<Integer> integerList = new ArrayList<>();
    private List<Integer> aux;
    private List<Integer> repeatList = new ArrayList<>();

    @Override
    public Integer add(NumbersCollection numbers) {
        integerList = validateNumber(numbers);
        Integer add = 0;
        for (int i = 0; i < integerList.size(); i++) {
            add = add + integerList.get(i);
        }
        return add;
    }

    @Override
    public Integer greaterThan(NumbersCollection numbers) {
        integerList = validateNumber(numbers);
        Integer great = integerList.get(0);
        for (int i = 0; i < integerList.size(); i++) {
            Integer actual = integerList.get(i);
            if (actual > great) {
                great = actual;
            }
        }
        return great;
    }

    @Override
    public Integer smallestThan(NumbersCollection numbers) {
        integerList = validateNumber(numbers);
        Integer small = integerList.get(0);
        for (int i = 0; i < integerList.size(); i++) {
            Integer actual = integerList.get(i);
            if (actual < small) {
                small = actual;
            }
        }
        return small;
    }

    @Override
    public Integer count(NumbersCollection numbers) {
        Map<Integer, Integer> map = new HashMap<>();
        integerList = validateNumber(numbers);
        Integer count = 0;
        for (int i = 0; i < integerList.size(); i++) {
            Integer actual = integerList.get(i);
            for (int j = 0; j < integerList.size(); j++) {
                Integer compare = integerList.get(j);
                if (actual.equals(compare)) {
                    count++;
                }
            }
            if (count != 1) {
                map.put(actual, count);
                System.out.println(map.get(actual));
            }
            count = 0;
        }

        Integer max = 0;
        for (int value : map.values()) {
            if (value > max) {
                max = value;
            }
        }
        Integer maxValue = null;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == max) {
                maxValue = entry.getKey();
            }
        }
        return maxValue;
    }

    @Override
    public Integer countPlus(NumbersCollection numbers) {
        repeatList.clear();
        integerList = validateNumber(numbers);
        aux = new ArrayList<>(integerList);
        Integer count = 0;
        for (int i = 0; i < aux.size(); i++) {
            Integer actual = aux.get(i);
            for (int j = 0; j < aux.size(); j++) {
                Integer compare = aux.get(j);
                if (actual.equals(compare)) {
                    count++;
                }
            }
            if (count != 1) {
                if (!exist(actual, repeatList)) {
                    repeatList.add(repeatList.size(), actual);
                }
            }
            count = 0;
        }
        numbers.setNumbers(convertToString(repeatList));
        System.out.println(repeatList);
        return greaterThan(numbers);
    }

    private List<Integer> validateNumber(NumbersCollection numbersCollection) {
        List<String> stringList;
        stringList = numbersCollection.getNumbers();
        List<Integer> integerList = new ArrayList<>();

        for (String s : stringList) {
            try {
                Integer number = Integer.parseInt(s);
                if (number <= 0 && stringList.size() == 1) {
                    throw new RuntimeException();
                }
                if (number > 0) {
                    integerList.add(number);
                }
            } catch (NumberFormatException e) {
                throw new RuntimeException("El JSON contiene letras.");
            }
        }
        if (integerList.size() == 0) {
            throw new RuntimeException("El JSON está vacío o solo contiene números negativos.");
        }
        return integerList;
    }

    private List<String> convertToString(List<Integer> integerList) {
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < integerList.size(); i++) {
            String s = String.valueOf(integerList.get(i));
            stringList.add(s);
        }
        return stringList;
    }

    private boolean exist(Integer number, List<Integer> numberList) {
        for (int i = 0; i < numberList.size(); i++) {
            if (number.equals(numberList.get(i))) {
                return true;
            }
        }
        return false;
    }
}
