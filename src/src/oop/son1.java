package oop;

public class son1 extends father{
    private String smallName;
    public son1(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    @Override
    public void fa() {
        System.out.println("Override father's fa()");
    }

    public void setSmallName(String smallName) {
        this.smallName = smallName;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getSmallName() {
        return smallName;
    }
}
