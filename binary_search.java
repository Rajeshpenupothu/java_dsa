
import javax.lang.model.util.ElementScanner14;

public class binary_search{
    public static void main(String a[]){
        int nums[]={5,7,9,11,13};
        int target=11;
        int result=binarysearch(nums,target);
        if(result!=-1)
        System.out.println("element found at index:"+result);
        else
        System.out.println("Element not found");
    }
    public static int binarysearch(int[] nums,int target){
        int left=0;
        int right=nums.length-1;
        int mid=(left+right)/2;
        while(left<=right)
        if(nums[mid]==target){
            return  mid;
            else if(nums[mid]<target)
            {
                left=mid+1;
            }
            else
            right=mid-1;
        }
        return -1;
    }
}