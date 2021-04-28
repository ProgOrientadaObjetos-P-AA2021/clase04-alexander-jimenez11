package paquete1;

public class Hospital {

    private String nombre;
    private String ciudad;
    private int numeroDoctores;
    private int numeroEnfermeros;

    /*
        Crear un constructor que no tenga parámetros
        y que asigne valores ya establecidos a todos 
        los atributos.
    nombre: Isidro Ayora
    ciudad: Loja
    numeroDoctores: 100
    numeroEnfermeros: 200
    
     */
    public Hospital() {
        nombre = "Isidro Ayora";
        ciudad = "Loja";
        numeroDoctores = 100;
        numeroEnfermeros = 200;

    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerCiudad(String n) {
        ciudad = n;
    }

    public void establecerNumeroDoctores(int n) {
        numeroDoctores = n;
    }

    public void establecerNumeroEnfermeros(int n) {
        numeroEnfermeros = n;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerCiudad() {
        return ciudad;
    }

    public int obtenerNumeroDoctores() {
        return numeroDoctores;
    }

    public int obtenerNumeroEnfermeros() {
        return numeroEnfermeros;
    }

    @Override
    public String toString() {
        String cadena = String.format("Nombre: %s\nCiudad: %s\nNúmero de "
                + "doctores: %d\nNúmero de enfermeros: %d\n", obtenerNombre(),
                obtenerCiudad(), obtenerNumeroDoctores(), obtenerNumeroEnfermeros());
        return cadena;
    }
}
