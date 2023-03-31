public class Empleado {
                ///ATRIBUTOS
        private String dni;
        private String nombre;
        private String apellido;
        private  float salario;


        public Empleado (String dni, String nombre, String apellido, float salario){
            this.apellido=apellido;
            this.dni=dni;
            this.nombre=nombre;
            this.salario=salario;


        }
        //METODOS

        //GETTERS


    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public float getSalario() {
        return salario;
    }


    //SETTERS


    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }



    public float aumentoSalario (int porcent){

            return salario=(salario/100)*porcent +salario ;

    }
    public void MostrarEmpleado(){
        System.out.println("Empleado Nº: " + dni + "Nombre:"+ nombre+" "+ apellido+ "Se le aumento a "+ getSalario());

    }

}
