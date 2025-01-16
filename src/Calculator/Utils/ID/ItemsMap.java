package Calculator.Utils.ID;

import Calculator.OperationsBase;
import java.util.HashMap;

public class ItemsMap{
    private HashMap<String, OperationsBase> items = new HashMap<String, OperationsBase>();

    public void setItems(String id, OperationsBase item) {
        if(items.put(id, item) == null){
            System.out.println("Item setted!");
        }
    }

    public boolean containsKey(String key) {
        return items.containsKey(key);
    }

    public OperationsBase get(String key) {
        return items.get(key);
    }

    public String getAll(){
        StringBuilder all = new StringBuilder();
        items.forEach((k,v)->{all.append(k).append(" ");});
        return all.toString().trim();
    }

    public int size(){
        return items.size();
    }
}
