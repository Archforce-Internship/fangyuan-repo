package IO;

import java.io.Serializable;

//要进行序列化和反序列化必须继承Serializable接口
public  class Person implements Serializable {
        private transient int age;   //transient关键字使得变量不可读
        private String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
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

