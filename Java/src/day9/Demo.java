package day9;

/**
 * @author loge
 * @date 2019-09-27 20:16
 */
public class Demo {
    public static void main(String[] args) {
        Student student = new Student();
        student.work();
        Worker worker = new Worker();
        worker.work();
        StudentLeader leader = new StudentLeader();
        leader.meeting();
        Dog dog = new Dog();
        dog.eat("骨头");
        Cat cat = new Cat();
        cat.eat("小鱼干");
        People people = new People();
        people.keepPet(dog,"骨头");
        people.keepPet(cat,"鱼干");
    }
}
