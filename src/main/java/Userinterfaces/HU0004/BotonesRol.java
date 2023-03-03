package Userinterfaces.HU0004;

import com.gargoylesoftware.htmlunit.html.TableRowGroup;
import net.serenitybdd.screenplay.targets.Target;

public class BotonesRol {

    public static final Target GESTION_ROLES = Target.the("Seleccionar boton Gestion de roles").locatedBy("(//span[contains(.,'Gestión Roles')])[1]");

    public static final Target CREAR_ROL = Target.the("Seleccionar boton Crear Rol").locatedBy("//span[contains(@class,'btn-add')]");

    public static final Target ICONO_NEAT = Target.the("Icono Neat").locatedBy("//img[@alt='logo']");

// crear rol

    public static final Target INPUT_NOMBRE = Target.the("Input para ingresar el nombre del rol").locatedBy("//input[contains(@placeholder,'Nombre')]");

    public static final Target INPUT_DESCRIPCION = Target.the("Input para ingresar la descripcion del rol").locatedBy("//input[contains(@placeholder,'Descripción')]");

    public static final Target SELECT_ESTADO = Target.the("Select estado rol").locatedBy("//div[contains(@id,'demo-multiple-name')]");

    public static final Target ESTADO_SELECCIONADO = Target.the("Estado seleccionado").locatedBy("//li[contains(@aria-selected,'true')]");

    public static final Target SELECT_MENU = Target.the("Select Menu Rol").locatedBy("//div[contains(@id,'mui-component-select-idMenu')]");

    public static final Target MENU_SELECCIONADO = Target.the("Menu seleccionado").locatedBy("//li[contains(.,'menuQA')]");

    public static final Target SELECT_MODULO = Target.the("Select modulo rol").locatedBy("//div[contains(@id,'mui-component-select-idModule')]");

    public static final Target MODULO_SELECCIONADO = Target.the("Modulo seleccionado").locatedBy("//li[contains(@tabindex,'0')]");

    public static final Target SELECT_PERMISOS = Target.the("Select permisos rol").locatedBy("//div[contains(@id,'checklist')]");

    public static final Target SELECCIONAR_PERMISO = Target.the("Seleccionar un permiso").locatedBy("//span[contains(.,'Crear')]");


    public static final Target BARRA_BAJAR = Target.the("Barra para bajar").locatedBy("(//div[contains(@class,'thumb-y')])[2]");

// Guardar Nuevo Rol

    public static final Target BUTTON_GUARDAR = Target.the("Boton guardar").locatedBy("//button[contains(.,'Guardar')]");

    public static final Target MENSAJE_EXITOSO_R = Target.the("").locatedBy("(//div[contains(.,'Éxitoso')])[19]");

// Cancelar Rol

    public static final Target BUTTON_CANCELAR = Target.the("Boton cancelar").locatedBy("//button[contains(@class,'MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButtonBase-root footer-btn danger-btn ripple css-sghohy-MuiButtonBase-root-MuiButton-root')]");

    public static final Target BUTTON_SI_CANCALAR = Target.the("Boton si cancelar").locatedBy("//i[contains(@class,'fa fa-check btn-icon pt-1 fa-md mr-2')]");

    public static final Target VERIFICACION_ROL_PRINCIPAL = Target.the("Verificacion menu principal").locatedBy("//p[contains(.,'Configuración / Gestión roles')]");


// Filtros rol

    public static final Target SELECT_FILTRO_ROL = Target.the("Select rol").locatedBy("//div[contains(@aria-labelledby,'Rol-label mui-component-select-Rol')]");

    public static final Target ROL_SELECCIONADO = Target.the("Rol seleccionado").locatedBy("//li[contains(@data-value,'Rol QA')]");

    public static final Target BUTTON_FILTRAR = Target.the("Boton filtrar").locatedBy("//label[@class='btn-label pl-1'][contains(.,'FILTRAR')]");

    public static final Target VERIFICACION_FILTRADO = Target.the("Verificacion filtrado").locatedBy("//div[@class='d-flex justify-content-center'][contains(.,'Rol QA')]");

    public static final Target BUTTON_LIMPIAR = Target.the("Boton limpiar").locatedBy("//label[@class='btn-label pl-1'][contains(.,'LIMPIAR')]");

    public static final Target VERIFICACION_FILTROS_LIMPIOS = Target.the("Verificacion filtros limpios").locatedBy("//td[contains(.,'Rol prueba')]");


// Buscar Rol

    public static final Target INPUT_BUSCAR = Target.the("Input buscar por nombre").locatedBy("//input[contains(@title,'Filtrar de busqueda en la tabla')]");

    public static final Target VERIFICACION_BUSQUEDA = Target.the("Verificacion Busqueda").locatedBy("//div[@class='d-flex justify-content-center'][contains(.,'Rol QA')]");


// Limpiar campos

    public static final Target BUTTON_BORRADOR = Target.the("Boton borrador").locatedBy("//img[contains(@alt,'Icon clear')]");

    public static final Target BUTTON_SI_BORRAR = Target.the("Boton confirmar borrador").locatedBy("//button[contains(.,'Si')]");

    public static final Target VERIFICACION_BORRADOR = Target.the("Verfificacion borrada").locatedBy("");


// Activar/ Desactivar rol

    public static final Target BAJAR_BARRA_1 = Target.the("Bajar Barra Lateral").locatedBy("(//div[contains(@class,'ps__thumb-y')])[2]");

    public static final Target EYE_LOGO = Target.the("Icono desactivar rol").locatedBy("//i[contains(@class,'fa-regular fa-eye-slash fa-lg pr-3 iconSee')]");

    public static final Target EYE_LOGO_A = Target.the("Icono activar rol").locatedBy("(//i[contains(@class,'fa fa-eye fa-lg pr-3 iconSee')])[1]");

    public static final Target VERIFICACION_STATUS_A = Target.the("Rol activo").locatedBy("(//div[@class='d-flex justify-content-center cellRowActive'][contains(.,'Activo')])[1]");

    public static final Target VERIFICACION_STATUS_D = Target.the("Rol inactivo").locatedBy("//div[@class='d-flex justify-content-center cellRowInactive'][contains(.,'Inactivo')][2]");

    public static final Target EXITOSO = Target.the("Mensaje Exitoso").locatedBy("(//div[contains(.,'Éxitoso')])[19]");




// Eliminar Rol

    public static final Target ICONO_ELIMINARR = Target.the("").locatedBy("(//i[contains(@aria-hidden,'true')])[11]");

    public static final Target BUTTON_SI_ELIMINAR = Target.the("").locatedBy("//button[@id='btnConfirm']");

    public static final Target CONFIRMACION_ELIMINAR = Target.the("").locatedBy("");


// Editar Rol

    public static final Target ICONO_EDITAR = Target.the("").locatedBy("(//i[contains(@class,'fa fa-pencil-square-o fa-lg pr-3 iconEdit')])[2]");

    public static final Target BUTTON_EDITAR = Target.the("").locatedBy("//button[@class='MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButtonBase-root footer-btn primary-btn ripple css-sghohy-MuiButtonBase-root-MuiButton-root'][contains(.,'Guardar')]");

    public static final Target BUTTON_SI_EDITAR = Target.the("").locatedBy("//button[contains(@id,'btnConfirm')]");

    public static final Target VERIFICACION_EXITOSA = Target.the("").locatedBy("(//div[contains(.,'Éxitoso')])[19]");


    // Ver detalles botones

    public static final Target ICONO_LUPA = Target.the("").locatedBy("");




}
