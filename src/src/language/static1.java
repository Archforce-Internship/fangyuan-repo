package language;

public class static1 {
    public static void main(String[] args) {
        Student stu = new Student(21,"江江");
        Student stu1 = new Student(22,"方方");
        help();
        Student.static1();
        System.out.println("年龄："+stu.getAge()+"姓名："+stu.getName()+"工号："+stu.getId()+"地址："+stu.address);
    }
    public static void help(){
        System.out.println("这是一个本类的静态方法");
    }
}
