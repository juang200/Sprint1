
Feature: the user can create a new user
  in the neat administrative page


  Background:
    Given The user enters to Neat administration page
    When He puts the nekoAdmin and the Admin123
    And He goes to the user page


  @Escenariocrearusuarioexitoso
  Scenario Outline: Create a new user
    Given He goes to the create user page
    When He enters the data
      | <Nombre> | <NumeroDoc> | <Telefono> | <Direccion> | <NombreUsuario> | <Correo> | <Contrasena> | <ConfirmarContra> |
    Then He sees the succes messageU 1

    Examples:
    | Nombre | NumeroDoc | Telefono | Direccion | NombreUsuario | Correo | Contrasena | ConfirmarContra |
    | Juan   |1005089765 |3216752430|cra64      |JuanGC40       |Juan@gmail.com| Juan1012| Juan1012     |


  @Escenariocancelarususario
  Scenario: cancel the creation of new user
    Given He goes to the create user page
    When He cancel the create user action
    Then He sees the principal page of users Configuración / Gestión usuarios


  @FiltrarUsario
  Scenario: Filter the user
    Given He filter the informationU juan
    Then He sees the user that filter 25


  @LimpiarFiltros
  Scenario: Clean the filters
    Given He filter the informationU juan
    When He sees the user that filter 25
    And He clean the filter
    Then He sees all users records 16


  @BorrarDatos
  Scenario: Clear the inputs on page create user
    Given He goes to the create user page
    When He select the eraser iconU


  @EditarUsuario
  Scenario: Edit a user
    Given He edit the user information 3133232677 and NewPassword1
    Then He sees the edit succes messageU Éxitoso


  @BuscarUsuario
  Scenario: Search a user
    Given He search the wordU Juan
    Then He sees all the information ofU 25

  @VerDetalles
  Scenario: See the user details
    Given He select the magnifying glass icon
    Then He sees the user details Autenticación de dos pasos