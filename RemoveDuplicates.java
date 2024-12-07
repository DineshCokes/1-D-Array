public class RemoveDuplicates {
    static int removeDupli(int arr[])
    {
        int n=arr.length;
        int indx=1;
        for(int i=1;i<n;i++)
        {
            if(arr[i]!=arr[i-1])
            {
                arr[indx++]=arr[i];
            }
        }
        return indx;
    }
    public static void main(String[] args) {
        int a[]={1,2,2,3,4,4,5};
       int result= removeDupli(a);
     for(int i=0;i<result;i++)
    {
        System.out.print(a[i]+" ");
    }
        
    }
}
