public class Mascota{
    /* Completar con los métodos, atributos y constructor de Mascota 
    dependiendo de la etapa */

    public Mascota(String name){
        this.Nombre = name;
        this.beggin_pet();
        this.setEstado(Estado.Neutro);
    }

    public void beggin_pet(){
        this.Edad = 0;
        this.Salud = 100;
        this.Energia = 100;
        this.Felicidad = 50;
    }

    public void setEstado(Estado estado) {
        this.Estado = estado;
    }

    public Estado getEstado() {
        return Estado;
    }

    public void addEnergia( int energia) {
        int result = this.Energia + energia;
        if (result > 100) this.Energia = 100;
        else this.Energia = result;
        actualizarEstado(this.Edad, this.Salud, this.Energia, this.Felicidad);
    }

    public void addFelicidad( int felicidad) {
        int result = this.Felicidad + felicidad;
        if (result > 100) this.Felicidad = 100;
        else this.Felicidad = result;
        actualizarEstado(this.Edad, this.Salud, this.Energia, this.Felicidad);
    }

    public void addEdad( int edad) {
        this.Edad = this.Edad + edad;
        actualizarEstado(this.Edad, this.Salud, this.Energia, this.Felicidad);
    }

    public void addSalud( int salud) {
        int result = this.Salud + salud;
        if (result > 100) this.Salud = 100;
        else this.Salud = result;
        actualizarEstado(this.Edad, this.Salud, this.Energia, this.Felicidad);
    }


    public void actualizarEstado(float Edad, int Salud, int Energia, int Felicidad) {
        if (Edad > 15 || Salud == 0 || Energia == 0) {
            this.Estado = Estado.Muerto;
        } else if (Energia <= 15) {
            this.Estado = Estado.Cansado;
        } else if (Edad > 5 && (Energia <= 30 && Salud <= 30)) {
            this.Estado = Estado.Enojado;
        } else if ((Edad <= 5 && Salud <= 20) || (Edad > 5 && Salud <= 50)) {
            this.Estado = Estado.Hambriento;
        } else if (Felicidad <= 20) {
            this.Estado = Estado.Triste;
        } else if (Felicidad >= 60) {
            this.Estado = Estado.Feliz;
        } else {
            this.Estado = Estado.Neutro; // Si no cumple ninguna condición, el estado es neutro
        }
    }
    public void actualizarParametros(){
        if (this.Edad <= 5 && this.Salud <= 10){
            this.Felicidad = Math.max(this.Felicidad - 20,0);
        }
        else if (this.Edad >5 && this.Edad <=10 && this.Salud <= 50){
            this.Felicidad = Math.max(this.Felicidad - 20,0);
            this.Energia = Math.max(this.Energia - 10,0);
        }
        else if (this.Edad > 10 && this.Salud <=50){
            this.Felicidad = Math.max(this.Felicidad - 30,0);
            this.Energia = Math.max(this.Energia - 20,0);
        }
        actualizarEstado(this.Edad, this.Salud, this.Energia, this.Felicidad);
    }
    public void dormir(){
        this.Energia = 100;
        addFelicidad(15);
        addSalud(15);
    }
    private Estado Estado;
    public String Nombre;
    public float Edad;
    public int Salud;
    public int Energia;
    public int Felicidad;
}
