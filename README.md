To run locally from IntelliJ IDEA:

1. Clone the repository to your local machine.
2. Open IntelliJ IDEA and select "Open" from the welcome screen.
3. Navigate to the cloned repository folder and select open as project by selecting the pom.xml file.
4. Wait for IntelliJ IDEA to index the project and download any necessary dependencies.
5. Using the Maven tool window (usually located on the right side), run a Maven build by selecting "Lifecycle" -> "clean" and then "install".
6. Locate the main class (Named "DemoApplication.java"). Path: `src/main/java/com/example/demo/DemoApplication.java`.
7. Right-click on the main class file and select "Run 'DemoApplication.main()'".
8. The application should now run locally, and you can view the output in the Run window at the bottom of IntelliJ IDEA.
9. Navigate to `http://localhost:8080` in your web browser to access the running application.

To run locally using the jar file:

1. Ensure you have Java installed on your machine. You can check this by running `java -version` in your terminal or command prompt.
2. Download the jar file from the releases section of the repository or build it yourself using Maven
3. Open your terminal or command prompt.
4. Navigate to the directory where the jar file is located using the `cd` command.
5. Run the jar file using the command: `java -jar dataentrydemo-1.0.0.jar`.
6. The application should now start running locally.
7. Open your web browser and navigate to `http://localhost:8080` to access the running application.

This project is built using Java 21 and Maven 3.
Make sure you have the appropriate versions installed to avoid compatibility issues.
