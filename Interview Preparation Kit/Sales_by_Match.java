import java.util.Arrays;
import java.util.HashMap;
import java.util.*;
public class Sales_by_Match {
	static void frequencyNumber(int arr[], int size) 
    { 
        
        HashMap<Integer, Integer> freqMap = new HashMap<Integer, Integer>(); 
        for (int i=0;i<size;i++) { 
            if (freqMap.containsKey(arr[i])) { 
                freqMap.put(arr[i], freqMap.get(arr[i]) + 1); 
            } 
            else { 
            	freqMap.put(arr[i], 1); 
            } 
        }  
        for (Map.Entry entry : freqMap.entrySet()) { 
            System.out.println(entry.getKey() + " " + entry.getValue()); 
        } 
        
    }
	static void solution(int arr[]) {
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[] = {1,2,1,2,1,3,2};
        //solution(arr);
        frequencyNumber(arr,arr.length);
	}

}
