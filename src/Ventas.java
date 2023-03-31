public class Ventas {
    private int id;
    private String descripcion;
    private int cantidad;
    private float precioUni;


    public Ventas (int id, String descripcion, int cantidad, float precioUni){
        this.id=id;
        this.descripcion=descripcion;
        this.cantidad=cantidad;
        this.precioUni=precioUni;

    }
    //Metodos


    //getters


    public float getPrecioUni() {
        return precioUni;
    }



    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    //SETTERS


    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecioUni(float precioUni) {
        this.precioUni = precioUni;
    }

    public void setId(int id) {
        this.id = id;
    }



    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    //Propios

    public float totalequal(){
        return cantidad*precioUni;
    }
    public void mostrarVentas (){
        System.out.println("ID:"+ id+" Precio:"+precioUni+" Total:"+ totalequal());
    }
}
