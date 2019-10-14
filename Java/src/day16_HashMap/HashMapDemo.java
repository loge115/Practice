package day16_HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author loge
 * @date 2019-09-17 11:20
 */
public class HashMapDemo {
    public static void main(String[] args) {
        Map<Integer,Student> m = new HashMap<Integer, Student>();
        Student s1 = new Student("loge",18);
        Student s2 = new Student("wx",19);
        Student s3 = new Student("lyu",17);
        m.put(001,s1);
        m.put(002,s2);
        m.put(003,s3);
        //key:values遍历
/*        Set<Map.Entry<Integer, Student>> entries = m.entrySet();
            for (Map.Entry<Integer,Student> me:entries){
            Integer key = me.getKey();
            Student value = me.getValue();
            System.out.println(key+value.getName()+value.getAge());
        }*/
        //key遍历
        Set<Integer> keySet = m.keySet();
        for (Integer k:keySet){
            Student student = m.get(k);
            System.out.println(k+student.getName()+student.getAge());
        }
    }
}
