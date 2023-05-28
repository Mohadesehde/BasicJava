import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Variables
        int a=22;
        double c=1.23;
        float b=1.25f;
        long w=12345671234l;

//        print
        System.out.println(a);
        System.out.println(c);
        System.out.println("Hi");
        System.out.println("سلام");
        System.out.println('a');

//        Array 1D
//        int[] anArray;
//        int anArray[];

        int[] anArray;
        anArray = new int[10];
        anArray[0] =100;
        anArray[1] =100;
        anArray[2] =100;
        System.out.println(anArray[0]);

        int[] anArray2 = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};
        System.out.println(anArray2.length);

//        Array 2D
        int[][] anArray3 = new int[5][10];

        int[][] anArray4 = new int[5][];
        anArray4[0] = new int[10];
        anArray4[1] = new int[5];
        anArray4[2] = new int[7];

//        input
        Scanner sc= new Scanner(System.in);
        a=sc.nextInt();
        System.out.println( a+b);
        System.out.println( a*b);
        System.out.println( "hi"+a);
        System.out.println("hello"+ "hi");

//        if
        if (a>10)
            System.out.println(a+10);

        if (a>10)
            System.out.println(a+10);
        else
            System.out.print(-a);

//        switch
        switch(a)
        {
            case 1:
                System.out.print('1');
                break;
            case 2:
                System.out.print('2');
                break;
            default:
                System.out.print("hi");
        }

//          while
        int count = 1;
        while (count < 11) {
            System.out.println("Count is: " + count);
            count++;
        }
        while(true)
        {
            a=sc.nextInt();
            if(a<0)
                break;
        }

//        for
        int [] f=new int [5];
//        read
        for( int i=0; i<5; i++)
            f[i]=sc.nextInt();
//        print
        for( int i=0; i<5; i++)
            System.out.println(f[i]);

        for( int i=0; i<f.length; i++)
            System.out.println(f[i]);

        for( int h: f)
            System.out.println(h);
        // function overloading
        System.out.println(sum(2,3));
        System.out.println(sum(2.5f, 3));
        System.out.println(sum(2,3,4));

    }
// function overloading
    public static int sum(int a, int b)
    {
        return a+b;
    }
    public static int sum(int a, int b, int c)
    {
        return a+b+c;
    }
    public static float sum(float a, float b)
    {
        return a+b;
    }
}
