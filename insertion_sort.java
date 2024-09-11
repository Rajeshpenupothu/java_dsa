public class insertion_sort{
    public static void main(String a[]){
        
        int arr[]={2,1,8,5};//having a array 
       
        for(int i=0;i<arr.length;i++)//i is the inner loop where it can starts from index value with 0 
        {
            int j=i-1;//and the outer loop j .... the value should be i-1
            int key=arr[i];
            while(j>= 0 && arr[j]>key){//while loop is used to satisfiy the conditions given
                arr[j+1]=arr[j];//if the conditions satisfy then the next value of arr[j+1] becomes arr[j] 
                j--; // if the above line satisfies then this line executes and the j value shoud be j-- or j-1
            }
            arr[j+1]=key;
        }
        for(int num:arr)
        {
            System.out.print(num +"  ");
        }
    } 
}