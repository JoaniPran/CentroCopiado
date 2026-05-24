# CentroCopiado

Proyecto Java Maven que modela el cálculo de costos de impresión y envío para un centro de copiado.

## Descripción

Esta aplicación muestra una pequeña arquitectura de dominio para un servicio de copiado. Incluye:

- Cálculo de costo por hoja impresa.
- Cálculo de costo de envío según distancia.
- Descuentos por volumen en libros grandes.
- Clases de ejemplo: `Hoja`, `Libro`, `Costo`, `Cantidad`, `Distancia`.

## Estructura del proyecto

- `pom.xml` - configuración de Maven y dependencias.
- `src/main/java/` - código fuente principal.
- `src/test/java/` - pruebas de unidad con JUnit.

## Cómo compilar

Desde la raíz del proyecto:

```bash
mvn clean compile
```

## Cómo ejecutar

Después de compilar, puedes ejecutar la clase principal con:

```bash
java -cp target/classes org.example.Main
```

La clase `Main` actualmente imprime un mensaje de bienvenida y un ejemplo de bucle.

## Pruebas

Ejecuta los casos de uso con:

```bash
mvn test
```

Las pruebas verifican el cálculo de costos para impresión de hojas sueltas y libros con descuento.

## Dependencias

- Java 11
- JUnit 4.13.1
- JUnit Jupiter 5.8.1

## Notas

Este proyecto es una base para extender la lógica de negocio de un centro de copiado, con foco en el cálculo de costos y las reglas de envío.
