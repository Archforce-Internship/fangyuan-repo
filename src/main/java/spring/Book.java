package spring;

public class Book {
    private String bname;
    private String auther;

    public Book() {
    }

    public Book(String bname, String auther) {
        this.bname = bname;
        this.auther = auther;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public void setAuther(String auther) {
        this.auther = auther;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bname='" + bname + '\'' +
                ", auther='" + auther + '\'' +
                '}';
    }

    public void help(){
        System.out.println(bname+"   "+auther);
    }
}
