package java常用类.字符串相关的类;

import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * String 的使用
 */
public class StringTest {
    @Test
    public void test77777() throws ParseException {
        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getTime());
        new Date(1657103130952L);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yy-MM-dd hh:mm:ss");
        String format = simpleDateFormat.format(date);
        System.out.println(format);

        Date parse = simpleDateFormat.parse("22-07-06 08:03:19");
        System.out.println(parse);
    }
    @Test
    public void test7777(){
        StringBuffer stringBuffer = new StringBuffer("afafjkahagkjaggagakgjagk");
        stringBuffer.append(2);
        stringBuffer.append(2.2356);
        System.out.println(stringBuffer.length());
        System.out.println(stringBuffer.toString());
        stringBuffer.delete(26,31);
        stringBuffer.replace(3,10,"abcdef");
        stringBuffer.insert(10,"ghijk");
        stringBuffer.reverse();
        for (int i = 0; i < stringBuffer.length(); i++) {
            System.out.print(stringBuffer.charAt(i)+",");
        }
        System.out.println("\n" + stringBuffer.length());
    }
    @Test
    public void test777() throws UnsupportedEncodingException {
        String str1 = "124李文阳";
        byte[] bytes = str1.getBytes();
        System.out.println(Arrays.toString(bytes));
        byte[] gbks = str1.getBytes("GBK");
        System.out.println(Arrays.toString(gbks));
        String s = new String(bytes);
        System.out.println(s);
        String s0 = new String(gbks);
        System.out.println(s0);

    }
        @Test
    public void test77(){
        String s = "adnasfmafna";
        System.out.println("charAt(5):  " + s.charAt(5));
        System.out.println("indexOf('a'):  " + s.indexOf('a'));
        String replace = s.replace('a', 'l');
        System.out.println("replace:  " + replace);
        System.out.println("length:  " + s.length());
        String s1 = s.toUpperCase();
        System.out.println("toUpperCase:   " +s1);
        String s2 = s1.toLowerCase();
        System.out.println("toLowerCase:   " + s2);
        String[] abs = s.split("ad");
        System.out.println(Arrays.toString(abs));
        String s3 = "   i eeee efa   ";
        String trim = s3.trim();
        System.out.println("trim:  " + "-----" + trim + "-------");
        System.out.println("isEmpty:   " + s.isEmpty());
        System.out.println("equals:   " + s.equals(s3));
        int i = s.compareTo(s1);
        System.out.println(s + " compareto " + s1 + " =  " +i);
        String a = "abd";
        String A = "Add";
        System.out.println(A.compareTo(a));
        String sa = "helloworld";
        System.out.println(sa.indexOf("lo"));
        System.out.println(sa.lastIndexOf("lo"));
    }
    /*

     */
    @Test
    public void test3(){
        String s1 = "javaEE";
        String s2 = "hadoop";

        String s3 = "javaEEhadoop";
        String s4 = "javaEE" + "hadoop";
        String s5 = s1 + "hadoop";
        String s6 = "javaEE" + s2;
        String s7 = s1 + s2;

        System.out.println(s3 == s4);//true
        System.out.println(s3 == s5);//false
        System.out.println(s3 == s6);//false
        System.out.println(s5 == s6);//false
        System.out.println(s3 == s7);//false
        System.out.println(s5 == s7);//false
        System.out.println(s7 == s6);//false

        String s8 = s5.intern();//返回值得到的s8使用的常量值中已经存在的javaEEhadoop"
        System.out.println(s3 == s8);//true 
    }

    /*
        String的买例化万式: .
            方式一:通过字面量定义的方式
            方式二:通过new +构造器的方式

            面试题: String s = new String( "abc");方式创建对象，在内存中创建了几个对象?
                    两个:一个是堆空间中new结构，另一个是char[]对应的常量池中的数据: "abc
    */
    @Test
    public void test2(){
        //此时的s1和s2的数据javaEE声明在方法区中的字符串常量池中。
        String s1 = "java";
        String s2 = "java";

        //new +构造器的方式:此时的s3和s4保存的地址值，是数据在堆空间中开辟空间以后对应的地址值。
        String s3 = new String("java");
        String s4 = new String("java");

        System.out.println(s1 == s2);//true
        System.out.println(s1 == s3);//false
        System.out.println(s1 == s4);//false
        System.out.println(s3 == s4);//false

        System.out.println("----------------------------------------------------------------");

        Person p1 = new Person("Tom",12);
        Person p2 = new Person("Tom",12);

        System.out.println(p1.name.equals(p2.name));//true
        System.out.println(p1.name == p2.name);//true

        p1.name = "Jerry";
        System.out.println(p2.name);//Tom
    }
    /*
     * String:字符串，使用一对""引起来表示。
     * 1.String声明为final的,不可被继承
     * 2.String实现了Serializable接口: 表示字符串是支持序列化的。
     *         实现了Comparable接口:表示String 可以比较大小
     * 3.String内部定义了final char[] value用于存储字符串数据
     * 4.String:代表不可变的字符序列。简称:不可变性。
     *   体现: 1.当对字符串重新赋值时，需要重写指定内存区域赋值，不能使用原有的value进行赋值。
     *        2.当对现有的字符串进行连接操作时，也需要重新指定内存区域赋值，不能使原有的value进行赋值。
     *        3.当调用String的replace（）方法修改指定字符或字符串时，也需要重新指定内存区域赋值，不能使原有的value进行赋值。
     * 5.通过字面量的方式(区别于new)给-一个字符串赋值，此时的字符串值声明在字符串常量池中。
     * 6.字符串常量池中是不会存储相同内容的字符串的。

     */

    @Test
    public void test1(){
        String s1 = "abc";//字面值的定义方式
        String s2 = "abc";
        s1 = "hello";

        System.out.println(s1 == s2);//比较s1和s2的地址值

        System.out.println(s1);//hello
        System.out.println(s2);//abc

        System.out.println("----------------------------------------------------------------");

        String s3 = "abc";
        s3 += "def";
        System.out.println(s3);//abcdef
        System.out.println(s2);//abc

        System.out.println("----------------------------------------------------------------");

        String s4 = "abc";
        String s5 = s4.replace('a', 'm');
        System.out.println(s4 + "  " + s5);//abc  mbc
    }

}
