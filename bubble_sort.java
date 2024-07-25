class bubble_sort{
    public static void main(String a[]){
        int nums[]={2,4,9,3,7,5,8,6};
        int temp=0;
        System.out.println("Before sorting");
        for(int num:nums){
            System.out.print(num +" ");
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j=0;j<nums.length-1;j++){
                if(nums[j]>nums[j+1]){
                temp=nums[j];
                nums[j]=nums[j+1];
                nums[j+1]=temp;
                }
            }
            
          
           }  System.out.println("After sorting");
           for(int num:nums){
            System.out.print(num+" ");
        }
    }
    
}