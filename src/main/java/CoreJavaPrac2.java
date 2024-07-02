public class CoreJavaPrac2 {

    public static void main (String []args){

        int [] array2 = {2,3,4,5,6,78,22,468,23,483,28} ;

        int b=10;
        int a=2;
        int c=b^a;
        System.out.println(c);

        //Display number divisible by 2
        for(int i=0;i< array2.length;i++)
        {
            if(array2[i] % 2 ==0)
            {
                System.out.println(array2[i]);
                break;

            }`
            else
            {
                System.out.println(array2[i] + "Is not divisible by 2");
                System.out.println(array2[i] + "Is not divisible by 2");
            }

        }



    }
}
