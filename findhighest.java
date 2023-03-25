public class findhighest {
  public static int MaxWealth(int[][]accounts){
    int ans=Integer.MIN_VALUE;
    for(int person=0;person<accounts.length;person++){
      int sum=0;
      for(int account=0;account<accounts[person].length;account++){
        sum+=accounts[person][account];
      }
      if(sum>ans){
        ans=sum;
      }
      
    }
    return ans;

  }


public static void main(String[] args) {
  int[][] arr2={{1,2,3},{3,4,5},{4,5,6}};
  int give=MaxWealth(arr2);
  System.out.println(give);
}
}
    

