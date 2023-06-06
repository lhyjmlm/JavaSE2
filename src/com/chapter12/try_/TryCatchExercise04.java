package com.chapter12.try_;

import java.util.Scanner;

public class TryCatchExercise04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = 0;
        while(true){
            System.out.println("请输入一个整数：");
            try {
                num=Integer.parseInt(scanner.next());
                break;
            } catch (NumberFormatException e) {
                System.out.println("不是一个整数");
            }
        }
        System.out.println("你输入的数："+num);
    }
}
