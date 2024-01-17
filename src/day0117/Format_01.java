package day0117;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Format_01 {
    public static void main(String[] args) {

        Date date = new Date();
        System.out.println(date);

        // 양식에 맞춰 출력하기
        // HH는 24시간 기준, MM: 월, mm: 분
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        System.out.println(simpleDateFormat1.format(date));

        // a: 오전,오후     hh: 12시간 기준
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss");
        System.out.println(simpleDateFormat2.format(date));

        // EEE: 요일 짧게(수)     EEEE: 요일 길게(수요일)
        SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("yyyy-MM-dd a HH:mm EEEE");
        System.out.println(simpleDateFormat3.format(date));

        // NumberFormat 숫자를 문자열로 변환하여 출려
        int money = 45_887_020;
        double num = 98765.451214;

        NumberFormat numberFormat1 = NumberFormat.getCurrencyInstance(); // 화폐단위와 컴마
        System.out.println(numberFormat1.format(money));

        NumberFormat numberFormat2 = NumberFormat.getInstance(); // 컴마
        System.out.println(numberFormat2.format(money));
        System.out.println(numberFormat2.format(num));




    }
}
