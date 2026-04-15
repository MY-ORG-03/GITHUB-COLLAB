/*Input: arr[] = {1, 14, 2, 16, 10, 20}
Output: 14
Explanation: Largest element is 20, second largest element is 16 and third largest element is 14*/
import java.util.*;
public class Solution{
   static int secondLargestElement(int []arr){
     int first = Integer.MIN_VALUE;
     for(int i = 0; i < arr.length;i++){
        if(arr[i] > first){
            first = arr[i];
        }
     }
     int second = Integer.MIN_VALUE;
     for(int i = 0; i < arr.length;i++){
        if(arr[i] > second && arr[i] < first){
            second = arr[i];
        }
     }
     return second;
   }
   public static void main(String [] args){
     int []arr={1,14,2,16,10,20};
     int result = secondLargestElement(arr);
     System.out.println("second Largest Element will be" + result);

   }
}