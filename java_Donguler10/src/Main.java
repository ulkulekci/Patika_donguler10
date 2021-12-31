import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("EBOB EKOK bulma\n iki sayi giriniz:");
        int i,ebob =1;
        int a= input.nextInt();
        int b= input.nextInt();
     if (a>b){for (i=1;i<=a;i++){if (a%i==0 && b%i==0)
      ebob=i;
     }

         System.out.println("EBOB:"+ ebob);
         System.out.print("EKOK:"+a*b/ebob);
     }
     if (b>a){
     for (i=1;i<=b;i++){if (a%i==0 && b%i==0)
            ebob=i;}
        System.out.println("EBOB:"+ ebob);
         System.out.print("EKOK:"+a*b/ebob);
     }



}}

