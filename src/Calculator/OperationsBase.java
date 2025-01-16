package Calculator;

import Calculator.Utils.ID.*;

public class OperationsBase {
    private SetId idCreator = new SetId();
    private int price;
    private String id;
    private Boolean disponible = false;
    private String description;

    public String createId(ItemsMap map){
        return idCreator.createId(map);
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public Boolean getDisponible() {
        return disponible;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setDisponible(Boolean disponible) {
        this.disponible = disponible;
    }

    public String getId() {
        return id;
    }

    public double use(double num1, double num2) {
        return 0;
    }
}
