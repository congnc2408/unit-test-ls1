/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import core.MathUltil;
import java.beans.ExceptionListener;
import org.junit.Assert;
import org.junit.Test;


/**
 *
 * @author congnc
 */
public class TestFramework {
    
//    @Test(expected = NumberFormatException.class)
    @Test(expected = IllegalArgumentException.class)
    public  void testGetFactorialGivenRigtArgumentReturnsWell(){
//        int  n =0;
//        long expteced = 1;
//        long actual = MathUltil.getFactorial(n);
//        
        Assert.assertEquals(1, MathUltil.getFactorial(1));
        Assert.assertEquals(2, MathUltil.getFactorial(2));
        Assert.assertEquals(6, MathUltil.getFactorial(3));
        Assert.assertEquals(24, MathUltil.getFactorial(4));
        Assert.assertEquals(120, MathUltil.getFactorial(5));
        MathUltil.getFactorial(-5);
    }
    
    @Test
    public  void testGetFactorialGivenRigtArgumentReturnsWell_WithLambda(){
        Assert.assertThrows(IllegalArgumentException.class, ()->{
            MathUltil.getFactorial(21);
        });
    }
   
    @Test
    public  void testGetFactorialGivenRigtArgumentReturnsWell_TryCatch(){
        try {
            MathUltil.getFactorial(-5);
        } catch (Exception e) {
            Assert.assertEquals("Invalid argument", e.getMessage());
        }
    }
}
