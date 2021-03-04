package ClassPackage;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_Demo {
    public static void main(String[] args) {
        try {
            System.out.println(new Date( ) + "\n");
            Thread.sleep(1000*3);   // 休眠3秒
            System.out.println(new Date( ) + "\n");
        } catch (Exception e) {
            System.out.println("Got an exception!");
        }
        demo();
        demo1();
    }

     private static void demo(){
        Date date = new Date();
        String time = date.toString();
         System.out.println(time);
     }

     private static void demo1(){
        Date date1 = new Date();
         SimpleDateFormat SF = new SimpleDateFormat("GG-yyyy-MM-dd hh:mm:ss");  //指定格式化日期
         System.out.println(SF.format(date1));
         System.out.printf("全部日期和时间信息：%tc%n",date1);     //格式化输出打印时间信息

         String input = "AD-2017-03-15 12:34:20";
         try {
            Date t = SF.parse(input);
             System.out.println(t);
         } catch (ParseException e) {
             System.out.println("Unparseable using " + SF);
         }
     }
}
