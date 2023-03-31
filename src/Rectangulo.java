public class Rectangulo {

    //Atributos o propiedades ESTOS SON PRIVADOS
    private float alto = 1;
    private float ancho=1;


    //Constructor
    public Rectangulo(float alto, float ancho){
        this.alto=alto;
        this.ancho=ancho;

    }

    //Metodos
    //Primero los Getters
    public float getAlto(){
        return alto;
    }
    public float getAncho(){
        return ancho;
    }
    //Luego los Setters
    public void setAlto(float alto){
        this.alto=alto;
    }
    public void setAncho(float ancho){
        this.ancho=ancho;
    }
    public float area (){
        float a= ancho*alto;
        return a;

    }
    public float perimetro (){
        float p= (ancho+alto)*2;
        return  p;

    }
}
