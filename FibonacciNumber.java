
/*
* The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,

F(0) = 0, F(1) = 1
F(n) = F(n - 1) + F(n - 2), for n > 1.
Given n, calculate F(n).*/
public class FibonacciNumber {
    public int recursiveFibonacci(int num) {
        if (num == 0 || num == 1)
            return num;
        else
           return recursiveFibonacci(num-1) + recursiveFibonacci(num - 2);
    }
    public static void main(String[] arg) {
       FibonacciNumber sol = new FibonacciNumber();
        System.out.println(sol.recursiveFibonacci(8));
    }
}
