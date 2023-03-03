package question.HU0003;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static Userinterfaces.HU0003.BotonesMenu.VERIFICACION_PAGINA_MENU;

public class VerificacionPaginaMenu implements Question {
    private final String Principalmenu;

    public VerificacionPaginaMenu(String Principalmenu){
        this.Principalmenu = Principalmenu;
    }

    @Override
    public Object answeredBy(Actor actor){
        if (Text.of(VERIFICACION_PAGINA_MENU).viewedBy(actor).asString().equals(Principalmenu.toString()))
            return true;
        else
            return false;
    }

    public static VerificacionPaginaMenu Menuvalidtext2 (String Principalmenu){
        return new VerificacionPaginaMenu(Principalmenu);
    }
}
