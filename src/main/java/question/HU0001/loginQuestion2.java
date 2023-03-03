package question.HU0001;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static Userinterfaces.HU0001.BotonesLogin.WARNING_TEXT;

public class loginQuestion2 implements Question {

    private final String advertencia;
    public loginQuestion2 (String advertencia){
        this.advertencia = advertencia;
    }


    @Override
    public  Object answeredBy(Actor actor){
        if (Text.of(WARNING_TEXT).viewedBy(actor).asString().equals(advertencia.toString()))
            return true;
        else
            return false;
    }

    public static loginQuestion2 loginadvertencia (String advertencia){
        return new loginQuestion2(advertencia);
    }

}
