package IO;

import java.io.*;

//序列化与反序列化
public class serialize {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        //序列化
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.txt"));
        oos.writeObject(new Person(18, "小明"));
        oos.close();

        //反序列化
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.txt"));
        Object s = ois.readObject();
        System.out.println(s);
        ois.close();

    }
}
