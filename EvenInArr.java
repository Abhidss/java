public class EvenInArr{
    public static int findNumbers(int[]nums){
        int count=0;
        for(int num:nums){
            while(num!=0){
                int digit=num%10;
                if(digit%2==0){
                    count++;
                    break;
                }
                num/=10;


            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[]arr={2,3,4,55,66,2};
        int ans=findNumbers(arr);
        System.out.println(ans);
    }
}