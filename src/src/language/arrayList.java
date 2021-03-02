package language;
import java.util.ArrayList;
public class arrayList {
    public static void main(String[] args) {
     /*   ArrayList<String> list = new ArrayList<>();
        System.out.println(list);
        list.add("小明");
        list.add("李四");
        list.add("张三");
        System.out.println(list);
        boolean Y = list.add("圆");
        System.out.println(Y);
        System.out.println(list);
        String J = list.remove(2);
        System.out.println(J);
        System.out.println(list);
        System.out.println(list.size());
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        */
      ArrayList<Student> list1 = new ArrayList<>();
      Student one = new Student(20,"江江");
      Student two = new Student(21,"方方");
      Student three = new Student(22,"圆圆");
      list1.add(one);
      list1.add(two);
      list1.add(three);
        System.out.println(list1);
        for (int i = 0; i < list1.size(); i++) {
            Student stu = list1.get(i);
            System.out.println(stu.getAge()+"   "+stu.getName());
        }
    }

}
