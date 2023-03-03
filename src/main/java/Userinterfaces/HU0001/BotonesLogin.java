package Userinterfaces.HU0001;


import net.serenitybdd.screenplay.targets.Target;

public class BotonesLogin {

    public static final Target BUTTON_USUARIO = Target.the("Campos para ingresar usuario").locatedBy("//input[contains(@id,'mui-1')]");

    public static final Target BUTTON_CONTRASENA = Target.the("Campos para ingresar contraseña").locatedBy("//input[contains(@id,'mui-2')]");

    public static final Target BUTTON_INGRESAR = Target.the("Campos para ingresar contraseña").locatedBy("//p[contains(.,'Ingresar')]");

    public static final Target BUTTON_OLVIDO_CONTRASENA = Target.the("Boton olvido contraseña").locatedBy("//span[@class='nav-link text-link'][contains(.,'¿Has olvidado la contraseña?')]");

    public static final Target TEXT_VALID = Target.the("Se verifica la pagina principal").locatedBy("//p[contains(.,'Hola nekoAdmin')]");

    public static final Target WARNING_TEXT = Target.the("Se verifica mensaje de advertencia").locatedBy("//span[@data-notify='message'][contains(.,'Por favor validar la información. Nombre de usuario o contraseña incorrectos')]");


    public static final Target TEXT_CONTRASENA = Target.the("Mensaje de notificacion de olvido de contraseña").locatedBy("//span[@data-notify='message'][contains(.,'Por favor comunicarse con el Super Administrador para suministrar una nueva contraseña')]");
}

