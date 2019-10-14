package day11;

/**
 * @author loge
 * @date 2019-09-12 11:35
 */
public class PingPangAthlete extends Athlete implements inter{
    public PingPangAthlete() {
    }

    public PingPangAthlete(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("乒乓球运动员吃健康食物");
    }

    @Override
    public void study() {
        System.out.println("乒乓球运动员练习乒乓");
    }

    @Override
    public void studyEnglish() {
        System.out.println("乒乓球运动员学习英语");
    }
}
