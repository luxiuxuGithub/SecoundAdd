package Demo2Class;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Demo3getConstructor {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<Demo1Person> dpClass = Demo1Person.class;//创建Demo1Person类的字节码对象

        Constructor<Demo1Person> cons = dpClass.getConstructor(String.class, int.class);//传递有参数的构造方法,返回一个类的构造方法数组
        Demo1Person person1 = cons.newInstance("GD", 20);//通过构造方法创建相应的对象（参数必须与创建的构造方法一致）
        System.out.println(person1);


        Constructor<Demo1Person> con = dpClass.getConstructor();//传递无参的构造方法
        Demo1Person person2 = con.newInstance();
        System.out.println(person2);


        Demo1Person person3 = dpClass.newInstance();//通过字节码对象调用newInstance方法创建无参的类对象
        System.out.println(person3);


    }
}
