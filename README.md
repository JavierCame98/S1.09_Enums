# S1.09_Enums

## Statement of the exercise

Exercici 1
Crea un enum anomenat Day amb els dies de la setmana. Fes una funció que rebi un Day i imprimeixi si és laborable o cap de setmana.

Exercici 2
Crea un enum Level amb valors LOW, MEDIUM i HIGH. Crea una classe Task amb una propietat Level i mostra com canvia el comportament en funció del nivell.

Exercici 3
Afegeix mètodes dins l’enum i comprova que poden tenir lògica (ex: getColor() per cada nivell de Level).

Exercici 4
Converteix un String a enum (amb valueOf) i gestiona errors si el valor no és vàlid.

## Features

Definition and usage of Java enums.
Conditional logic based on enum values.
Behavior encapsulation inside enums.
Interaction between enums and classes.
Safe conversion from String to enum using valueOf.
Error handling for invalid enum values.

## Technologies

Backend: Java 8+
Core Concepts: Enums, Control Flow, Exception Handling
Testing (optional): JUnit 5

## Installation & Execution

Clone the repository
Open the project
Import the project into your preferred IDE (IntelliJ IDEA, Eclipse, or VS Code).
Run the application
Locate the Main class.
Execute the main() method to see enum behavior in action.

## Diagrams & Technical Decisions

Enums are used instead of primitive constants to ensure type safety.
Business logic is placed inside enums when behavior depends on enum values.
switch statements are used only when necessary; logic is delegated to enums when possible.
Exception handling is applied to avoid runtime crashes during enum parsing.
Code is designed to be readable, maintainable, and robust.
