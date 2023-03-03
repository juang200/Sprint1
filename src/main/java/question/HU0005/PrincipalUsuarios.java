package question.HU0005;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static Userinterfaces.HU0005.BotonesUsuario.VER_USUARIOS_P;

public class PrincipalUsuarios implements Question {

    private final String PagPrincipal;

    public PrincipalUsuarios (String PagPrincipal){
        this.PagPrincipal = PagPrincipal;
    }

    @Override
    public Object answeredBy (Actor actor){
        if (Text.of(VER_USUARIOS_P).viewedBy(actor).asString().equals(PagPrincipal.toString()))
            return true;
        else
            return false;
    }

    public static PrincipalUsuarios ValidPag (String PagPrincipal){
        return new PrincipalUsuarios(PagPrincipal);
    }
}
