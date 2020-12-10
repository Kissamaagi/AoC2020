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

            Long value = findValue(list);
            System.out.println(value);

            //part 2
            for (int i = 0; i < list.size(); i++) {           
                long sum = list.get(i);
                for (int j = i+1; j < list.size() && sum < value; j++) {
                    sum += list.get(j);  
                        
                    if (sum == value) {
                        System.out.println(sum);
                        List<Long> temp = list.subList(i, j+1);
                        Long largest = Collections.max(temp);
                        Long smallest = Collections.min(temp);
                        System.out.println(largest+smallest);
                        System.exit(0);
                    } 
                }
            }
            
        }
        catch (Exception e) {
            System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaa");
        }
    }

    // part 1
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
        }
        return 0L;
    }
}
