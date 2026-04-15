import java.util.*;
public class Searching{
     static int linearSearch(int []arr,int key){
        for(int i = 0; i < arr.length;i++){
           if(arr[i] == key){
              return i;
           }
        }
        return -1;
     }
    public static void main(String [] args){
       int []arr = {9,5,3,8,9,20};
       int key = 20;
       int val = linearSearch(arr,key);
       if(val == -1){
        System.out.println("key is not found");
       }else{
        System.out.println("key is found at "+ val +" position");
       }
    }
}