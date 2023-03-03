package Tasks.HU0003;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static Userinterfaces.HU0003.BotonesMenu.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Crearmenu implements Task {

    private String nombre;
    private String orden;


    public Crearmenu (String nombre, String orden){
        this.nombre = nombre;
        this.orden = orden;

    }

    @Override
    public <T extends Actor> void performAs (T actor) {
            actor.attemptsTo(
                    Click.on(INPUT_NOMBRE),
                    Enter.theValue(nombre).into(INPUT_NOMBRE),
                    Click.on(SELECT_URL),
                    Click.on(SELECCIONAR_UNA_URL));// seleccionar una URL
                    try {
                    Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        };
               actor.attemptsTo(
                Click.on(INPUT_ORDEN),
                Enter.theValue(orden).into(INPUT_ORDEN),// Ingresar un valor para orden
                Click.on(SELECT_ESTADO),
                Click.on(SELECCIONAR_UN_ESTADO),// seleccionar un estado
                Click.on(BOTON_SIGUIENTE_1), //Boton siguiente 1
                Click.on(BOTON_SIGUIENTE_2), //Boton siguiente 2
                Click.on(BOTON_GUARDAR),  // Seleccionar boton "Guardar"
                Click.on(CONFIRMAR_GUARDAR)// Confirmar guardar menu
        );
    };
    public static Crearmenu conlosDatos (String nombre, String url) {
        return instrumented (Crearmenu.class, nombre, url);
    }


}
