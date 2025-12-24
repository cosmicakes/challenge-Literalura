public void muestraElMenu() {
    var opcion = -1;
    while (opcion != 0) {
        var menu = """
                1 - Buscar libro por título 
                2 - Listar libros registrados
                3 - Listar autores registrados
                4 - Listar autores vivos en un determinado año
                5 - Listar libros por idioma
                0 - Salir
                """;
        System.out.println(menu);
        opcion = teclado.nextInt();
        teclado.nextLine();

        switch (opcion) {
            case 1 -> buscarLibroPorTitulo();
            case 2 -> mostrarLibros();
            case 3 -> mostrarAutores();
            case 4 -> listarAutoresVivos();
            case 5 -> listarLibrosPorIdioma();
            case 0 -> System.out.println("Cerrando aplicación...");
            default -> System.out.println("Opción inválida");
        }
    }
}
