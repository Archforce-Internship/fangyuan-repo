package language;
public  class Person{
        private int age;
        private String name;

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
    public static void main(String[] args) {

        Person[] per = new Person[2];
        per[0] = new Person();
        per[1] = new Person();
        per[0].setAge(15);
        per[0].setName("圆圆");
        per[1].setAge(18);
        per[1].setName("陈磊");
        System.out.println("年龄："+per[0].getAge());

    }
}

