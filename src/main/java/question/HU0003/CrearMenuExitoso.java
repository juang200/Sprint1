package question.HU0003;

import Tasks.HU0003.Crearmenu;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static Userinterfaces.HU0003.BotonesMenu.MENSAJE_EXITOSO;

public class CrearMenuExitoso implements Question {

    private final String MenuExitoso;

    public CrearMenuExitoso (String MenuExitoso){
        this.MenuExitoso = MenuExitoso;
    }

    @Override
    public Object answeredBy (Actor actor){
        if (Text.of(MENSAJE_EXITOSO).viewedBy(actor).asString().equals(MenuExitoso.toString()))
            return true;
        else
            return false;
    }


    public static CrearMenuExitoso ValidMenu (String MenuExitoso){
        return new CrearMenuExitoso(MenuExitoso);
    }
}
