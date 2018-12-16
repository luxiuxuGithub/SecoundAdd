package Demo3Annotation;

public @interface Demo1MyAnno {
    //注解必须要有返回值
    //返回值类型可以是基本类型 ，字符串 ，枚举 ， 注解 ，以及它们的数组
    int age();//如果名称为value 且只有一个属性时，可以省略value

    Demo1Week week();
    Demo1myannotation myan();

    String[] str();//如果只有一个值时，可以省略大括号
    //使用注解时必须要对它们赋值
}
