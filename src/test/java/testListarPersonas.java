import org.example.modelo.EjecuionOpciones;
import org.example.modelo.Persona;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class testListarPersonas {
    public final EjecuionOpciones opcion = new EjecuionOpciones();
    public final List<Persona> persona = new ArrayList<>();

    @Test
    public void listaVacio(){
        opcion.listarPersona(persona);
    }

    @Test
    public void listaLlenaLeer(){
        var persona1 = new Persona("Diego","147852369","roman@gmail.com");
        var persona2 = new Persona("Daniel","854799919","solis@gmail.com");
        var persona3 = new Persona("Tiffani","452554159","garcia@gmail.com");

        persona.add(persona1);
        persona.add(persona2);
        persona.add(persona3);

        opcion.listarPersona(persona);
    }
}
