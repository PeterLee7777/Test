package 异常;

import org.junit.Test;

import java.util.Scanner;

public class ExceptionTest2 {

    @Test
    public void test1(){
        int[] a = null;
        System.out.println(a[3]);

    }
    @Test
    public void test2(){
        String s = "as";
        s = null;
        System.out.println(s);


    }
}

