package io.amigos.core.comparator;

import java.util.Comparator;
import java.util.Map;

public class StudentNameComparator implements Comparator<Map<String, Object>> {
    @Override
    public int compare(Map<String, Object> student1, Map<String, Object> student2) {

        return student1.get("name").toString().compareTo(student2.get("name").toString());
    }
}
