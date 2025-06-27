
# 📚 Fragmentos · by Libralia

Aplicación web desarrollada como parte del desafío final del curso  
**Java: creando tu primera API y conectándola al Front End**  
(Programa ONE - Oracle Next Education | Alura Latam)

---

### 🧩 Sobre el proyecto

El desafío original consistía en crear una app que mostrara **frases célebres de películas**.  
Decidí adaptar esta propuesta para alinearla con mi proyecto personal [**Libralia**](https://github.com/NattyPavez/Libralia-proyecto-personal), y transformarla en una app que muestra **frases célebres de libros**.

La idea fue mantener la estructura propuesta, pero cambiar el contenido y diseño para acercarlo a la experiencia de lectura y citas literarias que caracterizan mi línea de trabajo.

---

### 🚀 ¿Qué hace la app?

- Muestra una **frase célebre de un libro** acompañada de:
  - 📖 Título del libro
  - ✍️ Autor o personaje citado
  - 🖼️ Imagen de la portada
- Permite navegar entre frases aleatorias con un botón interactivo
- Estilo visual inspirado en el branding de **Libralia**

---

### ⚙️ Tecnologías utilizadas

#### 🧠 Backend
- Java 24 
- Spring Boot
- PostgreSQL
- API REST (`GET /frases`, `/frases/random`)
- CORS habilitado para conexión con el frontend

#### 🎨 Frontend
- HTML5
- CSS3
- JavaScript 
- Live Server para pruebas locales

---

### 📁 Estructura del repositorio

```
fragmentos-de-libros/
│
├── backend/     # Proyecto Spring Boot completo
├── frontend/    # Archivos HTML, CSS, JS
└── README.md
```

---

### 🧪 Cómo ejecutar localmente

Para correr este proyecto en tu entorno local, sigue estos pasos:

#### 1. Clona este repositorio

```bash
git clone https://github.com/NattyPavez/fragmentos-de-libros.git
```

#### 2. Ejecuta el backend

- Abre la carpeta `backend/` en tu IDE (como IntelliJ o VS Code).
- Asegúrate de tener una base de datos PostgreSQL corriendo localmente.
- Verifica que las variables de entorno estén configuradas correctamente.
- Ejecuta la clase `FrasesApplication.java`.

Esto iniciará el servidor en:  
```
http://localhost:8080
```

#### 3. Ejecuta el frontend

- Abre la carpeta `frontend/` y abre el archivo `index.html`.
- Puedes usar [Live Server](https://marketplace.visualstudio.com/items?itemName=ritwickdey.LiveServer) si usas VS Code para una experiencia interactiva.
- El frontend hace peticiones al backend para mostrar frases aleatorias con sus portadas, títulos y autores.

🎯 Asegúrate de que el backend esté corriendo antes de abrir el frontend para que los datos se carguen correctamente.

---
### 🛠️ Mejoras

Este proyecto me ha dado la idea de integrarlo de alguna forma a mi proyecto principal: **Libralia**, una app social para lectores.  
Visualizo como mejora futura que los usuarios puedan registrar las frases que más los inspiran mientras leen,  
guardarlas en su perfil personal, y contribuir a una gran base de datos colectiva de *Fragmentos literarios*.  

Esto no solo enriquecería la experiencia de lectura, sino que permitiría descubrir nuevas obras a través de las frases que han marcado a otros lectores.  
Una función emocional, social e inteligente para ampliar el universo de Libralia.

---

### 🎥 Video demo  
📹 [Ver Video](https://drive.google.com/file/d/1UBwOkHEJkt1IGLw4Ms3kpLIQvNToy99g/view?usp=sharing)

---

### 📬 Contacto  
📩 Correo: nattypavez@gmail.com  
🔗 [LinkedIn: Mi perfil profesional](https://www.linkedin.com/in/natalia-pavez-programacion/)  
🔗 [Repositorio GitHub: Libralia - proyecto personal](https://github.com/NattyPavez/Libralia-proyecto-personal)

