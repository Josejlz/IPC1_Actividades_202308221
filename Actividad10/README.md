Juego de consola: Adivina el país

Instrucciones (PowerShell / Windows):

1. Sitúate en la carpeta del proyecto (donde están `src` y `data.csv`).

2. Compilar:

```powershell
javac -d bin -sourcepath src src\*.java
```

3. Ejecutar:

```powershell
java -cp bin Main
```

El programa leerá `data.csv`, mostrará una pista (la primera letra del país) y pedirá una respuesta por consola.

Notas:
- Si no encuentra `data.csv`, mostrará un error con la ruta actual.
- La comparación ignora tildes y diferencia mayúsculas/minúsculas.
