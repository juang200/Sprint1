package question.HU0005;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static Userinterfaces.HU0005.BotonesUsuario.DETALLES;

public class VerDetalles implements Question {

    private final String Detalles;

    public VerDetalles (String Detalles){
        this.Detalles = Detalles;
    }

    @Override
    public Object answeredBy (Actor actor){
        if (Text.of(DETALLES).viewedBy(actor).asString().equals(Detalles.toString()))
            return true;
        else
            return false;
    }

    public static VerDetalles ValidDetalles (String Detalles){
        return new VerDetalles(Detalles);
    }
}
