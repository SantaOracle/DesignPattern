package main;

import entity.AbstractDisplay;
import entity.CharDisplay;
import entity.StringDisplay;

/**
 * Description: 模板方法模式 —— Template Method Mode
 * Created by Administrator on 2017/8/9.
 */
public class Main {
    public static void main(String[] args) {
        AbstractDisplay d1 = new StringDisplay("Hello World!");
        d1.display();

        AbstractDisplay d2 = new CharDisplay('p');
        d2.display();
    }
}
