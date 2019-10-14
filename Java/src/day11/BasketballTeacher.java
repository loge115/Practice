package day11;

/**
 * @author loge
 * @date 2019-09-12 11:48
 */
public class BasketballTeacher extends Teacher{
    public BasketballTeacher() {
    }

    public BasketballTeacher(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("篮球教练吃好吃的");
    }

    @Override
    public void teach() {
        System.out.println("篮球教练教篮球");
    }
}
