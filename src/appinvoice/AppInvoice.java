package appinvoice;

import java.util.Scanner;


public class AppInvoice {
    
    public static Product[] productos=new Product[5];
    public static Scanner leer=new Scanner(System.in);
    
    public static void main(String[] args) {
        startData();
        int opcion=0;
        do{
         opcion=menu();         
           switch(opcion){
               case 1:
                 System.out.println("Opcion 1. Crear factura");
                 System.out.println("Crear cliente");
                 Client c=crearCliente();
                 showCliente(c);
               break;
               case 2:
                 showProducts();
               break;
           }        
        
        }while(opcion>0 && opcion<3);
    }
    
    public static int menu(){       
        System.out.println("____MENU____");
        System.out.println("___1.Crear Factura");
        System.out.println("___2.Mostrar Producto" );
        System.out.println("___3.Salir");
        return leer.nextInt(); 
    }
    
    
    public static void startData(){
       loadProducts();
    }
    
    public static Client crearCliente(){    
        int id=0;        
        String nombre;
        String apellido;
        String direccion;
        String numeroCelular;
        System.out.println("Ingrese el id del cliente");
        id=leer.nextInt();
        leer.nextLine();
        System.out.println("Ingrese el nombre: ");
        nombre=leer.nextLine();       
        System.out.println("Ingrese el apellido");
        apellido=leer.nextLine();        
        System.out.println("Ingrese la dirección: ");
        direccion=leer.nextLine();        
        System.out.println("Ingrese el número de celular: ");
        numeroCelular=leer.nextLine();        
        Client cliente=new Client(id,nombre,apellido,direccion,numeroCelular);
        return cliente; 
    }
    
    public static void showCliente(Client cliente){
      
        System.out.println("Datos del Cliente: ");
        System.out.println("Id: "+cliente.getIdClient());
        System.out.println("Nombre: "+cliente.getName());
        System.out.println("Apellido: "+cliente.getLastName());
        System.out.println("Dirección: "+cliente.getAddress());
        System.out.println("Número celular: "+cliente.getNumberCell());
    
    }
    
    public static void loadProducts(){        
       productos[0]=new Product(1,"Televisor 20","Televisor lG20","001",600000,1200000);
       productos[1]=new Product(2,"Iphone 13","Iphone 13xxx","002",600000,3000000);
       productos[2]=new Product(3,"Televisor 60","Televisor lG60","003",1300000,3200000);
       productos[3]=new Product(4,"Xbox","Xbox","004",1200000,3600000);
       productos[4]=new Product(5,"Xiomi 20pro","Xiomi 20pro","004",900000,1500000);      
    }
    
    public static void showProducts(){
       System.out.println("\nLISTA DE PRODUCTOS\n");
       for(int i=0;i<productos.length;i++){
           System.out.println("id:"+productos[i].getId()+" "+"nombre: "+productos[i].getNombre()+" "+productos[i].getPrecioVenta());
       }
       System.out.println("");
    }
     
    
}
