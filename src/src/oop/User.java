package oop;

public class User {
    private int money;
    private String name;

    public User() {
    }

    public User(int money, String name) {
        this.money = money;
        this.name = name;
    }

    public void show(){
        System.out.println("我是"+name+";"+"我的余额为"+money);
    }
    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
