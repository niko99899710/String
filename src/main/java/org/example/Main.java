package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void task1() {
        System.out.println("Задание №1");
        String[] stringArray = {"ab", "cd", "ef"};
        String result = String.join(" ", stringArray);
        char[] result1 = result.toCharArray();
            System.out.println(result1);
        }

        // задание я не поняла, покажите, пожалуйста, как должен выглядит первый код

       /* String array = "abcdef";
       String stroke = new String(new char[]{'a', 'b', 'c', 'd', 'e', 'f'});
       System.out.println(stroke);
        String[] num = new String[array.length()];
       for (int i = 0;  i < array.length(); i++){
        num[i] =String.valueOf(array.charAt(i));
         System.out.println(num[i]);
       }


       char[] result = array.toCharArray();
       System.out.println(result);
       for (int i = 0; i < result.length; i++) {
       int num = result[i];
        System.out.println(result[i]);
      }
      **/



    public static void task2() {
        System.out.println("Задание №2");
        String stroke = "12345";
        String result = stroke.charAt(0) + "" + stroke.charAt(4);
        System.out.println(result);


    }
    public static void task3(){
        System.out.println("Задание №3");
        String stokeNew = "1203405";
        char number = stokeNew.charAt(2);
        System.out.println(number);
    }


}