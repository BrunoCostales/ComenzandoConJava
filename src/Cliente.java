public class Cliente {
    private final String id;
    private String nombre;
    private Integer descuento;


    public Cliente(String id, String nombre, Integer descuento) {
        this.descuento=descuento;
        this.nombre=nombre;
        this.id=id;


    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDescuento() {
        return descuento;
    }

    public void setDescuento(Integer descuento) {
        this.descuento = descuento;
    }
}
