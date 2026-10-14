# Java lab: Maven, JUnit and Jenkins

This project covers all 15 assessment questions. Every question has an independent Java program with a main method and a matching JUnit 4 test class. One Jenkins pipeline builds the project, tests all questions, runs the selected program with sample values, and saves the JAR.

## Start here

1. Open the Java file and test file for your assigned question in the table below.
2. Run Maven locally: `mvn clean verify`.
3. Push the project to GitHub.
4. Configure Maven in Jenkins with the exact tool name `M3`.
5. Create a Pipeline job and paste the contents of [Jenkinsfile](Jenkinsfile).
6. Run the job once. Then use **Build with Parameters** to select your question.
7. Show your teacher the Java code, its JUnit test, the console output and the Jenkins test results.

## Pick your question

| No. | Question | Java program | JUnit test | Default console output |
| --- | --- | --- | --- | --- |
| 1 | Add two numbers | [Q01Addition.java](src/main/java/com/example/Q01Addition.java) | [Q01AdditionTest.java](src/test/java/com/example/Q01AdditionTest.java) | `Sum = 5` |
| 2 | Check even or odd | [Q02EvenOdd.java](src/main/java/com/example/Q02EvenOdd.java) | [Q02EvenOddTest.java](src/test/java/com/example/Q02EvenOddTest.java) | `7 is odd` |
| 3 | Largest of three numbers | [Q03LargestOfThree.java](src/main/java/com/example/Q03LargestOfThree.java) | [Q03LargestOfThreeTest.java](src/test/java/com/example/Q03LargestOfThreeTest.java) | `Largest = 30` |
| 4 | Factorial of a number | [Q04Factorial.java](src/main/java/com/example/Q04Factorial.java) | [Q04FactorialTest.java](src/test/java/com/example/Q04FactorialTest.java) | `5! = 120` |
| 5 | Check prime number | [Q05Prime.java](src/main/java/com/example/Q05Prime.java) | [Q05PrimeTest.java](src/test/java/com/example/Q05PrimeTest.java) | `17 is prime` |
| 6 | Generate Fibonacci series | [Q06Fibonacci.java](src/main/java/com/example/Q06Fibonacci.java) | [Q06FibonacciTest.java](src/test/java/com/example/Q06FibonacciTest.java) | `Fibonacci = [0, 1, 1, 2, 3, 5, 8]` |
| 7 | Reverse a number | [Q07ReverseNumber.java](src/main/java/com/example/Q07ReverseNumber.java) | [Q07ReverseNumberTest.java](src/test/java/com/example/Q07ReverseNumberTest.java) | `Reversed = 4321` |
| 8 | Check number palindrome | [Q08NumberPalindrome.java](src/main/java/com/example/Q08NumberPalindrome.java) | [Q08NumberPalindromeTest.java](src/test/java/com/example/Q08NumberPalindromeTest.java) | `121 is a palindrome` |
| 9 | Calculate simple interest | [Q09SimpleInterest.java](src/main/java/com/example/Q09SimpleInterest.java) | [Q09SimpleInterestTest.java](src/test/java/com/example/Q09SimpleInterestTest.java) | `Simple interest = 100.0` |
| 10 | Calculate student grade | [Q10StudentGrade.java](src/main/java/com/example/Q10StudentGrade.java) | [Q10StudentGradeTest.java](src/test/java/com/example/Q10StudentGradeTest.java) | `Grade = B` |
| 11 | Sum array elements | [Q11ArraySum.java](src/main/java/com/example/Q11ArraySum.java) | [Q11ArraySumTest.java](src/test/java/com/example/Q11ArraySumTest.java) | `Array sum = 15` |
| 12 | Maximum array element | [Q12ArrayMaximum.java](src/main/java/com/example/Q12ArrayMaximum.java) | [Q12ArrayMaximumTest.java](src/test/java/com/example/Q12ArrayMaximumTest.java) | `Maximum = 40` |
| 13 | Count vowels in a string | [Q13VowelCount.java](src/main/java/com/example/Q13VowelCount.java) | [Q13VowelCountTest.java](src/test/java/com/example/Q13VowelCountTest.java) | `Vowels = 3` |
| 14 | Reverse a string | [Q14ReverseString.java](src/main/java/com/example/Q14ReverseString.java) | [Q14ReverseStringTest.java](src/test/java/com/example/Q14ReverseStringTest.java) | `Reversed = olleh` |
| 15 | Check string palindrome | [Q15StringPalindrome.java](src/main/java/com/example/Q15StringPalindrome.java) | [Q15StringPalindromeTest.java](src/test/java/com/example/Q15StringPalindromeTest.java) | `madam is a palindrome` |

## Folder structure

