package homework;

import java.util.*;

/**
 * @author loge
 * @date 2019-10-12 11:53
 */
public class Day16_2 {
    public static void main(String[] args) {
        Student s1 = new Student("小明", 18);
        Student s2 = new Student("小张", 20);
        Student s3 = new Student("小花", 16);
        HashMap<Student, ArrayList> hm = new HashMap<>();
        Random random = new Random();
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list1.add(random.nextInt(51) + 50);
        }
        hm.put(s1, list1);
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list2.add(random.nextInt(51) + 50);
        }
        hm.put(s2, list2);
        ArrayList<Integer> list3 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list3.add(random.nextInt(51) + 50);
        }
        hm.put(s3, list3);
        for (Student student : hm.keySet()) {
            String name = student.getName();
            int age = student.getAge();
            System.out.println("姓名:"+name+",年龄:"+age+",最近5次考试成绩:"+hm.get(student).toString());
        }
    }
}
