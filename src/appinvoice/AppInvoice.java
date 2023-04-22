package appinvoice;

import java.util.Date;
import java.util.Scanner;

public class AppInvoice {

    public static Product[] productos = new Product[5];
    public static Scanner leer = new Scanner(System.in);

    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
   

    public static void main(String[] args) {
        startData();
        int opcion = 0;
        do {
            opcion = menu();
            switch (opcion) {
                case 1:
                    System.out.println("Opcion 1. Crear factura");                                       
                    Client cliente=crearCliente();
                    System.out.println("Ingrese el Id de la factura: ");
                    int idFactura=leer.nextInt();
                    System.out.println("Ingrese la descripción de la factura: ");
                    String descripcionFactura=leer.nextLine();
                    Invoice invoice = new Invoice(idFactura, new Date(), descripcionFactura, cliente);
                    addItemsFactura(invoice);
                    imprimirFactura(invoice);                
                    
                    
                    

                    break;
                case 2:
                    showProducts();
                    break;
            }

        } while (opcion > 0 && opcion < 3);
    }
    
    public static void addItemsFactura(Invoice invoice){
    
        int controlItems=0;
        showProducts();
        int rta=0;
        
        do{            
           System.out.println("Ingrese la posición del producto en el arreglo: ");
           int pos=leer.nextInt();
           System.out.println("Ingrese la cantidad: ");
           int cantidad=leer.nextInt();
           Item item = new Item(cantidad, productos[pos]);
           invoice.addItem(item);
           System.out.println("Desea ingresar más items?: 1. si 2. no.");
           rta=leer.nextInt();
           controlItems++;
        }while(rta==1 && controlItems<=9);
        
        
    }
    
    public static int menu() {
        System.out.println("____MENU____");
        System.out.println("___1.Crear Factura");
        System.out.println("___2.Mostrar Producto");
        System.out.println("___3.Salir");
        return leer.nextInt();
    }

    public static void imprimirFactura(Invoice invoice) {

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(ANSI_GREEN_BACKGROUND + "|_________INFORMACION DE FACTDURA______No: " + invoice.getId());
        System.out.println("");
        System.out.println("\n DATOS DE LA FACTURA");
        System.out.println("\033[0;1m" + "Fecha: " + invoice.getDate());
        System.out.println("\033[0;1m" + "Descripción: " + invoice.getDescripcion());
        System.out.println("\n DATOS DEL CLIENTE");
        System.out.println("\033[0;1m" + "Nombre: " + invoice.getCliente().getName() + " " + invoice.getCliente().getLastName());
        System.out.println("\033[0;1m" + "Direccion: " + invoice.getCliente().getAddress());
        System.out.println("\033[0;1m" + "Celular: " + invoice.getCliente().getNumberCell());
        System.out.println();
        for (Item i : invoice.getItems()) {
            if (i != null) {
                System.out.println("\033[0;1m" + i.getProducto().getNombre() + "  " + i.getCantidad() + "  " + i.getProducto().getPrecioVenta() + " " + i.getTotal());
            }
        }
        System.out.println("\033[0;1m" + "Total:                                 $" + Double.toString(invoice.getTotal()));
        System.out.println();
        System.out.println();
    }

    public static void startData() {
        loadProducts();
    }

    public static Client crearCliente() {
        int id = 0;
        String nombre;
        String apellido;
        String direccion;
        String numeroCelular;
        System.out.println("Ingrese el id del cliente");
        id = leer.nextInt();
        leer.nextLine();
        System.out.println("Ingrese el nombre: ");
        nombre = leer.nextLine();
        System.out.println("Ingrese el apellido");
        apellido = leer.nextLine();
        System.out.println("Ingrese la dirección: ");
        direccion = leer.nextLine();
        System.out.println("Ingrese el número de celular: ");
        numeroCelular = leer.nextLine();
        Client cliente = new Client(id, nombre, apellido, direccion, numeroCelular);
        return cliente;
    }

    public static void showCliente(Client cliente) {

        System.out.println("Datos del Cliente: ");
        System.out.println("Id: " + cliente.getIdClient());
        System.out.println("Nombre: " + cliente.getName());
        System.out.println("Apellido: " + cliente.getLastName());
        System.out.println("Dirección: " + cliente.getAddress());
        System.out.println("Número celular: " + cliente.getNumberCell());

    }

    public static void loadProducts() {
        productos[0] = new Product(1, "Televisor 20", "Televisor lG20", "001", 600000, 1200000);
        productos[1] = new Product(2, "Iphone 13", "Iphone 13xxx", "002", 600000, 3000000);
        productos[2] = new Product(3, "Televisor 60", "Televisor lG60", "003", 1300000, 3200000);
        productos[3] = new Product(4, "Xbox", "Xbox", "004", 1200000, 3600000);
        productos[4] = new Product(5, "Xiomi 20pro", "Xiomi 20pro", "004", 900000, 1500000);
    }

    public static void showProducts() {
        System.out.println("\nLISTA DE PRODUCTOS\n");
        for (int i = 0; i < productos.length; i++) {
            System.out.println("pos:"+i+" id:" + productos[i].getId() + " " + "nombre: " + productos[i].getNombre() + " " + productos[i].getPrecioVenta());
        }
        System.out.println("");
    }

}
