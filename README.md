# Sprint 1 Task S1.03

## Repository with level-1 and level-2 exercises from the Java programming course, developed using IntelliJ IDEA and Maven.

### 📂 Repository Contents

| Level   | Exercise | Package                    | Principal Classes              | Description                                                                             | 
|---------|----------|----------------------------|--------------------------------|-----------------------------------------------------------------------------------------|
| Level 1 | 1        | `ejercicio1.months`        | `Month`, `MonthMain`           | Duplicates in ArrayList and HashSet Practice add and modify elements.                   |
| Level 1 | 2        | `ejercicio2.lists`         | `ListMain`                     | Listerator use is a List add elements in a List and add inverse mode with Listerator.   |
| Level 1 | 3        | `ejercicio3.capitalgame`   | `CapitalGameMain`              | Read and Write Files, using `HashMap`.                                                  |
| Level 2 | 1        | `ejercicio1.restaurants1`  | `Restaurant`, `RestaurantMain` | Usage of `HashSet` without exactly duplicates new methods `.equals()` and `hashCode()`. |
| Level 2 | 2        | `ejercicio2.restaurants2`  | `Restaurant`, `RestaurantMain` | Multiple Sort of ArrayList, because HashMap can't Sort.                                 |

## ⚙️ Requirements

- Java JDK 11 o superior
- Maven
- IntelliJ IDEA (optional, but recommended)

---

## 💻 Installation and Execution

1. Clone the repository:

````bash
git clone https://github.com/erictc95/TascaS1.03.git
````

2. Open the project in IntelliJ IDEA or compile with Maven:

````bash
cd TascaS1.03
mvn compile
````

3. Run a specific exercise with Maven:

````bash
mvn exec:java -Dexec.mainClass="package.Main"
````

4. Replace package.Main with the main class of each exercise:

Level-1 / Exercise 1: ejercicio1.months

Level-1 / Exercise 2: ejercicio2.lists

Level-1 / Exercise 3: ejercicio3.capitalgame

Level-2 / Exercise 1: ejercicio1.restaurants1

Level-2 / Exercise 2: ejercicio2.restaurants2


You can also open each Main.java class in IntelliJ and run it directly from the IDE.

## 📝 Usage

Each level folder contains independent exercises.
The exercises demonstrate Java concepts such as different Collections like `HashSet`, `HashMap`, `ArrayList` and `Comparable` vs `Comparator`.

## 🤝 Contributions

If you want to improve the exercises or add examples:

Fork the repository

Create a branch for your changes: git checkout -b my-branch

Commit your changes: git commit -m "My contribution"

Push your branch: git push origin my-branch

Open a Pull Request

## 📜 License

MIT License

## 👤 Author

Eric Tarres Cabrisas - GitHub --> erictc95
