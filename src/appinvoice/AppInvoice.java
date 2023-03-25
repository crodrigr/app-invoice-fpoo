package appinvoice;


public class AppInvoice {

 
    public static void main(String[] args) {
        
        Client client=new Client(1,"Camilo","Rodriguez","cra 34 No 56-11","353939333");
        
        System.out.println("Nombre: "+client.getName()
                          +" \nApellidos: "+client.getLastName()
                          +" \nDireccion: "+client.getAddress()
                          +" \nCelular: "+client.getNumberCell());
        
        
    }
    
}
