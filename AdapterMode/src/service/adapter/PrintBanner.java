package service.adapter;

import entity.Banner;
import service.PrintService;

/**
 * Created by Administrator on 2017/8/8.
 */
public class PrintBanner extends Banner implements PrintService{

    public PrintBanner(String item){
        super(item);
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
