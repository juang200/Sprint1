package Tasks.HU0004;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.Scroll;
import org.openqa.selenium.Keys;


import static Userinterfaces.HU0004.BotonesRol.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CrearRol implements Task {

    private String nombre;

    private String descripcion;


    public CrearRol (String nombre, String descripcion ){
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    @Override
    public <T extends Actor> void performAs (T actor) {
        actor.attemptsTo(

                //Hit.the(Keys.ARROW_DOWN).into(BARRA_BAJAR),
               // Hit.the(Keys.ARROW_DOWN).into(BARRA_BAJAR),
                Scroll.to(BUTTON_GUARDAR),

                //Steps para crear un Rol
                Click.on(INPUT_NOMBRE),
                Enter.theValue(nombre).into(INPUT_NOMBRE), //Ingresar Nombres
                Click.on(INPUT_DESCRIPCION),
                Enter.theValue(descripcion).into(INPUT_DESCRIPCION), //Ingresar descripcion
                Click.on(SELECT_ESTADO),
                Click.on(ESTADO_SELECCIONADO), //Seleccionar un estado
                Click.on(SELECT_MENU),
                Click.on(MENU_SELECCIONADO), //Seleccionar un menu
                Click.on(SELECT_MODULO),
                Click.on(MODULO_SELECCIONADO)); //Seleccionar modulo
                try {
                    Thread.sleep(4000);
        } catch (InterruptedException e) {
                    throw new RuntimeException(e);
        };
        actor.attemptsTo(
                Click.on(BUTTON_GUARDAR));

    }

    public static Performable conlosDatos(String nombre, String descripcion) {
        return instrumented (CrearRol.class, nombre, descripcion);
    }

}
