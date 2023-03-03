package question.HU0003;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static Userinterfaces.HU0003.BotonesMenu.VERIFICACION_EDICION;

public class OperacionExitosa implements Question {

    private final String OperacionE;

    public OperacionExitosa(String EdicionE){
        this.OperacionE = EdicionE;
    }

    @Override
    public Object answeredBy (Actor actor){
        if (Text.of(VERIFICACION_EDICION).viewedBy(actor).asString().equals(OperacionE.toString()))
            return true;
        else
            return false;
    }

    public static OperacionExitosa Exitosa (String OperacionE){
        return new OperacionExitosa(OperacionE);
    }
}
