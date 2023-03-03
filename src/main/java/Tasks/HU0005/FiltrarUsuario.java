package Tasks.HU0005;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static Userinterfaces.HU0005.BotonesUsuario.BUTTON_FILTRAR;
import static Userinterfaces.HU0005.BotonesUsuario.INPUT_NOMBRE_FILTRO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FiltrarUsuario implements Task {

    public String Nombre;

    public FiltrarUsuario(String Nombre){
        this.Nombre = Nombre;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(INPUT_NOMBRE_FILTRO),
                Enter.theValue(Nombre).into(INPUT_NOMBRE_FILTRO),
                Click.on(BUTTON_FILTRAR));
    }

    public static FiltrarUsuario ConDato (String Nombre){
        return instrumented (FiltrarUsuario.class, Nombre);
    }
}
