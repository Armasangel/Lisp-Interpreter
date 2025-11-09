Un intérprete completo del lenguaje LISP implementado en Java con arquitectura orientada a objetos. Desarrollado como proyecto académico que demuestra conceptos avanzados de compiladores y programación funcional.

Características Principales
Funcionalidades Implementadas
Operadores Aritméticos: +, -, *, /

-Operadores de Comparación: <, >, equal
-Manejo de Variables: setq para asignación
-Estructuras de Control: if, cond (condicionales)
-Funciones Definidas por Usuario: defun
-Manipulación de Listas: list, quote (')
-Funciones Especiales: atom, print
-Entornos Anidados: Scope léxico con herencia

Arquitectura del Proyecto
text
LispInterpreter/
├── Expression.java          # Interfaz principal
├── LispInterpreter.java     # Punto de entrada
├── LispParser.java          # Tokenizer y Parser
├── Environment.java         # Manejo de variables/funciones
├── OperatorStrategy.java    # Patrón Strategy para operadores
├── ListExpression.java      # Listas LISP
├── SymbolExpression.java    # Símbolos y variables
├── LiteralExpression.java   # Valores literales
└── Function.java           # Definición de funciones
Comenzando

Prerrequisitos
Java JDK 17 o superior

Cualquier terminal (CMD, PowerShell, Bash)

Compilación y Ejecución
bash
# 1. Compilar todos los archivos Java
javac -d . *.java

# 2. Ejecutar el intérprete
java com.example.LispInterpreter
-Uso del Intérprete
lisp
LISP> (+ 2 3)
Resultado: 5

LISP> (* 4 5 2) 
Resultado: 40

LISP> (setq x 10)
Resultado: 10

LISP> (+ x 5)
Resultado: 15

LISP> (if (> 5 3) "verdadero" "falso")
Resultado: verdadero

LISP> (defun factorial (n) 
        (if (equal n 0) 1 (* n (factorial (- n 1)))))
Resultado: Función definida: factorial

LISP> (factorial 5)
Resultado: 120

#Ejemplos de Código LISP
#Operaciones Básicas
lisp
; Aritmética
(+ 1 2 3 4)          ; → 10
(- 10 5 2)           ; → 3
(* 3 4 2)            ; → 24
(/ 20 5 2)           ; → 2

; Comparación
(< 5 10)             ; → true
(> 10 5)             ; → true  
(equal 5 5)          ; → true

Control de Flujo
lisp
; Condicionales
(if (< 3 5) "menor" "mayor")    ; → "menor"

; Múltiples condiciones
(cond 
  ((< x 0) "negativo")
  ((equal x 0) "cero") 
  (true "positivo"))
  
Manejo de Variables y Funciones
lisp
; Variables
(setq pi 3.1416)
(setq nombre "Juan")

; Funciones personalizadas
(defun cuadrado (x) (* x x))
(defun es-par (n) (equal (% n 2) 0))

Características Técnicas
Patrones de Diseño Implementados
Strategy Pattern: Para operadores (OperatorStrategy)

Interpreter Pattern: Para evaluación de expresiones

Composite Pattern: Estructura de árbol de expresiones

🔧 Manejo de Entornos
Entornos anidados con herencia

Separación entre variables y funciones

Scope léxico para funciones definidas

Limitaciones Conocidas
-Solo soporta expresiones en una línea
-Tipado básico (principalmente enteros y strings)
-No incluye todas las funciones built-in de LISP
-Manejo de errores básico

¿Por Qué Este Proyecto es Impresionante?
Este no es solo "otro intérprete" - demuestra:

Conceptos Avanzados
-Arquitectura de compiladores: Lexer → Parser → Evaluator
-Programación funcional en lenguaje OOP
-Patrones de diseño empresariales aplicados
-Manejo de AST (Abstract Syntax Tree)

Evolución del Proyecto
-De concepto académico a implementación real
-Arquitectura escalable y mantenible
-Código production-ready con manejo de errores

-Próximas Mejoras
-Soporte para múltiples líneas
-Más funciones built-in de LISP
-Sistema de tipos mejorado
-Interfaz gráfica web
-Optimización de performance
