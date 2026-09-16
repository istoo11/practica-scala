# Guía de Instalación y Ejecución de Jupyter Notebook

## 1. Verificación de Python
Primero, debemos comprobar si contamos con Python instalado ejecutando el siguiente comando en la terminal:

```bash
python --version
```

## 2. Instalación de Jupyter
Una vez comprobado que Python está instalado, procedemos a instalar el entorno con:

```bash
pip install notebook
```

![Imagen descarga Jupyter](../images/instalacion_notebook.png)

> **Nota sobre el límite de rutas en Windows:** Al intentar realizar instalaciones en rutas muy anidadas de la Tienda de Windows (`AppData\Local\Packages\...`), es común superar el límite clásico de Windows de 260 caracteres (*Windows Long Path support*). 
> 
> Para evitar este problema, utilizamos la alternativa más simple:
```bash
pip install notebook --no-warn-script-location
```

## 3. Ejecución
Para iniciar la aplicación y evitar errores de ruta, ejecútala directamente desde el módulo de Python:

```bash
python -m notebook
```

Una vez ejecutado, se abrirá automáticamente una pestaña en el navegador web con la interfaz de Jupyter. De no ser así, deberemos utilizar una de las dos rutas (URLs) que encontraremos en la terminal.

# Instalación del Kernel de Almond (Scala para Jupyter)

## 1. Verificación de Java
Lo primero que debemos hacer es comprobar si contamos con Java instalado ejecutando el siguiente comando en la terminal:

```bash
java --version
```

## 2. Descarga del CLI de Coursier
Una vez comprobado Java, descargamos Coursier mediante su script de instalación automática:

```bash
curl -Lo coursier https://git.io/coursier-cli
```

## 3. Configuración del Kernel en Jupyter
Para configurar el kernel de Scala en Jupyter, necesitamos el instalador de Coursier. 

1. Descarga el archivo ZIP desde la página oficial de lanzamientos:
   [Enlace de descarga de Coursier (Windows x86_64)](https://github.com/coursier/coursier/releases/download/v2.1.24/cs-x86_64-pc-win32.zip)
2. Extrae el contenido del archivo ZIP.
3. Ejecuta el archivo ejecutable que se encuentra dentro de la carpeta y sigue los pasos indicados en la terminal.

## 4. Instalación de Almond
Una vez completado el paso anterior, ejecutamos el siguiente comando para instalar el kernel de Almond:

```bash
cs launch almond --scala 2.12 -- --install
```

## 5. Verificación y Ejecución
Para comprobar que todo funciona correctamente, iniciamos JupyterLab ejecutando:

```bash
python -m jupyterlab
```

Esto abrirá automáticamente una pestaña en el navegador web con la interfaz de JupyterLab. De no ser así, copia y pega en tu navegador una de las rutas (URLs) que se muestran en la terminal.

# 6. Pruebas Iniciales

Por ultimo, para comprobar que el kernel de Scala (Almond) responde correctamente en JupyterLab, realizaremos unas pequeñas pruebas de código:
