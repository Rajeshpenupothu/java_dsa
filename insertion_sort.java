public class insertion_sort{
    public static void main(String a[]){
        
        int arr[]={2,1,8,5};
       
        for(int i=0;i<arr.length;i++)
        {
            int j=i-1;
            int key=arr[i];
            while(j>= 0 && arr[j]<key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        for(int num:arr)
        {
            System.out.print(num +"  ");
        }
    } 
}