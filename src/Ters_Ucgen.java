import java.util. Scanner;



public class Ters_Ucgen {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen basamak sayısını yazınız");

        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j=1 ; j<=i-1; j++) {

                System.out.print(" ");}

                for (int k = 2*i-1; k <= 2 * n - 1;k++ ) {

                    System.out.print("*");
                }


            System.out.println();
        }



    }

    }