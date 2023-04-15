
package appinvoice;

import java.util.Date;


public class Invoice {
    
    private int id;
    private Date date;
    private String descripcion;
    private Item[] items;
    private Client cliente;

    public Invoice() {
    }

    public Invoice(int id, Date date, String descripcion, Client cliente) {
        this.id = id;
        this.date = date;
        this.descripcion = descripcion;
        this.items=new Item[10];
        this.cliente=cliente;
    }

    public Item[] getItems() {
        return items;
    }

    public void setItems(Item[] items) {
        this.items = items;
    }

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Client getCliente() {
        return cliente;
    }

    public void setCliente(Client cliente) {
        this.cliente = cliente;
    }
    
    
    
}
