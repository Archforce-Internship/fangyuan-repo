package language;

public class V_type {
    private String name;
    private VariableType VType;     //类做成员变量的类型
    private VariableType1 VType1;   //接口做成员变量的类型

    public V_type() {
    }

    public V_type(String name) {
        this.name = name;
    }

    public void Do(){
        VType1.attack();
        VType.use();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VariableType getVType() {
        return VType;
    }

    public void setVType(VariableType VType) {
        this.VType = VType;
    }

    public VariableType1 getVType1() {
        return VType1;
    }

    public void setVType1(VariableType1 VType1) {
        this.VType1 = VType1;
    }
}
