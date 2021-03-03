package oop;

import java.util.ArrayList;

public class UserTest {
    public static void main(String[] args) {
        UserManager Manager = new UserManager(100,"boss");

        UserMember one = new UserMember(10,"员工1");
        UserMember two = new UserMember(0,"员工2");
        UserMember three = new UserMember(20,"员工3");

        Manager.show();
        one.show();
        two.show();
        three.show();

        //收发红包
        ArrayList<Integer> list = Manager.send(50,3);
        one.receive(list);
        two.receive(list);
        three.receive(list);

        Manager.show();
        one.show();
        two.show();
        three.show();
    }
}
