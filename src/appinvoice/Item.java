
package appinvoice;


public class Item {
    
    private int cantidad;
    private double total;
    private Product producto;

    public Item() {
    }
    
    
    public Item(int cantidad, Product producto) {
        this.cantidad = cantidad;
        this.producto=producto;
    }

    public Product getProducto() {
        return producto;
    }

    public void setProducto(Product producto) {
        this.producto = producto;
    }
    
    

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    
    
}
