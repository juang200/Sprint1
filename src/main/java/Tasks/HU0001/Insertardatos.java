package Tasks.HU0001;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static Userinterfaces.HU0001.BotonesLogin.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Insertardatos implements Task {

    private String usuario;
    private String contrasena;

    public Insertardatos(String usuario, String contrasena){
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
       try {
            actor.attemptsTo(
                    Click.on(BUTTON_USUARIO), // seleccionar campo para usuario
                    Enter.theValue(usuario).into(BUTTON_USUARIO), // ingresar usuario
                    Click.on(BUTTON_CONTRASENA), // Seleccionar campo paracontraseña
                    Enter.theValue(contrasena).into(BUTTON_CONTRASENA), // ingresar contraseña
                    Click.on(BUTTON_INGRESAR)//boton para ingresar
            );
           Thread.sleep(10000);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
        }


    public static Insertardatos conDatos(String usuario, String contrasena) {
        return instrumented (Insertardatos.class, usuario, contrasena);
    }
}
