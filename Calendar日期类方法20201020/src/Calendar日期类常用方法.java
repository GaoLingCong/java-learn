/*
    Calendar类的常用成员方法:
        public int get(int field)：返回给定日历字段的值。
        public void set(int field, int value)：将给定的日历字段设置为给定值。
        public abstract void add(int field, int amount)：根据日历的规则，为给定的日历字段添加或减去指定的时间量。
        public Date getTime()：返回一个表示此Calendar时间值（从历元到现在的毫秒偏移量）的Date对象。
    成员方法的参数:
        int field:日历类的字段,可以使用Calendar类的静态成员变量获取
            public static final int YEAR = 1;	年
            public static final int MONTH = 2;	月
            public static final int DATE = 5;	月中的某一天
            public static final int DAY_OF_MONTH = 5;月中的某一天
            public static final int HOUR = 10; 		时
            public static final int MINUTE = 12; 	分
            public static final int SECOND = 13;	秒
 */


import java.util.Calendar;
import java.util.Date;

public class Calendar日期类常用方法 {
    public static void main(String[] args) {
        System.out.println("============方法一分界线=============");
        method1();
        System.out.println("============方法二分界线=============");
        method2();
        System.out.println("============方法三分界线=============");
        method3();
        System.out.println("============方法四分界线=============");
        method4();

    }


    /*  方法一：
        public int get(int field)：返回给定日历字段的值。
        参数:传递指定的日历字段(YEAR,MONTH...)
        返回值:日历字段代表的具体的值
     */
    private static void method1() {
        //第一步使用getInstance方法获取Calendar对象
        Calendar c = Calendar.getInstance();
        //第二步传入需要参数并接收
        int year = c.get(Calendar.YEAR);//接收年
        System.out.println(year);

        int month = c.get(Calendar.MONTH);//接收月
        System.out.println(month);

        int date = c.get(Calendar.DATE);//接收月中某一天
        System.out.println(date);

        int DAY_MONTH = c.get(Calendar.DAY_OF_MONTH);//接收月中某一天
        System.out.println(DAY_MONTH);

    }

    /*  方法二：
        public void set(int field, int value)：将给定的日历字段设置为给定值。
        参数:
            int field:传递指定的日历字段(YEAR,MONTH...)
            int value:给指定字段设置的值
     */
    private static void method2()
    {
        //第一步使用getInstance方法获取Calendar对象
        Calendar c = Calendar.getInstance();
        //设置年为2000
        c.set(Calendar.YEAR,2000);
        //设置月为10月
        c.set(Calendar.MONTH,9);
        //设置日为20日
        c.set(Calendar.DATE,20);

        //同时设置年月日  可以使用set的重载方法
        c.set(2000,10,8);

        int month1 = c.get(Calendar.DATE);
        System.out.println(month1);//西方的月份0—11 东方：1——12

        int date=c.get(Calendar.DATE);
        System.out.println(date);
    }


    /*
        方法3：
        public abstract void add(int field, int amount)：根据日历的规则，为给定的日历字段添加或减去指定的时间量。
        把指定的字段增加/减少指定的值
        参数:
            int field:传递指定的日历字段(YEAR,MONTH...)
            int amount:增加/减少指定的值
                正数:增加
                负数:减少
     */

    private static void method3()
    {
        //第一步使用getInstance方法获取Calendar对象
        Calendar c = Calendar.getInstance();
        //把年增加2年
        c.add(Calendar.YEAR,2);
        //把月份减少3个月
        c.add(Calendar.YEAR,-3);



        int year = c.get(Calendar.YEAR);
        System.out.println(year);

        int month = c.get(Calendar.MONTH);
        System.out.println(month);//西方的月份0-11 东方:1-12

        //int date = c.get(Calendar.DAY_OF_MONTH);
        int date = c.get(Calendar.DATE);
        System.out.println(date);

    }


    /*
        方法4：
        public Date getTime()：返回一个表示此Calendar时间值（从历元到现在的毫秒偏移量）的Date对象。
        把日历对象,转换为日期对象
     */

    private static void method4()
    {
        //第一步使用getInstance方法获取Calendar对象
        Calendar c = Calendar.getInstance();

        Date date = c.getTime();
        System.out.println(date);

    }

}
