package Stepsdefinitions;

import Tasks.HU0004.BuscarRol;
import Tasks.HU0004.CrearRol;
import Tasks.HU0004.EditarRol;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import question.HU0004.*;

import java.awt.*;
import java.util.List;

import static Userinterfaces.HU0003.BotonesMenu.ICONO_CONFIGURACION;
import static Userinterfaces.HU0003.BotonesMenu.INPUT_DESCRIPCCION;
import static Userinterfaces.HU0004.BotonesRol.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.GivenWhenThen.when;

public class CrearRolSteps {

    @Managed(driver = "Chrome")
    private WebDriver navegador;

    private Actor actor = Actor.named("Juan");


    //Escenario crear rol exitoso

    @Given("^He goes to the create rol page$")
    public void heGoesToTheCreateRolPage() {
        actor.can(BrowseTheWeb.with(navegador));
        actor.attemptsTo(
                Click.on(ICONO_CONFIGURACION),
                Scroll.to(GESTION_ROLES),
                Click.on(GESTION_ROLES),
                Click.on(CREAR_ROL));
    }
    @When("^He enters the data name (.*) and the description (.*)$")
    public void heEntersTheData(String nombre, String descripcion) {
        actor.wasAbleTo(
                CrearRol.conlosDatos(nombre, descripcion)
        );
    }
    @Then("^He see the succesful messageR (.*)$")
    public void heSeeTheSuccesfulMessage(String RolExitoso) {
        actor.should(seeThat(CrearRolExitoso.RolExitoso(RolExitoso)));
    }


//Escenario cancelar Rol

    @When("^He cancel the crear rol action$")
    public void heCancelTheCrearRolAction() {
        actor.attemptsTo(
                Scroll.to(BUTTON_CANCELAR),
                Click.on(BUTTON_CANCELAR),
                Click.on(BUTTON_SI_CANCALAR),
                Scroll.to(ICONO_NEAT));
    }
    @Then("^He see the principal page of rol (.*)$")
    public void heSeeThePrincipalPageOfMenu(String PrincipalRol) {
        actor.should(seeThat(VerificacionPaginaRol.RolValidtext(PrincipalRol)));

    }

// Escenario filtrar rol

    @Given("^He goes to the rol principal page$")
    public void heGoesToTheRolPrincipalpage(){
        actor.can(BrowseTheWeb.with(navegador));
        actor.attemptsTo(
                Click.on(ICONO_CONFIGURACION),
                Scroll.to(GESTION_ROLES),
                Click.on(GESTION_ROLES));
    }

    @When("^He filter the information1$")
    public void heFilterTheInformation(){
        actor.attemptsTo(
                Click.on(SELECT_FILTRO_ROL),
                Click.on(ROL_SELECCIONADO),
                Click.on(BUTTON_FILTRAR));
    }

    @Then("^He sees the information that use in the filter1 (.*)$")
    public void heSeesTheInformationThatUseInTheFilter1(String RolFiltrado){
        actor.should(seeThat(VerificacionFiltradoRol.Validfilter(RolFiltrado)));
    }

// Escenario limpiar filtro

    @And("^He select the clean button1$")
    public void heSelectTheCleanButton(){
        actor.attemptsTo(
                Click.on(BUTTON_LIMPIAR));
    }

    @Then("^He see the roles page (.*)$")
    public void heSeeTheRolesPage(String RolLimpio){
        actor.should(seeThat(VerificacionFiltroLimpioR.ValidClean(RolLimpio)));

    }

// Escenario Buscar rol

    @When("^He search the word (.*)$")
    public void heSearchTheInformation(String PalabraBuscar){
        actor.attemptsTo(
                BuscarRol.ConDato(PalabraBuscar));
    }
    @Then("^He sees all the information of (.*)$")
    public void heSeesAllTheInformationOf(String VerBusqueda){
        actor.should((seeThat((VerifiacionBusquedaR.BusquedaValidtext(VerBusqueda)))));

    }

// Escenario borrar datos

    @When("^He select the eraser iconR$")
    public void heSelectTheEraserIconR (List<String> datos){
        actor.attemptsTo(
                Click.on(INPUT_NOMBRE),
                Enter.theValue(datos.get(0)).into(INPUT_NOMBRE),
                Click.on(INPUT_DESCRIPCION),
                Enter.theValue(datos.get(1)).into(INPUT_DESCRIPCCION),
                Scroll.to(BUTTON_BORRADOR),
                Click.on(BUTTON_BORRADOR),
                Click.on(BUTTON_SI_BORRAR));
    }
    @Then("^He sees all the inputs clean2$")
    public void He_sees_all_the_inputs_clean2(){

    }

// Escenario DesactivarRol

    @When("^He select the eye iconR$")
    public void heSelectTheEyeIcon(){
        actor.attemptsTo(
        Click.on(EYE_LOGO_A));
    }
    @Then("^He sees the role status (.*)$")
    public void heSeesTheEditSeccesMessageR(String Exitoso) {
        actor.should(seeThat(RolInactivo.ValisStatus(Exitoso)));
    }


// Escenario ActivarRol

    @When("^He select the close eye iconR$")
    public void heSelectTheCloseEyeIcon (){
        actor.attemptsTo(
                Click.on(EYE_LOGO));
    }
    @Then("^He sees the new status role (.*)$")
    public void heSeesTheNewStatusRole(String Status1){
        actor.should(seeThat(RolInactivo.ValisStatus(Status1)));
    }

// Escenario Eliminar un rol

    @When("^He delate a role$")
    public void heDelateARole(){
        actor.attemptsTo(
                Click.on(ICONO_ELIMINARR),
                Click.on(BUTTON_SI_ELIMINAR));
    }

    @Then("^He sees the delate succes messageR$")
    public void heSeeesTheDelateSuccesMessageR(){

    }

// Escenario Editar rol

    @When("^He edit the role information (.*)$")
    public void heSeeTheEditSuccesMessageR(String NuevaD) {
        actor.attemptsTo(
                EditarRol.ConDatosNuevos(NuevaD));
    }
    @Then("^He see the edit succes messageR (.*)$")
    public void heSeeTheEditSuccesMessage(String MensajeEdicion){
        actor.should(seeThat(EdicionExitosaR.ValidEdicion(MensajeEdicion)));
    }
}



