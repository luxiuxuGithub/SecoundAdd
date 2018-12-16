package Demo2Class;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

public class DemoProperties {
    public static void main(String[] args) throws Exception {
        Properties p = new Properties();//创建properties对象

        ClassLoader demoPC = DemoProperties.class.getClassLoader();

        InputStream resourceAsStream = demoPC.getResourceAsStream("pro.properties");
        p.load(resourceAsStream);//将配置文件加载

        //获取配置文件中的数据
        String classN = p.getProperty("className");
        String classM = p.getProperty("classmethod");


        //加载类进入内存
        Class cla = Class.forName(classN);

        //创建无参对象
        Object person = cla.newInstance();

        //传递类的方法
        Method claMethod = cla.getMethod(classM);

        claMethod.invoke(person);//调用类中的方法


    }
}
