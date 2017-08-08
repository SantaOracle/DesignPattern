package entity;

/**
 * Created by Administrator on 2017/8/8.
 */
public class Banner {
    private String item;

    public Banner(String item){
        this.item = item;
    }

    public void showWithParen(){
        System.out.println("(" + item + ")");
    }

    public void showWithAster(){
        System.out.println("*" + item + "*");
    }
}
