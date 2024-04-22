import java.io.File;
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

        Scanner in = new Scanner(new File(args[0])); //Scanner in original
        //Scanner in = new Scanner(new File("config.csv"));
        Main stage1 = new Main();
        // Lectura de archivo config.csv
        stage1.readConfiguration(in, inventario);

        stage1.executeAction(new Scanner(System.in), System.out, inventario);
        System.out.println("\n Fin de la simulación\n");
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
        
            if (tipoItem.equals("Juguete")){
                Item item_juguete = new Juguete(nombreItem,id,cantidad);
                System.out.println("tipo item:" + tipoItem + " Largo:" + tipoItem.length());
                inventario.addItem(item_juguete);
            }
            else if (tipoItem.equals("Comida")){
                Item item_comida = new Comida(nombreItem,id,cantidad);
                inventario.addItem(item_comida);
            }
            else if (tipoItem.equals("Medicina")){
                Item item_medicina = new Medicina(nombreItem,id,cantidad);
                inventario.addItem(item_medicina);
            }

        }
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
        char opcion;
        float Time = 0;
        int flag =1;
        System.out.println("Test Mascota Virtual\n");
        do {
            System.out.println("Tiempo Simulado:" + Time);
            System.out.println("\nAtributos\n---------\nNombre: " + mascota.Nombre +  "\nEdad:" + mascota.Edad + "\nSalud:" + mascota.Salud + "\nEnergía:" + mascota.Energia + "\nFelicidad:" + mascota.Felicidad + "\nEstado:" + mascota.getEstado().getMensaje());
            if(mascota.getEstado().getMensaje() == "(x_x) fin del juego (Muerto)"){
                return;        
            }
            System.out.println("\nAcciones---------\n");
            System.out.println("0: Dormir");
            inventario.imprimir_inventario();
            System.out.println("Seleccione un elemento del inventario, 'c' para continuar, y 'x' para salir:");
            System.out.println("\nSeleccione un elemento del inventario:");
            opcion = scan.next().charAt(0);

            if (opcion == '0'){
                mascota.dormir()
                System.out.println("\nA Dormir!! (v,v) zzz...");
            }
            else if(opcion =='x'){
                flag = 0;
            }
            else if(opcion =='c'){
                System.out.println("\nContinuando turno.");
            }
            else if(opcion >= '1' && opcion <= '9'){
                int numero = opcion - '0';
                try{
                    Item itemSeleccionado = inventario.getItems().get(numero-1);
                    if (itemSeleccionado.cantidad > 1){
                        itemSeleccionado.usar_item(mascota);
                    }
                    else{
                        itemSeleccionado.usar_item(mascota);
                        inventario.eliminarItem(itemSeleccionado);
                    }
                }
                catch(Exception e){
                    System.out.println("\nNumero no valido, Saltando turno...");
                }
            }
            else{
                System.out.println("\nAccion no valida, Saltando turno...");
            }
            
            if (flag == 0){
                return;
            }
            mascota.addEdad(0.5f);
            Time = Time + 0.5f;
            mascota.addEdad(0.5f);
            Time = Time + 0.5f;
            mascota.actualizarParametros();
            mascota.addSalud(-5);
            mascota.addFelicidad(-5);
            mascota.addEnergía(-5);
            

                          
            
        } while(mascota.Edad <= 15 || mascota.Salud > 0 || mascota.Energia > 0);

        scan.close(); //cerrar instancia scan despues de utilizar
        return;
    }

    public void printEstado(float step, PrintStream out){
        /* Completar método que muestra el estado de la Mascota y del inventario
        dependiendo de la etapa */

    }

    private Mascota mascota;
    private Inventario inventario; // Descomentar cuando se haya creado el inventario
}
