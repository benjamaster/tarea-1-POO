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

    public void setEnergia( int energia) {
        this.Energia = energia;
        actualizarEstado(this.Edad, this.Salud, this.Energia, this.Felicidad);
    }

    public void setFelicidad( int felicidad) {
        this.Felicidad = felicidad;
        actualizarEstado(this.Edad, this.Salud, this.Energia, this.Felicidad);
    }

    public void setEdad( int edad) {
        this.Edad = edad;
        actualizarEstado(this.Edad, this.Salud, this.Energia, this.Felicidad);
    }

    public void setSalud( int salud) {
        this.Salud = salud;
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

    private Estado Estado;
    public String Nombre;
    public float Edad;
    public int Salud;
    public int Energia;
    public int Felicidad;
}
