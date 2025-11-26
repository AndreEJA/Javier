# Sistema JAVIER - Gestión y Votación de Concurso

## Descripción del Proyecto

Este repositorio contiene el código para el **Sistema JAVIER**, una solución integral diseñada para gestionar y calificar eventos o concursos (como un reinado de belleza) en un entorno universitario (`ni.edu.uam`).

El sistema se compone de un panel de **Administración** para la gestión de datos, y una **Plataforma Web de Votación** para que los jueces califiquen y consulten resultados.

**Funcionalidades Clave:**
* Gestión de **Candidatos** y sus **Facultades** o representaciones.
* Control de **Eventos** o Fases del concurso.
* Definición de **Categorías** de calificación con un **Peso** (porcentaje) para el cálculo del puntaje final.
* Mecanismo de **Votaciones** por **Jueces** (un voto único por candidata), con calificaciones detalladas por categoría (valor 0-100).

## ⚙️ Arquitectura y Tecnologías

El proyecto se divide en tres módulos con distintas responsabilidades:

| Módulo | Descripción | Tecnologías Clave | Base de Datos |
| :--- | :--- | :--- | :--- |
| **JAVIER-ADMIN** | Panel de administración para el manejo de entidades base. | **Java 1.8** / **OpenXava 7.0** / Maven | **PostgreSQL** |
| **core** | API backend para la lógica de votación y la persistencia de los votos (Jueces, Categorías, Votos). | **Python** / **Django** | (Se integra con la DB) |
| **JAVIER-WEBSITE** | Interfaz de usuario (frontend) para que los jueces realicen votaciones y visualicen resultados. | **SvelteKit** / **TypeScript** / **Tailwind CSS** | - |

## Requisitos Previos

Asegúrate de tener instalados los siguientes componentes antes de comenzar:

* **Java Development Kit (JDK) 1.8** o superior (11 o 17 son compatibles).
* **Apache Maven**.
* **Python 3.x** y **pip**.
* **Node.js** y **npm** (o Yarn/pnpm).
* Servidor de base de datos **PostgreSQL**.
* Un servidor de aplicaciones Java (ej. Apache Tomcat) para el despliegue del `.war` de `JAVIER-ADMIN`.

## Guía de Instalación y Configuración

### 1. Configuración de la Base de Datos (PostgreSQL)

1.  Crea la base de datos para el proyecto.
2.  Asegúrate de configurar los detalles de conexión JDBC para **PostgreSQL** en el archivo `JAVIER-ADMIN/src/main/resources/META-INF/persistence.xml` antes de la compilación del módulo Admin.

### 2. Módulo `core` (API de Votación en Django)

Este módulo maneja la base de datos de jueces, categorías y votos.

```bash
# Navegar al directorio del backend de Django
cd core

# Instalar dependencias
# Se recomienda crear y activar un entorno virtual.
pip install django djangorestframework # (y otras dependencias si existen en requirements.txt)

# Realizar las migraciones
python manage.py makemigrations core
python manage.py migrate

# Crear un superusuario (opcional)
python manage.py createsuperuser

# Ejecutar el servidor de la API (por defecto en [http://127.0.0.1:8000](http://127.0.0.1:8000))
python manage.py runserver
