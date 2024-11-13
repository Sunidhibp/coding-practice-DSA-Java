public class ReturningArray {
    static int[] get(){
        return new int[]{33,44,55,66,33};
    }
    public static void main(String[] args){
        int arr[] = get();
        for(int i = 0; i<arr.length;i++)
        System.out.println(arr[i]);
    }
}
