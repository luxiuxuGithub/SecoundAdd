package TestDemo;

import Demo2Class.Demo1Person;

public class Demo2getClass {
    public static void main(String[] args) throws ClassNotFoundException {
        //获取类Class对象的三种方式

        //1.通过包名+类名
        Class cls1 = Class.forName("Demo2Class.Demo1Person");

        //2.通过类名.class
        Class cls2 = Demo1Person.class;

        //3.通过创建类对象  对象名.getClass
        Demo1Person d = new Demo1Person();
        Class cls3 = d.getClass();

        //同一字节码文件（类.class）对象，在程序运行时，只会被加载一次
        System.out.println(cls1 == cls2);//true
        System.out.println(cls1 == cls3);//true

    }
}
