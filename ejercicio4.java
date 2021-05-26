import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int number = scanner.nextInt();
        for (int i=1; i<= number; i++){
            if(isPrime(i)){
                System.out.println("El numero: " + i + " es primo");
            }
        }
        scanner.close();
    }


    public static boolean isPrime(int number){
        for(int i=2; i<number; i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
}