/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import core.MathUltil;

/**
 *
 * @author congnc
 */
public class Main {
    public static void main(String[] args) {
        long expected = 120;
        int n = 5;
        long actual = MathUltil.getFactorial(n);
        System.out.println("5! = "+ actual );
    }
}
