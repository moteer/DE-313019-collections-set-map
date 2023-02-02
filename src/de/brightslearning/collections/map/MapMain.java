package de.brightslearning.collections.map;

import de.brightslearning.collections.set.Person;

import java.util.HashMap;
import java.util.Map;

public class MapMain {

    public static void main(String[] args) {

        Map<String, String> dictionary = new HashMap<>();
        //CRUD

        //INSERT
        dictionary.put("Hallo", "Hello");
        dictionary.put("Wörterbuch", "Dictionary");
        dictionary.put("Wörterbuch", "Glossary");
        dictionary.put("Lexikon", "Glossary");
        System.out.println(dictionary);

        Map<Person, Integer> altersMap = new HashMap<>();
        altersMap.put(new Person("Nikita", "Smirnov", 26), 26);
        Person christian = new Person("Christian", "Lange", 32);
        altersMap.put(christian, 32);

        System.out.println(altersMap);

        //READ
        System.out.println(altersMap.get(christian));
        System.out.println(dictionary.get("Lexikon"));
        System.out.println(dictionary.get("no idea"));

        //Update
        altersMap.put(christian, 28);
        System.out.println(altersMap.get(christian));

        //DELETE
        altersMap.remove(christian);
        System.out.println(altersMap.get(christian));
    }
}
