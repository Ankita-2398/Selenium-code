public class CoreJavaPractice {

    public static void main(String[] args){
        //VARIALBES TYPES IN CORE JAVA
        int MyNUM=7;
        String name="My name is Ankita";
        char letter='M';
        double decimal1=8.99;
        float dec = 9.90F;
        boolean myCard= true;

        //PRINT VALUE
        System.out.println(MyNUM);
        //PRINT VALUE WITH THE NAME
        System.out.println( MyNUM + "Is my Lucky Number.");

        //ARRAYS DECLARATION - add [] after variable
        //ARRAY STYLE 1
        int[] array = new int[5];
        array[0]=1;
        array[1]=2;
        array[2]=3;
        array[3]=4;
        array[4]=5;

        //ARRAY STYLE 2
        int[] array2= {1,2,3,4,5,9,44,2,33,45,566,222};
        //System.out.println(array[4]);

        //FOR LOOP
        //1st
        //for(int i=0;i<array2.length;i++){
           //for (int i=0; i<5;i++){
               //System.out.println(array2[i]);

        //STRING ARRAY
        String[] name1 = {"Ankita", "Mahesh", "Rutuja"};

        for(int a = 0; a< name1.length;a++)
        {
                System.out.println(name1[a]);
        }

        //SIMPLIFIED WAY OF FOR LOOP
        for(String s: name1)
        {
           System.out.println(s);
        }


        }



    }

