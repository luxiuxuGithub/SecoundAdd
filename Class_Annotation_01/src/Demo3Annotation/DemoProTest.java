package Demo3Annotation;

import java.lang.reflect.Method;

@pro(className = "Demo2Class.Demo1Person",classMethod = "eat")
public class DemoProTest {
    public static void main(String[] args) throws Exception{
        Class<DemoProTest> demoTestClass = DemoProTest.class;//获取类的字节码文件

        pro anno = demoTestClass.getAnnotation(pro.class);//获取注解的字节码对象


        //注解在内存中时会生成子类实现对象，所以可以通过注解对象.方法名返回相应的数据
        String className = anno.className();//获取className;
        String classMethod = anno.classMethod();//获取classMethod

        Class cla = Class.forName(className);//通过全类名返回字节码对象
        Object person = cla.newInstance();//通过字节码对象构建相应类的对象

        Method claMethod = cla.getMethod(classMethod);//通过字节码对象获取对应类的指定方法

        claMethod.invoke(person);//调用指定方法的执行


    }
}
