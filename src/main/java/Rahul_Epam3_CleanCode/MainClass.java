package Rahul_Epam3_CleanCode;

import Rahul_Epam3_CleanCode.HouseCost.HouseCost;

import java.util.Scanner;

public class MainClass {
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
        int type;
        double area;
        System.out.println("enter type of construction");
        System.out.println("enter 1 for Standard type");
        System.out.println("enter 2 for Above Standard type");
        System.out.println("enter 3 for high Standard type");
        System.out.println("enter 4 for Standard type and automation");

        type=sc.nextInt();
        System.out.println("enter the area of house");
        area=sc.nextDouble();

        HouseCost hh = new HouseCost(type,area);
        System.out.println(hh.calculateTotalCost());
    }
}
