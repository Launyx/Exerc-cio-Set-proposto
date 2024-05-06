package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        
        Scanner tec = new Scanner(System.in);
        // Utilizando HashSet pois a ordem não importa
        Set<Integer> A = new HashSet<>();
        Set<Integer> B = new HashSet<>();
        Set<Integer> C = new HashSet<>();

        System.out.print("How many students for course A? ");
        int num = Integer.parseInt(tec.nextLine());

        for (int i = 0; i < num; i++){
            int number = Integer.parseInt(tec.nextLine());
            A.add(number);

        }

        System.out.print("How many students for course B? ");
        num = Integer.parseInt(tec.nextLine());

        for (int i = 0; i < num; i++){
            int number = Integer.parseInt(tec.nextLine());
            B.add(number);

        }

        System.out.print("How many students for course C? ");
        num = Integer.parseInt(tec.nextLine());

        for (int i = 0; i < num; i++){
            int number = Integer.parseInt(tec.nextLine());
            C.add(number);

        }

        Set<Integer> total = new HashSet<>(A);
        total.addAll(B);
        total.addAll(C);

        System.out.println("Total students: " + total.size());

        tec.close();
    }
}