public class LargestElement {
    static int arr[]={1,2,55,43,667,5432,98};
    static int largest()
    {
        int max=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println("Lagest Number in a array is "+largest());
    }
}
