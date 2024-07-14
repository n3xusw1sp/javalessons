package org.example;

public class Lesson_5 {
    // Цикли та оператори в них
    // Урок: https://www.youtube.com/watch?v=oexy9dMCNqo
    public static void main (String[] args) {
        // Цикл For (він виконується поки i не буде менше 10):
/*        for(int i = 0; i < 10; i++) {
            System.out.println("Element is " + i);
        }*/


        // Цикл For (він виконується до числа 5):
/*        for(int i = 1; i <= 5; i++) {
            System.out.println("Element is " + i);
        }*/


        // Цикл For (число має бути більше ніж 100 і кожен раз воно ділиться на 2):
/*        for(float i = 100f; i > 0.5f; i /= 2) {
            System.out.println("Element is " + i);
        }*/


        // Цикл While:
/*        int i = 10;
        while(i >= 10) {
            System.out.println("Element is " + i);
            i -= 10;
        }*/


        // Цикл Do:
/*        int i = 0;
        do {
            System.out.println("Element is " + i);
            i++;
        } while(i < 10);*/


        // Оператор "break" (він перериває цикл коли число по рахунку стає 8):
        // Оператор "continue" (він пропускає одне коло циклу. Програма виводить тільки парні числа):
        for(byte i = 1; i <= 10; i++) {
            if(i == 8)
                break;

            if(i % 2 == 0)
                continue;

            System.out.println(i);
        }
    }
}
