package entity;

/**
 * Created by Administrator on 2017/8/10.
 */
public interface Product extends Cloneable{
    void use(String s);
    Product createClone();
}
