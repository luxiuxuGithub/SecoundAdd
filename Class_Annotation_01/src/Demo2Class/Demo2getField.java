package Demo2Class;

import java.lang.reflect.Field;
import java.util.Arrays;

public class Demo2getField {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        //获取（Demo1Person）类的字节码对象
        Class dpClass = Demo1Person.class;

        Field[] fields = dpClass.getFields();//获取Demo1Person类中被public修饰的所有成员变量
        System.out.println(Arrays.toString(fields));

        Field field = dpClass.getField("a");//获取Demo1Person类中指定的被public修饰的成员变量
        Demo1Person p = new Demo1Person();//创建Demo1Person类对象
        field.set(p,"Lay");//传递Demo1Person类对象，并对指定成员变量设置值
        Object value1 = field.get(p);//获取Demo1Person类指定变量的值
        System.out.println(value1);


        Field[] dFields = dpClass.getDeclaredFields();//获取Demo1Person类中所有的成员变量
        System.out.println(Arrays.toString(dFields));

        Field dField = dpClass.getDeclaredField("d");//获取Demo1Person类中指定的成员变量

        dField.setAccessible(true);//忽略成员变量的权限修饰符安全检查，对成员变量进行下一步操作
        dField.set(p,"洪金宝");//对私有成员变量设置值
        Object value2 = dField.get(p);//获取值
        System.out.println(value2);

    }
}
