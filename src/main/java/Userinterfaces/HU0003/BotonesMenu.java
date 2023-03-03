package Userinterfaces.HU0003;


import net.serenitybdd.screenplay.targets.Target;

import javax.swing.plaf.PanelUI;

public class BotonesMenu {

    // Creacion del menu

    public static final Target ICONO_CONFIGURACION = Target.the("Seleccionar configuracion").locatedBy("//p[@class='sidebar-text'][contains(.,'Configuración')]");

    public static final Target ICONO_MENU = Target.the("Seleccionar modulo gestion de menus").locatedBy("(//span[contains(.,'Gestión Menus')])[2]");

    public static final Target ICONO_CREAR_MENU = Target.the("Seleccionar icono crear menu").locatedBy("//i[contains(@class,'fa-solid fa-plus')]");

    public static final Target INPUT_NOMBRE = Target.the("Input nombre").locatedBy("//input[contains(@name,'name')]");

    public static final Target SELECT_URL = Target.the("Select URL").locatedBy("//div[@tabindex='0'][contains(.,'\u200B')]");

    public static final Target SELECCIONAR_UNA_URL = Target.the("URL SELECCIONADA").locatedBy("//li[contains(.,'/admin/fileUpload')]");

    public static final Target INPUT_ORDEN = Target.the("Input orden").locatedBy("//input[contains(@name,'order')]");


    public static final Target INPUT_DESCRIPCCION = Target.the("Input descrpcciob").locatedBy("(//input[contains(@placeholder,'Descripción')])[1]");

    public static final Target SELECT_ESTADO = Target.the("Select estado").locatedBy("//div[@id='demo-multiple-name']");

    public static final Target SELECCIONAR_UN_ESTADO = Target.the("Estado seleccionado").locatedBy("//li[contains(@tabindex,'0')]");

    public static final Target BOTON_SIGUIENTE_1 = Target.the("Boton siguiente1").locatedBy("//button[contains(.,'Siguiente')]");

    public static final Target BOTON_SIGUIENTE_2 = Target.the("Boton siguiente2").locatedBy("//button[contains(.,'Siguiente')]");

    public static final Target BOTON_GUARDAR = Target.the("Boton guardar").locatedBy("//button[contains(.,'Guardar')]");

    public static final Target CONFIRMAR_GUARDAR = Target.the("Boton si guardar").locatedBy("//button[@id='btnConfirm']");

    public static final Target MENSAJE_EXITOSO = Target.the("").locatedBy("(//div[contains(.,'Éxitoso')])[19]");


    //Cancelar creacion del menu

    public static final Target BUTTON_CANCELAR_MENU = Target.the("Boton para cancelar creacion del menu").locatedBy("//button[contains(.,'Cancelar')]");

    public static final Target BUTTON_SI_CANCELAR_MENU = Target.the("Boton si cancelar menu").locatedBy("//button[@class='d-flex btn-light-dark'][contains(.,'Si')]");


    public static final Target VERIFICACION_PAGINA_MENU = Target.the("Verficicacion pagina de menu").locatedBy("//p[@class='txt-primary-md'][contains(.,'Crear menú')]");


    //Filtrar un menu

    public static final Target INPUT_FILTRAR_NOMBRE = Target.the("Input nombre en filtros").locatedBy("//input[contains(@id,'Menú')]");

    public static final Target BUTTON_FILTRAR = Target.the("Boton filtrar").locatedBy("//label[@class='btn-label pl-1'][contains(.,'FILTRAR')]");

    public static final Target VERIFICACION_FILTRADO = Target.the("Verificacion filtrado").locatedBy("//div[@class='d-flex justify-content-center'][contains(.,'Configuración')]");


    //Limpiar filtro

    public static final Target BUTTON_LIMPIAR_Filtro = Target.the("Boton limpiar filtro").locatedBy("//label[@class='btn-label pl-1'][contains(.,'LIMPIAR')]");


    //Borrar datos del tegistro

    public static final Target ICONO_BORRADOR = Target.the("Icono borrador").locatedBy("//img[@src='/static/media/icon-park_clear-format.68f4c3dd.svg']");

    public static final Target CONFIRMAR_BORRADOR = Target.the("Mensaje de confirmacion Borrador").locatedBy("//i[contains(@class,'fa fa-check btn-icon pt-1 fa-md mr-2')]");


    //Buscar menu

    public static final Target INPUT_BUSCAR = Target.the("Input para buscar menu").locatedBy("//input[contains(@class,'input-app-sm w-100')]");


    public static final Target VERIFICACION_BUSQUEDA = Target.the("Verificacion busqueda").locatedBy("//div[@class='d-flex justify-content-center'][contains(.,'menuQA')]");


    // Activar Rol

    public static final Target EYE_ICON_A = Target.the("Activar menu").locatedBy("(//i[contains(@class,'fa-regular fa-eye-slash fa-lg pr-3 iconSee')])[1]");
    public static final Target  MENU_ACTIVO = Target.the("Menu activo").locatedBy("(//div[@class='d-flex col-sm-4 justify-content-center'][contains(.,'Activo')])[1]");


    //Desactivar Menu

    public static final Target EYE_ICON_D = Target.the("Desactivar menu").locatedBy("(//i[contains(@class,'fa fa-eye fa-lg pr-3 iconSee')])[1]");

    public static final Target MENU_DESACTIVADO = Target.the("Menu desactivado").locatedBy("//div[@class='d-flex col-sm-4 justify-content-center'][contains(.,'Inactivo')]");

    // Editar Menu

    public static final Target ICONO_EDITAR = Target.the("Icono editar").locatedBy("(//i[contains(@class,'fa fa-pencil-square-o fa-lg pr-3 iconEdit')])[8]");

    public static final Target BUTTON_SIGUIENTE = Target.the("Boton siguiete").locatedBy("//button[contains(.,'Siguiente')]");

    public static final Target BUTTON_EDITAR = Target.the("Boton para guardar edicion").locatedBy("//button[contains(.,'Guardar')]");

    public static final Target BUTTON_SI_EDITAR = Target.the("Boton para confirmar edicion").locatedBy("//button[contains(@id,'btnConfirm')]");

    public static final Target VERIFICACION_EDICION = Target.the("Mensaje de edicion Exitosa").locatedBy("(//div[contains(.,'Éxitoso')])[10]");


    // Eliminar Menu

    public static final Target ICONO_ELIMINAR = Target.the("Icono eliminar").locatedBy("(//i[contains(@class,'fa fa-trash fa-lg iconDelete')])[5]");

    public static final Target BUTTON_SI_ELIMINAR = Target.the("Boton para confirmar la eliminacion del rol").locatedBy("//button[contains(@id,'btnConfirm')]");

    public static final Target VERIFICACION_ELIMINACION = Target.the("Mensaje de confirmacion eliminacion").locatedBy("(//div[contains(.,'Éxitoso')])[19]");
}