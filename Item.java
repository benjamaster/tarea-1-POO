public abstract class Item {
	
    public item(String name, int new_id){
	ID= new_id;
	nombre = name;
	cantidad = 0;
    }	    
    public abstract void printItemAplicado();
    public abstract void usar_item(Mascota pou);
    public void add_item(){
	cantidad = cantidad+1;
    } 	
    public void 		
    private int ID;
    private int cantidad;
    private String nombre;			
}

class Comida extends Item{
    public void printItemAplicado(){
	System.out.println("Dando de comer"+this.nombre+"...");
    }	
    public void usar_item(Mascota pou){
	pou.addEnergia(20);
	pou.addSalud(20);
	this.cantidad = cantidad -1;
    }	    
}

class Medicina extends Item{
    public void printItemAplicado(){
	System.out.println("Aplicando medicamento"+this.nombre+"...");
    }	
    public void usar_item(Mascota pou){
	pou.addSalud(40);
	this.cantidad = cantidad -1;
    }	    
}

class Juguete extends Item{
    public void printItemAplicado(){
	System.out.println("Usando Juguete"+this.nombre+"...");
    }	
    public void usar_item(Mascota pou){
	pou.addFelicidad(30);
	this.cantidad = cantidad -1;
    }	    
}






