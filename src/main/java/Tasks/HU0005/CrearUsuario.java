package Tasks.HU0005;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;


import static Userinterfaces.HU0005.BotonesUsuario.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CrearUsuario implements Task {

    public String Nombre;
    public String NumeroDoc;

    public String Fecha;
    public String Telefono;
    public String Direccion;
    public String NombreUsuario;
    public String Correo;
    public String Contrasena;

    public CrearUsuario (String Nombre, String NumeroDoc, String Telefono, String Direccion, String NombreUsuario, String Correo,
                         String Contrasena, String ConfirmarContra)
    {this.Nombre = Nombre; this.Telefono = Telefono; this.NumeroDoc = NumeroDoc; this.Fecha = Fecha; this.Direccion = Direccion;
        this.NombreUsuario = NombreUsuario; this.Correo = Correo; this.Contrasena = Contrasena;
    }

    @Override
    public <T extends Actor> void performAs (T actor){
        actor.attemptsTo(
                Click.on(INPUT_NOMBRE),
                Enter.theValue(Nombre).into(INPUT_NOMBRE), //Ingresar nombre
                Click.on(SELECT_TC),
                Click.on(TC_SELECCIONADO), //Seleccionar tipo de documento
                Click.on(INPUT_DOCUMENTO),
                Enter.theValue(NumeroDoc).into(INPUT_DOCUMENTO)); //Ingresar numero de documento
                //Click.on(SELECT_FECHA),
                //Click.on(), //Seleccionar fecha
                //Enter.theValue(Fecha).into(SELECT_FECHA),
                try{
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);};
                actor.attemptsTo(
                Click.on(INPUT_TELEFONO),
                Enter.theValue(Telefono).into(INPUT_TELEFONO), // Ingresar numero de telefono
                Click.on(INPUT_DIRECCION),
                Enter.theValue(Direccion).into(INPUT_DIRECCION), // Ingresar direccion
                Click.on(SELECT_PAIS),
                Click.on(PAIS_SELECCIONDO), // Ingresar Pais
                Click.on(SELECT_ESTADO_P),
                Click.on(ESTADO_SELECCIONADO_P), // Ingresat Estado
                Click.on(SELECT_CIUDAD),
                Click.on(CIUDAD_SELECCIONADA), // Ingresar Ciudad
                Click.on(INPUT_NOMBREU),
                Enter.theValue(NombreUsuario).into(INPUT_NOMBREU), // Ingresar nombre de usuario
                Click.on(SELECT_ROL),
                Click.on(ROL_SELECCIONADO), // Seleccionar Rol
                Click.on(INPUT_CORREO),
                Enter.theValue(Correo).into(INPUT_CORREO),//Ingresar Correo
                Click.on(INPUT_CONTRASENA),
                Enter.theValue(Contrasena).into(INPUT_CONTRASENA), // iNGRESAR CONTRASEÑA
                Click.on(INPUT_CONFIRMAR_C),
                Enter.theValue(Contrasena).into(INPUT_CONFIRMAR_C), // ConfirmarContraseña

                //Guardar Usuario
                Scroll.to(BUTTON_GUARDAR),
                Click.on(BUTTON_GUARDAR),
                Click.on(CONFIRMAR_GUARDAR));
    }

    public static CrearUsuario ConDatos (String Nombre, String NumeroDoc, String Fecha , String Telefono,
                                         String Direccion, String NombreUsuario, String Correo,
                                         String Contrasena){
        return instrumented (CrearUsuario.class, Nombre, NumeroDoc, Fecha, Telefono, Direccion, NombreUsuario, Correo, Contrasena);
    }

}
