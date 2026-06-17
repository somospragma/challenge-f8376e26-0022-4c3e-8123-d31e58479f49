# Implementar pruebas unitarias para un servicio de gestión de usuarios

El sistema de gestión de usuarios necesita asegurar que cada funcionalidad se comporta como se espera. Las pruebas unitarias son cruciales para identificar problemas temprano en el desarrollo. El objetivo es crear pruebas unitarias que validen el comportamiento del servicio de gestión de usuarios.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | pruebas unitarias |
| **Nivel** | junior-l1 |
| **Tipo** | practical |
| **Tiempo estimado** | 2-3 horas |

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Obtener el proyecto base funcional enviando el Código Base a un asistente de IA, que lo analizará, corregirá errores y generará un ZIP listo para usar.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Asegúrate de tener instalado para ejecutar el proyecto: Un IDE o editor de código.
- Copia todo el contenido del campo **Código Base** de este reto — incluyendo el texto de instrucciones que aparece al inicio.
- Abre un asistente de IA (Claude en claude.ai, ChatGPT o Gemini — se recomienda Claude), pega el contenido copiado en el chat y envíalo.
- El asistente analizará los archivos, corregirá errores y generará un archivo ZIP descargable. Descárgalo y extráelo en la carpeta donde quieras trabajar.
- Verifica que el proyecto arranca sin errores.

**Entregable:** El proyecto compila/arranca sin errores.

<details>
<summary>Pistas de conocimiento</summary>

- Copia el Código Base completo incluyendo el texto de instrucciones al inicio — esas instrucciones le indican al asistente exactamente qué hacer con los archivos.
- Si el asistente no genera el ZIP automáticamente al terminar el análisis, escríbele: "genera el ZIP ahora".
- Si el proyecto tiene errores al arrancar, comparte el mensaje de error con el mismo asistente para que lo corrija.

</details>

### Fase 1: Definir el alcance de las pruebas

**Objetivo:** Identificar las funcionalidades clave del servicio de gestión de usuarios que deben ser probadas.

**Tiempo estimado:** 30 minutos

**Instrucciones:**

- Enumera las funcionalidades del servicio de gestión de usuarios que consideras críticas para probar.
- Piensa en los posibles escenarios de uso y edge cases que podrían afectar el comportamiento del servicio.

**Entregable:** Lista de funcionalidades y escenarios a probar

<details>
<summary>Pistas de conocimiento</summary>

- Considera funcionalidades como creación, actualización y eliminación de usuarios.
- Piensa en edge cases como usuarios con nombres duplicados o campos vacíos.

</details>

### Fase 2: Escribir pruebas unitarias

**Objetivo:** Crear pruebas unitarias para las funcionalidades identificadas en la fase anterior.

**Tiempo estimado:** 1 hora

**Instrucciones:**

- Escribe pruebas unitarias para cada funcionalidad identificada en la fase 1.
- Utiliza técnicas de mock para aislar las dependencias externas del servicio.

**Entregable:** Conjunto de pruebas unitarias funcionales

<details>
<summary>Pistas de conocimiento</summary>

- Piensa en cómo simular las dependencias externas para que tus pruebas sean efectivas.
- Considera diferentes escenarios de éxito y fallo para cada funcionalidad.

</details>

### Fase 3: Ejecutar y revisar las pruebas

**Objetivo:** Ejecutar las pruebas unitarias y revisar los resultados para identificar y corregir errores.

**Tiempo estimado:** 30 minutos

**Instrucciones:**

- Ejecuta las pruebas unitarias creadas en la fase 2.
- Revisa los resultados y corrige cualquier error o fallo identificado.

**Entregable:** Pruebas unitarias ejecutadas y corregidas

<details>
<summary>Pistas de conocimiento</summary>

- Verifica que todas las funcionalidades identificadas en la fase 1 tengan pruebas unitarias asociadas.
- Asegúrate de que los edge cases considerados en la fase 1 estén cubiertos por las pruebas.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué son las pruebas unitarias y por qué son importantes en el desarrollo de software?
- **paraQueSirve**: ¿Para qué sirven las pruebas unitarias en el contexto del servicio de gestión de usuarios?
- **comoSeUsa**: ¿Cómo se utilizan las técnicas de mock en las pruebas unitarias para aislar las dependencias externas?
- **erroresComunes**: ¿Qué errores comunes pueden ocurrir al escribir pruebas unitarias y cómo se pueden evitar?
- **queDecisionesImplica**: ¿Qué decisiones debes tomar al escribir pruebas unitarias para el servicio de gestión de usuarios?

## Criterios de Evaluacion

- Identificar funcionalidades críticas del servicio de gestión de usuarios para probar.
- Escribir pruebas unitarias para las funcionalidades identificadas.
- Utilizar técnicas de mock para aislar dependencias externas.
- Ejecutar y revisar las pruebas unitarias para identificar y corregir errores.

---

*Reto generado automaticamente por Challenge Generator - Pragma*
