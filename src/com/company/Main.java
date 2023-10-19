package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите математическую формулу:");
        String input = scanner.nextLine();

        Deque<String> sing = new ArrayDeque<>();
        Queue<Integer> numbers = new ArrayDeque<>();

        String[] part = input.split(""); // разбиваем строку на подстроки, используя пробел в качестве разделителя

        for (int i = 0; i < part.length; i++) {
           try{
               numbers.add(Integer.parseInt(part[i]));
           }catch (NumberFormatException e){
               sing.add(part[i]);
           }

        }

        while (!numbers.isEmpty()) {
            System.out.print(numbers.poll());
        }

        while (!sing.isEmpty()) {
            System.out.print(sing.poll());
        }
    }
}
