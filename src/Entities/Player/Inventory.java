package Entities.Player;

import Calculator.OperationsBase;
import Calculator.Utils.ID.ItemsMap;

import java.util.ArrayList;
import java.util.HashMap;

public class Inventory {

    private ArrayList<String> inventory = new ArrayList<>();
    private ItemsMap itemsMap = new ItemsMap();


    public Inventory(ItemsMap itemsMap) {
        this.itemsMap = itemsMap;
    }

    public void addToInventory(String id){
        if(inventory.add(id)){
            System.out.println("Item added to the inventory!");
        };
    }

    public void removeFromInventory(String id){
        inventory.remove(id);
    }

    public String getFromInventory(int id){
        return inventory.get(id);
    }

    public void printInventory(){
        int i;
        for(i = 0; i < inventory.size(); i++){
            System.out.println(i + 1 + "-" + itemsMap.get(inventory.get(i)).getDescription() + "\n");
        }
    }

}
