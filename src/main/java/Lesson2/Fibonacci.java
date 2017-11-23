package Lesson2;

public class Fibonacci {

    public void printFibonacciNumbers(int numberCounts) {
        int a = 0;
        int b = 1;
        System.out.print(a + " " + b + " ");
        for(int i = 0; i < numberCounts - 2; ++i) {
            int sum = a + b;
            System.out.print(sum + " ");
            a = b;
            b = sum;
        }
    }
}
