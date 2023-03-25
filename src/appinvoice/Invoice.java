
package appinvoice;

import java.util.Date;


public class Invoice {
    
    private int id;
    private Date date;
    private String descripcion;
    private Item[] items;

    public Invoice() {
    }

    public Invoice(int id, Date date, String descripcion) {
        this.id = id;
        this.date = date;
        this.descripcion = descripcion;
        this.items=new Item[10];
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
    
    
    
}
