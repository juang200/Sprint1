package question.HU0005;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static Userinterfaces.HU0005.BotonesUsuario.VER_FILTRADO;

public class VerificacionFiltrado implements Question {

    private final String ID;

    public VerificacionFiltrado(String ID){
        this.ID = ID;
    }

    @Override
    public Object answeredBy (Actor actor){
        if (Text.of(VER_FILTRADO).viewedBy(actor).asString().equals(ID.toString()))
            return true;
        else
            return false;
    }

    public static VerificacionFiltrado Validfilter (String ID){
        return new VerificacionFiltrado(ID);
    }


}
