package day11;

/**
 * @author loge
 * @date 2019-09-12 11:31
 */
public class Demo {
    public static void main(String[] args) {
        PingPangAthlete ppa = new PingPangAthlete();
        ppa.eat();
        ppa.study();
        ppa.studyEnglish();
        BasketballTeacher bt = new BasketballTeacher();
        bt.teach();
        long t = System.currentTimeMillis();
        System.out.println(t);
    }
}
