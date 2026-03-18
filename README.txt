Descripción del sistema

Este sistema permite:

Iniciar sesión como empleado

Gestionar usuarios

Visualizar vehículos

Controlar accesos según el cargo

Preparar la base para reservas de vehículos

🏗️ Arquitectura del sistema

El sistema está basado en programación orientada a objetos con la siguiente jerarquía:

Persona (ProyectoUno)
│
├── Empleado
│
└── Usuario

Carro
Login
Sesion
🧠 Clases principales
🔹 Persona (ProyectoUno)

Clase base del sistema.

Atributos:

Cédula

Nombre

Correo

Ruta de foto

🔹 Empleado

Hereda de Persona.

Atributos adicionales:

Cargo

Contraseña

Funciones:

Iniciar sesión

Validar credenciales

Definir permisos

🔹 Usuario

Hereda de Persona.

Atributos adicionales:

País

Ciudad

Dirección

Teléfono

Documentos

Funciones:

Registro de clientes

🔹 Carro

Representa los vehículos.

Atributos:

Marca

Modelo

Color

Categoría

Tipo de sistema

Placa

🔹 Login

Encargado de:

Leer archivos .txt

Cargar listas de:

Empleados

Usuarios

Vehículos

🔹 Sesion

Controla el usuario activo.

Funciones:

Guardar empleado logueado

Obtener datos del empleado actual

🔄 Flujo del sistema
Inicio
   │
   ▼
Login de empleado
   │
   ▼
Validación de credenciales
   │
   ▼
Acceso según rol
🔐 Roles del sistema
👨‍💻 Administrador / Ingeniero

Puede:

Registrar empleados

Registrar usuarios

Ver vehículos

👨‍💼 Asesor comercial

Puede:

Ver vehículos

Registrar usuarios

📋 Menús del sistema
🔹 Menú principal
1. Ingreso de empleado
2. Salir
🔹 Menú administrador
1. Registrar empleado
2. Registrar usuario
3. Ver vehículos
4. Cerrar sesión
🔹 Menú asesor
1. Ver vehículos
2. Registrar usuario
3. Cerrar sesión
🚗 Gestión de vehículos

El sistema permite:

Mostrar todos los vehículos

Ver información detallada:

Marca

Modelo

Color

Categoría

Tipo de sistema

📂 Almacenamiento actual

El sistema utiliza archivos .txt:

Empleados.txt

Usuarios.txt

Vehiculos.txt

🚀 Mejoras futuras

El sistema está preparado para evolucionar a:

🔥 1. Sistema de reservas

Nueva clase:

Reserva
- Usuario
- Vehiculo
- FechaInicio
- FechaFin
- MetodoPago
- Precio
🔥 2. Disponibilidad de vehículos

Validación por fechas

Control de vehículos ocupados

🔥 3. Cotización automática
Precio = días * valor por día
🔥 4. Base de datos

Migración a SQL:

PERSONA
EMPLEADOS
USUARIOS
VEHICULOS
RESERVAS
🔥 5. Interfaz gráfica

Posible implementación en:

Windows Forms

Aplicación web

🧩 Estado actual del proyecto

✔ Login funcional
✔ Control de roles
✔ Lectura de archivos
✔ Menús en consola
✔ Estructura orientada a objeto