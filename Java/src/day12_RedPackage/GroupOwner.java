package day12_RedPackage;

import java.util.ArrayList;
import java.util.List;

/**
 * @author loge
 * @date 2019-09-17 19:29
 */
public class GroupOwner extends Person {
    public GroupOwner() {
    }

    public GroupOwner(String name, double leftMoney) {
        super(name, leftMoney);
    }
    public List<Double> sendReadPackage(double totalMoney, int n){
        double money =getLeftMoney();
        List<Double> arr = new ArrayList<Double>();
        if (totalMoney>money){
            System.out.println("余额不足~~~");
            return null;
        }else {
            money -=totalMoney;
            setLeftMoney(money);
            int total = (int)(totalMoney*100);
            int average = total/n;
            for (int i = 0; i < n - 1; i++) {
                arr.add(average/100.0);
                total -=average;
            }
            arr.add(total/100.0);
        }
        return arr;
    }
}
