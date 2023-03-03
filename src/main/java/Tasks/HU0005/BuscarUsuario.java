package Tasks.HU0005;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static Userinterfaces.HU0005.BotonesUsuario.INPUT_BUSCAR;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class BuscarUsuario implements Task {

    public String PalabaraBuscar;

    public BuscarUsuario (String PalabraBuscar){
        this.PalabaraBuscar = PalabraBuscar;
    }

    @Override

    public <T extends Actor> void performAs (T actor) {
        actor.attemptsTo(
                Click.on(INPUT_BUSCAR),
                Enter.theValue(PalabaraBuscar).into(INPUT_BUSCAR));
    }

    public static BuscarUsuario Condato (String Palabrabuscar){
        return instrumented (BuscarUsuario.class, Palabrabuscar);
    }
}
