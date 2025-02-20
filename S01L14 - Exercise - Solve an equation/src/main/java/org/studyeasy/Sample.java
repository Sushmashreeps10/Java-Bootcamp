package org.studyeasy;
/* Author: Chand Sheikh */

public class Sample {
    public static void main(String[] args) {
        // (a+b)^2 = a^2 + 2ab + b^2
        int a = 25;
        float b = 42.159f;
        int value = (int)(a*a + 2*(a*b) + b*b);
        System.out.println(value);

    }
}
