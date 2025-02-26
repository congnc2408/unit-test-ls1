
import core.MathUltil;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

//báo hiệu rằng sẽ cần loop qua tập data để 
// lặp lấy cặp data input/expected nhồi vào hàm test
@RunWith(value = Parameterized.class)
public class MathUtilDDTTest {

    @Parameterized.Parameters // Junit sẽ ngầm chạy loop qua từng dòng của mảng 
    //để lấy ra được cặp data input/expected
    // tên hàm không quan trọng, quan trọng là @
    public static Object[][] initData() {
        return new Integer[][]{
            {0, 1},
            {1, 1},
            {2, 2},
            {3, 6},
            {4, 24},
            {5, 120}
        };
        //int a[][] = {{2,4},{6,8},{},{}};
    }
    //giả sử loop qua từng dòng của mảng, ta vẫn cần gán từng value của cột
    // vào biến tương ứng input/expected để lát hồi feed cho hàm
    //
    @Parameterized.Parameter(value = 0) //value = 0 là map với mảng data
    public int n; // biến map với value của cột 0 của mảng
    @Parameterized.Parameter(value = 1)
    public long expected;
    
    @Test
    public  void testGetFactorialGivenRigtArgumentReturnsWell(){      
        Assert.assertEquals(expected, MathUltil.getFactorial(n));
        
    }
}
