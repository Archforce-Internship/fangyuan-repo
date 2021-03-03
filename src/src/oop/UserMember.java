package oop;

import java.util.ArrayList;
import java.util.Random;

public class UserMember extends User{
    public UserMember() {
    }

    public UserMember(int money, String name) {
        super(money, name);
    }

    //收红包
    public void receive(ArrayList<Integer> List){
        int Balance = super.getMoney();
        int index = new Random().nextInt(List.size());
        int get = List.remove(index);
        super.setMoney(Balance + get);
    }
}
