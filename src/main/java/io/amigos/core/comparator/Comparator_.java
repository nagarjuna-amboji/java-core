package io.amigos.core.comparator;

import java.time.LocalDate;
import java.util.*;

public class Comparator_ {

    public static void main(String[] args) {

        List<Map<String, Object>> entryList = new ArrayList<>();
        Map<String, Object> students = new HashMap<>();

        students.put("id", 1000);
        students.put("name", "Arjun");
        students.put("marks", 70);
        students.put("doj", LocalDate.now());
        entryList.add(students);

        Map<String, Object> students1 = new HashMap<>();
        students1.put("id", 1005);
        students1.put("name", "Nagarjuna");
        students1.put("marks", 20);
        students1.put("doj", LocalDate.now());
        entryList.add(students1);

        Map<String, Object> students2 = new HashMap<>();
        students2.put("id", 1003);
        students2.put("name", "Bob");
        students2.put("marks", 170);
        students2.put("doj", LocalDate.now());
        entryList.add(students2);

        Map<String, Object> students3 = new HashMap<>();
        students3.put("id", 1001);
        students3.put("name", "Edward");
        students3.put("marks", 12);
        students3.put("doj", LocalDate.now());
        entryList.add(students3);

        Map<String, Object> students4 = new HashMap<>();
        students4.put("id", 1002);
        students4.put("name", "Cam");
        students4.put("marks", 35);
        students4.put("doj", LocalDate.now());
        entryList.add(students4);

        Collections.sort(entryList, new StudentNameComparator());

        entryList.forEach(
                e -> System.out.println(e)
        );

    }
}
