package Tasks.HU0005;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import java.util.Scanner;

import static Userinterfaces.HU0005.BotonesUsuario.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EditarUsuario implements Task {

    public String NuevoCel;

    public String NuevaContrasena;

    public EditarUsuario (String NuevoCel, String NuevaContrasena) {
        this.NuevoCel = NuevoCel;
        this.NuevaContrasena = NuevaContrasena;
    }

    @Override
    public <T extends Actor> void performAs (T actor){
        actor.attemptsTo(
                Click.on(ICONO_EDITAR),
                Enter.theValue(NuevoCel).into(INPUT_TELEFONO),
                Enter.theValue(NuevaContrasena).into(INPUT_CONTRASENA),
                Enter.theValue(NuevaContrasena).into(INPUT_CONFIRMAR_C),
                Scroll.to(BUTTON_EDITAR),
                Click.on(BUTTON_EDITAR),
                Click.on(CONFIRMAR_EDITAR)
        );
    }

    public static EditarUsuario ConNuevosDatos (String NuevoCel, String NuevaContrasena) {
        return instrumented (EditarUsuario.class, NuevoCel, NuevaContrasena);
    }

}
