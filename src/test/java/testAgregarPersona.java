import org.example.modelo.EjecuionOpciones;
import org.example.modelo.Persona;
import org.junit.Test;
import java.util.*;

public class testAgregarPersona {
    public final EjecuionOpciones opcion = new EjecuionOpciones();
    public final List<Persona> persona = new ArrayList<>();

    @Test
    public void agregarPersona(){
        var consola = new Scanner(System.in);
        opcion.agregarPersona(consola,persona);
        opcion.listarPersona(persona);
    }
}
