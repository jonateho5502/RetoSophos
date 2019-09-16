package com.google.www.stepdefinitions;

import com.google.www.drivers.MyDriver;
import com.google.www.task.buscarArticulo;
import com.google.www.userinterfaces.agregarTv;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class agregarTvStepDefinitions {

    private Question<Boolean> articuloCorrecto;

    @Before
    public void init() {
        OnStage.setTheStage(Cast.ofStandardActors());
    }

    @Given("^El (.*) esta en la pagina principal$")
    public void elUsuarioEstaEnLaPaginaPrincipal(String jonatan) {
        theActorCalled(jonatan).can(BrowseTheWeb.with(MyDriver.web().enLaPagina("https://www.plazavea.com.pe/.")));
    }

    @When("^Busca un (.*) en el catalogo$")
    public void buscaUnTelevisorEnElCatalogo(String Articulo) {
        theActorInTheSpotlight().attemptsTo(buscarArticulo.buscar(Articulo));
    }


    @Then("^El usuario valida que en el carrito se encuentre el articulo seleccionado$")
    public void elUsuarioValidaQueEnElCarritoSeEncuentreElArticuloSeleccionado(List<Map<String, String>> comprobar) {
        theActorInTheSpotlight().should(seeThat(com.google.www.questions.articuloCorrecto.articuloSeleccionado(agregarTv.COMPROBAR), Matchers.is(comprobar.get(0).get("comprobar"))));
    }
}

