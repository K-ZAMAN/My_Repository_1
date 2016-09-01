package com.zaman.test1;

public class StdOut {
	public static long fib(int n) {
        if (n <= 1) return n;
        else return fib(n-1) + fib(n-2);
    }

    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        for (int i = 1; i <= N; i++)
            StdOut.print(i + ": " + fib(i));
    }

	private static void print(String string) {
		// TODO Auto-generated method stub
		
	}

}
