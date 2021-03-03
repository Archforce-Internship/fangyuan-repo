package oop;

public class father {
    public String name;
    public int age;
    private String status;

    public father() {
    }

    public father(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void getStatus() {
        System.out.println(status);
    }

    public void fa() {
        System.out.println("This is father");
    }

    public void fa1(){
        System.out.println("father's other");
    }
}
