package day13;

import java.text.ParseException;
import java.util.Date;

/**
 * @author loge
 * @date 2019-09-14 9:41
 */
public class DateDemo {
    public static void main(String[] args) throws ParseException {
        Date_String ds = new Date_String();
        Date d = new Date();
        String s = ds.dateToString(d, "yyy年MM月dd日 HH:mm:ss");
        System.out.println(s);
        Date date = ds.stringToDate("2014-9-2 11:11:11", "yyy-M-d HH:mm:ss");
        System.out.println(date);
    }
}
