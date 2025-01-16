package Calculator;


import Calculator.Utils.ID.ItemsMap;

public class Multiplication extends OperationsBase {

    public Multiplication(ItemsMap map) {
        super.setId(super.createId(map));
        super.setDescription("Multiplication");
    }
    public double use(double a, double b) {
            return a * b;
        }
    }
