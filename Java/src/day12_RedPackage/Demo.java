package day12_RedPackage;

import java.util.List;

/**
 * @author loge
 * @date 2019-09-17 20:18
 */
public class Demo {
    public static void main(String[] args) {
        GroupOwner go = new GroupOwner("loge",200);
        System.out.println("发红包前:");
        System.out.println("群主:"+go.getName()+","+"余额:"+go.getLeftMoney());
        GroupMember gm1 = new GroupMember("lyu",10);
        GroupMember gm2 = new GroupMember("wx",5);
        GroupMember gm3 = new GroupMember("yuan",8);
        System.out.println("群员:"+gm1.getName()+","+"余额:"+gm1.getLeftMoney());
        System.out.println("群员:"+gm2.getName()+","+"余额:"+gm2.getLeftMoney());
        System.out.println("群员:"+gm3.getName()+","+"余额:"+gm3.getLeftMoney());
        System.out.println("~~~~~~~~~~");
        System.out.println("发红包后");
        List<Double> list = go.sendReadPackage(50, 3);
        gm1.receive(list);
        gm2.receive(list);
        gm3.receive(list);
        System.out.println("群主:"+go.getName()+","+"余额:"+go.getLeftMoney());
        System.out.println("群员:"+gm1.getName()+","+"余额:"+gm1.getLeftMoney());
        System.out.println("群员:"+gm2.getName()+","+"余额:"+gm2.getLeftMoney());
        System.out.println("群员:"+gm3.getName()+","+"余额:"+gm3.getLeftMoney());
    }
}
