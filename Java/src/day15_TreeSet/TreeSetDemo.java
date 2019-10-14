package day15_TreeSet;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author loge
 * @date 2019-09-15 20:54
 */
public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Student> treeSet = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                //主要条件 总分从高到低
                int i = o2.getSum() - o1.getSum();
                //次要条件1 数学从高到低
                //次要条件2 姓名首字母降序排列
                int i1 = i == 0 ? o2.getMath() - o1.getMath() : i;
                int i2 = i1 == 0 ? o1.getName().compareTo(o2.getName()) : i1;
                return i2;
            }
        });
        Student s1 = new Student("loge", 85, 80);
        Student s2 = new Student("wx", 80, 85);
        Student s3 = new Student("lyu", 90, 90);
        Student s4 = new Student("aYuan", 75, 80);
        Student s5 = new Student("aTao", 90, 90);
        treeSet.add(s1);
        treeSet.add(s2);
        treeSet.add(s3);
        treeSet.add(s4);
        treeSet.add(s5);
        for (Student s :
                treeSet) {
            System.out.println(s.getName() + "数学" + s.getMath() + "分" + "英语" + s.getChinese() + "分" + "总分" + s.getSum());
        }
    }
}
