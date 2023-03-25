package appinvoice;


public class AppInvoice {

 
    public static void main(String[] args) {
        
        Client client=new Client(1,"Camilo","Rodriguez","cra 34 No 56-11","353939333");
        
        System.out.println("Nombre: "+client.getName()
                          +" \nApellidos: "+client.getLastName()
                          +" \nDireccion: "+client.getAddress()
                          +" \nCelular: "+client.getNumberCell());
        
        Client client1=new Client(1,"Juan","Perez","cra 34 No 56-11","353939333");
        
        System.out.println("Nombre: "+client1.getName()
                          +" \nApellidos: "+client1.getLastName()
                          +" \nDireccion: "+client1.getAddress()
                          +" \nCelular: "+client1.getNumberCell());
        
        
    }
    
}
