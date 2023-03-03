
  Feature: The user can create a new menu
    in the neat administrative page

    Background:
      Given The user enters to Neat administration page
      When He puts the nekoAdmin and the Admin123


    @Escenaiocrearmenuexitoso
    Scenario: Create a new menu
      Given He goes to the create menu page
      When he enters the data name Menu 4 and the orden 9
      Then He see the succesful message Éxitoso



    @Escenariocancelarmenu
    Scenario: cancel the creation of new menu
      Given He goes to the create menu page
      When He cancel the action
      Then He see the principal page of menu CREAR MENÚ


    @Filtrarmenu
    Scenario: Filter a menu
      Given He goes to the menus principal page
      When He filter the information name Configuración
      Then He sees the information that use in the filter Configuración

     @Cleanfilter
     Scenario: Clean the filter
       Given He goes to the menus principal page
       When He filter the information name Configuración
       And He sees the information that use in the filter Configuración
       And He select the clean button
       Then He see the menus pgae


    @Buscarmenu
    Scenario: Search a new menu
      Given He goes to the menus principal page
      When He search the information Configuración
      Then He sees the register of menus Configuración

    @Limpiarcampos
    Scenario Outline: Clear the inputs on page clear menu
      Given He goes to the create menu page
      When He select the eraser icon
      | <Nombre> | <Orden> |
      Then He sees all the inputs clean
      Examples:
      | Nombre | Orden |
      | Menu Prueba | 4 |


    @ActivarMenu
      Scenario: Change menu status
      Given He goes to the menus principal page
      When He select the activate iconM
      Then He sees the menu active Activo

    @DesactivarMenu
      Scenario: Change menu status
      Given He goes to the menus principal page
      When He select the inactive iconM
      Then He sees the menu inactive Inactivo


    @EditarMenu
      Scenario: Edit a menu
      Given He goes to the menus principal page
      When He edit the menu information Nueva descripccion
      Then He sees the edit succes messageM Éxitoso


    @EliminarMenu
    Scenario: Delate a menu
      Given He goes to the menus principal page
      When He delate a menu
      Then He sees the delate succes messageM Éxitoso















