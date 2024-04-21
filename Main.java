import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws IOException{
        // Carga de archivo config.csv
        Inventario inventario = new Inventario();
        if (args.length != 1) {
            System.out.println("Usage: java Stage1 <config.csv>");
            //System.exit(-1);
        }

        //Scanner in = new Scanner(new File(args[0])); //Scanner in original
        Scanner in = new Scanner(new File("config.csv"));
        Main stage1 = new Main();
        // Lectura de archivo config.csv
        stage1.readConfiguration(in, inventario);

        stage1.executeAction(new Scanner(System.in), System.out, inventario);
        System.out.println("Programa terminado");
    }

    public void readConfiguration(Scanner in,  Inventario inventario){
        // Creación de mascota
        String nombre_mascota = in.nextLine();
        mascota = new Mascota(nombre_mascota);
        // Creación de inventario vacío
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
           /*  inventario.addInv(1,"Juguete","Pelota",4);
            inventario.addInv(2,"Comida","Queso",5);
            inventario.addInv(3,"Comida","Pan",3);
            inventario.addInv(4,"Medicina","Jarabe",4);*/

        }

        // Crear algunos elementos
        Item item1 = new Juguete("Pelota", 1, 4);
        Item item2 = new Comida("Queso", 2, 5);
        Item item3 = new Comida("Pan", 3, 3);
        Item item4 = new Medicina("Jarabe", 4, 4);

        // Agregar los elementos al inventario
        inventario.addItem(item1);
        inventario.addItem(item2);
        inventario.addItem(item3);
        inventario.addItem(item4);

        /* 
        System.out.println("Mascota Virtual\n");
        System.out.println("'\nAtributos\n---------\nNombre: " + mascota.Nombre +  "\nEdad:" + mascota.Edad + "\nSalud:" + mascota.Salud + "\nEnergía:" + mascota.Energia + "\nFelicidad:" + mascota.Felicidad + "\nEstado:" + mascota.getEstado().getMensaje());
        mascota.addFelicidad(50);
        System.out.println("'\nAtributos\n---------\nNombre: " + mascota.Nombre +  "\nEdad:" + mascota.Edad + "\nSalud:" + mascota.Salud + "\nEnergía:" + mascota.Energia + "\nFelicidad:" + mascota.Felicidad + "\nEstado:" + mascota.getEstado().getMensaje());
        mascota.addEnergia(-90);
        System.out.println("'\nAtributos\n---------\nNombre: " + mascota.Nombre +  "\nEdad:" + mascota.Edad + "\nSalud:" + mascota.Salud + "\nEnergía:" + mascota.Energia + "\nFelicidad:" + mascota.Felicidad + "\nEstado:" + mascota.getEstado().getMensaje());
        mascota.addEnergia(150);
        System.out.println("'\nAtributos\n---------\nNombre: " + mascota.Nombre +  "\nEdad:" + mascota.Edad + "\nSalud:" + mascota.Salud + "\nEnergía:" + mascota.Energia + "\nFelicidad:" + mascota.Felicidad + "\nEstado:" + mascota.getEstado().getMensaje());
        */
    }
    
    /**
     * @param in
     * @param out
     * @param inventario
     */
    public void executeAction(Scanner in, PrintStream out, Inventario inventario){
        /* Completar código con manejo de acciones y menú en las etapas que corresponda
        e incremento del tiempo dependiendo de la etapa */
        Scanner scan = new Scanner(System.in);
        int opcion;
        float Time = 0;
        System.out.println("Test Mascota Virtual\n");
        do {
            System.out.println("Tiempo Simulado:" + Time);
            System.out.println("\nAtributos\n---------\nNombre: " + mascota.Nombre +  "\nEdad:" + mascota.Edad + "\nSalud:" + mascota.Salud + "\nEnergía:" + mascota.Energia + "\nFelicidad:" + mascota.Felicidad + "\nEstado:" + mascota.getEstado().getMensaje());
            System.out.println("\nAcciones---------\n");
            inventario.imprimir_inventario();
            System.out.println("\nSeleccione un elemento del inventario:");
            opcion = scan.nextInt();

            switch(opcion){
                case 1:
                    //Ocupar item 1
                    Item itemSeleccionado = inventario.getItems().get(opcion - 1);
                    itemSeleccionado.usar_item(mascota);
                    //itemSeleccionado.printItemAplicado();//Arreglar Sigue apareciendo que juega a pesar de no estar disponible
                    break;
                case 2: 
                    //Ocupar item 2
                    Item itemSeleccionado2 = inventario.getItems().get(opcion - 1);
                    itemSeleccionado2.usar_item(mascota);
                    //itemSeleccionado2.printItemAplicado();
                    break;
                case 3:
                    //Ocupar item 3
                    Item itemSeleccionado3 = inventario.getItems().get(opcion - 1);
                    itemSeleccionado3.usar_item(mascota);
                   // itemSeleccionado3.printItemAplicado();
                    break;
                case 4:
                    //Ocupar item 4
                    Item itemSeleccionado5 = inventario.getItems().get(opcion - 1);
                    itemSeleccionado5.usar_item(mascota);
                    //itemSeleccionado5.printItemAplicado();
                    break;
            }
            mascota.addEdad(0.5f);
            Time = Time + 0.5f;
            mascota.addEnergia(-5);
            mascota.addSalud(-5);   
            mascota.addFelicidad(-5); 

                          
            
        } while(mascota.Edad < 15 || mascota.Salud > 0 || mascota.Energia > 0);

        scan.close(); //cerrar instancia scan despues de utilizar
    
    }

    public void printEstado(float step, PrintStream out){
        /* Completar método que muestra el estado de la Mascota y del inventario
        dependiendo de la etapa */

    }

    private Mascota mascota;
    //private Inventario inventario; // Descomentar cuando se haya creado el inventario
}
