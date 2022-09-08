package Potok;

import java.util.*;
import java.util.stream.*;

public class PotokHome {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<Integer>();
        for (int i = 0; i < 25; i++) {
            myList.add(i);
        }
        System.out.println(myList);
        Stream myStream = myList.stream();
        myStream.filter(x -> x % 2 == 0).toString().forEach(System.out::println); //я вроде работаю с примитивом, а мне пишет что где x%2 это object делится, почему?
    }
}