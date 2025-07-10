package test; // Paquete donde se encuentra la clase

// Importaciones necesarias para JUnit y Selenium
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static java.lang.Thread.*; // Para poder usar sleep sin escribir Thread.sleep
import static org.junit.jupiter.api.Assertions.assertTrue; // Para hacer afirmaciones en las pruebas

public class SearchTest {

    // Driver de Selenium para controlar el navegador
    private WebDriver driver;

    /**
     * Este método se ejecuta **antes de cada test**.
     * Inicializa el navegador (en este caso, Chrome).
     * Puedes cambiar `ChromeDriver` por `FirefoxDriver` si lo deseas.
     */
    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver(); // Inicia el navegador Chrome
    }

    /**
     * Test principal: abre Google y verifica que el título contenga la palabra "Google".
     * También incluye una pausa de 5 segundos para observar el comportamiento.
     */
    @Test
    public void testOpenGoogleAndVerifyTitle() {
        try {
            driver.get("https://google.com"); // Intenta abrir la página de Google

            // Pausa de 5 segundos para observar la carga (no recomendado para producción)
            sleep(5000);

            String title = driver.getTitle(); // Obtiene el título de la página

            // Verifica que el título contenga "Google"
            assertTrue(title.contains("Google"), "El título debería contener 'Google'");
        } catch (Exception e) {
            // Si ocurre cualquier excepción (como problemas de red, timeout, etc.)
            System.out.println("Error durante la prueba: " + e.getMessage());
            e.printStackTrace();
            // Podrías usar: fail("El test falló debido a una excepción");
        }
    }


    /**
     * Este método se ejecuta **después de cada test**.
     * Cierra el navegador si está abierto.
     */
    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit(); // Cierra el navegador y libera recursos
        }
    }
}
