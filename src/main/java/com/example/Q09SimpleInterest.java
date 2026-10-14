package com.example;

public class Q09SimpleInterest {
    public static double simpleInterest(double principal, double rate, double time) {
        if (!Double.isFinite(principal) || !Double.isFinite(rate) || !Double.isFinite(time)
                || principal < 0 || rate < 0 || time < 0) {
            throw new IllegalArgumentException("Principal, rate and time must be finite and non-negative.");
        }
        return principal * rate * time / 100.0;
    }

    public static void main(String[] args) {
        double principal = args.length > 0 ? Double.parseDouble(args[0]) : 1000;
        double rate = args.length > 1 ? Double.parseDouble(args[1]) : 5;
        double time = args.length > 2 ? Double.parseDouble(args[2]) : 2;
        System.out.println("Simple interest = " + simpleInterest(principal, rate, time));
    }
}
