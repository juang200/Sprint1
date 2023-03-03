package question.HU0004;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static Userinterfaces.HU0004.BotonesRol.EXITOSO;
import static Userinterfaces.HU0004.BotonesRol.VERIFICACION_STATUS_A;

public class RolActivo implements Question {

    private final String Status1;

    public RolActivo (String Status){
        this.Status1 = Status;
    }

    @Override
    public Object answeredBy (Actor actor){
        if (Text.of(EXITOSO).viewedBy(actor).asString().equals(Status1.toString()))
            return true;
        else
            return false;
    }

    public static RolActivo ValisStatus (String Status1){
        return new RolActivo(Status1);
    }


}
