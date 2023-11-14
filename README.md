# Selenium, Cucumber, TestNG Java Example

Este proyecto proporciona un ejemplo básico de automatización de pruebas utilizando Selenium WebDriver, Cucumber y TestNG en Java.

## Configuración del Proyecto

### Dependencias

- Selenium WebDriver: 4.15.0
- Cucumber: 7.14.0
- TestNG: 7.8.0
- Webdrivermanager: 5.6.2

### Estructura del Proyecto

- **src/test/resources/features**: Contiene archivos `.feature` con las definiciones de funciones Cucumber.
- **src/test/java/stepdefinitions**: Contiene clases con las definiciones de pasos para las funciones Cucumber.
- **src/test/java/testing.TestRunner.java**: Clase TestNG que ejecuta las funciones Cucumber.

## Ejecución de Pruebas

1. Clona el repositorio:

   ```bash
   git clone <url-del-repositorio>

2. Abre el proyecto en tu IDE.

3. Configura el ejecutable del ChromeDriver en la clase StepDefinitions.

4. Ejecuta la clase testing.TestRunner como una clase de prueba TestNG.

## Funcionalidades
* Abre el navegador y navega a una página.
* Verifica el título de la página.

## Contribución
Siéntete libre de contribuir al proyecto. ¡Estamos abiertos a sugerencias y mejoras!

## Licencia
Este proyecto está bajo la Licencia MIT.

Asegúrate de personalizar la sección de dependencias con las versiones específicas que estás utilizando y ajusta cualquier otra información relevante para tu proyecto. Además, siéntete libre de expandir esta plantilla según las características y detalles específicos de tu proyecto.