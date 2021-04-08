Es la base de un programa para la gestión de personal, faltaría la implementación del menú/interfaz.

Explicación: 

En la secretaría del instituto necesitan una aplicación para gestionar su personal. De cada empleado necesitan guardar su información personal básica (nombre, edad, género, horario, código de identificación y contraseña) y dependiendo de su perfil profesional información específica de
éste del siguiente modo:

    Si el empleado es un profesor debe almacenarse su departamento, módulo y curso que imparte.
    Si además es personal de dirección, guardará su ubicación en el centro y competencias (secretaría, jefatura de estudios o dirección).
    Si por el contrario es personal de administración guardará su ubicación en el centro, teléfono y área de responsabilidad (gestión del alumnado o profesorado).

Cada empleado tendrá un código de identificación único que será utilizado para su acceso a la intranet del centro y para consultar su información en base de datos.
Además, la contraseña que se asigne deberá tener un mínimo de 10 caracteres siendo dos de ellos mayúsculas y tres, numéricos.
Para cada empleado se podrá grabar y mostrar tanto la información básica como la correspondiente a su perfil profesional.
Genera una clase Principal que sirva de interfaz de la aplicación (GUI) y las clases java que permitan almacenar y procesar esta información haciendo uso de la herencia y el control de excepciones donde son necesarias.
