package Userinterfaces.HU0005;

import net.serenitybdd.screenplay.targets.Target;

import javax.swing.plaf.PanelUI;

public class BotonesUsuario {

    public static final Target GESTION_USUARIOS = Target.the("Seleccionar modulo Gestion de usuarios").locatedBy("(//span[contains(.,'Gestión Usuarios')])[2]");

    public static final Target CREAR_USUARIO = Target.the("Seleccionar Crear Usuario").locatedBy("//i[contains(@class,'fa-solid fa-plus')]");

    public static final Target BARRA_BAJAR = Target.the("Barra para Bajar").locatedBy("");


//Crear usuario

    public static final Target INPUT_NOMBRE = Target.the("").locatedBy("//input[contains(@name,'nameComplete')]");

    public static final Target SELECT_TC = Target.the("").locatedBy("//input[contains(@id,'typeDocument')]");

    public static final Target TC_SELECCIONADO = Target.the("").locatedBy("//span[contains(@id,'typeDocument-option-0')]");

    public static final Target INPUT_DOCUMENTO = Target.the("").locatedBy("//input[contains(@name,'numberDocument')]");

    public static final Target INPUT_TELEFONO = Target.the("").locatedBy("//input[contains(@name,'phone')]");

    public static final Target INPUT_DIRECCION = Target.the("").locatedBy("//input[contains(@name,'address')]");

    public static final Target SELECT_PAIS = Target.the("").locatedBy("//input[contains(@id,'countries')]");

    public static final Target PAIS_SELECCIONDO = Target.the("").locatedBy("//span[contains(@id,'countries-option-0')]");

    public static final Target SELECT_ESTADO_P = Target.the("").locatedBy("//input[contains(@id,'state')]");

    public static final Target ESTADO_SELECCIONADO_P = Target.the("").locatedBy("//span[contains(@id,'state-option-1')]");

    public static final Target SELECT_CIUDAD = Target.the("").locatedBy("//input[contains(@name,'city')]");

    public static final Target CIUDAD_SELECCIONADA = Target.the("").locatedBy("//span[contains(@id,'city-option-0')]");

    public static final Target INPUT_NOMBREU = Target.the("").locatedBy("//input[contains(@name,'username')]");

    public static final Target SELECT_ROL = Target.the("").locatedBy("//input[contains(@id,'roles')]");

    public static final Target ROL_SELECCIONADO = Target.the("").locatedBy("//span[contains(@id,'roles-option-0')]");

    public static final Target INPUT_CORREO = Target.the("").locatedBy("//input[contains(@name,'email')]");

    public static final Target INPUT_CONTRASENA = Target.the("").locatedBy("//input[contains(@name,'password')]");

    public static final Target INPUT_CONFIRMAR_C = Target.the("").locatedBy("//input[contains(@name,'confirmPassword')]");

    public static final Target BUTTON_GUARDAR = Target.the("").locatedBy("//button[@class='MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButtonBase-root footer-btn primary-btn ripple css-sghohy-MuiButtonBase-root-MuiButton-root'][contains(.,'Guardar')]");

    public static final Target CONFIRMAR_GUARDAR = Target.the("").locatedBy("//i[contains(@class,'fa fa-check btn-icon pt-1 fa-md mr-2')]");

    public static final Target MENSAJE_EXITODO_U = Target.the("").locatedBy("");


    //CANCELAR USUARIO

    public static final Target BUTTON_CANCELAR_U = Target.the("").locatedBy("(//button[contains(@tabindex,'0')])[7]");

    public static final Target BUTTON_SI_CANCELAR = Target.the("").locatedBy("//button[contains(@id,'btnConfirm')]");

    public static final Target VER_USUARIOS_P = Target.the("").locatedBy("//p[contains(.,'Configuración / Gestión usuarios')]");

    //FILTRAR USUSARIO

    public static final Target INPUT_NOMBRE_FILTRO = Target.the("").locatedBy("//input[@id='Nombre']");

    public static final Target BUTTON_FILTRAR = Target.the("").locatedBy("//button[contains(.,'FILTRAR')]");

    public static final Target VER_FILTRADO = Target.the("").locatedBy("//td[contains(.,'25')]");

    // Limpiar filtros

    public static final Target BUTTON_LIMPIAR = Target.the("").locatedBy("//label[@class='btn-label pl-1'][contains(.,'LIMPIAR')]");

    public static final Target VER_LIMPIAR = Target.the("").locatedBy("//td[contains(.,'16')]");


    //Borrar datos

    public static final Target BUTTON_BORRADOR = Target.the("").locatedBy("//img[contains(@src,'clear-format.68f4c3dd.svg')]");

    public static final Target CONFIRMAR_BORRADOR = Target.the("").locatedBy("//i[contains(@class,'fa fa-check btn-icon pt-1 fa-md mr-2')]");


    //EDITAR USUARIO

    public static final Target ICONO_EDITAR = Target.the("").locatedBy("(//i[contains(@class,'fa fa-pencil-square-o fa-lg pr-3 iconEdit')])[1]");

    public static final Target BUTTON_EDITAR = Target.the("").locatedBy("//button[contains(.,'Editar')]");

    public static final Target CONFIRMAR_EDITAR = Target.the("").locatedBy("//i[contains(@class,'fa fa-check btn-icon pt-1 fa-md mr-2')]");

    public static final Target EDICION_EXITOSA = Target.the("").locatedBy("(//div[contains(.,'Éxitoso')])[13]");

    //BUSCAR USUARIO

    public static final Target INPUT_BUSCAR = Target.the("").locatedBy("//input[@placeholder='Buscar...']");

    public static final Target VERIFICACION_BUSQUEDA = Target.the("").locatedBy("//td[contains(.,'25')]");

    //VER DETALLES

    public static final Target ICONO_LUPA = Target.the("").locatedBy("(//i[contains(@aria-hidden,'true')])[6]");

    public static final Target DETALLES = Target.the("").locatedBy("//th[contains(.,'Autenticación de dos pasos')]");

}

