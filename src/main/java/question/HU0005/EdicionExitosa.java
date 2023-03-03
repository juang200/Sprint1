package question.HU0005;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static Userinterfaces.HU0005.BotonesUsuario.EDICION_EXITOSA;

public class EdicionExitosa implements Question {

    private final String Exitoso;

    public EdicionExitosa (String Exitoso){
        this.Exitoso = Exitoso;
    }

    @Override
    public Object answeredBy (Actor actor){
        if (Text.of(EDICION_EXITOSA).viewedBy(actor).asString().equals(Exitoso.toString()))
            return true;
        else
            return false;
    }

    public static EdicionExitosa ValidEdicion (String Exitoso){
        return new EdicionExitosa(Exitoso);
    }
}
