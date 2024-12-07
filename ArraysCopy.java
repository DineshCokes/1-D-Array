public class ArraysCopy {
    public static void main(String[] args) {
       int a[]={1,3,4,5,6};
       int b[]=new int[a.length];
       b=a;
       //b[0]++;
       System.out.println("");
       for(int i=0;i<a.length;i++)
       {
        System.out.print(a[i]+" ");
       }
       System.out.println("");
       for(int i=0;i<b.length;i++)
       {
        System.out.print(b[i]+" ");
       }
    }
}
