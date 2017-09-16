package com.company;
public class Main {
    public static void main(String[] args) {


        int a = 3;
        int b = 4;
        int c = a + b;
        int n = 2;

        Math.pow(a, n);


        if (Math.pow(a, n) + Math.pow(b, n) == Math.pow(c, n)) {
            if (n > 2) {
                System.out.println("Holy smokes, Fermat was wrong!");
            } else {
                System.out.println("It holds!");
            }
        } else {
                    System.out.println("No, that doesn't work");
                }
            }
        }
