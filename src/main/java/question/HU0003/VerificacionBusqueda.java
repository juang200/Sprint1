package question.HU0003;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static Userinterfaces.HU0003.BotonesMenu.VERIFICACION_BUSQUEDA;

public class VerificacionBusqueda implements Question {

    private final String ValidBusqueda;

    public VerificacionBusqueda(String ValidBusqueda){
        this.ValidBusqueda = ValidBusqueda;
    }

    @Override
    public Object answeredBy (Actor actor){
        if (Text.of(VERIFICACION_BUSQUEDA).viewedBy(actor).asString().equals(ValidBusqueda.toString()))
            return true;
        else
            return false;
    }

    public static VerificacionBusqueda BusquedaValidtext (String ValidBusqueda){
        return new VerificacionBusqueda(ValidBusqueda);
    }
}
