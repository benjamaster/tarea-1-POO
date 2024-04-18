public abstract class Item {
	
    public item(String name, int new_id){
	ID= new_id;
	nombre = name;
	cantidad = 0;
    }	    
    public abstract void printItemAplicado();
    public abstract void usar_item(Mascota pou)	;
    public void add_item(){
	cantidad = cantidad+1;
    }
    public void 		
    private int ID;
    private int cantidad;
    private String nombre;			
}

class Comida extends Item{
	
}

class Medicina extends Item{
	
}

class Juguete extends Item{
		
=======
    /* Completar código de la clase*/

}




enum ItemClass{ //actualizarAtributos(this.Salud, this.Energia, this.Felicidad);
    Comida(20,20,0),
    Medicina(40,0,0),
    Juguete(0,0,30);

    private int Salud;
    private int Energia;
    private int Felicidad;

    private ItemClass (int Salud, int Energia, int Felicidad){
		this.Salud = Salud;
        this.Energia = Energia;
        this.Felicidad = Felicidad;
	}

    public void Consumir() {
        //valores = [Salud , Energia, Felicidad];
		//return valores;
    }
	
}

