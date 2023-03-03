package question.HU0004;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static Userinterfaces.HU0004.BotonesRol.MENSAJE_EXITOSO_R;

public class CrearRolExitoso implements Question {

    private final String RolExitoso;

    public CrearRolExitoso (String RolExitoso){
        this.RolExitoso = RolExitoso;
    }

    @Override
    public Object answeredBy (Actor actor){
        if (Text.of(MENSAJE_EXITOSO_R).viewedBy(actor).asString().equals(RolExitoso.toString()))
            return true;
        else
            return false;
    }

    public static CrearRolExitoso RolExitoso (String RolExitoso){
        return new CrearRolExitoso(RolExitoso);
    }


}
