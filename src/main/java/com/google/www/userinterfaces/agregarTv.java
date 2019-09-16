package com.google.www.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class agregarTv {

    public static final Target NO = Target.the("NO").locatedBy("(//*[@id='onesignal-popover-cancel-button'])");
    public static final Target TXT_ARTICULO = Target.the("Buscar articulo").locatedBy("(//*[@id='search_box'])");
    public static final Target CLIC_ARTICULO = Target.the("Clic articulo").locatedBy("(//*[@title='Televisor AOC LED 50\" UHD Smart TV 50U6285'])");
    public static final Target AGREGAR_ARTICULO = Target.the("Agregar articulo").locatedBy("(//*[@id='ProductCard__add-to-cart'])");
    public static final Target CARRITO = Target.the("Ver carrito").locatedBy("(//*[@class='cart__ico'])");
    public static final Target COMPROBAR = Target.the("Comprobar").locatedBy("(//*[@class='cart__number'])");

}



