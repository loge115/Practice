package day11;

/**
 * @author loge
 * @date 2019-09-12 11:28
 */
public abstract class Teacher extends People{
    public Teacher() {
    }

    public Teacher(String name, int age) {
        super(name, age);
    }
    public abstract void teach();
}
