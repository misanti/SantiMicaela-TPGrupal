import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args){
        System.out.println("Ingrese un numero: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (int i=0; i<= number; i++){
            if(i % 2 == 0){
                System.out.println("Numero par: " + i);
            }
        }
        scanner.close();
    }
}
