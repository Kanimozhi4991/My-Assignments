package week4.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {
    public static void main(String[] args) {
         Integer[] arr1={3,2,11,4,6,7};
         //convert to list
         List<Integer> list=new ArrayList<Integer>(Arrays.asList(arr1));
         //sort the list
         Collections.sort(list);
         //get second largest number
        Integer result = list.get( list.size()-2);//list size=6,index=0,1,2,3,4,5  
                                                   //list size-2=4,index=0,1,2,3,4 
         System.out.println("Second largest number is:"+result);                                          
         
    }

}
