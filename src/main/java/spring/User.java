package spring;

public class User {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void help(){
        System.out.println(name);
    }
}
