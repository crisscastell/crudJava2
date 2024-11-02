public class Contacto extends Persona {

    int telefono;

    public Contacto(String nombre, String apellido, int telefono) {
        super(nombre, apellido);
        this.telefono = telefono;
    }

    public String toString() {
        return "Nombre: " + nombre + "\nApellido: " + apellido + "\nTelefono: " + telefono;
    }
}