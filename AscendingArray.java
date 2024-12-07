import java.util.Arrays;

public class AscendingArray {
    public static void main(String[] args) {
        int arr[]={-2,-1,-3,0,7,6,4};
        int t;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    t=arr[i];
                    arr[i]=arr[j];
                    arr[j]=t;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
