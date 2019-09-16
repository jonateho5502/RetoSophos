package com.google.www.task;

import com.google.www.userinterfaces.agregarTv;
import net.serenitybdd.core.time.InternalSystemClock;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;


public class buscarArticulo implements Task {

    private String televisor;
    private String driver;

    public buscarArticulo(String televisor) {
        this.televisor = televisor;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        InternalSystemClock clock = new InternalSystemClock();
        clock.pauseFor(7000);

        actor.attemptsTo(Click.on(agregarTv.NO));
        actor.attemptsTo(Enter.theValue(televisor).into(agregarTv.TXT_ARTICULO));
        actor.attemptsTo(Click.on(agregarTv.TXT_ARTICULO));
        clock.pauseFor(5000);
        actor.attemptsTo(Click.on(agregarTv.CLIC_ARTICULO));
        clock.pauseFor(5000);
        actor.attemptsTo(Click.on(agregarTv.AGREGAR_ARTICULO));
        clock.pauseFor(5000);
        actor.attemptsTo(Click.on(agregarTv.CARRITO));

    }

    public static buscarArticulo buscar(String televisor) {
        return new buscarArticulo(televisor);
    }

}
