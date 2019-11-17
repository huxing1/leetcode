package com.hx.test.javaCollection;


/**
 * @author
 * @description
 * @date
 */
class Demo<T> {

    public void method(T t) {
        System.out.println("输出" + t);
    }

}

class TestDemo {

    public static void main(String[] args) {
        Demo<Double> demo = new Demo<Double>();
        demo.method(3.4);
    }
}


