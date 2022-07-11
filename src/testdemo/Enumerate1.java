package testdemo;

import java.util.Arrays;

public class Enumerate1 {

    public static void main(String[] args) {
        Season1 spring = Season1.SPRING;
        System.out.println(spring);
        System.out.println(Arrays.toString(Season1.values()));
        Season1 winter = Season1.valueOf("WINTER");
        System.out.println(winter.getSeasonDesc());

    }
}
enum Season1{
    //1提供当前枚举类的对象，多个对象之间用逗号隔开，最后一个用分号
    SPRING("春天","春暖花开"),
    SUMMER("夏天","夏日炎炎"),
    AUTUMN("秋天","秋高气爽"),
    WINTER("冬天","冰天雪地");

    private final String seasonName;
    private final String seasonDesc;

    private  Season1(String seasonName,String seasonDesc){
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }


    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

//    @Override
//    public String toString() {
//        return "Season{" +
//                "seasonName='" + seasonName + '\'' +
//                ", seasonDesc='" + seasonDesc + '}';
//    }
}