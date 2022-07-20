package io.amigos.core.amazon.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class Result {

    /*
     * Complete the 'numberOfItems' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. INTEGER_ARRAY startIndices
     *  3. INTEGER_ARRAY endIndices
     */

    // *|*|
    // *|*|*|
    // *|**|***|*|

    /**
        case 1: start with '|' and end with '|'
            |*|*|
        case 2: Doesn't start with '|' but ends with '|'
        case 3: start with '|' but doesn't ends with '|'
        case 4: Doesn't start with '|' and doesn't end with '|'
     */

    public static List<Integer> numberOfItems(String s, List<Integer> startIndices, List<Integer> endIndices) {
        // Write your code here

        System.out.println(s);

        String temp = s;

        List<Integer> ret = new ArrayList<>();

        for (int i = 0; i < startIndices.size(); i++) {

            for(int j = 0; j < endIndices.size(); j++) {

                if (i == j) {
                    String result = temp.substring(startIndices.get(i) - 1, endIndices.get(j));

                    char[] chars = result.toCharArray();

                    String[] strs = result.split("\\|");
                    if(result.startsWith("|") && result.endsWith("|")) {
                        int count = 0;
                        for (int l = 0; l < strs.length; l++) {
                            int length = strs[l].toCharArray().length;
                            count+=length;
                        }

                     ret.add(count);
                    } else if(!result.startsWith("|") && result.endsWith("|")) {
                        int count = 0;
                        for (int l = 1; l < strs.length; l++) {
                            int length = strs[l].toCharArray().length;
                            count+=length;
                        }

                        ret.add(count);
                    } else if (result.startsWith("|") && !result.endsWith("|")) {
                        int count = 0;
                        for (int l = 0; l < strs.length - 1; l++) {
                            int length = strs[l].toCharArray().length;
                            count+=length;
                        }

                        ret.add(count);
                    } else if (!result.startsWith("|") && !result.endsWith("|")) {
                        int count = 0;
                        for (int l = 1; l < strs.length - 1; l++) {
                            int length = strs[l].toCharArray().length;
                            count+=length;
                        }

                        ret.add(count);
                    }
                }

            }

        }

        return ret;

    }

   /* public void addToList(String str, List<Integer> ret) {

    }*/

    public static void main(String[] args) {

//        numberOfItems(String s, List<Integer> startIndices, List<Integer> endIndices)

        String s = "|**|*|*|";
        List<Integer> startIndices = List.of(1,1);
        List<Integer> endIndices = List.of(5,6);

        List<Integer> results = numberOfItems(s, startIndices, endIndices);

        results.forEach(System.out::println);
    }

}
