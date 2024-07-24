class HelloWorld {
    public static void main(String[] args) {
        int nums[]={23,34,45,56};
        int target=56;
       
        int result=linearsearch(nums,target);
        if(result != -1)
        System.out.println("Element fount at index:"+result);
        else
        System.out.println("Element not found");
        }
        public static int linearsearch(int[] nums,int target){
            for(int i=0;i<nums.length;i++)
           
            if(nums[i]==target)
            return i;
          
            return -1;
        }
}