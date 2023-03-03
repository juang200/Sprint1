package Tasks.HU0003;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static Userinterfaces.HU0003.BotonesMenu.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EditarMenu implements Task {

    public String NuevaD;

    public EditarMenu (String NuevaD){
        this.NuevaD = NuevaD;
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Scroll.to(ICONO_EDITAR),
                Click.on(ICONO_EDITAR),
                Scroll.to(INPUT_DESCRIPCCION),
                Click.on(INPUT_DESCRIPCCION),
                Enter.theValue(NuevaD).into(INPUT_DESCRIPCCION),
                Scroll.to(BUTTON_SIGUIENTE),
                Click.on(BUTTON_SIGUIENTE),
                Click.on(BOTON_SIGUIENTE_2),
                Click.on(BUTTON_EDITAR),
                Click.on(BUTTON_SI_EDITAR));
    }

    public static EditarMenu ConNuevaD (String NuevaD){
        return instrumented  (EditarMenu.class, NuevaD);
    }
}
