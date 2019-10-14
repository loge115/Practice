package day11;

/**
 * @author loge
 * @date 2019-09-12 11:38
 */
public class BasketballAthlete extends Athlete{
    public BasketballAthlete() {
    }

    public BasketballAthlete(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("篮球运动员吃健康食物");
    }

    @Override
    public void study() {
        System.out.println("篮球运动员练习篮球");
    }
}
