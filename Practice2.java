package kz.practice.secondLesson;
import java.util.Scanner;

public class Practice2 {
/* 
Задание 7
    Напишите программу, где ввожу два целых числа. Если они отличаются на 100, то выведите YES, иначе NO.
    Ввод:   100
            200
    Вывод:  YES

    Ввод:   100
            189
    Вывод:  NO
    
 Задание 8
    Напишите программу, где ввожу три целых числа. Найдите наибольшее число из них.
    Ввод:   100
            200
            300
    Вывод:  300
   
    Ввод:   15
            44
           -12
    Вывод:  44
    
  Задание 9
    Напишите программу, где ввожу три целых числа. Найдите наименьшее число из них.
    Ввод:   100
            200
            300
    Вывод:  100
 
    Ввод:   15
            44
           -12
    Вывод: -12
 
  Задание 10
    Напишите программу, где ввожу четыре целых числа. Найдите наибольшее четное число среди них. Если оно не существует, выведите Not Found.
    Ввод: 12 37 200 45
    Вывод:200
    
    Ввод: 19 37 201 453
    Вывод:Not Found 
*/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        //task #7
        int a = in.nextInt();
        int b = in.nextInt();
            
        if(a - b == 100) System.out.println("Yes");
        else  System.out.println("No");
        
        //task #8
        int a1 = in.nextInt();
        int b1 = in.nextInt();
        int c1 = in.nextInt();
        
         if(a1 >= b1 && a1 >= c1){
                System.out.println(a1);
        }

        else if(b1 >= a1 && b1 >= c1){
                System.out.println(b1);
        }

        else System.out.println(c1);
        
        //task #9
        int a2 = in.nextInt();
        int b2 = in.nextInt();
        int c2 = in.nextInt();
        
        if(a2 <= b2 && a2 <= c2){
            System.out.println(a2);
        }
        else if(b2 <= a2 && b2 <= c2){
            System.out.println(b2);
        }
        else System.out.println(c2);

        //task #10
        
    }
}
