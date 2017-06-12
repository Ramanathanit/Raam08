import java.util.Scanner;
 
class digitCount {
    public static void main(String args[])
    {  
        int n, i=0;
        Scanner get = new Scanner(System.in);
        n = get.nextInt();
        while(n>0)
        {
            n=n/10;
            i++;
        }
        System.out.println();
        System.out.println("Digits  : "+i);
    }
}
