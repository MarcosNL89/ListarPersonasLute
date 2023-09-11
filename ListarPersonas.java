import java.util.*;

public class ListarPersonas {
    public static void main(String[] args) {

        //Creo diferentes listas a utilizar.
        List<String> listadoNombres = new ArrayList<>(5);
        List<String> listadoApellidos = new ArrayList<>(5);
        List<Personas> listadoPersonas = new ArrayList<>(5);
        //Setteo nobmres
        listadoNombres.add("Marcos ");
        listadoNombres.add("Santiago ");
        listadoNombres.add("Agustin ");
        listadoNombres.add("Alejandro ");
        listadoNombres.add("Sofia ");
        //Setteo nobmres
        listadoApellidos.add("Lute ");
        listadoApellidos.add("Blanc ");
        listadoApellidos.add("Cabrera ");
        listadoApellidos.add("Schulten ");
        listadoApellidos.add("Di Marco ");
        // Instancio los objetos persona con sus atributos nombre y apellidos de manera Random.
        Personas persona1 = new Personas();
        Personas persona2 = new Personas();
        Personas persona3 = new Personas();
        Personas persona4 = new Personas();
        Personas persona5 = new Personas();

        Random random = new Random();
        persona1.setNombre(listadoNombres.get(random.nextInt(5)));
        persona1.setApellido(listadoApellidos.get(random.nextInt(5)));
        persona2.setNombre(listadoNombres.get(random.nextInt(5)));
        persona2.setApellido(listadoApellidos.get(random.nextInt(5)));
        persona3.setNombre(listadoNombres.get(random.nextInt(5)));
        persona3.setApellido(listadoApellidos.get(random.nextInt(5)));
        persona4.setNombre(listadoNombres.get(random.nextInt(5)));
        persona4.setApellido(listadoApellidos.get(random.nextInt(5)));
        persona5.setNombre(listadoNombres.get(random.nextInt(5)));
        persona5.setApellido(listadoApellidos.get(random.nextInt(5)));
        //agrego cada persona al listado de personas.
        listadoPersonas.add(persona1);
        listadoPersonas.add(persona2);
        listadoPersonas.add(persona3);
        listadoPersonas.add(persona4);
        listadoPersonas.add(persona5);
        // Recorre la lista y los ordena por nombre, comparando persona1 y persona2(y asi por cada elemento en la lista) por getNombre
        listadoPersonas.sort(Comparator.comparing(Personas::getNombre));
        System.out.println("Lista ordenada por nombres: ");
        listadoPersonas.forEach(personas -> System.out.println(personas.getNombre() + "" + personas.getApellido()));
        // Recorre la lista y los ordena por apellido, comparando persona1 y persona2(y asi por cada elemento en la lista) por getApellido
        listadoPersonas.sort(Comparator.comparing(Personas::getApellido));
        System.out.println("Lista ordenada por apellidos: ");
        listadoPersonas.forEach(personas -> System.out.println(personas.getApellido() + "" + personas.getNombre()));
        // Recorre la lista y los ordena por apellido de manera inversa( por eso el reverse), comparando persona1 y persona2(y asi por cada elemento en la lista) por getApellido
        Collections.reverse(listadoPersonas);
        System.out.println("Lista ordenada por apellido de manera inversa: ");
        listadoPersonas.forEach(personas -> System.out.println(personas.getApellido() + ""+ personas.getNombre()));

    }
}
