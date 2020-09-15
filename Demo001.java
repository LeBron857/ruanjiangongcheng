import java.util.Arrays;

public class Demo001 {
 public static void mpPx(int arr[]){
  for (int i = 0; i <= arr.length - 1; i++){
   for (int j = 0; j < arr.length - 1 - i;j++){
    if (arr[j] > arr[j+1]){
     int temp = arr[j];
     arr[j] = arr[j+1];
     arr[j+1] = temp;
    }
   }
  }
 }
}




import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class Example01Test {

 @Test
 public void test() {
  int[] arr={1,3,5,7,8};
  Demo001.mpPx(arr);
  System.out.println(Arrays.toString(arr));
 }
}
