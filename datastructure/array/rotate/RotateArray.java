package datastructure.array.rotate;

/**
 * @author Netravati Asundi
 * @apiNote Rotate first D elements in the given Array
 */
public class RotateArray {
  public static void rotateArrayUtil(int arr[], int d, int n) {
    int tempArr[] = new int[n];
    int tempIndex = 0;
    for (int i = d; i < arr.length; i++) 
      tempArr[tempIndex++] = arr[i];
    for (int i = 0; i < d; i++) 
      tempArr[tempIndex++] = arr[i];
    
    System.out.println("\nRotated Array ");
    printArray(tempArr, n);
  }

  public static void printArray(int arr[], int n) {
    for (int i = 0; i < arr.length; i++) 
      System.out.print(arr[i] + " ");
  }

  public static void main(String[] args) {
    int arr[] = {1,2,3,4,5,6,7};
    System.out.println("Original Array ");
    printArray(arr, arr.length);
    rotateArrayUtil(arr, 2, arr.length);
  }
}