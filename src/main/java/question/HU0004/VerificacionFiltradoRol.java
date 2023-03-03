package question.HU0004;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static Userinterfaces.HU0004.BotonesRol.VERIFICACION_FILTRADO;

public class VerificacionFiltradoRol implements Question {

    private final String RolFiltrado;

    public VerificacionFiltradoRol(String RolFiltrado){
        this.RolFiltrado = RolFiltrado;

    }

    @Override
    public Object answeredBy (Actor actor){
        if (Text.of(VERIFICACION_FILTRADO).viewedBy(actor).asString().equals(RolFiltrado.toString()))
            return true;
        else
            return false;
    }

    public static VerificacionFiltradoRol Validfilter (String RolFiltrado){
        return new VerificacionFiltradoRol(RolFiltrado);
    }
}
