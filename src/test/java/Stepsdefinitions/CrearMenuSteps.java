package Stepsdefinitions;

import Tasks.HU0003.BuscarMenu;
import Tasks.HU0003.Crearmenu;
import Tasks.HU0003.EditarMenu;
import Tasks.HU0003.FiltrarMenu;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import question.HU0003.*;

import java.util.List;

import static Userinterfaces.HU0003.BotonesMenu.*;

public class CrearMenuSteps {

    @Managed (driver = "Chrome")
    private WebDriver navegador;

    private Actor actor = Actor.named("Juan");

    // Escenario crear menu exitoso

    @Given("^He goes to the create menu page$")
    public void he_goes_to_the_create_menu_page() {
        actor.can(BrowseTheWeb.with(navegador));
        actor.attemptsTo(Click.on(ICONO_CONFIGURACION));
        actor.attemptsTo(Click.on(ICONO_MENU));
        actor.attemptsTo(Click.on(ICONO_CREAR_MENU));
    }
    @When("^he enters the data name (.*) and the orden (.*)$")
    public void he_Enters_The_Data_Name_And_the_orden(String nombre, String orden){
        actor.wasAbleTo(
            Crearmenu.conlosDatos(nombre, orden));
    }
    @Then("^He see the succesful message (.*)$")
    public void he_see_the_succesful_message(String MenuExitoso) {
        actor.should(GivenWhenThen.seeThat(CrearMenuExitoso.ValidMenu(MenuExitoso)));
    }



    // Escenario cancelar crear menu

    @When("^He cancel the action$")
    public void heCancelTheAction() {
        actor.attemptsTo(
                Click.on(BUTTON_CANCELAR_MENU),// Seleccionar boton cancelar
                Click.on(BUTTON_SI_CANCELAR_MENU));// Seleccionar opcion "Si"
    }
    @Then("^He see the principal page of menu (.*)$")
    public void heSeeThePrincipalPageOfMenu(String Principalmenu) {
        actor.should(GivenWhenThen.seeThat(VerificacionPaginaMenu.Menuvalidtext2(Principalmenu)));
    }



    //Escenario filtrar menu

    @Given("^He goes to the menus principal page$")
    public void heGoesToTheMenusPrincipalPage() {
            actor.can(BrowseTheWeb.with(navegador));
            actor.attemptsTo(Click.on(ICONO_CONFIGURACION));
            actor.attemptsTo(Click.on(ICONO_MENU));
        }
    @When("^He filter the information name (.*)$")
    public void heFilterTheInformation(String Namemenu) {
        actor.attemptsTo(
                FiltrarMenu.conelnombre(Namemenu));
    }
    @Then("^He sees the information that use in the filter (.*)$")
    public void heSeesTheInformationThatUseInTheFilter(String Validfiltro) {
        actor.should(GivenWhenThen.seeThat(VerificacionFiltrado.Validfilter(Validfiltro)));
    }



    //Escenario limpiar filtros

    @When("^He select the clean button$")
    public void heSelectTheCleanButton() {
        actor.attemptsTo(
                Click.on(BUTTON_LIMPIAR_Filtro));
    }
    @Then("^He see the menus pgae$")
    public void heSeeTheMenusPgae() {

    }



    //Escenario buscar filtros

    @When("^He search the information (.*)$")
    public void heSearchTheInformation(String SearchMenu) {
        actor.attemptsTo(
                BuscarMenu.conlosDatos(SearchMenu));
    }
    @Then("^He sees the register of menus (.*)$")
    public void heSeesTheRegisterOfMenus(String ValidBusqueda) {
        actor.should(GivenWhenThen.seeThat(VerificacionBusqueda.BusquedaValidtext(ValidBusqueda)));
    }



    // Borrar todos los datos del nuevo registro

    @When("^He select the eraser icon$")
    public void heSelectTheEraserIcon(List<String> datos) {
        actor.attemptsTo(
                Click.on(INPUT_NOMBRE),
                Enter.theValue(datos.get(0)).into(INPUT_NOMBRE),
                Click.on(INPUT_ORDEN),
                Enter.theValue(datos.get(1)).into(INPUT_ORDEN),
                Click.on(ICONO_BORRADOR),
                Click.on(CONFIRMAR_BORRADOR));
    }

    @Then("^He sees all the inputs clean$")
    public void He_sees_all_the_inputs_clean (){

    }



    // Activar Menu

    @When("^He select the activate iconM$")
    public void heSelectTheActivateIcon() {
        actor.attemptsTo(
                Click.on(EYE_ICON_A));
    }
    @Then("^He sees the menu active (.*)$")
    public void heSeesTheEditSuccesMessagem(String Inactivo){
        actor.should(GivenWhenThen.seeThat(MenuActivo.ValidEstado2(Inactivo)));
    }



    // Desactivar Menu

    @When("^He select the inactive iconM$")
    public void heSelectTheDesactivateIcon(){
        actor.attemptsTo(
                Click.on(EYE_ICON_D));
    }
    @Then("^He sees the menu inactive (.*)$")
    public void heSeesTheMenuInactive(String Inactivo){
        actor.should(GivenWhenThen.seeThat(MenuInactivo.ValidEstado(Inactivo)));
    }



    //Editar Menu

    @When("^He edit the menu information (.*)$")
    public void heEditTheMenuInformation(String NuevaD){
        actor.attemptsTo(
                EditarMenu.ConNuevaD(NuevaD));
    }
    @Then("^He sees the edit succes messageM (.*)$")
    public void heSeesTheEditSuccesMessageM(String OperacionE){
        actor.should((GivenWhenThen.seeThat(OperacionExitosa.Exitosa(OperacionE))));
            }



    //Eliminar menu
    @When("^He delate a menu$")
    public void heDelateAMenu(){
        actor.attemptsTo(
                Scroll.to(ICONO_ELIMINAR),
                Click.on(ICONO_ELIMINAR),
                Click.on(BUTTON_SI_ELIMINAR));
    }
    @Then("^He sees the delate succes messageM (.*)$")
    public void heSeesTheDelateSuccesMessageM(String EliminacionE){
        actor.should((GivenWhenThen.seeThat(MenuEliminado.ValidEliminacion(EliminacionE))));

    }









}

