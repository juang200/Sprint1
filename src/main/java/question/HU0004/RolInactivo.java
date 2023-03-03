package question.HU0004;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static Userinterfaces.HU0004.BotonesRol.EXITOSO;
import static Userinterfaces.HU0004.BotonesRol.VERIFICACION_STATUS_D;

public class RolInactivo implements Question {

    private final String Exitoso;

    public RolInactivo (String Exitoso){
        this.Exitoso = Exitoso;
    }

    @Override
    public Object answeredBy (Actor actor){
        if (Text.of(EXITOSO).viewedBy(actor).asString().equals(Exitoso.toString()))
            return true;
        else
            return false;
    }

    public static RolInactivo ValisStatus (String Exitoso){
        return new RolInactivo(Exitoso);
    }

}
