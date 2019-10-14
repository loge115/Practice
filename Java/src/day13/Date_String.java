package day13;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author loge
 * @date 2019-09-14 9:23
 */
public class Date_String {
    public Date_String() {
    }
    public String dateToString(Date d,String format){
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        String s = sdf.format(d);
        return s;
    }
    public Date stringToDate(String s,String format) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        Date parse = sdf.parse(s);
        return parse;
    }
}
