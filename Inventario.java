import java.util.ArrayList;

public class Inventario {
    private ArrayList<Item> Item;

    public Inventario() {
        this.Item = new ArrayList<>();
    }
    
    public void addItem(Item item) { // Método para agregar un Item al inventario
        Item.add(item);
    }

    public void eliminarItem(Item item) { // Método para eliminar un Item del inventario
        Item.remove(item);
    }

    public ArrayList<Item> getItems() { // Método para obtener todos los Items del inventario
        return Item;
    }
    public void imprimir_inventario() { //Imprimir inventario
        for(Item itemInventario:items){
            System.out.println(itemInventario.getID() + ": " + itemInventario.getNombre() + " Cantidad " + itemInventario.getCantidad());
        }
    }  
}

