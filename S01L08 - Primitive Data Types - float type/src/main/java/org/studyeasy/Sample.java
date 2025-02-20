package org.studyeasy;
/* Author: Chand Sheikh */

public class Sample {
    public static void main(String[] args) {
        float max = 3.40282346638528860e+38f;  // 4 byte
        float min = 1.40129846432481707e-45f;
        double doubleMax = 1.79769313486231570e+308d;  // 8 byte
        double doubleMin = 4.94065645841246544e-324d;

        System.out.println(doubleMax);
        System.out.printf("%.2f",doubleMax);

    }
}
