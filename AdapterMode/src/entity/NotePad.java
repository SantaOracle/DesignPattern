package entity;

/**
 * Created by Administrator on 2017/8/8.
 */
public class NotePad {
    private String item;

    public NotePad(String item){
        this.item = item;
    }

    public void showWeak(){
        System.out.println("[" + item + "]");
    }

    public void showStrong(){
        System.out.println("**" + item + "**");
    }
}
