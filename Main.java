import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws IOException{
        // Carga de archivo config.csv
        if (args.length != 1) {
            System.out.println("Usage: java Stage1 <config.csv>");
            //System.exit(-1);
        }

        //Scanner in = new Scanner(new File(args[0])); //Scanner in original
        Scanner in = new Scanner(new File("config.csv"));
        Main stage1 = new Main();
        // Lectura de archivo config.csv
        stage1.readConfiguration(in);

        stage1.executeAction(new Scanner(System.in), System.out);
        System.out.println("Programa terminado");
    }

    public void readConfiguration(Scanner in){
        // Creación de mascota
        String nombre_mascota = in.nextLine();
        mascota = new Mascota(nombre_mascota);
        // Creación de inventario vacío
        Inventario inventario = new Inventario();
        // Llenando inventario
        while (in.hasNextLine()) {
            String linea = in.nextLine();
            String[] item_csv = linea.split(";");
            int id = Integer.parseInt(item_csv[0]);
            String tipoItem = item_csv[1];
            String nombreItem = item_csv[2];
            int cantidad = Integer.parseInt(item_csv[3]);
        
            // inventario.addInv(id, tipoItem, nombreItem, cantidad);
            /* Completar código para inicialización de inventario en la etapa
            que corresponda */
            // Se realiza inicializacion Stage 3 -> 
            // se inicializa los 4 items de prueba
            inventario.addItem(1,Juguete,Pelota,4);
            inventario.addItem(2,Comida,Queso,5);
            inventario.addItem(3,Comida,Pan,3);
            inventario.addItem(4,Medicina,Jarabe,4);
        }

        System.out.println("Mascota Virtual\n");
        System.out.println("'\nAtributos\n---------\nNombre: " + mascota.Nombre +  "\nEdad:" + mascota.Edad + "\nSalud:" + mascota.Salud + "\nEnergía:" + mascota.Energia + "\nFelicidad:" + mascota.Felicidad + "\nEstado:" + mascota.getEstado().getMensaje());
        mascota.addFelicidad(50);
        System.out.println("'\nAtributos\n---------\nNombre: " + mascota.Nombre +  "\nEdad:" + mascota.Edad + "\nSalud:" + mascota.Salud + "\nEnergía:" + mascota.Energia + "\nFelicidad:" + mascota.Felicidad + "\nEstado:" + mascota.getEstado().getMensaje());
        mascota.addEnergia(-90);
        System.out.println("'\nAtributos\n---------\nNombre: " + mascota.Nombre +  "\nEdad:" + mascota.Edad + "\nSalud:" + mascota.Salud + "\nEnergía:" + mascota.Energia + "\nFelicidad:" + mascota.Felicidad + "\nEstado:" + mascota.getEstado().getMensaje());
        mascota.addEnergia(150);
        System.out.println("'\nAtributos\n---------\nNombre: " + mascota.Nombre +  "\nEdad:" + mascota.Edad + "\nSalud:" + mascota.Salud + "\nEnergía:" + mascota.Energia + "\nFelicidad:" + mascota.Felicidad + "\nEstado:" + mascota.getEstado().getMensaje());
    }
    
    public void executeAction(Scanner in, PrintStream out){
        /* Completar código con manejo de acciones y menú en las etapas que corresponda
        e incremento del tiempo dependiendo de la etapa */
        Scanner scan = new Scanner(System.in);
        int opcion;
        float Time = 0;
        System.out.println("Test Mascota Virtual\n");
        do {
            System.out.println("Tiempo Simulado:" + Time);
            System.out.println("'\nAtributos\n---------\nNombre: " + mascota.Nombre +  "\nEdad:" + mascota.Edad + "\nSalud:" + mascota.Salud + "\nEnergía:" + mascota.Energia + "\nFelicidad:" + mascota.Felicidad + "\nEstado:" + mascota.getEstado().getMensaje());
            System.out.println("\nAcciones---------\n");
            inventario.imprimirInventario();
             System.out.println("\nSeleccione un elemento del inventario:\n");
            opcion = scan.nextInt();

            switch(opcion){
                case 1:
                    //Ocupar item 1
                    break;
                case 2: 
                    //Ocupar item 2
                    break;
                case 3:
                    //Ocupar item 3
                    break;
                case 4:
                    //Ocupar item 4
                    break;
            }
            mascota.addEdad(0.5);
            Time = Time + 0.5;          
                          
            
        } While(mascota.Edad < 15 || mascota.Salud > 0 || mascota.Energia > 0);
    
    }

    public void printEstado(float step, PrintStream out){
        /* Completar método que muestra el estado de la Mascota y del inventario
        dependiendo de la etapa */

    }

    private Mascota mascota;
    // private Inventario inventario; // Descomentar cuando se haya creado el inventario
}
