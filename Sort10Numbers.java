package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Sort10Numbers {

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for(int c = 0; c<10;  ){
            System.out.println("Введите число под номером =" + (c + 1));
            if (!sc.hasNextInt()) {
                System.out.println("Вы ввели не число!");
                sc.next();
            }
            else {
                nums.add(sc.nextInt());
                c++;
            }
        }
        /*
        Collections.sort(nums);
        Если вариат сортировки через Collections Вас не устраивает, то:
         */
        for (int i = nums.size() - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (nums.get(j) > nums.get(j + 1)) {
                    int tmp = nums.get(j);
                    nums.set(j, nums.get(j + 1));
                    nums.set(j + 1, tmp);
                }
            }
        }
        System.out.println("Числа в порядке возрастания = " + nums);
        sc.close();
    }
}
