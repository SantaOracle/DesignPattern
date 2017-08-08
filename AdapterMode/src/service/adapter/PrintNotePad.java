package service.adapter;

import entity.NotePad;
import service.PrintService;

/**
 * Created by Administrator on 2017/8/8.
 */
public class PrintNotePad extends NotePad implements PrintService{

    public PrintNotePad(String item){
        super(item);
    }

    @Override
    public void printWeak() {
        showWeak();
    }

    @Override
    public void printStrong() {
        showStrong();
    }
}
