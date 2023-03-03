package question.HU0001;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static Userinterfaces.HU0001.BotonesLogin.TEXT_VALID;
public class loginQuestion implements Question{
    private final String Validtext;

     public loginQuestion (String Validtext) {
         this.Validtext = Validtext;
    }

    @Override
    public Object answeredBy(Actor actor) {
         if (Text.of(TEXT_VALID).viewedBy(actor).asString().equals(Validtext.toString()))
             return true;
         else
             return false;
    }
    public static loginQuestion loginvalidtext (String Validtext){
         return new loginQuestion(Validtext);
    }

    }
