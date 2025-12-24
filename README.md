# challenge-Literalura
# LiterAlura - Catálogo de Libros 📚

¡Bienvenido al desafío **LiterAlura**! Este proyecto es una aplicación Java que interactúa con la API de [Gutendex](https://gutendex.com/) para buscar información sobre libros, procesar datos en formato JSON y almacenarlos en una base de datos relacional para su posterior consulta y filtrado.

## 🎯 Objetivo del Proyecto
Desarrollar una herramienta de consola que permita a los usuarios gestionar su propio catálogo de libros, permitiendo búsquedas por título, listados de autores y filtrados específicos por idioma o año de vida de los autores.

---

## 🛠️ Tecnologías Utilizadas

* **Java JDK 17** o superior.
* **Maven** (Gestor de dependencias).
* **Spring Boot 3.2.3** (Framework principal).
* **Spring Data JPA** (Persistencia de datos).
* **PostgreSQL** (Base de datos relacional).
* **Jackson** (Manipulación de JSON).
* **HttpClient** (Consumo de API).

---

## 🚀 Funcionalidades Principales

El sistema ofrece un menú interactivo con las siguientes opciones:

1.  **Buscar libro por título:** Consulta la API de Gutendex, obtiene el primer resultado y lo guarda en la base de datos (incluyendo su autor).
2.  **Listar libros registrados:** Muestra todos los libros que han sido persistidos en la base de datos.
3.  **Listar autores registrados:** Muestra una lista única de los autores almacenados.
4.  **Listar autores vivos en un determinado año:** Filtra autores que estaban vivos en el año ingresado por el usuario.
5.  **Listar libros por idioma:** Permite filtrar los libros almacenados por siglas de idioma (ej: `es` para español, `en` para inglés).

---

## 📊 Estructura de Datos

El proyecto utiliza una relación de **Uno a Muchos (OneToMany)** entre Autor y Libro:
* Un **Libro** tiene: Título, Autor, Idioma y Número de descargas.
* Un **Autor** tiene: Nombre, Año de nacimiento y Año de fallecimiento.

---

## ⚙️ Configuración del Entorno

### 1. Base de Datos
Debes tener instalado **PostgreSQL** y crear una base de datos llamada `literalura_db`. Luego, configura tu archivo `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/literalura_db
spring.datasource.username=tu_usuario
spring.datasource.password=tu_contraseña
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
