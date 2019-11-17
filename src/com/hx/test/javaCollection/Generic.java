package com.hx.test.javaCollection;

/**
 * @author
 * @description 自定义泛型Generic
 * @date
 */
public class Generic<T> {
    //key的成员变量类型为T，T的类型由外部指定
    private T key;

    public T getKey() {
    //泛型方法getkey的返回值类型也是T，T由外部指定
        return key;
    }

    public void setKey(T key) {
    //泛型构造方法形参的类型也是T,T由外部指定
        this.key = key;
    }


}
