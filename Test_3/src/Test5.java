import java.util.Arrays;

public class Test5 {
    public static void main(String[] args) {
        ChickenManage cm=new ChickenManage(5);
        cm.add(new Chicken(1,"北极",1,5));
        cm.add(new Chicken(2,"南极",2,14));
        cm.add(new Chicken(3,"西极",2,12));
        cm.add(new Chicken(4,"东极",3,20));
        cm.add(new Chicken(5,"中极",2,15));
        cm.add(new Chicken(6,"中极",2,15));
        cm.findAll();
        System.out.println("----------------------------------");
        cm.find(3).print();
        cm.updata(new Chicken(4,"发财",4,22));
        cm.findAll();
        System.out.println("----------------------------------");
        cm.delete(2);
        cm.findAll();

    }
}
class ChickenManage{
    private Chicken[] ck;
    private static int count=0;
    public ChickenManage(int size) {
        //自动扩建舍
        if (size<5){
            ck=new Chicken[5];
        }else {
            ck=new Chicken[size];
        }
    }
    //增加
    public void add(Chicken c){
        //增加自己的一半    len * 3 / 2 + 1;
        //增加自己1倍 len * 2;
        if(ck.length==count){//相等时恰好没空间
            ck= Arrays.copyOf(ck,ck.length*2);//数组空间变为2倍
        }
        ck[count]=c;
        count++;
    }
    //更新
    public void updata(Chicken c){
        Chicken c1=find(c.getId());
        c1.setName(c.getName());
        c1.setAge(c.getAge());
        c1.setWeight(c.getWeight());
    }
    //删除
    public void delete(int id){
        for (int i = 0; i < count; i++) {
            if(ck[i].getId()==id){
                for (int j = i; j < count; j++) {
                    ck[j]=ck[j+1];
                }
                ck[count]=null;
                count--;
            }
        }
    }
    //查找一个鸡
    public Chicken find(int id){
        for (int i = 0; i < ck.length; i++) {
            if(ck[i].getId()==id){
                return ck[i];
            }
        }
        return null;
    }
    //查找所有鸡
    public void findAll(){
        for(Chicken c:ck){
            if (c!=null){
            c.print();
            }
        }
    }
}
class Chicken{
    private int id;
    private String name;
    private int age;
    private int weight;
    public Chicken(){}
    public Chicken(int id,String name,int age,int weight){
        this.id=id;
        this.name=name;
        this.age=age;
        this.weight=weight;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    public void print(){
        System.out.println(this.id +","+this.name+","+this.age+","+this.weight);
    }
}
