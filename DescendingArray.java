import java.util.Arrays;

public class DescendingArray {
    public static void main(String[] args) {
        int a[]={1,3,4,5,2,7,8,10};
        Arrays.sort(a);
        reverse(a);
        System.out.println(Arrays.toString(a));     
    }
    static void reverse(int arr[])
    {
        int n=arr.length;
        for(int i=0;i<n/2;i++)
        {
        int t=arr[i];
        arr[i]=arr[n-i-1];
        arr[n-i-1]=t;
        }   
    }
}
// public static void main(String[] args) {
//     int a[]={1,3,4,5,2,7,8,10};
//     Arrays.sort(a,Collections.reverseOrder());
//     System.out.println(Arrays.toString(a));     
// }
