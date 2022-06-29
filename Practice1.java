package kz.practice.secondLesson;
import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
/*
Задание 1
Даны два целых числа. Выведите значение наибольшего из них.

    Ввод:   45 78
    Вывод:  78

    Ввод:   34 11
    Вывод:  34
*/
        // task #1
        int a = in.nextInt();
//        int b = in.nextInt();
//        if(a>b) System.out.println(a);
//        else System.out.println(b);

/*
Задание 2
Напишите программу, где ввожу число n, и если оно между 10 и 20, то программа выведет YES иначе NO.

    Ввод:   14
    Вывод:  YES

    Ввод:   26
    Вывод:  NO
*/
        // task #2
//        System.out.println();
//        int n = in.nextInt();
//        if(n >= 10 && n <=20) System.out.println("YES");
//        else System.out.println("NO");

/*
Задание 3
Напишите программу, где ввожу целое число n, и если оно четное, программа выведет EVEN иначе ODD.
    Ввод:   8
    Вывод:  EVEN

    Ввод:   13
    Вывод:  ODD
*/
        // task #3
//        System.out.println();
//        if(n <= 0) System.out.println("NO");
//        else if(n % 2 == 0) System.out.println("EVEN");
//        else System.out.println("ODD");


/*
Задание 4
Дано число.
Если оно меньше или равно 2019, то вывести NO, если больше или равно 2021,
то вывести YES, если равно 2020, то вывести Error.

    Ввод:   2018
    Вывод:  NO

    Ввод:   2020
    Вывод:  Error
*/
        // task #4
//        System.out.println();
//        if(a <= 2019) System.out.println("NO");
//        else if(a >= 2021) System.out.println("YES");
//        else if(a == 2020) System.out.println("ERROR");

/*
Задание 5
Напишите программу, где ввожу номер дня недели(1-7). Выведите название дня недели.

    Ввод:   6
    Вывод:  Saturday

    Ввод:   1
    Вывод:  Monday
*/
        // task #5
//        System.out.println();
//        int dayNumber = in.nextInt();
//        String dayValue = "";
//        switch(dayNumber){
//            case 1: dayValue = "Monday";
//                break;
//            case 2: dayValue = "Tuesday";
//                break;
//            case 3: dayValue = "Wednesday";
//                break;
//            case 4: dayValue = "Thursday";
//                break;
//            case 5: dayValue = "Friday";
//                break;
//            case 6: dayValue = "Saturday";
//                break;
//            case 7: dayValue = "Sunday";
//                break;
//            default: dayValue = "No day";
//        }
//        System.out.println(dayValue);

/*
Задание 6
Напишите программу, где ввожу целое число.
Если оно больше 100 или меньше -100,
то меняем значение переменной на 0, иначе увеличьте его на 1.

    Ввод:   101
    Вывод:  0

    Ввод:   88
    Вывод:  89
*/

        // task #6
        System.out.println();
        if(a >= 100 || a <= -100){
            a = 0;
            System.out.println(a);
        }
        else {
            a++;
            System.out.println(a);
        }
    }
}
