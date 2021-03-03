package oop;

import java.awt.dnd.DragSourceDragEvent;

public class son2 extends father{
    private String smallName;

    public son2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public son2(String smallName) {
        this("方方",20);
        this.smallName = smallName;
    }

    @Override
    public void fa1() {
        System.out.println("i'm 老二");
    }

    public String getSmallName() {
       return smallName;
    }
}
