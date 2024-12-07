public class SearchanElement {
    private static void check(int arr[], int checkvalue)
    {
      boolean test=false;
      for(int element:arr)
      {
        if(element==checkvalue)
        {
            test = true;
            break;
        }

      }
      System.out.println("Is "+checkvalue+"present in a array : "+test);
    }
   public static void main(String[] args) {
    int a[]={1,4,5,6,7,8};
    int element=7;
    check(a, element);

   }
}