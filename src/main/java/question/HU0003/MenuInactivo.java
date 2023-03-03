package question.HU0003;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static Userinterfaces.HU0003.BotonesMenu.*;

public class MenuInactivo implements Question {

    private final String Inactivo;

    public MenuInactivo (String Inactivo){
        this.Inactivo = Inactivo;
    }


    @Override
    public Object answeredBy (Actor actor){
        if (Text.of(MENU_DESACTIVADO).viewedBy(actor).asString().equals(Inactivo.toString()))
            return true;
        else
            return false;
    }

    public static MenuInactivo ValidEstado (String Inactivo){
        return new MenuInactivo(Inactivo);
    }
}
