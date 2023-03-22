public class Linearsearch{
    static int LinearSearch(int[]arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return target;
            }
        }   
        return -1; 
    }
    public static void main(String[] args) {
        int []arr={6,99,79,77,9};
        int targer=70;
        int give=LinearSearch(arr, targer);
        System.out.println(give);
    }
}