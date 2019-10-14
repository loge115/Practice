package day12_RedPackage;

import java.util.List;
import java.util.Random;

/**
 * @author loge
 * @date 2019-09-17 20:10
 */
public class GroupMember extends Person {
    public GroupMember() {
    }

    public GroupMember(String name, double leftMoney) {
        super(name, leftMoney);
    }
    public void receive(List<Double> arr){
        Double money = getLeftMoney();
        Random r = new Random();
        int n = r.nextInt(arr.size());
        Double remove = arr.remove(n);
        money +=remove;
        setLeftMoney(money);
    }
}
