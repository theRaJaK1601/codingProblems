public class BubbleSort{
    int flag;
    void bs(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>i;j--){
                flag=0;
                if(arr[i]>arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                    flag=1;
                }
            }
            if(flag==1){
                bs(arr);
            }
        }
    }
    public static void main(String[] args){
        int[] arr = {29,30,47,6,9,1,2,100,98,3,878,1,66,54};
        BubbleSort obj = new BubbleSort();
        obj.bs(arr);
        System.out.println("Sorted Array: ");
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}

