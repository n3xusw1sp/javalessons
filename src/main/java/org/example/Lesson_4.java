package org.example;

import java.util.Scanner;

public class Lesson_4 {
    public static void main (String[] args) {

        // https://www.youtube.com/watch?v=4eMWFgsZZdg&list=PL7vq4D0vOpQbW4oply2GMQjVeYHNi05-I&index=6
        // Замість == може бути >, <, >=, <=, !=
        // || - програма виконується лише тоді якщо 1 або 2 змінна правидві
        // && - програма виконується лиші тоді якщо всі змінні правидиві
        // if() - виконує коданди при правидивому значенні змінної
        // else - виконує коданди при не правидивому значенні змінної
        // else if() - перевіряє ще декілька умов
        // switch() - в ньому прописуються перевірки case(). Default - якщо всі випадки не коректні
        // Доробити калькулятор.


        /* Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int user = scan.nextInt();
        char sym = 't';
        if(user == 5 && sym == 't') {
            System.out.println("Number is five");
            boolean isHappy = false;
            if (!isHappy)
                System.out.println("Bool is false");
            } else if (user == 60)
                System.out.println("Number is sixty");
              else if (user == 70)
                  System.out.println("Number is 70");
              else if (user > 100)
                  System.out.println("Number > 100");
        else {
                System.out.println("Number is undefined");
            }
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int user = scan.nextInt();

        switch (user) {
            case 5: System.out.println("Number is 5");
            break;
            case 50: System.out.println("Number is 50");
            break;
            default: System.out.println("Number is underfined");
        }
        }
    }
