# Count Positive & Negative integers
Following program takes the input from the console and counts the amount of positive and negative values, and gives the total amount followed by average amount of all entered integer values

- After entering to the main class directory, we run the command 'mvn clean install'

<p align="center">
  <img src="https://user-images.githubusercontent.com/24220136/228428916-4a06c85f-1bd4-4917-9b88-0734ccca6d0e.png" alt="Image">
</p>

- After building successful you get the following result on the terminal:

<p align="center">
  <img src="https://user-images.githubusercontent.com/24220136/228428996-8337b19d-9f5f-4c7d-9a1e-220f1f5daa1b.png" alt="Image">
</p>

- Then we can check the created `*.jar` file:

<p align="center">
  <img src="https://user-images.githubusercontent.com/24220136/228429057-64672fe0-4ac8-4560-9005-46c12243d559.png" alt="Image">
</p>

-----------------

### IMPORTANT

- When we try to run jar file usually we get the following error message in case of not setting the manifest file in `pom.xml` file in `maven` project:

```
$ java -jar TestMaven-1.0-SNAPSHOT.jar
no main manifest attribute, in TestMaven-1.0-SNAPSHOT.jar
```

- Solution is to update the `pom.xml` file to include the main class in the manifest file as following:

```
   <build>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-jar-plugin</artifactId>
                <version>3.2.0</version>
                <configuration>
                    <archive>
                        <manifest>
                            <mainClass>org.example.Main</mainClass>
                        </manifest>
                    </archive>
                </configuration>
            </plugin>
        </plugins>
    </build>
```

--------------------

## [Implementation](https://github.com/af4092/count-positive-negative-integer/blob/main/project-integer/src/main/java/com/project/integer/positiveANDnegative.java)

- `positiveANDnegative.java` program that calculates the number of positive and negative integers entered by the user, as well as their total and average.

   - The code is in a package named `com.project.integer`.

   - The `positiveANDnegative` class contains the main method, which is the entry point of the program.

   - The program uses a `Scanner` object named input to read user input from the console.

   - Four integer variables are declared and initialized: `NUMBER_OF_POSITIVES` is set to 0, `NUMBER_OF_NEGATIVES` is set to 0, total is set to 0, and `countOfNumbers` is set to 0.

   - The program prompts the user to enter an integer by displaying the message "Enter an integer, the input ends if it is 0: ".

   - The program reads the integer entered by the user using the `nextInt` method of the Scanner object and assigns it to the variable n.

   - If the value of n is 0, the program displays the message "No numbers are entered except 0" and returns, exiting the program.

   - If the value of n is not 0, the program enters a loop that continues until the user enters 0.

   - Inside the loop, the program checks whether the value of n is positive or negative. If it is positive, the value of `NUMBER_OF_POSITIVES` is incremented by 1. Otherwise, the value of `NUMBER_OF_NEGATIVES` is incremented by 1.

   - The program adds the value of n to the total variable to calculate the sum of all the entered numbers.

   - The value of `countOfNumbers` is incremented by 1 to keep track of the number of entered integers.

   - The program reads the next integer entered by the user using the `nextInt` method and assigns it to the variable n.

   - After the user enters 0 and the loop terminates, the program calculates the average of the entered numbers by dividing the total by `countOfNumbers` and storing the result in the average variable. The total is cast to a double to ensure the division is done in floating-point arithmetic.

   - The program displays the number of positive integers entered, the number of negative integers entered, the total sum of the integers, and the calculated average.
