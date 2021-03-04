package language;

public class OuterClass implements Outer{
    private int id;
    //内部类
    public class InnerClass{
        private String name;

        public void setName(String name) {
            this.name = name;
        }

        public void setId(int id) {
            OuterClass.this.id = id;
        }
    }

    @Override
    public void method() {
        System.out.println("实现类重写");
    }

    public void get(){
        int number = 100;
        class inner{
            int num = 10;
            public void method(){
                System.out.println("这是一个局部内部类"+"num="+num+";"+"number"+number);
            }

        }
        inner in = new inner();
        in.method();

        InnerClass innerClass = new InnerClass();
        innerClass.setId(1);
        innerClass.setName("Y");
        System.out.println(this.id + innerClass.name);
    }
}
