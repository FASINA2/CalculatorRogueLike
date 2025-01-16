package Entities.Player;

import Calculator.Utils.ID.ItemsMap;

public class Player {
    private String name;
    private int balance;
    private int level;
    private int xp;
    private Inventory inventory;

    public Player(ItemsMap itemsMap) {
        inventory = new Inventory(itemsMap);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void printInventory() {
        inventory.printInventory();
    }

    public String getItemIventory(int index){
        return inventory.getFromInventory(index);
    }

    public void addToInventory(String id){
        inventory.addToInventory(id);
    }

    public void removeFromInventory(String id){
        inventory.removeFromInventory(id);
    }
}
