package Actividades;

public class Persona {
    private String nombre;

    public Persona(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void saludar(){
        System.out.println("Hola, mi nombre es " + nombre);
    }

    public void caminar(){
        System.out.println(nombre + " esta caminando");
    }
}
