package day11;

/**
 * @author loge
 * @date 2019-09-12 11:46
 */
public class PingPangTeacher extends Teacher implements inter{
    public PingPangTeacher() {
    }

    public PingPangTeacher(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("乒乓球教练吃好吃的");
    }

    @Override
    public void teach() {
        System.out.println("乒乓球教练教乒乓");
    }

    @Override
    public void studyEnglish() {
        System.out.println("乒乓球教练也要学习英语");
    }
}
