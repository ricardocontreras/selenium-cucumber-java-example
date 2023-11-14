Feature: Validar el menú de navegación en la página de Selenium

  @smoke
  Scenario: Verificar el título de la página de Selenium
    Given navegar a "https://www.selenium.dev/"
    When optener titulo de la pagina
    And validar titulo de la pagina
    Then el título de la página debe ser "Selenium"

  @navigation
  Scenario: Verificar la presencia del enlace de Documentación
    Given que abro el navegador
    When navego a "https://www.selenium.dev/"
    Then debería ver el enlace de Documentación en el menú de navegación

  @navigation
  Scenario: Verificar la presencia del enlace de Descargas
    Given que abro el navegador
    When navego a "https://www.selenium.dev/"
    Then debería ver el enlace de Descargas en el menú de navegación

  @navigation
  Scenario: Verificar la presencia del enlace de Proyectos
    Given que abro el navegador
    When navego a "https://www.selenium.dev/"
    Then debería ver el enlace de Proyectos en el menú de navegación

  @navigation
  Scenario: Verificar la presencia del enlace de Soporte
    Given que abro el navegador
    When navego a "https://www.selenium.dev/"
    Then debería ver el enlace de Soporte en el menú de navegación
