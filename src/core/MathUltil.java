/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

/**
 *
 * @author congnc
 */
public class MathUltil {

    public static long getFactorial(int n) {
        int product = 1;
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid argument");
        }

        if (n == 0 || n == 1) {
            return 1; // ket thuc 
        }
        for (int i = 2; i <= n; i++) {
            product *= i;
        }

        return product;
    }
}
