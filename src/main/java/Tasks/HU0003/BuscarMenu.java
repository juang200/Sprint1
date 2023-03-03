package Tasks.HU0003;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static Userinterfaces.HU0003.BotonesMenu.INPUT_BUSCAR;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class BuscarMenu  implements Task {

    private String SearchMenu;

    public BuscarMenu (String SearchMenu){
        this.SearchMenu = SearchMenu;
    }

    @Override
    public <T extends Actor> void performAs (T actor) {
        actor.attemptsTo(
                Click.on(INPUT_BUSCAR),
                Enter.theValue(SearchMenu).into(INPUT_BUSCAR)
        );
    }
        public static BuscarMenu conlosDatos (String SearchMenu){
            return instrumented (BuscarMenu.class, SearchMenu);
        }
}
