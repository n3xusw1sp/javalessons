package org.example;
import java.util.Scanner;
public class Lesson_6 {
    // Масиви
    // Урок: https://youtu.be/nXsRubxRZDE?si=5qHsD0rLzbMTlaYS
    public static void main (String[] args) {
        // Масиви з різними значенями:
        /* int[] nums = new int[5];
        nums[0] = 500;
        nums[1] = 500;
        nums[2] = 500;
        nums[3] = 500;
        nums[4] = 500;
        nums[5] = 500;
        System.out.println(nums[0]); */


        // 2-ий спосіб створення масиву:
        // byte[] nums2 = { 6, 7, 3, 5, 3, -1};


        // Цикли і масиви. Програма виводить найбільшу цифри циклу в консоль:
        /* System.out.println("Enter num: ");
        Scanner scan = new Scanner(System.in);
        int user_num = scan.nextInt();

        short[] nums = { 5, 6, 2, 9, 0 };
        for(int i = 0; i < nums.length; i++) {
            System.out.println("Enter element " + i + ": ");
            nums[i] = scan.nextShort();
        }

        short max_num = nums[0];
        for(int i = 0; i < user_num; i++) {
            if(nums[i] > max_num) {
                max_num = nums[i];
            }
        }

        System.out.println("Max element: " + max_num);

        for(int i = 0; i < user_num; i++) {
            System.out.println(nums[i]);
        } */

        // Багатовимірні масиви ("Hello" та інші мають індекси 1, 2 і так далі. Таким чином можна створити багато масивів):
        /* String[][] words2 = {
                {"Hello", "World"},
                {"Hi", "Amigos"}
        };
        System.out.println(words2[1][1]); */
    }
}
