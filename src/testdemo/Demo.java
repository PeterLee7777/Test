package testdemo;

import compare.Goods;
import org.junit.Test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAccessor;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Properties;

public class Demo {

    @Test
    public void test1(){
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(localDate);
        System.out.println(localTime);
        System.out.println(localDateTime);

        LocalDateTime localDateTime1 = LocalDateTime.of(2022, 7, 7, 10, 18, 20);
        System.out.println(localDateTime1);

        int dayOfMonth = localDate.getDayOfMonth();
        System.out.println(dayOfMonth);
        System.out.println(localDate.getMonthValue());
        System.out.println(localDate.getMonth());
        LocalDate localDate1 = localDate.plusMonths(6);
        LocalDateTime localDateTime2 = localDateTime.minusDays(2);
        System.out.println(localDateTime2);
        System.out.println(localDate1);
    }

    @Test
    public void Instant(){
        Instant now = Instant.now();
        System.out.println(now);

        OffsetDateTime offsetDateTime = now.atOffset(ZoneOffset.ofHours(8));
        System.out.println(offsetDateTime);

        long epochSecond = now.getEpochSecond();
        System.out.println(epochSecond);

        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd__hh:mm:ss");
        String format = dateTimeFormatter.format(localDateTime);
        System.out.println(format);

        TemporalAccessor parse = dateTimeFormatter.parse("2022-07-07__10:48:40");
        System.out.println(parse);

        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        System.out.println(localDateTime);
        LocalDateTime localDateTime1 = localDateTime.withDayOfMonth(20);
        String format1 = dateTimeFormatter1.format(localDateTime);
        System.out.println(format1);

        Duration between = Duration.between(localDateTime, localDateTime1);
        System.out.println(between);
    }
    @Test
    public void test2(){

        Goods[] goods = new Goods[4];
        goods[0] = new Goods("华为",6666);
        goods[1] = new Goods("苹果",7699);
        goods[2] = new Goods("小米",5699);
        goods[3] = new Goods("一加",4688);
        Arrays.sort(goods);
        System.out.println(Arrays.toString(goods));
    }
    @Test
    public void test3(){
//        Properties properties = System.getProperties();
//        System.out.println(properties.toString());
//        String property = System.getProperty("user.dir");
//        System.out.println(property.toString());
        BigInteger bigInteger = new BigInteger("15548484564564668485421326848");
        BigDecimal bigDecimal = new BigDecimal("253.231566333");
        BigInteger bigInteger1 = new BigInteger("22356");
        BigInteger divide = bigInteger.divide(bigInteger1);
        System.out.println(divide);
    }
}
