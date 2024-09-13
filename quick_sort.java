public class quick_sort{
    public static void quicksort(int[] arr,int low,int high) //we have to create a method
    {
        if(low<high)//if this condt=ition is true quicksort will call itself
        {
            int pi=partition(arr,low,high);
            quicksort(arr,low,pi-1);//we have one array and that array is divided into two parts so we have to call quicksort twice which have starting value is low and pi-1
            quicksort(arr,pi+1,high);//in the second array the starting value is pi+1 and the last value is high
        }
    }
    private static int partition(int[] arr,int low,int high){//this method is created to acces the word partition int the above line no 6
        int pivot=arr[high];//to run the below code we have to give some variables and pivot value is always high so we give arr[high]  
        int i=low-1;
        for(int j=low;j<high;j++)
        {
            if(arr[j]<pivot) 
            {
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;
        return i+1;
    }
    public static void main(String[] args) {
        int arr[]={4,8,2,9,5};
        quicksort(arr,0,arr.length);//quicksort is a function name or a method name which will take three parameters ..one is arr and the two other is atarting point and the ending point of the array
        for(int num:arr)
        {
            System.out.println(num + " ");
        }
    }

    }
