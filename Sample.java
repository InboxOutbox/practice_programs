package practice;

import java.util.Scanner;

public class Sample {
static void solve(double meal_cost, int tip_percent, int tax_percent) {
        
        double tip= tip_percent*meal_cost/100;
        double tax= tax_percent*meal_cost/100;
        double totalcost = meal_cost + tip + tax;
        System.out.println(tip +","+ tax+","+ totalcost);
        System.out.println(Math.round(totalcost));

    }

    

    public static void main(String[] args) {
        double meal_cost = 10.25;
        int tip_percent = 17;
        int tax_percent = 5;
        solve(meal_cost, tip_percent, tax_percent);

    }
}
