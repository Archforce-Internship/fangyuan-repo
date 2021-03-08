package spring;

import java.util.Arrays;
import java.util.Map;
import java.util.List;
import java.util.Set;

public class collections {
    private String [] arr;
    private List<String> list;
    private Map<String,String> maps;
    private Set<String> set;

    public void setArr(String[] arr) {
        this.arr = arr;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }
    public void test(){
        System.out.println(Arrays.toString(arr));
        System.out.println(list);
        System.out.println(maps);
        System.out.println(set);
    }
}
