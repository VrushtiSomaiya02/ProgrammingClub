import java.util.Scanner;
class RevArray{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size=sc.nextInt();
        int a[]=new int[size];
        int temp;
        for (int i=0;i<a.length;i++) {
            System.out.print("Enter a["+i+"] : ");
            a[i]=sc.nextInt();
        }    
        for(int i=0;i<a.length/2;i++){
            temp=a[i];
            a[i]=a[(size-1)-i];
            a[(size-1)-i]=temp;
        }
        System.out.println("Reverse Array : ");
        for(int i=0;i<a.length;i++){
            System.out.println(" a["+i+"] : "+a[i]);
        }
    }
}