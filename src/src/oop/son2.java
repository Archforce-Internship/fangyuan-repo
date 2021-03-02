package oop;

public class son2 extends father{
    private String smallName;

    public son2(String smallName,String s,int a) {
        this.smallName = smallName;
        name = s;
        age = a;
    }

    @Override
    public void fa1() {
        super.fa1();
        System.out.println("i'm 老二");
    }
    public void two(){
        son2 Two = new son2("矮子","yuan",15);
        System.out.println("老二"+Two.smallName+Two.name+Two.age);
        System.out.println(Two.maybe);
    }

}
