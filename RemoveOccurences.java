import java.util.Arrays;
public class RemoveOccurences {
    public static int[] duplicate(int arr[],int k)
    {
        int index=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=k)
            {
                arr[index++]=arr[i];
            }
        }
        return Arrays.copyOf(arr, index);
    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,3,4,5,6,3};
        int k=3;
        a=duplicate(a,k);
        System.out.println(Arrays.toString(a));
        
    }
}
