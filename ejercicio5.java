package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int occurrences, quantity, digit;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese cantidad de numeros a mostrar: ");
        quantity = scanner.nextInt();
        System.out.println("Ingrese el digito que desea comprobar: ");
        digit = scanner.nextInt();
        System.out.println("Ingrese cantidad de ocurrencias del digito: ");
        occurrences = scanner.nextInt();
        List<String> numbers = new ArrayList<>();
        for(int i=0;numbers.size() < quantity;i++) {
            String currentNumber = Integer.toString(i);
            int count = currentNumber.length() - currentNumber.replace(Integer.toString(digit),"").length();
            if(count >= occurrences) {
                numbers.add(currentNumber);
            }
        }
        numbers.forEach(System.out::println);

    }
}