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
        //Netbeans 8. mặc định khi tạo project, tạo unitest , clean and build nó không 
        //chạy bộ unit test để kiểm tra xanh đỏ dù gọi trực tiếp clean & build trong NB hay
        //gọi ở cửa sổ CMD bằng lệnh ant
        //muốn NB 8. khi đóng gói app phải chạy bộ Test trước khi đóng gói(.jar,.war)
        // ta phải độ lại tập tin build-impl.xml
        // bằng cách giọi lệnh test trong tập lệnh .xml này
        //mở file tìm dòng 1005, bổ sung thêm
        //<target depends="init,compile
        //<target depends="init,compile,test
        //NB 13 không cần làm, mặc định ant sẽ chạy test ở cmd nhưng vẫn cần chỉnh sửa
        //ở file này khi clean&build
        
    }
}
