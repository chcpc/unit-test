package chcpc;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * Created by xuhongchuan on 2015/7/18.
 */
public class MathTest {

    @Test
    public void testFactorial() throws Exception {

        assertEquals(120, new Math().factorial(5));

        assertEquals(120, new Math().factorial(-1));
    }

    @Test
    public void fibonacci() throws Exception {
        assertEquals(21, new Math().fibonacci(9));
    }

    @Test(expected = Exception.class)
    public void testFactorialException() throws Exception {
        new Math().factorial(-1);
        fail("factorial参数为负数没有抛出异常");
    }

    @Test(timeout = 2000)
    public void testSort() throws Exception {
        int[] arr = new int[50000]; //数组长度为50000
        int arrLength = arr.length;
        //随机生成数组元素
        Random r = new Random();
        for (int i = 0; i < arrLength; i++) {
            arr[i] = r.nextInt(arrLength);
        }

        new Math().sort(arr);
    }
}
