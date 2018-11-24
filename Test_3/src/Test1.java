public class Test1 {
    public static void main(String[] args) {
        Person p1=new Person();
        p1.setName("侯祥政");
        p1.setAge(20);
        System.out.println(p1.getName()+"的年龄为"+p1.getAge()+"岁");
    }
}
class Person{
    private String name;
    private int age;
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}
