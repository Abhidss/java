public class Maxium implements ff {
     static int Max(int[] arr){
        var Max1=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>Max1){
                Max1=arr[i];
            }
            

    }
 return Max1;
}
    public static void main(String[] args) {
        int[]arr2={22,1,3,2,133,2};
        System.out.println(Max(arr2));
    }
    
}
