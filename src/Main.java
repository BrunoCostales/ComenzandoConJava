public class Main {
    public static void main(String[] args) {
//        Rectangulo forma= new Rectangulo (10,10);
//        Empleado employe= new Empleado("201", "Bru","Alo",100);
//        System.out.println("Antiguo:"+employe.getSalario());
//        employe.aumentoSalario(20);
//        employe.MostrarEmpleado();
//        Ventas sell= new Ventas(21,"Anana",23,32);
//        sell.mostrarVentas();
        Autor actor= new Autor("Joshua", "Blosch","correo@correo.com","M");
        Libro book= new Libro("Effective Java",320,23,actor);
        book.setTitulo("Bruno");
        actor.setNombre("NINI");
        System.out.println(book);



    }
}