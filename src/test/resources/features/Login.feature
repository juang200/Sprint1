
 Feature: Perform the Login in the Neat administration page

   @Escenariologinexitoso
   Scenario: User enters to Neat administration page
     Given The user enters to Neat administration page
     When He puts the nekoAdmin and the Admin123
     Then He see the administrative page Hola nekoAdmin


   @Escenariowronglogin
   Scenario: User enters wrong data
     Given The user enters to Neat administration page
     When He puts in the user juan and password 12345
     Then He see the warnning message Por favor validar la información. Nombre de usuario o contraseña incorrectos

   @Escenarioolvidocontrasena
   Scenario: User select the button forgotten the password
     Given The user enters to Neat administration page
     When He select the option Forgotten the password
     Then He see the administrative message Por favor comunicarse con el Super Administrador para suministrar una nueva contraseña





