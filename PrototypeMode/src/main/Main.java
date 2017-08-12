package main;

import entity.Manager;
import entity.MessageBox;
import entity.Product;
import entity.UnderlinePen;

/**
 * Created by Administrator on 2017/8/10.
 */
public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        UnderlinePen upen = new UnderlinePen('~');
        MessageBox mbox = new MessageBox('*');
        MessageBox sbox = new MessageBox('/');
        manager.register("strong message", upen);
        manager.register("warning box", mbox);
        manager.register("slash box", sbox);

        Product p1 = manager.createProduct("strong message");
        Product p2 = manager.createProduct("warning box");
        Product p3 = manager.createProduct("slash box");
        p1.use("Hello, world!");
        p2.use("Hello, world!");
        p3.use("Hello, world!");
    }
}
