package question.HU0004;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static Userinterfaces.HU0004.BotonesRol.VERIFICACION_ROL_PRINCIPAL;

public class VerificacionPaginaRol implements Question {

    private final String PrincipalRol;

    public VerificacionPaginaRol(String PrincipalRol){
        this.PrincipalRol = PrincipalRol;
    }

    @Override
    public Object answeredBy(Actor actor){
        if (Text.of(VERIFICACION_ROL_PRINCIPAL).viewedBy(actor).asString().equals(PrincipalRol.toString()))
            return true;
        else
            return false;
    }

    public static VerificacionPaginaRol RolValidtext (String PrincipalRol){
        return new VerificacionPaginaRol(PrincipalRol);
    }
}
