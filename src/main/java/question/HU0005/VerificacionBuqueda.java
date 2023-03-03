package question.HU0005;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static Userinterfaces.HU0005.BotonesUsuario.VERIFICACION_BUSQUEDA;

public class VerificacionBuqueda implements Question {

    private final String ID;

    public VerificacionBuqueda (String ID){
        this.ID = ID;
    }

    public Object answeredBy (Actor actor){
        if (Text.of(VERIFICACION_BUSQUEDA).viewedBy(actor).asString().equals(ID.toString()))
            return true;
        else
            return false;
    }

    public static VerificacionBuqueda ValidID (String ID){
        return new VerificacionBuqueda(ID);
    }
}
