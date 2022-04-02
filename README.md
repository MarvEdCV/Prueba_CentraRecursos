
PRUEBA PRACTICA CONTROL DE VACUNACION COVID-19
=================
# EJECUCION DE PROYECTO (FRONT-END)
### Instalar Framework Angular
Como el Framework es bastante amplio no es una unica instalacion ya que tenemos que instalar 
- NPM
- NODE.JS
- ANGULAR CLI


Por lo tanto adjunto una página donde se encuentra a detalle la instalación -> https://openwebinars.net/blog/instalacion-angular-8-requisitos/
Al momento de tener instalado Angular entrando a la raíz de el proyecto de angular que es ControlCOVID, al ejecutar el comando ***ng serve***
![Image text](https://github.com/MarvEdCV/Prueba_CentraRecursos/blob/main/Img/successNG.jpg)
Si el comando retorna un mensaje como este, el proyecto ya esta corriendo en el servidor local en el puerto 4200 -> http://localhost:4200/
#### Instalar Swet Alert
La aplicación web utiliza una librería para alertas que la hacen más estética, en caso de tener problemas con la librería en la raíz del proyecto ejecutar el comando -> ***cmp install*** ***--save*** ***swetalert2***

### Instalar MS SQL SERVER
De igual manera que Angular este DBMS lleva una instalacion que toma un poco de tiempo por lo cual les comparto la guia de instalacion de microsoft -> https://docs.microsoft.com/en-us/sql/database-engine/install-windows/install-sql-server?view=sql-server-ver15
Cuando ya tengamos MS SQL SERVER activado lo unico que nos quedara es crear una base de datos con el nombre ***EmpleadosCovid*** Después de esto la estructura del marco de trabajo de Spring nos creará automaticamente las tablas necesarias al igual que los atributos de la misma. Pero para esto hay que configurar nuestra conexión con nuestro servidor local y el puerto el cual habilita nuestro MS SQL SERVER.
![Image text](https://github.com/MarvEdCV/Prueba_CentraRecursos/blob/main/Img/CONFIGDB.jpg)

### Instalar Java, Maven y un IDE para poder levantar aplicaciones Maven 
Para este proyecto se utilizó el IDE Apache Netbeans 13, en el cual al instalarle el plugin de Spring y abrir el proyecto no debería de haber ningún tipo de error. Al ejecutar el proyecto en el IDE utilizado debería retornar una salida en consola como esta.
![Image text](https://github.com/MarvEdCV/Prueba_CentraRecursos/blob/main/Img/successSP.jpg)


Cuando ya tengas los dos proyectos funcionando significa que la API en Spring Java ya esta funcionando para comunicarse con la Base de datos de MS SQL SERVER y Angular ya esta preparado para solicitar todos los consumos creados en la API.
# DESARROLLADOR
***Marvin Eduardo Catalán Véliz*** 
