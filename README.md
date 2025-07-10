# Proyecto Java: test

Este proyecto es una aplicación Java basada en Maven, que incluye pruebas automatizadas con JUnit 5 y Selenium WebDriver.

## Estructura del Proyecto

```
├── pom.xml
├── src
│   ├── main
│   │   └── java
│   │       └── org/example/Main.java
│   └── test
│       └── java
│           └── test/SearchTest.java
```

## Descripción

- **Main.java**: Clase principal que imprime un mensaje de bienvenida y realiza un pequeño bucle de ejemplo.
- **SearchTest.java**: Prueba automatizada con JUnit 5 y Selenium que abre Google en un navegador y verifica que el título de la página contenga la palabra "Google".

## Dependencias principales

- **JUnit Jupiter (JUnit 5)**: Framework para pruebas unitarias.
- **Selenium WebDriver**: Automatización de navegadores web (Chrome y Firefox).

Estas dependencias están definidas en el archivo `pom.xml`.

## Requisitos previos

- Java 24 o superior
- Maven
- [Driver de Chrome o Firefox](https://www.selenium.dev/documentation/webdriver/getting_started/install_drivers/) instalado y en el PATH del sistema

## Cómo compilar y ejecutar

### Compilar el proyecto:
```sh
mvn clean compile
```

### Ejecutar la aplicación principal:
```sh
mvn exec:java -Dexec.mainClass="org.example.Main"
```

### Ejecutar las pruebas automatizadas:
```sh
mvn test
```

## Notas
- El test de Selenium abre el navegador y realiza una pausa de 5 segundos para observar el comportamiento.
- Puedes cambiar el navegador modificando la línea correspondiente en `SearchTest.java` (de `ChromeDriver` a `FirefoxDriver`).

## Autor
- Generado automáticamente por IA
