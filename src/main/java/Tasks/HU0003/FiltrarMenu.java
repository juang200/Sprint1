package Tasks.HU0003;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static Userinterfaces.HU0003.BotonesMenu.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FiltrarMenu implements Task {

    private String Namemenu;

    public FiltrarMenu (String Namemenu) {
        this.Namemenu =Namemenu;
    }

    @Override
    public <T extends Actor> void performAs (T actor) {
        actor.attemptsTo(
                Click.on(INPUT_FILTRAR_NOMBRE),
                Enter.theValue(Namemenu).into(INPUT_FILTRAR_NOMBRE));

        actor.attemptsTo(Click.on(BUTTON_FILTRAR));
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public static FiltrarMenu conelnombre(String Namemenu) {
        return instrumented (FiltrarMenu.class, Namemenu);
    }
}
