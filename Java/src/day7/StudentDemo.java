package day7;

public class StudentDemo {
    public static void main(String[] args) {
        Student st = new Student("小王",20);
        Student st1 = new Student();
        st1.setName("loge");
        st1.setAge(18);
        st1.study();
        st1.doHomework();
        st.study();
        st.doHomework();
    }
}
