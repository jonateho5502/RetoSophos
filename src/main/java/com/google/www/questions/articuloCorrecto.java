package com.google.www.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class articuloCorrecto implements Question<String> {

	private Target nombre;

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(nombre).viewedBy(actor).asString();
	}



	public articuloCorrecto(Target nombre) {
		this.nombre = nombre;
	}



	public static articuloCorrecto articuloSeleccionado(Target nombre) {
		return new articuloCorrecto(nombre);
	}

}
