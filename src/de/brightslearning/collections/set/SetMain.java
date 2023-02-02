package de.brightslearning.collections.set;

import java.util.*;

public class SetMain {
    public static void main(String[] args) {
        //CRUD Operations
        Set<Integer> integerSet = new HashSet<>();

        // Create
        integerSet.add(1);
        integerSet.add(2);
        integerSet.add(Integer.valueOf(3));
        boolean add = integerSet.add(1);
        System.out.println(add);
        System.out.println(integerSet);


        // Read
        boolean containsOne = integerSet.contains(1);
        System.out.println(containsOne);

        boolean containsSeven = integerSet.contains(7);
        System.out.println(containsSeven);

        for (Integer integer : integerSet) {
            System.out.println(integer);
        }

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);

        System.out.println(integerSet.containsAll(arrayList));

        // Update
        integerSet.add(1);

        // Delete
        integerSet.remove(1);
        integerSet.remove(2);
        System.out.println(integerSet);


        System.out.println(new Person("Sebastian", "Offergeld", 50)
                .hashCode());
        Person sebastian = new Person("Sebastian", "Offergeld", 40);
        System.out.println(sebastian
                .hashCode());
        Person alina = new Person("Alina", "Wiehagen", 30);
        System.out.println(alina
                .hashCode());


        // ORDER
        Set<String> characters = new HashSet<>();
        characters.add("H");
        characters.add("A");
        characters.add("L");
        characters.add("L");
        characters.add("O");
        System.out.println(characters);

        Set<String> sortedCharacters = new TreeSet<>();
        sortedCharacters.add("H");
        sortedCharacters.add("A");
        sortedCharacters.add("L");
        sortedCharacters.add("L");
        sortedCharacters.add("O");
        System.out.println(sortedCharacters);

        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("H");
        linkedHashSet.add("A");
        linkedHashSet.add("L");
        linkedHashSet.add("L");
        linkedHashSet.add("O");
        System.out.println(linkedHashSet);

        Person bacdasch = new Person("Bacdasch", "Zafaryar", 20);
        Person rene = new Person("Rene", "Martinek", 10);

        Set<Person> persons = new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge().compareTo(o2.getAge());
            }
        });
        persons.add(bacdasch);
        persons.add(rene);
        persons.add(alina);
        persons.add(sebastian);
        System.out.println(persons);

    }
}
