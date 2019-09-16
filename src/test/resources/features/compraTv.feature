Feature: Agregar productos al carrito de compras

  Scenario: Ingresar a la pagina web de PLAZA VEA y agregar un televisor al carrito de compras

    Given El usuario esta en la pagina principal
    When Busca un televisor en el catalogo
    Then El usuario valida que en el carrito se encuentre el articulo seleccionado
      | comprobar                                  |
      | Televisor AOC LED 50" UHD Smart TV 50U6285 |