package Calculator;

import Calculator.Utils.ID.ItemsMap;

public class Sum extends OperationsBase {

    public Sum(ItemsMap map) {
        super.setId(super.createId(map));
        super.setDescription("Sum");
    }
    public double use(double a, double b) {
        return a + b;
    }

}
