package Demo2Class;

public class Demo1Person {
    private String name;
    private int age;

    public String a;
    protected String b;
    String c;
    private String d;

    public Demo1Person() {
    }

    public Demo1Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Demo1Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    public void eat(){
        System.out.println("eat无参方法");
    }

    public void eat(String food){
        System.out.println("eat有参方法");
    }
}
