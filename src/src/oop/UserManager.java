package oop;

import java.util.ArrayList;

public class UserManager extends User {
    public UserManager() {
    }

    public UserManager(int money, String name) {
        super(money, name);
    }

    public ArrayList<Integer> send(int totalMoney,int count){
        ArrayList<Integer> sendList = new ArrayList<>();

        //查看余额是否足够发红包
        int Balance = super.getMoney();
        if (Balance < totalMoney)
            return sendList;

        //将钱平分为count份，余数放到最后一个红包，然后保存到数组
        int avg = totalMoney / count;
        int Remaining = totalMoney % count;
        super.setMoney(Balance - totalMoney);
        for (int i = 0; i < count - 1; i++) {
            sendList.add(avg);
        }
        sendList.add(avg+Remaining);
        return sendList;
    }
}
