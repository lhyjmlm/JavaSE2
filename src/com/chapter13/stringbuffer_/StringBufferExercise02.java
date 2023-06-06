package com.chapter13.stringbuffer_;

public class StringBufferExercise02 {
    public static void main(String[] args) {

        String price = "123564.59";
        StringBuffer sb = new StringBuffer(price);

        for (int i = sb.lastIndexOf(".") - 3; i > 0; i -= 3) {
            sb = sb.insert(i, ",");
        }
        System.out.println(sb);
    }
}
