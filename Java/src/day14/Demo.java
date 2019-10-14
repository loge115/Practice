package day14;

import java.util.*;

/**
 * @author loge
 * @date 2019-10-09 15:27
 */
public class Demo {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int num = o2.getAge()-o1.getAge();
                int num2 = num==0?o1.getHeight()-o2.getHeight():num;
                int num3 = num2 == 0 ? o1.getName().compareTo(o2.getName()) : num2;
                return num3;
            }
        });
        Student wx = new Student("wx", 20, 172);
        Student loge = new Student("loge", 18, 178);
        Student yuan = new Student("yuan", 23, 177);
        Student lyu = new Student("lyu", 18, 172);
        ts.add(wx);
        ts.add(loge);
        ts.add(yuan);
        ts.add(lyu);
        for (Student t : ts) {
            System.out.println(t);
        }
    }
}

