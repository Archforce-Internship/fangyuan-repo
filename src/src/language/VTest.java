package language;

public class VTest {
    public static void main(String[] args) {
        V_type type = new V_type("赵云");
        VariableType1 type1 = new VariableType1();

        type.setVType(type1);
        type.setVType1(type1);

        System.out.println(type.getName());
        type.Do();
    }
}
