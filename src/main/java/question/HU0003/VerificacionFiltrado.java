package question.HU0003;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static Userinterfaces.HU0003.BotonesMenu.VERIFICACION_FILTRADO;


public class VerificacionFiltrado implements Question {

    private final String Validfiltro;

    public VerificacionFiltrado(String Validfiltro){
        this.Validfiltro = Validfiltro;
    }

    @Override
    public Object answeredBy (Actor actor){
        if (Text.of(VERIFICACION_FILTRADO).viewedBy(actor).asString().equals(Validfiltro.toString()))
            return true;
        else
            return false;
    }

    public static VerificacionFiltrado Validfilter (String Validfiltro){
        return new VerificacionFiltrado(Validfiltro);
    }
}
