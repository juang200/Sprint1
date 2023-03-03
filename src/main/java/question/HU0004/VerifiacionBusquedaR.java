package question.HU0004;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static Userinterfaces.HU0004.BotonesRol.VERIFICACION_BUSQUEDA;

public class VerifiacionBusquedaR implements Question {

    private final String VerBusqueda;

    public VerifiacionBusquedaR (String VerBusqueda){
        this.VerBusqueda = VerBusqueda;
    }


    @Override
    public Object answeredBy (Actor actor){
        if (Text.of(VERIFICACION_BUSQUEDA).viewedBy(actor).asString().equals(VerBusqueda.toString()))
            return true;
        else
            return false;
    }


    public static VerifiacionBusquedaR BusquedaValidtext (String VerBusqueda){
        return new VerifiacionBusquedaR (VerBusqueda);
    }
}
