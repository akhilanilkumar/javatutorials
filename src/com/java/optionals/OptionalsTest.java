package com.java.optionals;

import java.util.*;
import java.util.function.Function;

public class OptionalsTest {
    public static void main(String[] args) {
        Function<String, String> getSecondName = (name) -> name.split(" ").length > 1 ? name.split(" ")[1] : null;
        Function<String, Integer> getStringLength = (secondName) -> secondName.length();

        Optional.ofNullable(getSecondName.apply("Akhil")).map(getStringLength).ifPresent(System.out::println);
        getStringCount();
        sampleFunction();
    }

    static void sampleFunction() {
        Map<Person, Long> personLongMap = new HashMap<>();
        personLongMap.put(new Person(10L), 1L);
        personLongMap.put(new Person(7L), 2L);
        personLongMap.put(new Person(9L), 3L);
        personLongMap.put(new Person(12L), 4L);
        List<Person> personList = new ArrayList(personLongMap.keySet());
        Collections.sort(personList, Comparator.comparing(Person::getId));
        personList.forEach(System.out::println);
        for (Person person : personList) {
            //System.out.println(personLongMap.get(person));
        }
    }

    static void getStringCount() {
        String input = "This is just a sample message";
        Map<String, Integer> map = new HashMap<>();
        for (String s : input.split("")) {
            if (!s.equals(" ")) {
                if (map.containsKey(s)) {
                    int count = map.get(s);
                    map.put(s, ++count);
                } else {
                    map.put(s, 1);
                }
            }
        }
        map.forEach((key, value) -> {
            System.out.println(key + "=" + value);
        });
    }
}
