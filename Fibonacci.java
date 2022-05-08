import java.util.Scanner;
class Fibonacci{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter number n : ");
        int n=sc.nextInt();

        int a= 0,b = 1;
        if (n==0){
                System.out.print(a+" "+b+" ");
                for (int i = 1; i<4; ++i)
                {
                    int series = a + b;
                        a = b;
                        b = series;
                        
                    if  (series>=n)
                    {
                       System.out.print (series+" ");
                    }         
                }                
        }
        else if(n==1){
                System.out.print(b+" ");
                for (int i = 1; i<5; ++i)
                {
                    int series = a + b;
                        a = b;
                        b = series;
                        
                    if  (series>=n)
                    {
                       System.out.print (series+" ");
                    }         
                }
        }
        // System.out.println("Fibonacci Series :");
        else{
                for (int i = 1; i<n+5; ++i)
                {
                    int series = a + b;
                        a = b;
                        b = series;
                        
                    if  (series>=n)
                    {
                       System.out.print(series+" ");
                    }         
                }
            }
    }
}