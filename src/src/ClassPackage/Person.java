package ClassPackage;

import java.util.Objects;

public  class Person {
    private int age;
    private String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {  //重写Object父类的toString()方法
        return "我的年龄："+age+";"+"我的名字："+name;
    }


    @Override
    public boolean equals(Object obj) {   //重写Object父类的equals()方法
        if(this == obj){
            return true;
        }
        if(obj ==null){
            return false;
        }
        if(obj instanceof Person){
            Person person = (Person)obj;
            return this.name.equals(person.name) && this.age == person.age;
        }
        return false;
    }

//    @Override
//    public boolean equals(Object o) {    ////官方重写Object父类的equals()方法
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Person person = (Person) o;
//        return age == person.age &&
//                Objects.equals(name, person.name);
//    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


