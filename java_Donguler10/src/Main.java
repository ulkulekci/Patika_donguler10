import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("EBOB EKOK bulma\n iki sayi giriniz:");
        int i=1, ebob =1;
        int a= input.nextInt();
        int b= input.nextInt();
     if (a>b){while (i<=a){
         {if (a%i==0 && b%i==0)
             ebob=i;} i++;
     }

         System.out.println("EBOB:"+ ebob);
         System.out.print("EKOK:"+a*b/ebob);
     }
     else { i=1; ebob=1;
     while (i<=b){if (a%i==0 && b%i==0)
            ebob=i;} i++;
        System.out.println("EBOB:"+ ebob);
         System.out.print("EKOK:"+a*b/ebob);
     }



}}

