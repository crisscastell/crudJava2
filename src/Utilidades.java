import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Utilidades {
    private ArrayList<Contacto> contactos = new ArrayList<>();
    private final Scanner scanner = new Scanner(System.in);

    public void cargarContactos() {
        try (FileInputStream archivo = new FileInputStream("listaContactos.bin");
             ObjectInputStream entrada = new ObjectInputStream(archivo)) {
            contactos = (ArrayList<Contacto>)entrada.readObject();
            System.out.println("Productos cargados exitosamente.");
        } catch (FileNotFoundException e) {
            System.out.println("se empezara un nuevo reporte");
            contactos = new ArrayList<>();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error al cargar los productos: " + e.getMessage());
            contactos = new ArrayList<>();
        }
    }

    public void guardarContactos() {
        try (FileOutputStream archivo = new FileOutputStream("listaContactos.bin")){
            ObjectOutputStream salida = new ObjectOutputStream(archivo);
            salida.writeObject(contactos);
        } catch (IOException e) {
            System.err.println("Error al guardar producto: " + e.getMessage());
        }
    }
}
