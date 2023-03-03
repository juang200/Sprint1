package question.HU0005;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static Userinterfaces.HU0005.BotonesUsuario.VER_LIMPIAR;

public class VerificacionFiltrosLimpios implements Question {

    private final String ID2;

    public VerificacionFiltrosLimpios(String ID2){
        this.ID2 = ID2;
    }

    @Override
    public Object answeredBy (Actor actor){
        if (Text.of(VER_LIMPIAR).viewedBy(actor).asString().equals(ID2.toString()))
            return true;
        else
            return false;
    }

    public static VerificacionFiltrosLimpios ValidLimpiar (String ID2){
        return new VerificacionFiltrosLimpios(ID2);
    }
}
