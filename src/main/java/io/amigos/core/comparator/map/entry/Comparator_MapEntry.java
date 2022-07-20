package io.amigos.core.comparator.map.entry;

import io.amigos.core.comparator.StudentNameComparator;

import java.time.LocalDate;
import java.util.*;

public class Comparator_MapEntry {

    public static void main(String[] args) {

        List<Map.Entry<String, Object>> entryList = new ArrayList<>();


        entryList.add(new AbstractMap.SimpleEntry<>("id", 1000));
        entryList.add(new AbstractMap.SimpleEntry<>("name", "Arjun"));
        entryList.add(new AbstractMap.SimpleEntry<>("marks", 70));
        entryList.add(new AbstractMap.SimpleEntry<>("doj", LocalDate.now()));

        entryList.add(new AbstractMap.SimpleEntry<>("id", 1005));
        entryList.add(new AbstractMap.SimpleEntry<>("name", "Nagarjuna"));
        entryList.add(new AbstractMap.SimpleEntry<>("marks", 20));
        entryList.add(new AbstractMap.SimpleEntry<>("doj", LocalDate.now()));

       entryList.add(new AbstractMap.SimpleEntry<>("id", 1003));
       entryList.add(new AbstractMap.SimpleEntry<>("name", "Bob"));
       entryList.add(new AbstractMap.SimpleEntry<>("marks", 170));
       entryList.add(new AbstractMap.SimpleEntry<>("doj", LocalDate.now()));

        entryList.add(new AbstractMap.SimpleEntry<>("id", 1001));
        entryList.add(new AbstractMap.SimpleEntry<>("name", "Edward"));
        entryList.add(new AbstractMap.SimpleEntry<>("marks", 12));
        entryList.add(new AbstractMap.SimpleEntry<>("doj", LocalDate.now()));

        entryList.add(new AbstractMap.SimpleEntry<>("id", 1002));
        entryList.add(new AbstractMap.SimpleEntry<>("name", "Cam"));
        entryList.add(new AbstractMap.SimpleEntry<>("marks", 35));
        entryList.add(new AbstractMap.SimpleEntry<>("doj", LocalDate.now()));

        Collections.sort(entryList, new StudentNameComparator_With_MapEntry());

        entryList.forEach(
                e -> System.out.println(e)
        );

    }
}
