# count-positive-negative-integer
Following program takes the input from the console and counts the amount of positive and negative values, and gives the total amount followed by average amount of all entered integer values

After entering to the main class directory, we run the command 'mvn clean install'

![image](https://user-images.githubusercontent.com/24220136/228428916-4a06c85f-1bd4-4917-9b88-0734ccca6d0e.png)

After building successful you get the following result on the terminal:

![image](https://user-images.githubusercontent.com/24220136/228428996-8337b19d-9f5f-4c7d-9a1e-220f1f5daa1b.png)

Then we can check the created *.jar file:

![image](https://user-images.githubusercontent.com/24220136/228429057-64672fe0-4ac8-4560-9005-46c12243d559.png)

### IMPORTANT

When we try to run jar file usually we get the following error message in case of not setting the manifest file in `pom.xml` file in `maven` project:

```
$ java -jar TestMaven-1.0-SNAPSHOT.jar
no main manifest attribute, in TestMaven-1.0-SNAPSHOT.jar
```

Solution is to update the `pom.xml` file to include the main class in the manifest file as following:

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
