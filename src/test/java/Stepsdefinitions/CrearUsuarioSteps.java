package Stepsdefinitions;

import Tasks.HU0005.BuscarUsuario;
import Tasks.HU0005.CrearUsuario;
import Tasks.HU0005.EditarUsuario;
import Tasks.HU0005.FiltrarUsuario;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.Scroll;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import question.HU0005.*;

import java.util.List;

import static Userinterfaces.HU0003.BotonesMenu.ICONO_CONFIGURACION;
import static Userinterfaces.HU0003.BotonesMenu.ICONO_MENU;
import static Userinterfaces.HU0005.BotonesUsuario.*;
import static net.serenitybdd.screenplay.GivenWhenThen.*;

public class CrearUsuarioSteps {

    @Managed(driver = "Chrome")
    private WebDriver navegador;

    private Actor actor = Actor.named("Juan");

    @And("^He goes to the user page$")
    public void heGoesToTheUserPage(){
        actor.can(BrowseTheWeb.with(navegador));
        actor.attemptsTo(
                Click.on(ICONO_CONFIGURACION),
                Scroll.to(GESTION_USUARIOS),
                Click.on(GESTION_USUARIOS));
    }

    //Escenario Crear USUARIO exitoso

    @Given("^He goes to the create user page$")
    public void heGoesToTheCreateNewUserPage(){
        actor.attemptsTo(
                Click.on(CREAR_USUARIO));}

    @When("^He enters the data$")
    public void heEntersTheData(List<String> datos){
        actor.attemptsTo(
                CrearUsuario.ConDatos(datos.get(0), datos.get(1), datos.get(2), datos.get(3), datos.get(4), datos.get(5), datos.get(6), datos.get(7))
        );}

    @Then("^He sees the succes messageU (.*)$")
    public void heSeesTheSuccesMessageU(String Exitosos){

    }


 // Cancelar usuario

    @Given("^He cancel the create user action$")
    public void heCancelTheCreateUserAction(){
        actor.attemptsTo(
            Click.on(CREAR_USUARIO),
            Scroll.to(BUTTON_CANCELAR_U),
            Click.on(BUTTON_CANCELAR_U),
            Click.on(BUTTON_SI_CANCELAR));
    }
    @Then("^He sees the principal page of users (.*)$")
    public void heSeesThePrincipalPageOfUsers(String PagPrincipal){
        actor.should(seeThat(PrincipalUsuarios.ValidPag(PagPrincipal)));
    }


    //Filtrar Usuario

    @Given("^He filter the informationU (.*)$")
    public void heFilterTheInformation(String Nombre){
        actor.wasAbleTo(FiltrarUsuario.ConDato(Nombre));
    }
    @Then("^He sees the user that filter (.*)$")
    public void heSeesTheUserThatFilter(String ID){
        actor.should(seeThat(VerificacionFiltrado.Validfilter(ID)));
    }


    //Limpiar Campos

    @And("^He clean the filter$")
    public void heCleanTheFilter(){
        actor.attemptsTo(
                Click.on(BUTTON_LIMPIAR)
        );
    }
    @Then("^He sees all users records (.*)$")
    public void heSeesAllUsersRecords(String ID2){
        actor.should(seeThat(VerificacionFiltrosLimpios.ValidLimpiar(ID2)));
    }

    //Borrar Datos
    @When("^He select the eraser iconU$")
    public void heSelestTheEraseIconU(){
        actor.attemptsTo(
                Click.on(BUTTON_BORRADOR),
                Click.on(CONFIRMAR_BORRADOR)
        );
    }
    //Editar Usuario

    @Given("^He edit the user information (.*) and (.*)$")
    public void heEditTheUserInformtion(String NuevoCel , String NuevaContrasena){
        actor.wasAbleTo(
                EditarUsuario.ConNuevosDatos(NuevoCel, NuevaContrasena));
    }
    @Then("^He sees the edit succes messageU (.*)$")
    public void heSeesTheEditSuccesMessageU (String Exitoso){
        actor.should(GivenWhenThen.seeThat(EdicionExitosa.ValidEdicion(Exitoso)));
    }


    //Buscar Usuario

    @Given("^He search the wordU (.*)$")
    public void heSearchTheWordU (String PalabraBuscar){
        actor.wasAbleTo(BuscarUsuario.Condato(PalabraBuscar));
    }

    @Then("^He sees all the information ofU (.*)$")
    public void heSeesAllTheInformationOfU (String ID){
        actor.should(GivenWhenThen.seeThat(VerificacionBuqueda.ValidID(ID)));
    }


    //Ver detalles
    @Given("^He select the magnifying glass icon$")
    public void heSelectTheMagnifyingGlassIcon(){
        Click.on(ICONO_LUPA);
    }
    @Then("^He sees the user details (.*)$")
    public void heSeesTheUserDetails (String Detalles){
        actor.should(seeThat(VerDetalles.ValidDetalles(Detalles)));

    }
}
