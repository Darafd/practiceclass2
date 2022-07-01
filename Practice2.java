package kz.practice.secondLesson;
import java.util.Scanner;

public class Practice2 {
/* Задание 7
    Напишите программу, где ввожу два целых числа. Если они отличаются на 100, то выведите YES, иначе NO.
    Ввод:   100
            200
    Вывод:  YES

    Ввод:   100
            189
    Вывод:  NO
*/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int a = in.nextInt();
        int b = in.nextInt();
            
        if(a - b == 100) System.out.println("Yes");
        else  System.out.println("No");
               

    }
}
