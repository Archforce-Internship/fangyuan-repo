package language;

public class Student {
    private static int count = 0;
    public static String address = "华锐金融";
    private int age;
    private String name;
    private int Id;

    static {
        System.out.println("静态代码");
    }

    public Student() {
        count++;
    }

    public int getId() {
        return Id;
    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
        this.Id = ++count;

    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
    public static void static1(){
        System.out.println("这是一个静态函数");
        System.out.println(address);
        System.out.println(count);
    }
}
