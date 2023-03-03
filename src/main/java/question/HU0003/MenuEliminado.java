package question.HU0003;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static Userinterfaces.HU0003.BotonesMenu.VERIFICACION_ELIMINACION;

public class MenuEliminado implements Question {

    private final String EliminacionE;

    public MenuEliminado(String EliminacionE){
        this.EliminacionE = EliminacionE;
    }

    @Override
    public Object answeredBy (Actor actor){
        if (Text.of(VERIFICACION_ELIMINACION).viewedBy(actor).asString().equals(EliminacionE.toString()))
            return true;
        else
            return false;
    }

    public static MenuEliminado ValidEliminacion (String EliminacionE){
        return new MenuEliminado(EliminacionE);
    }
}
