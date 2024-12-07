public class Checkarraysequal {
    private static void checkarray(int a[],int b[])
    {
        boolean c=true;
        if(a.length==b.length)
        {
            for(int i=0;i<a.length;i++)
            {
                    if(a[i]!=b[i])
                    {
                        c=false;
                    }
            }

        }
        else{
            c=false;
        }
        if(c)
        {
            System.out.println("Equal");
        }
        else{
            System.out.println("Not Equal");
        }

    }
    public static void main(String[] args) {
        int a[]={10,20,30,40,50};
        int b[]={10,20,30,40,50};
        checkarray(a, b);
        
    }
}
