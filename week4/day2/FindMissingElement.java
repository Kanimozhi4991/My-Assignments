package week4.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindMissingElement {
    public static void main(String[] args) {
        Integer[] arr={1,2,3,4,10,6,8};
        List<Integer> list=new ArrayList<>(Arrays.asList(arr));
        Collections.sort(list);
        System.out.println("Missing number is:");
        for(int i=0; i<list.size()-1;i++){
            int current = list.get(i);
            int  next = list.get(i+1);
            if(current+1 != next){
                for(int  j=current+1;j<next;j++){
                    System.out.println(j);
                }
            }
            
        }
    }


}
