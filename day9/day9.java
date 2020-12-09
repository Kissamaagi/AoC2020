package aoc2020.day9;

// Advent of code day 9 

import java.util.Scanner;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.io.*;

public class day9 {
    public static void main(String[] args) {
        try {
            Scanner fileInput = new Scanner(new File("day9.txt"));
            LinkedList<Long> list = new LinkedList();

            while (fileInput.hasNextLine()) {
                list.add(Long.parseLong(fileInput.nextLine()));
            }

            Long value = Long.valueOf(findValue(list));
            System.out.println(value);

            for (int i = 0; i < list.size(); i++) {
                for (int j = i; j < list.size(); j++) {
                    List<Long> temp = list.subList(i, j);
                    // how do longs work???????????? no one knows??????????????????????
                    Long val = Long.valueOf(0);
                    for (int k = 0; k < temp.size(); k++){
                        val = val + temp.get(k);
                    }
                    if (val == value) {
                        Long largest = Collections.max(temp);
                        Long smallest = Collections.min(temp);

                        System.out.println(largest+smallest);
                    }
                }
            }
            
        }
        catch (Exception e) {
            System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaa");
        }
    }

    public static Long findValue(LinkedList<Long> list) {
        for (int i = 25; i < list.size(); i++) {
            Long value = list.get(i);
            boolean valid = false;

            for (int j = i - 25; j < i;j++) {
                for (int k = i - 25;k < i; k++) {
                    if (list.get(j) + list.get(k) == value) {
                        valid = true;
                    }
                }
            }
            if (valid == false) {
                return value;
            }
            else {
                return 0;
            }
        }
    }
}
