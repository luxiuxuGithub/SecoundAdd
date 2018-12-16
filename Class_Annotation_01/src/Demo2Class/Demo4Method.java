package Demo2Class;

import java.lang.reflect.Method;

public class Demo4Method {
    public static void main(String[] args) throws Exception {
        Class dpClass = Class.forName("Demo2Class.Demo1Person");

        Method person_eat1 = dpClass.getMethod("eat");//获取无参eat方法
        Demo1Person d = new Demo1Person();//创建类对象
        person_eat1.invoke(d);//调用Demo1Person类中的无参eat方法


        Method person_eat2 = dpClass.getMethod("eat",String.class);//获取有参eat方法
        person_eat2.invoke(d,"FOOD");//调用Demo1Person类中的有参eat方法，并传递参数

        String name = person_eat2.getName();//获取方法名称
        String name1 = dpClass.getName();//获取类名
    }
}
