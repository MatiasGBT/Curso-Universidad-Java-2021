Errores que cometí al hacerlo:
1. La clase CatalogoPeliculasImpl no debe usar directamente la clase de AccesoDatosImpl, sino su interface.
El hecho de que las clases no se usen entre sí, sino a sus interfaces, aplica el concepto conocido como 
bajo acoplamiento y alta cohesión (el trabajar directamente entre clases puede afectar el código).