/*
 * APCS-A - Mixed Loop Practice
 *
 * This program is to give you practice writing methods that use for loops. Your
 * task is to study the code and output for methods that I have completed. Then
 * you should complete and test the methods that are incomplete or missing.
 *
 *  1) oneToThirtyF    - uses a for loop to print the set {1, 2, 3, ... , 30}.
 *
 *  2) oneToThirtyW    - uses a while loop to print the set {1, 2, 3, ... , 30}.
 *
 *  3) twentyToZeroF   - uses a for loop to print the set {20, 18, 16, ... , 0}.
 *
 *  4) twentyToZeroW   - uses a while loop to print the set {20, 18, 16, ... , 0}.
 *
 *  5) countMtoN       - uses a while loop to print the set {m, m+1, m+2, ... , n}.
 *
 *  6) sumN            - uses a while loop to find and return the sum of the first
 *                       n positive integers.
 *
 *  7) perfectSquaresF - uses a for loop to print the first n perfect squares.
 *
 *  8) sumSquaresW     - uses a while loop find and return the sum of the first n
 *                       perfect squares.
 *
 *  9) iLoveJava       - uses a while loop to print the sentence "I love java." n
 *                       times.
 *
 * 10) divBy2and9      - uses a for loop to count from 1 to 100 by ones, but only
 *                       values that are evenly divisible by 2 and 9 are printed.
 *                       (you'll need to use an if statement.)
 *
 * 11) divBy3and8      - uses a while loop to count from 1 to 100 by ones, but only
 *                       values that are evenly divisible by 3 and 8 are printed.
 *                       (you'll need to use an if statement.)
 *
 * 12) divBy5or7Sum    - uses a while loop to find and return the sum of all values in
 *                       the set {1, 2, 3, ... , 10000} that are divisible by 5 or 7.
 *
 * 13) fizzBuzz        - uses a while loop to count from 1 to n by ones. However,
 *                       if a number is divisible by 3, the word "bizz" should be
 *                       printed, and if the number is divisible by 5, "buzz" should
 *                       be printed. Sample output:
 *
 *                       1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14,
 *                       Fizz Buzz, 16, 17, Fizz, 19, Buzz, Fizz, 22, 23, Fizz, ...
 *
 * 14) sumDigits       - finds and return the sum of the digits in an int.
 *
 * 15) countEvens      - finds and returns the number of even digits in an int.
 *
 * 16) hasDigit        - return true if a number n contains the digit d and false otherwise.
 *
 * 17) hasMoreEvens    - returns true if a number n has more even digits than odd digits
 *                       and false otherwise.
 *
 *  ------------------------------------------------------------------------------
 *
 * @author  your name
 * @version date
 */

import java.util.ArrayList;

public class MixedLoopPractice
 {
    public static void oneToThirtyF(){
        for(int i = 1; i <= 30; i++){
            System.out.print(i + " ");
        }
        System.out.println("Done");
    }

    public static void oneToThirtyW(){
        int i = 1;
        while(i <= 30){
            System.out.print(i + " ");
            i ++;
        }
        System.out.println("Done");
    }

    public static void twentyToZeroF(){
        for(int i = 20; i > 0; i--){
            System.out.print(i + " ");
        }
        System.out.println("Done");
    }

    public static void twentyToZeroW(){
        int i = 20;
        while(i > 0){
            System.out.print(i + " ");
            i--;
        }
        System.out.println("Done");
    }

    public static void countMtoN(int m, int n){
        while(m <= n){
            System.out.print(m + " ");
            m++;
        }
        System.out.println("Done");
    }

    public static void sumN(int n){
        int i = 0;
        int m = 0;
        while(i <= n){
            m += i;
            i++;
        }
        System.out.println(m);
    }

    public static void perfectSquaresF(int n){
        for(int i = 0; i <= n; i++){
            System.out.print(i * i + " ");
        }
        System.out.println("Done");

    }

    public static void sumSquaresW(int n){
        int i = 0;
        int sum = 0;
        while(n >= i){
            sum = sum + (i * i);
            i++;
        }
        System.out.println(sum);
    }

    public static void iLoveJava(int n){
        int i = 0;
        while(i <= n){
            System.out.println("I Love Java!");
            i++;
        }
    }

    public static void divBy2and9(){
        for(int i=1; i<=100; i++){
            if (i % 2 == 0 && i % 9 == 0){
                System.out.print(i + " ");
            }
        }
        System.out.println("Done");
    }

    public static void divBy3and8(){
        int i = 0;
        while(i <= 100){
            if(i % 3 == 0 && i % 8 == 0){System.out.print(i + " ");}
            i++;
        }
        System.out.println("Done");
    }

    public static void divBy5or7Sum(){
        int i = 0;
        while(i <= 1000){
            if(i % 5 == 0 || i % 7 == 0){System.out.print(i + " ");}
            i++;
        }
        System.out.println("Done");
    }

    public static void fizzBuzz(int n){
        for(int i = 0; i < n; i++){
            if(i % 3 == 0 && i % 5 ==0){System.out.print("FizzBuzz ");}
            else if(i % 3 == 0){System.out.print("Fizz ");}
            else if(i % 5 == 0){System.out.print("Buzz ");}
            else{System.out.print(i + " ");}
        }
        System.out.println("Done!");
    }

    public static int sumDigits(int n){
        int sum = 0;
        String num = Integer.toString(n);
        ArrayList<Integer> ints = new ArrayList<Integer>();

        for(int i = 0; i < num.length(); i++){
            ints.add(Integer.parseInt(num.substring(i, i+1)));
        }

        for (int i : ints) {
            sum = sum + i;
        }

        return sum;
    }

    public static int countEvens(int n){
        int count = 0;
        String num = Integer.toString(n);
        ArrayList<Integer> ints = new ArrayList<Integer>();

        for(int i = 0; i < num.length(); i++){
            ints.add(Integer.parseInt(num.substring(i, i+1)));
        }
        for (int i : ints) {
            if (i % 2 == 0){count++;}
        }
        return count;

    }

    public static boolean hasDigit(int n, int d){

        while(n != 0){
            if(n % 10 == d){return true;}
            n = n /10;
        }
        return false;
    }

    public static boolean hasMoreEvens(int n){
        int even = 0;
        int odd = 0;
        while(n != 0){
            if(n % 2 == 0){even++;}
            else{odd++;}
            n = n /10;
        }
        return even > odd;
    }
    // keep making methods here

    public static void main(String[] args){
        oneToThirtyF();
        oneToThirtyW();
        twentyToZeroF();
        twentyToZeroW();
        countMtoN(10, 20);
        sumN(20);
        perfectSquaresF(10);
        sumSquaresW(10);
        iLoveJava(10);
        divBy2and9();
        divBy3and8();
        divBy5or7Sum();
        fizzBuzz(100);
        System.out.println(sumDigits(1212));
        System.out.println(countEvens(121212));
        System.out.println(hasDigit(9090,1));
        System.out.println(hasMoreEvens(212));


        // test your methods here
    }
 }

