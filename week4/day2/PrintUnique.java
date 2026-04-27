package week4.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintUnique {
    public static void main(String[] args) {
        String companyName="google";
        //convert string into characters
        char[] charArray = companyName.toCharArray();
        //create set
        Set<Character> unique=new LinkedHashSet<Character>();
        for(int i=0;i<charArray.length;i++){
            unique.add(charArray[i]);
            
        }for(Character ch:unique){
            System.out.print(ch);
            }
    }

}
