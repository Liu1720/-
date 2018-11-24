public class Test2 {
    public static void main(String[] args) {
        Dog d=new Dog("侯祥政",5);
        System.out.println("这条狗叫"+d.getName()+"已经"+d.getAge()+"岁了");
    }
}
class Dog{
    //自带一个默认构造方法
    private String name;
    private int age;
    public Dog(){
        System.out.println("默认构造");
    }
    public Dog(String name){
        this.name=name;
        System.out.println("一个");
    }
    public Dog(String name,int age){
        this(name);
        this.age=age;
        System.out.println("两个");
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
}
