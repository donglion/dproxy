package com.lion.dproxy;

/**
 * Created by lion on 2019/8/17.
 */
public class Demo {

    public static void main(String[] args) {
        try {
            Person obj = (Person) new DMeipo().getInstance(new Customer());
            System.out.println(obj.getClass());
            obj.findLove();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
