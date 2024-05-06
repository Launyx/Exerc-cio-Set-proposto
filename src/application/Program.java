package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Student;

public class Program {
    public static void main(String[] args) {
        
        Scanner tec = new Scanner(System.in);

        // Utilizando HashSet pois a ordem não importa
        Set<Student> set = new HashSet<>();

        System.out.print("How many students for course A? ");
        int num = Integer.parseInt(tec.nextLine());

        for (int i = 0; i < num; i++){
            int code = Integer.parseInt(tec.nextLine());
            set.add(new Student(code));

        }

        System.out.print("How many students for course B? ");
        num = Integer.parseInt(tec.nextLine());

        for (int i = 0; i < num; i++){
            int code = Integer.parseInt(tec.nextLine());
            set.add(new Student(code));

        }


        System.out.print("How many students for course C? ");
        num = Integer.parseInt(tec.nextLine());

        for (int i = 0; i < num; i++){
            int code = Integer.parseInt(tec.nextLine());
            set.add(new Student(code));

        }

        System.out.println("Total students: " + set.size());


        tec.close();
    }
}
