public class CloningArray {
    public static void main(String args[]){
        int arr[] = {23, 34, 44, 54};
        System.out.print("Printing original array");
        for(int i:arr){
            System.out.println(i);
        }
        int carr[] = arr.clone();
        System.out.println("Cloned array");
        for(int i:carr){
            System.out.println(i);
        }
        System.out.println("Are these both equal?");
        System.out.println(arr==carr);
    }
}
