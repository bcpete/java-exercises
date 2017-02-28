package org.lanchcode.java.studios;
import java.util.Scanner;
/**
 * Created by Brady on 2/27/17.
 */
public class Area {

    public static void main(String[] args){
        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.println("Enter a radius:");
        double radius = scanner.nextFloat();
        while(radius<=0){
            System.out.println("Enter a radius:");
            radius = scanner.nextFloat();
        }
        double pi = 3.14;
        double area = pi*radius*radius;
        System.out.println(area);
    }

}
