package question.HU0004;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static Userinterfaces.HU0004.BotonesRol.VERIFICACION_FILTROS_LIMPIOS;

public class VerificacionFiltroLimpioR implements Question {

    private final String RolLimpio;

    public VerificacionFiltroLimpioR (String RolLimpio){
        this.RolLimpio = RolLimpio;
    }

    @Override
    public Object answeredBy (Actor actor) {
        if (Text.of(VERIFICACION_FILTROS_LIMPIOS).viewedBy(actor).asString().equals(RolLimpio.toString()))
            return true;
        else
            return false;
    }


    public static VerificacionFiltroLimpioR ValidClean (String RolLimpio){
        return new VerificacionFiltroLimpioR(RolLimpio);
        }
    }
