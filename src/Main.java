//import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n;
      // Scanner input=new Scanner(System.in) ;
      // n= input.nextInt();
        for(n=2;n<=100;n++) {
            boolean isPrime = true;
            for (int i = 2; i < (n - 1); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(n);
            }


        }
        }

    }
