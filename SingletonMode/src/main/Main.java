package main;

import entity.Singleton;

/**
 * Description: 单例模式
 * Created by Administrator on 2017/8/10.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("start...");
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        if (s1 == s2){
            System.out.println("s1和s2是相同对象");
        }else{
            System.out.println("s1和s2不是相同对象");
        }

    }
}
