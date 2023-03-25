
package appinvoice;

public class Client {
    
    //Atributos
    private int idClient;
    private String name;
    private String lastName;
    private String address;
    private String numberCell;
    
    //Metodos

    public Client() {
    }
    

    public Client(int idClient, String name, String lastName, String address, String numberCell) {
        this.idClient = idClient;
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.numberCell = numberCell;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumberCell() {
        return numberCell;
    }

    public void setNumberCell(String numberCell) {
        this.numberCell = numberCell;
    }
    
    
    
    
}
