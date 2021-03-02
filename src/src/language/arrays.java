package language;

import java.util.Arrays;

public class arrays {

    public static void main(String[] args) {
        int [] arr = {1,5,2,7,9};
        int [] arr1 = {3,5,6,2,5,9};
        String S = Arrays.toString(arr);
        System.out.println(S);
        Arrays.sort(arr1);
        String s=Arrays.toString(arr1);
        System.out.println(s);

        Sort();
    }

    //对字符串按字符倒序打印
    public static void Sort(){
        String S="hvfdgu283fjhwrf743t";
        char [] s = S.toCharArray();
        Arrays.sort(s);
        for (int i = s.length - 1; i >= 0; i--) {
            System.out.println(s[i]);
        }
    }

}
