package java101;
import java.util.Scanner;

public class usHesaplamaFor {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Üssü hesaplanacak sayıyı giriniz: ");
        int n= inp.nextInt();
        System.out.print("Üs olacak sayıyı giriniz: ");
        int r= inp.nextInt();
        int total = 1;

        for(int i = 1 ; i <= r ; i++){
            total *= n;
        }
        System.out.println(n+"^"+r+ ":"+total);
    }
}
