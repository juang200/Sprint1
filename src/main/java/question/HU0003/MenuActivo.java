package question.HU0003;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static Userinterfaces.HU0003.BotonesMenu.MENU_ACTIVO;
import static Userinterfaces.HU0003.BotonesMenu.MENU_DESACTIVADO;

public class MenuActivo implements Question {

    private final String Activo;

    public MenuActivo (String Activo){
        this.Activo = Activo;
    }

    @Override
    public Object answeredBy (Actor actor){
        if (Text.of(MENU_ACTIVO).viewedBy(actor).asString().equals(Activo.toString()))
            return true;
        else
            return false;
    }

    public static MenuActivo ValidEstado2 (String Activo){
        return new MenuActivo(Activo);
    }
}
