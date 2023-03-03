Feature: the user can create a new rol
  in the neat administrative page


  Background:
    Given The user enters to Neat administration page
    When He puts the nekoAdmin and the Admin123

  @Escenariocrearrolexitoso
  Scenario: Create a new rol
    Given He goes to the create rol page
    When He enters the data name Rol prueba and the description Rol prueba QA
    Then He see the succesful messageR Éxitoso


  @Escenariocancelarrol
  Scenario: cancel the creation of new rol
    Given He goes to the create rol page
    When He cancel the crear rol action
    Then He see the principal page of rol Configuración / Gestión roles


  @Filtrarrol
  Scenario: Filter a rol
    Given He goes to the rol principal page
    When He filter the information1
    Then He sees the information that use in the filter1 Rol QA

  @Cleanfilter
  Scenario: Clean the filter
    Given He goes to the rol principal page
    When He filter the information1
    Then He sees the information that use in the filter1 Rol QA
    And He select the clean button1
    Then He see the roles page Rol prueba


  @BuscarRol
  Scenario: Search a rol
    Given He goes to the rol principal page
    When He search the word QA
    Then He sees all the information of Rol QA


  @Limpiarcampos
  Scenario Outline: Clear the inputs on page create rol
    Given He goes to the create rol page
    When He select the eraser iconR
      |<Nombre> | <Descripcion> |
    Then He sees all the inputs clean2
    Examples:
    | Nombre | Descripcion |
    | RolPrueba | RolPruebaQA |

  @DesactivarRol
  Scenario: Change role status
    Given He goes to the rol principal page
    When He select the eye iconR
    Then He sees the role status Éxitoso

  @ActivarRol
  Scenario: Change role status
    Given He goes to the rol principal page
    When He select the close eye iconR
    Then He sees the new status role Éxitoso


  @Eliminarunrol
  Scenario: Delate a rol
    Given He goes to the rol principal page
    When He delate a role
    Then He sees the delate succes messageR

  @EditarRol
  Scenario: Edit a role
    Given He goes to the rol principal page
    When He edit the role information Nueva descripcion
    Then He see the edit succes messageR Éxitoso


