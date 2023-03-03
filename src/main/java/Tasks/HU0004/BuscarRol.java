package Tasks.HU0004;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static Userinterfaces.HU0004.BotonesRol.INPUT_BUSCAR;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class BuscarRol implements Task {

    public String PalabraBuscar;

    public BuscarRol(String PalabraBuscar) {
        this.PalabraBuscar = PalabraBuscar;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(INPUT_BUSCAR),
                Enter.theValue(PalabraBuscar).into(INPUT_BUSCAR)
                );
    }
    public static BuscarRol ConDato (String PalabraBuscar){
        return instrumented (BuscarRol.class, PalabraBuscar);
    }
}