```text
agile/
  Jenkinsfile
  pom.xml
  README.md
  .gitignore
  src/main/java/com/example/Q01Addition.java
  src/main/java/com/example/... (15 programs)
  src/test/java/com/example/Q01AdditionTest.java
  src/test/java/com/example/... (15 test classes)
```

Keep these Maven directory names exactly as shown. The package declaration in every source and test file is `package com.example;`.

## 1. Java and Maven setup

Use a JDK, such as your installed JDK 21. Set `JAVA_HOME` to the JDK folder (not its bin folder) and add `%JAVA_HOME%\bin` to PATH. On this computer, the JDK folder is `C:\Program Files\Java\jdk-21`.

Install/extract Maven and add its `bin` folder to PATH. Check from a new terminal:

```powershell
java -version
javac -version
mvn -version
```

If the project-local Maven download is present on this computer, you can run it without changing system PATH:

```powershell
$env:JAVA_HOME = 'C:\Program Files\Java\jdk-21'
& '.\.tools\apache-maven-3.9.12\bin\mvn.cmd' '-Dmaven.repo.local=.m2/repository' clean verify
```

The pom targets Java 8 compatible bytecode and pins the compiler, test runner and JAR plugin versions. The first Maven build needs internet access to download dependencies. Later builds can use cached dependencies.

## 2. Build and test locally

Run these commands from the folder containing pom.xml:

```powershell
mvn clean verify
java -cp target/java-lab-1.0-SNAPSHOT.jar com.example.Q01Addition
```

The first command compiles the programs, runs all 50 JUnit tests, packages the JAR, and completes Maven's verify phase. A failed test causes Maven to fail.

To run only the test class for your assigned question during practice:

```powershell
mvn '-Dtest=Q04FactorialTest' test
```

Replace `Q04FactorialTest` with the test class from the table. Jenkins still runs all 50 tests on every build.

Each main method uses default sample values when no arguments are given. You can supply your own inputs:

```powershell
java -cp target/java-lab-1.0-SNAPSHOT.jar com.example.Q01Addition 8 9
java -cp target/java-lab-1.0-SNAPSHOT.jar com.example.Q03LargestOfThree 5 20 10
java -cp target/java-lab-1.0-SNAPSHOT.jar com.example.Q04Factorial 6
java -cp target/java-lab-1.0-SNAPSHOT.jar com.example.Q09SimpleInterest 2000 6 3
java -cp target/java-lab-1.0-SNAPSHOT.jar com.example.Q11ArraySum 10 20 30
java -cp target/java-lab-1.0-SNAPSHOT.jar com.example.Q14ReverseString 'hello world'
```

Most programs take one argument. Addition takes two, largest-of-three takes three, and simple interest takes principal, annual percentage rate and time in years. The array programs accept any number of integer arguments. Quote a string containing spaces. Jenkins uses default sample values, so the build does not wait for keyboard input.

## 3. Push to GitHub

This folder already has origin set to `https://github.com/Ayaan-1082/Agile.git` and the current branch is `main`. From this folder, run:

```powershell
git add Jenkinsfile pom.xml src README.md .gitignore
git commit -m 'Add Java lab programs, JUnit tests and Jenkins pipeline'
git push -u origin main
```

The project files have been created locally; committing and pushing are steps for you to perform. The existing PDF is not needed for the build. The local tools, dependency cache and target folder are ignored by Git.

If you use a different repository or branch during the assessment, change the URL and branch in the Jenkinsfile's **Checkout Git** stage.

## 4. Configure Jenkins

Open your Jenkins server (commonly `http://localhost:8080`).

1. Under **Manage Jenkins > Plugins**, ensure **Pipeline**, **Git** and **JUnit** are installed. Maven tool configuration is supplied by the **Maven Integration** plugin.
2. Under **Manage Jenkins > Tools**, find **Maven installations** and choose **Add Maven**.
3. Enter the exact name **M3**. It must match `maven 'M3'` in the Jenkinsfile.
4. Either enable automatic installation and choose a Maven version, or disable automatic installation and set Maven home to its extracted folder. If using the local download on this machine, that folder is `C:\Users\khana\OneDrive\Documents\1imp project\agile\.tools\apache-maven-3.9.12`. Use the actual lab-machine path during the assessment.
5. Ensure the Jenkins build agent has a JDK and Git available. Jenkins's service account must be able to access the configured Maven and JDK folders. Restart the Jenkins service after changing its system environment variables.

### Option A: paste the pipeline (closest to your teacher's guide)

1. Choose **New Item**, name it `java-lab`, select **Pipeline**, and click **OK**.
2. In the **Pipeline** section, select **Pipeline script**.
3. Paste the full contents of [Jenkinsfile](Jenkinsfile), then save.
4. Click **Build Now** once. This initializes the PROGRAM choices and uses Q01Addition by default.
5. When the first build finishes, choose **Build with Parameters**, select your question's class, and click **Build**.

