import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int number = scanner.nextInt();
        boolean isPrimeNumber = true;
        for (int i=2; i<number; i++){
            if(i % i == 0){
                System.out.println("No es un numero primo");
                isPrimeNumber = false;
                break;
            }
        }
        if(isPrimeNumber){
            System.out.println("Es un numero primo");
        }
        scanner.close();
    }
}