package com.chapter12.exception_;

public class Exception01 {
    public static void main(String[] args) {

        int num1 = 1;
        int num2 = 0;
        try {
            int res = num1 / num2;
        } catch (Exception e) {
            System.out.println("异常原因"+e.getMessage());
        }
        System.out.println("程序继续运行");
    }
}