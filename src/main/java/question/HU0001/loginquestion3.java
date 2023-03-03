package question.HU0001;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static Userinterfaces.HU0001.BotonesLogin.TEXT_CONTRASENA;

public class loginquestion3 implements Question {

    private final String notificacion;

    public loginquestion3 (String notificacion){
        this.notificacion = notificacion;
    }

    @Override
    public Object answeredBy(Actor actor){
        if (Text.of(TEXT_CONTRASENA).viewedBy(actor).asString().equals(notificacion.toString()))
            return true;
        else
            return false;
    }

    public static loginquestion3 loginnotificacion (String notificacion){
        return new loginquestion3(notificacion);
    }
}

