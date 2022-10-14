package Gfg_Problems_Solutions_Java;

import java.util.HashMap;

public class Majority_element_in_Array {
    static int majorityElement(int a[], int size)
    {
        // your code here
        HashMap<Integer, Integer> map = new HashMap<>();
        int i=0;
        for(i=0;i<size;i++){
            map.put(a[i], map.getOrDefault(a[i],0)+1);
        }
        for(i=0;i<size;i++){
            if(map.get(a[i])>size/2){
                return a[i];
            }
        }
        return -1;
    }
}
