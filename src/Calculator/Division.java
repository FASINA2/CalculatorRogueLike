package Calculator;

import Calculator.Utils.ID.ItemsMap;

import java.util.Scanner;

public class Division extends OperationsBase{

    public Division(ItemsMap map) {
        super.setId(super.createId(map));
        super.setDescription("Division");
    }

    public double use(double a, double b){
        while(b == 0){
            System.out.println("Division by zero! Try again!");
            Scanner sc = new Scanner(System.in);
            b = sc.nextInt();
        }
        return a/b;
    }
}
