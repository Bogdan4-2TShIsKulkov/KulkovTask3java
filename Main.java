
package com.company;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        System.out.println("Список:");
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0; i<25; i++)
        {
            list.add((int)(Math.random()*10 + 1));
        }

        System.out.println(list);

        HashSet<Integer> TheSet = new HashSet<>();
        for (int i = 0; i < 25; i++) {
            TheSet.add(list.get(i));
        }
        Object[] numberArray = TheSet.toArray();
        System.out.println("Set: " + Arrays.toString(numberArray));
        System.out.println("Уникальные числа: " + numberArray.length);

        HashMap<Integer, Integer> nMap = new HashMap<>();

        for (int i = 0; i < numberArray.length; i++) {
            nMap.put((Integer) numberArray[i], list.indexOf(i));
        }
        System.out.println("Map: " + nMap);
    }
}
