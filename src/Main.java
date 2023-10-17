import com.google.common.primitives.Shorts;

import java.util.List;
public class Main {
    public static void main(String[] args) {
        short arr[] = { 1, 2, 3, 4, 5 };
        List<Short> myList = Shorts.asList(arr);
        System.out.println(myList);


        short arr2[] = { 3, 5, 7 };
        List<Short> myList2 = Shorts.asList(arr2);
        System.out.println(myList2);
    }
}