### Option B: load the Jenkinsfile from GitHub

Choose **Pipeline script from SCM**, select **Git**, enter your repository URL, choose branch `*/main`, and set Script Path to `Jenkinsfile`. Then save and run once to initialize the choices. For a private repository, select Jenkins credentials in the job and add the matching `credentialsId` to the Jenkinsfile's git step as well.

The file works on Windows and Unix agents: Windows uses `bat` and Unix uses `sh`. Maven's tool name is still M3 on either system.

## 5. What to show in the assessment

Open the build's **Console Output**. You should see Maven report 50 tests, zero failures and errors, `BUILD SUCCESS`, your selected program's output, and Jenkins finish with `SUCCESS`.

Open the build's **Test Result** page to show the JUnit results. The compiled file `java-lab-1.0-SNAPSHOT.jar` is available under the build's artifacts.

Changing PROGRAM changes which main method runs. The build compiles and tests all 15 programs before it runs the selected one. If your teacher requires a submission containing only the assigned program, keep only that Java file and its matching test file before you push, and select the retained program in Jenkins. The pom and pipeline can stay the same; the test count will then be lower.

## Assumptions in the sample answers

- Factorial accepts 0 through 20 so its result fits in long; 0! is 1.
- Fibonacci starts at 0, 1 and accepts 0 through 93 terms so every term fits in long.
- Reversing a negative number preserves its sign; trailing zeros disappear. The return type is long so reversing any int is supported.
- Negative numbers are not numeric palindromes.
- Simple interest uses `principal * rate * time / 100` with non-negative, finite inputs.
- Grades use A: 90-100, B: 80-89, C: 70-79, D: 60-69, E: 50-59, F: 0-49. **Confirm the teacher's thresholds and update the method and tests if they differ.**
- The sum of an empty array is 0. Maximum rejects an empty array.
- Vowels are a, e, i, o and u, including uppercase forms.
- String palindrome checking is case-sensitive and includes spaces and punctuation. An empty string is a palindrome.

## Common fixes

| Problem | Fix |
| --- | --- |
| Maven installation M3 is missing | Configure a Maven tool named exactly M3 under Manage Jenkins > Tools. |
| mvn is not recognized locally | Add Maven's bin folder to PATH or use the local full command above. |
| JAVA_HOME is invalid / no compiler | Point JAVA_HOME to a JDK folder, and check javac -version. |
| Jenkins cannot find Git | Install Git for the build agent and configure its path under Jenkins Tools if needed. |
| Checkout cannot find main | Push main to GitHub or change the Jenkinsfile's branch to the branch you pushed. |
| Repository is private | Configure Jenkins Git credentials and use credentialsId in the git step. |
| No POM in this directory | Put pom.xml at the Git repository root, or wrap the Maven steps in dir('your-project-subfolder'). |
| No JUnit reports | Check the Maven failure first; reports appear only after tests execute. |
| Program class cannot be found | Check that the selected Java file exists and that the build succeeded. |

## Short viva answers

- **Maven:** builds the Java project and manages its dependencies through pom.xml.
- **JUnit:** tests whether a method returns the expected result.
- **Jenkins:** checks out the code and automatically runs the build and tests.
- **pom.xml:** declares the project's identity, dependencies and build plugins.
- **@Test:** marks a method as a JUnit test.
- **assertEquals:** compares the expected value with the actual value.
- **clean:** removes previous build output.
- **test:** compiles and executes unit tests.
- **package:** creates the JAR after testing.
- **verify:** runs the preceding lifecycle phases and any checks bound to verification.
- **CI:** automatically builds and tests changes using a repeatable pipeline.

## Validation on this computer

Maven 3.9.12 with JDK 21 completed clean verify successfully: 15 test classes, 50 tests, zero failures, zero errors and zero skipped tests. All 15 main methods were run from the generated JAR and their default output matched the table.

The Jenkinsfile has been prepared for the setup above; it has not yet been executed on your Jenkins server. Complete the GitHub push and Jenkins tool/job configuration to verify the full CI run.

## Official references

- [Jenkins pipeline syntax](https://www.jenkins.io/doc/book/pipeline/syntax/)
- [Jenkins JUnit report step](https://www.jenkins.io/doc/pipeline/steps/junit/)
- [Maven compiler release setting](https://maven.apache.org/plugins/maven-compiler-plugin/examples/set-compiler-release.html)
- [Maven Surefire with JUnit](https://maven.apache.org/surefire/maven-surefire-plugin/examples/junit.html)
