package Test;

import java.util.*;

/**
 * @author loge
 * @date 2019-09-15 15:13
 */
//集合遍历方法
public class Test13 {
    public static void main(String[] args) {
        List<String> arr = new ArrayList<String>();
        arr.add("loge");
        arr.add("lyu");
        arr.add("wx");
        //迭代器遍历
        Iterator<String> iterator = arr.iterator();
        while (iterator.hasNext()){
            String s = iterator.next();
            System.out.println(s);
        }
        System.out.println("-----------");
        //List迭代器
        ListIterator<String> stringListIterator = arr.listIterator();
        while (stringListIterator.hasNext()){
            String s = stringListIterator.next();
            System.out.println(s);
        }
        System.out.println("----------");
        //for增强
        for (String s:arr){
            System.out.println(s);
        }
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("loge");
        ll.add("lyu");
        ll.add("wx");
        ll.add(1,"yuan");
        ListIterator<String> listIterator = ll.listIterator();
        while (listIterator.hasNext()){
            String s = listIterator.next();
            System.out.println(s);
        }
    }
}
