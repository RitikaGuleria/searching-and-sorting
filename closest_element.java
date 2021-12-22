public class HelloWorld
{
     public static void main(String []args)
     {
         int arr[]={1,2,5,6};
         int target=2;
        System.out.println(binary(arr,target));
     }
     public static int binary(int arr[],int target)
     {
         int lo=0;
         int hi=arr.length-1;
         while(lo<=hi)
         {
             int mid=lo+(hi-lo)/2;
             if(arr[mid]==target)
             {
                 return arr[mid];
             }
             else if(arr[mid]<target)
             {
                 lo=mid+1;
             }
             else
             {
                 hi=mid-1;
             }
         }
         return closest(arr,target,lo,hi);
     }
     
     public static int closest(int arr[],int target,int lo,int hi)
     {
         
         if(Math.abs(arr[lo]-target)<Math.abs(arr[hi]-target))
         {
             return arr[lo];
         }
         else
         {
             return arr[hi];
         }
     }
}
