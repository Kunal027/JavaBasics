public class LoopsIntro {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 5) {
            System.out.println(i + ".Code Blooded");
            ++i;
        }
        System.out.println("The value of i is : " + i);

        int j = 1;
        do{
            System.out.println( j +".This is do part");
            j++;
        }while(j <= 5);

        for(int k = 1; k <= 5; k++)
        {
            if( k == 3)
            {
                continue;
            }
            if( k == 5)
            {
                break;
            }
            System.out.println(k);
        }
        int n=0;
        for( int m = 0; m < 10; m++)
        {
            System.out.println("Inside For loop\n");
            do{
                System.out.println("Inside Do while loop");
                n++;
            }while(n <= 3);
        }

    }
}
