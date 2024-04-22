public abstract class Item {
	
    public Item(String name, int new_id, int cant){
	   ID= new_id;
	   nombre = name;
	   cantidad = cant;
    }	    
    public abstract void printItemAplicado();
    public abstract void usar_item(Mascota pou);
    public void add_item(){
	cantidad = cantidad+1;
    } 	
    //public void 	
    public int getID() {
        return ID;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getNombre() {
        return nombre;
    }		
    protected int ID;
    protected int cantidad;
    protected String nombre;			
}

class Comida extends Item{
    public Comida(String name, int new_id, int cantidad){
        super(name,new_id,cantidad);
    }
    public void printItemAplicado(){
	   System.out.println("Dando de comer " +this.nombre+"...");
    }	
    public void usar_item(Mascota pou){
        if (this.cantidad>0) {
            pou.addEnergia(20);
            pou.addSalud(20);
            this.cantidad = cantidad -1;
            System.out.println("Dando de comer " +this.nombre+"...");
        }
        else{
            System.out.println("Este item no se encuentra disponible");
        }
    }	    
}

class Medicina extends Item{
    public Medicina(String name, int new_id, int cantidad){
        super(name,new_id,cantidad);
    }
    public void printItemAplicado(){
	   System.out.println("Aplicando medicamento " +this.nombre+"...");
    }	
    public void usar_item(Mascota pou){
        if (this.cantidad>0) {
            pou.addSalud(40);
            this.cantidad = cantidad -1; 
            System.out.println("Aplicando medicamento " +this.nombre+"...");
        }
        else{
            System.out.println("Este item no se encuentra disponible");
        }
    }	    
}

class Juguete extends Item{
    public Juguete(String name, int new_id, int cantidad){
        super(name,new_id,cantidad);
    }
    public void printItemAplicado(){
	   System.out.println("Usando Juguete " +this.nombre+"...");
    }	
    public void usar_item(Mascota pou){
        if (this.cantidad>0) {
            pou.addFelicidad(30);
            this.cantidad = cantidad -1;
            System.out.println("Usando Juguete " +this.nombre+"...");
        }
        else{
            System.out.println("Este item no se encuentra disponible");
        }
    }



    /* Completar código de la clase*/


}



