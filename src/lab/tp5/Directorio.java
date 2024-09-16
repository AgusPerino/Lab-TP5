package lab.tp5;
import java.util.*;
public class Directorio {
    private TreeMap<Long, Contacto> directorio;

    public Directorio() {
        directorio = new TreeMap<>();
    }

    // A. agregarContacto
    public void agregarContacto(Long telefono, Contacto contacto) {
        directorio.put(telefono, contacto);
    }

    // B. buscarContacto
    public Contacto buscarContacto(Long telefono) {
        return directorio.get(telefono);
    }

    // C. buscarTelefono
    public Set<Long> buscarTelefono(String apellido) {
        Set<Long> telefonos = new TreeSet<>();
        for (Map.Entry<Long, Contacto> entry : directorio.entrySet()) {
            if (entry.getValue().getApellido().equalsIgnoreCase(apellido)) {
                telefonos.add(entry.getKey());
            }
        }
        return telefonos;
    }

    // D. buscarContactos
    public ArrayList<Contacto> buscarContactos(String ciudad) {
        ArrayList<Contacto> contactos = new ArrayList<>();
        for (Contacto contacto : directorio.values()) {
            if (contacto.getCiudad().equalsIgnoreCase(ciudad)) {
                contactos.add(contacto);
            }
        }
        return contactos;
    }

    // E. borrarContacto
    public void borrarContacto(Long telefono) {
        directorio.remove(telefono);
    }

    // Mostrar todos los contactos (solo para prueba)
    public void mostrarContactos() {
        for (Map.Entry<Long, Contacto> entry : directorio.entrySet()) {
            System.out.println("Teléfono: " + entry.getKey() + " - " + entry.getValue());
        }
    }
}
