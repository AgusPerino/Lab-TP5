package lab.tp5;

public class Main {

    public static void main(String[] args) {
        Directorio directorio = new Directorio();

        // Crear contactos
        Contacto contacto1 = new Contacto("12345678", "Juan", "Pérez", "Calle Falsa 123", "Ciudad A");
        Contacto contacto2 = new Contacto("87654321", "Ana", "Gómez", "Avenida Siempre Viva", "Ciudad B");
        Contacto contacto3 = new Contacto("11223344", "Luis", "López", "Boulevard Central", "Ciudad A");
        
        // Agregar contactos al directorio
        directorio.agregarContacto(111111111L, contacto1);
        directorio.agregarContacto(222222222L, contacto2);
        directorio.agregarContacto(333333333L, contacto3);

        // Probar los métodos
        System.out.println("Buscar contacto por teléfono (111111111): ");
        System.out.println(directorio.buscarContacto(111111111L));

        System.out.println("\nBuscar teléfonos por apellido 'Gómez': ");
        System.out.println(directorio.buscarTelefono("Gómez"));

        System.out.println("\nBuscar contactos por ciudad 'Ciudad A': ");
        System.out.println(directorio.buscarContactos("Ciudad A"));

        System.out.println("\nBorrar contacto con teléfono 111111111");
        directorio.borrarContacto(111111111L);

        System.out.println("\nContactos restantes en el directorio:");
        directorio.mostrarContactos();
    }
}
