package io.amigos.core.comparator.map.entry;

import java.util.Comparator;
import java.util.Map;

public class StudentNameComparator_With_MapEntry implements Comparator<Map.Entry<String, Object>> {
    @Override
    public int compare(Map.Entry<String, Object> student1, Map.Entry<String, Object> student2) {

//        if (student1.getKey().compareTo("name") == 0 && student2.getKey().compareTo("name") == 0) {
            return student1.getValue().toString().compareTo(student2.getValue().toString());
//        }

//        return 0;
    }
}
