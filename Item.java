public abstract class Item {
	
    
    public abstract void printItemAplicado();

    private int ID;
    private int cantidad;
    private String nombre;			
}

class Comida extends Item{
	
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

