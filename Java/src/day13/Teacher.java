package day13;

/**
 * @author loge
 * @date 2019-09-14 20:48
 */
public class Teacher {
    public void score(int score) throws ScoreException {
        if (score<0||score>100){
            throw new ScoreException("你输入的分数应该在0~100之间");
        }else {
            System.out.println("你输入的分数正确");
        }
    }
}
