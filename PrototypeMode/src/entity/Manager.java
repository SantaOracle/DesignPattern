package entity;

import java.util.HashMap;

/**
 * Created by Administrator on 2017/8/10.
 */
public class Manager {
    private HashMap showcase = new HashMap();
    public void register(String name, Product proto){
        showcase.put(name, proto);
    }

    public Product createProduct(String protoname){
        Product p = (Product)showcase.get(protoname);
        return p.createClone();
    }
}
