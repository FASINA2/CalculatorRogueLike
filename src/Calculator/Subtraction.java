package Calculator;


import Calculator.Utils.ID.ItemsMap;

public class Subtraction extends OperationsBase {

    public Subtraction(ItemsMap map) {
        super.setId(super.createId(map));
        super.setDescription("Subtraction");
    }
    public double use(double a, double b) {
        return a - b;
    }
}
