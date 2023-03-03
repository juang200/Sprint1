package question.HU0004;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static Userinterfaces.HU0004.BotonesRol.VERIFICACION_EXITOSA;


public class EdicionExitosaR implements Question {

    private final String MensajeEdicion;

    public EdicionExitosaR (String MensajeEdicion){
        this.MensajeEdicion = MensajeEdicion;
    }


    @Override
    public Object answeredBy (Actor actor){
        if (Text.of(VERIFICACION_EXITOSA).viewedBy(actor).asString().equals(MensajeEdicion.toString()))
            return true;
        else
            return false;
    }

    public static EdicionExitosaR ValidEdicion (String MensajeExitoso){
        return new EdicionExitosaR(MensajeExitoso);
    }

}
