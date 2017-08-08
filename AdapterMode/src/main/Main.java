package main;

import service.PrintService;
import service.adapter.PrintBanner;
import service.adapter.PrintNotePad;

/**
 * Description: 适配器模式——AdapterMode，这里是对接口向下适配，还有一种使用委托的适配器模式，其将服务接口
 *  换成抽象类，我觉得这种方式不好，就没写源码
 * Created by Administrator on 2017/8/8.
 */
public class Main {
    public static void main(String[] args) {
        PrintService p = new PrintBanner("Ubsoft is the worst Game Company!");
        p.printWeak();
        p.printStrong();

        PrintService p2 = new PrintNotePad("Good good study, day day up");
        p2.printWeak();
        p2.printStrong();
    }
}
