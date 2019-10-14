package day11;

/**
 * @author loge
 * @date 2019-09-12 11:22
 */
public abstract class Athlete extends People{
    public Athlete(){}
    public Athlete(String name,int age){
        super(name, age);
    }

    public abstract void study();
}
