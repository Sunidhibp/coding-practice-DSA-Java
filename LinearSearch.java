public class LinearSearch {
    public static int binarySearch(int[] arr, int target){
        for(int i = 0 ; i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr = {2,3,4,5,8};
        int target = 8;
        int result = binarySearch(arr, target);
        if(result == -1){
            System.out.println("The element no found ");
        }
        else{
            System.out.println("The element found at " + result + "th position");
        }
    }

}
