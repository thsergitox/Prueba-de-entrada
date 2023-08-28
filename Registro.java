class  Persona{

    private int edad;
    private String nombre;
    private String genero;

    public void setearNombre(String nombre){
       this.nombre = nombre; 
    }

    public void setearEdad(int edad){
        this.edad = edad;
    }

    public String obtenerNombre(){
        return this.nombre;
    }

    public int obtenerEdad(){
        return this.edad;
    }

    public double calcularEdadPromedio(Persona p1, Persona p2, Persona p3){
        return (p1.obtenerEdad() + p3.obtenerEdad() + p2.obtenerEdad())/3.0;
    }

}

class Registro{

    public static void main(String[] args) {
        
        System.out.println("CALCULADORA DE EDAD DE LAS SIGUIENTES 3 PERSONAS\n");
        
        Persona p1 = new Persona();
        Persona p2 = new Persona();
        Persona p3 = new Persona();

        p1.setearNombre("Joselin Ramirez");
        p2.setearNombre("Roberto Jara");
        p3.setearNombre("Manuel Jorge");
        
        p1.setearEdad(24);
        p2.setearEdad(56);
        p3.setearEdad(38);
         

        System.out.println("Persona 1:\n Nombre: " +  p1.obtenerNombre() + "\n Edad: " + p1.obtenerEdad());
        System.out.println("Persona 2:\n Nombre: " +  p2.obtenerNombre() + "\n Edad: " + p2.obtenerEdad());
        System.out.println("Persona 3:\n Nombre: " +  p3.obtenerNombre() + "\n Edad: " + p3.obtenerEdad());
        
        System.out.println("\nEl promedio de sus edades es: " + p1.calcularEdadPromedio(p1, p2, p3));
    
    }
   
}