package Stepsdefinitions;

import Tasks.HU0001.Insertardatos;
import Userinterfaces.HU0001.Homepage;
import cucumber.api.java.en.*;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import question.HU0001.loginQuestion;
import question.HU0001.loginQuestion2;
import question.HU0001.loginquestion3;

import static Userinterfaces.HU0001.BotonesLogin.BUTTON_OLVIDO_CONTRASENA;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class LoginSteps {

    @Managed(driver = "Chrome")
    private WebDriver navegador;

    private Homepage homepage = new Homepage();
    private Actor actor = Actor.named("Juan");

    @Given("^The user enters to Neat administration page$")
    public void the_user_enters_to_Neat_administration_page() {
        actor.can(BrowseTheWeb.with(navegador));
        actor.wasAbleTo(Open.browserOn(homepage));
        navegador.manage().window().maximize();
    }

    @When("^He puts the (.*) and the (.*)$")
    public void he_puts_the_user_and_the_password(String usuario, String contrasena) {
        actor.wasAbleTo(
                Insertardatos.conDatos(usuario, contrasena));
    }

    @Then("^He see the administrative page (.*)$")
    public void he_see_the_administrative_page(String Validtext) {
        actor.should(GivenWhenThen.seeThat(loginQuestion.loginvalidtext(Validtext)));
    }


// Pasos para realizar el login con datos incorrectos, datos no registrados.

    @When("^He puts in the user (.*) and password (.*)$")
    public void hePutsInTheUserJuanAndPassword(String usuario, String contrasena) {
        actor.wasAbleTo(
                Insertardatos.conDatos(usuario, contrasena));
    }

    @Then("^He see the warnning message (.*)$")
    public void heSeeTheWarnningMessage(String advertencia) {
        actor.should(GivenWhenThen.seeThat(loginQuestion2.loginadvertencia(advertencia)));
        }

// Pasos para verificar accion olvidar contraseña

    @When("^He select the option Forgotten the password$")
    public void heSelectTheOptionForgottenThePassword(){
        actor.attemptsTo(
                Click.on(BUTTON_OLVIDO_CONTRASENA)//Boton olvide mi contraseña
        );
    }

    @Then("^He see the administrative message (.*)$")
    public void heSeeTheAdministrativeMessage(String notificacion) {
        actor.should((GivenWhenThen.seeThat((loginquestion3.loginnotificacion(notificacion)))));

    }








}

