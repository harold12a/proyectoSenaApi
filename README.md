
# API

Este proyecto consiste en una API desarrollada en Java utilizando Spring Boot. La API permite gestionar tareas almacenadas en una base de datos MySQL y se puede interactuar con ella a través de Postman.

1-  Codificación en Spring Boot:

El proyecto está codificado en Spring Boot, dividiendo cada módulo específico para el backend e implementando la lógica de negocio relacionada con la gestión de tareas.

2- Control de Versiones:

Se utiliza GIT como sistema de control de versiones para gestionar y rastrear el código fuente del backend.

3. Gestión de Dependencias:

Se han determinado las siguientes librerías necesarias para el backend:
-	Spring Boot Starter Data JDBC
-	Spring Boot Starter Data JPA
-	Spring Boot Starter Web
-	MySQL Connector Java
-	Lombok

4. Frameworks en el Backend:

Se utiliza Spring Boot como framework principal para el desarrollo del backend.

5. Componentes Reutilizables:

En el proceso de desarrollo del backend, se ha puesto un énfasis significativo en la creación de componentes reutilizables, con especial atención en aquellos relacionados con la gestión de tareas y asignación. Estos componentes no solo mejoran la modularidad del código, sino que también facilitan el mantenimiento y la escalabilidad del sistema.

6. Buenas Prácticas de Codificación:

En el desarrollo del backend de este proyecto, se han aplicado rigurosamente diversas buenas prácticas de codificación con el objetivo de mejorar la legibilidad, mantenibilidad y escalabilidad del código. Estas prácticas se basan en estándares y convenciones ampliamente aceptadas en la comunidad de desarrollo de software.

7. Patrones de Diseño:

En el desarrollo del backend de este proyecto, se han aplicado cuidadosamente varios patrones de diseño para mejorar la estructura, modularidad y mantenibilidad del código. Estos patrones ofrecen soluciones probadas para problemas comunes de diseño de software y promueven buenas prácticas de desarrollo. Entre los patrones aplicados, se destaca especialmente el uso del patrón Modelo-Vista-Controlador (MVC), adaptado a la arquitectura del software en el backend.

8. Pruebas Unitarias:

En el desarrollo del backend de este proyecto, se ha dado una gran importancia a la realización de pruebas unitarias exhaustivas para cada módulo, garantizando así la funcionalidad y la integridad de las operaciones. Las pruebas unitarias son fundamentales para validar el comportamiento individual de cada componente del sistema y detectar posibles errores antes de la implementación en entornos de producción. Además, se pueden realizar pruebas con Postman para verificar la funcionalidad de la API de manera más integral.
 
## API Reference

#### Get all items

```http
  GET /api/local/findAll
  GET /api/Product/findAll
```


9. Configuración del Servidor:

Para ejecutar el proyecto correctamente, es fundamental contar con la configuración adecuada en el entorno de desarrollo y producción. 
A continuación, se detallan los requisitos y la configuración necesaria para ejecutar el servidor del backend:

-	 Requisitos del Sistema

•	Java Development Kit (JDK): Es necesario tener instalado el JDK en el sistema. Se recomienda utilizar JDK 17 o una versión compatible.

•	Entorno de Desarrollo Integrado (IDE): Se ha utilizado IntelliJ IDEA como IDE para el desarrollo del proyecto. Se recomienda utilizar este IDE o cualquier otro compatible con Java y Spring Boot.

•	XAMPP o Similar para MySQL: Para ejecutar la base de datos MySQL, se requiere un servidor de base de datos como XAMPP. Asegúrate de tener MySQL instalado y en ejecución en tu sistema.

•	Postman: Se utiliza Postman para probar y verificar la funcionalidad de la API. Asegúrate de tener Postman instalado en tu sistema.

-	Configuración del Proyecto

•	Clonar el Repositorio: Clona el repositorio del proyecto desde el sistema de control de versiones utilizando Git.

•	Importar el Proyecto en el IDE: Abre IntelliJ IDEA y importa el proyecto clonado como un proyecto de Maven.

•	Configurar la Base de Datos: Configura la conexión a la base de datos MySQL en el archivo application.properties. Asegúrate de proporcionar las credenciales correctas y el nombre de la base de datos que se utilizará.


10. Documentación del Ambiente:

Se detalla la documentación específica del ambiente, incluyendo configuraciones y requisitos necesarios para el correcto funcionamiento del backend:

-	Requisitos del Sistema

•	Java Development Kit (JDK): Se requiere tener instalado JDK 17 o una versión compatible para compilar y ejecutar el proyecto.

•	IntelliJ IDEA: Se recomienda utilizar IntelliJ IDEA como IDE para el desarrollo del proyecto. Se puede obtener desde JetBrains.

•	XAMPP o Similar: Se necesita un servidor de base de datos MySQL como XAMPP para ejecutar la base de datos localmente. Se puede descargar desde XAMPP.

•	Postman: Se utiliza Postman para probar y verificar la funcionalidad de la API. Se puede descargar desde Postman.

-	Configuración del Proyecto

•	Clonar el Repositorio: Clona el repositorio del proyecto desde el sistema de control de versiones utilizando Git.

•	Importar el Proyecto en IntelliJ IDEA: Abre IntelliJ IDEA y selecciona la opción para importar un proyecto Maven. Selecciona el directorio del proyecto clonado.

•	Configurar la Base de Datos: Abre XAMPP y asegúrate de que el servicio MySQL esté en ejecución. Luego, configura la conexión a la base de datos en el archivo application.properties del proyecto.

-	Ejecución del Proyecto

 Compilar y Ejecutar el Proyecto: Utiliza IntelliJ IDEA para compilar y ejecutar el proyecto. Puedes ejecutar la aplicación desde el IDE o mediante Maven en la línea de comandos.

-	Verificación de la Funcionalidad

Probar la API con Postman: Abre Postman y utiliza las colecciones de solicitudes predefinidas para probar la funcionalidad de la API. Realiza operaciones CRUD como crear, leer, actualizar y eliminar datos en la base de datos a través de la API.

-	Monitoreo y Depuración

Monitorear el Servidor: Utiliza las herramientas de monitoreo proporcionadas por IntelliJ IDEA o sistemas externos para supervisar el rendimiento y el estado del servidor en tiempo real.
Depurar el Código: Utiliza las capacidades de depuración de IntelliJ IDEA para identificar y corregir posibles errores o problemas en el código del backend.
