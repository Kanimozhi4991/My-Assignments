package week4.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionInList {
    public static void main(String[] args) {
        Integer[] arr1={3,2,11,4,6,7};
        Integer[] arr2={1,2,8,4,9,7};
        List<Integer> list1=new ArrayList<Integer>(Arrays.asList(arr1));// another way of adding arrays into list
        List<Integer> list2=new ArrayList<Integer>(Arrays.asList(arr2));
        System.out.println("Matching Elements:");
        for(int i=0; i<list1.size(); i++)
            {
            if(list1.get(i).equals(list2.get(i)))
                {
                System.out.println(list1.get(i));
            }
        }

    }

}
