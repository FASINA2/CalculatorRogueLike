import Calculator.*;
import Calculator.Utils.ID.ItemsMap;
import Entities.Player.*;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ItemsMap itemsMap = new ItemsMap();
        Player player = new Player(itemsMap);
        Division division = new Division(itemsMap);
        Multiplication multiplication = new Multiplication(itemsMap);
        Sum sum = new Sum(itemsMap);
        Subtraction subtraction = new Subtraction(itemsMap);

        itemsMap.setItems(division.getId(), division);
        itemsMap.setItems(multiplication.getId(), multiplication);
        itemsMap.setItems(sum.getId(), sum);
        itemsMap.setItems(subtraction.getId(), subtraction);

        System.out.println("Olá! Veja preciso que você faça uma coisa para mim...\n" +
                "É simples, faça contas matematicas para chegar ao numero 8!" +
                " Mas antes, veja os items disponiveis para você necesse momento, escolha apenas um...");

        String all = itemsMap.getAll();
        String[] items = all.split(" ");

        for (int i = 0; i < items.length; i++) {
            OperationsBase operation;
            operation = itemsMap.get(items[i]);
            System.out.println(i + " " + operation.getDescription());
        }

        int chose = sc.nextInt();

        player.addToInventory(items[chose]);

        double result = 0;

        while(result != 8){
            System.out.println("Digite n1:");
            double num1 = sc.nextDouble();
            System.out.println("Digite n2:");
            double num2 = sc.nextDouble();
            String itemChoice = player.getItemIventory(0);
            OperationsBase item = itemsMap.get(itemChoice);
            result = item.use(num1,num2);
            System.out.println(result);
        }

        System.out.println("Correto!");

    }
}