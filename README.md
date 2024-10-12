# 🚗 Sistema de Gestión de Vehículos 🚲

## Descripción 📝
Este proyecto es un **Sistema de Gestión de Vehículos** implementado en Java utilizando **Programación Orientada a Objetos (POO)**. Permite la creación y manejo de un inventario de diferentes tipos de vehículos (autos y motocicletas). El sistema incluye funciones para agregar vehículos, mostrarlos, buscarlos por matrícula y calcular el costo total de mantenimiento para todos los vehículos registrados.

---

## 📋 Funcionalidades

- **Agregar vehículos**: Puedes agregar autos o motocicletas al inventario con información relevante como matrícula, marca, modelo y costo de mantenimiento.
- **Mostrar vehículos**: Muestra todos los vehículos registrados en el inventario.
- **Buscar por matrícula**: Encuentra un vehículo específico a partir de su matrícula.
- **Calcular costo total de mantenimiento**: Calcula el costo total de mantenimiento sumando los costos individuales de cada vehículo registrado.

---

## 📂 Estructura de Clases

### 1. **Vehículo** (Clase abstracta):
   - **Atributos comunes**: matrícula, marca, modelo, costo de mantenimiento.
   - **Método abstracto**: `calcularCostoMantenimiento()` que debe ser implementado por las subclases.

### 2. **Auto** (Hereda de Vehículo):
   - **Atributo adicional**: número de puertas.
   - **Costo de mantenimiento**: se calcula multiplicando el costo base por el número de puertas.

### 3. **Motocicleta** (Hereda de Vehículo):
   - **Atributo adicional**: cilindraje.
   - **Costo de mantenimiento**: se calcula multiplicando el costo base por el cilindraje dividido entre 100.

### 4. **Inventario**:
   - Maneja una lista de vehículos, permitiendo agregar, buscar y realizar cálculos sobre los vehículos.

---

## 🛠️ Tecnologías Utilizadas

- **Lenguaje**: ![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
- **Paradigma**: Programación Orientada a Objetos (POO)

---

## 🚀 Instrucciones de Uso

1. **Clona el repositorio**:
    ```bash
    git clone https://github.com/tu-usuario/sistema-gestion-vehiculos.git
    ```

2. **Compila y ejecuta el proyecto** en tu entorno de desarrollo preferido (NetBeans, Eclipse, IntelliJ, etc.).

3. Sigue el menú de opciones que te permitirá interactuar con el sistema de inventario de vehículos.

---

## 📞 Contacto

Si tienes alguna pregunta o sugerencia, no dudes en ponerte en contacto conmigo:

- **Nombre**: Robert Paternina
- **Email**: [paterninayolir@gmail.com](mailto:paterninayolir@gmail.com)
- **LinkedIn**: [linkedin.com/in/robert-paternina](https://www.linkedin.com/in/robert-paternina/)

---

### ¡Gracias por visitar este proyecto! 🎉
