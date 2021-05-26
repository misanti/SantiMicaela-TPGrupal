import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int number = scanner.nextInt();
        System.out.println("Ingrese la cantidad de multiplos: ");
        int multiplos = scanner.nextInt();
        for (int i=1; i<= multiplos; i++){
            if(i % 2 == 0){
                System.out.println(number*i);
            }
        }
        scanner.close();
    }
}