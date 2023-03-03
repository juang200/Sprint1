package Tasks.HU0004;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static Userinterfaces.HU0003.BotonesMenu.ICONO_CONFIGURACION;
import static Userinterfaces.HU0004.BotonesRol.GESTION_ROLES;

public class IngresarPaginaRol implements Task {

    public IngresarPaginaRol(){

    }

    @Override
    public <T extends Actor> void performAs (T actor){
        actor.attemptsTo(
                Click.on(ICONO_CONFIGURACION),
                Click.on(GESTION_ROLES)
        );
    }



}
