package Tasks.HU0004;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.Scroll;
import org.openqa.selenium.Keys;

import static Userinterfaces.HU0004.BotonesRol.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EditarRol implements Task {

     public String NuevaD;

     public EditarRol (String NuevoD){
         this.NuevaD = NuevoD;
     }


     @Override
    public <T extends Actor> void performAs(T actor) {
         actor.attemptsTo(
                 Click.on(ICONO_EDITAR),
                 Click.on(INPUT_DESCRIPCION),
                 Enter.theValue(NuevaD).into(INPUT_DESCRIPCION),
                 Scroll.to(BUTTON_EDITAR),
                 //Hit.the(Keys.ARROW_DOWN).into(BARRA_BAJAR),
                 //Hit.the(Keys.ARROW_DOWN).into(BARRA_BAJAR),
                 Click.on(BUTTON_EDITAR),
                 Click.on(BUTTON_SI_EDITAR));
     }

     public static EditarRol ConDatosNuevos (String NuevaD){
         return instrumented (EditarRol.class, NuevaD);
     }

}
