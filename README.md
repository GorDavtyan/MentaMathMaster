Mental Math Master is a simple console-based game that helps improve mental math skills. It generates random arithmetic expressions and prompts the player to solve them within a time limit of 60 seconds. After the time limit is reached, the game displays the player's total answers and correct answers.
The code is organized into several classes:

1. Player: Represents the player in the game. It keeps track of the total number of answers and the number of correct answers.

2. Question: Generates a random arithmetic expression and its correct answer. It uses the ArithmeticUtils class to generate numbers and arithmetic operators.

3. ArithmeticUtils: Contains utility methods for generating random numbers and arithmetic operators. It also calculates the result of the arithmetic expression.

4. Game: Manages the game flow. It initializes a player, sets a time limit of 60 seconds, and repeatedly generates and presents questions to the player until the time limit is reached.

5. Main: Entry point of the program. It creates an instance of the Game class and starts the game.
