package Calculator.Utils.ID;

import java.util.UUID;

public class SetId {
    private String id;

    public String createId(ItemsMap map) {
        do {
            this.id = UUID.randomUUID().toString();
        } while (map.containsKey(this.id));
        System.out.println("Create ID: " + this.id);
        return this.id;
    }

}
