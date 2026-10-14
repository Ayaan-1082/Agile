pipeline {
    agent any

    tools {
        maven 'M3'
    }

    options {
        skipDefaultCheckout(true)
    }

    parameters {
        choice(name: 'PROGRAM', choices: [
            'Q01Addition',
            'Q02EvenOdd',
            'Q03LargestOfThree',
            'Q04Factorial',
            'Q05Prime',
            'Q06Fibonacci',
            'Q07ReverseNumber',
            'Q08NumberPalindrome',
            'Q09SimpleInterest',
            'Q10StudentGrade',
            'Q11ArraySum',
            'Q12ArrayMaximum',
            'Q13VowelCount',
            'Q14ReverseString',
            'Q15StringPalindrome'
        ], description: 'Select the Java program for your lab question (Q01 to Q15).')
    }

    stages {
        stage('Checkout Git') {
            steps {
                git branch: 'main', url: 'https://github.com/Ayaan-1082/Agile.git'
            }
        }

        stage('Check Tools') {
            steps {
                script {
                    if (isUnix()) {
                        sh 'java -version'
                        sh 'mvn -version'
                    } else {
                        bat 'java -version'
                        bat 'mvn -version'
                    }
                }
            }
        }

        stage('Build and Test') {
            steps {
                script {
                    if (isUnix()) {
                        sh 'mvn --batch-mode clean verify'
                    } else {
                        bat 'mvn --batch-mode clean verify'
                    }
                }
            }
            post {
                always {
                    junit testResults: 'target/surefire-reports/*.xml'
                }
            }
        }

        stage('Run Selected Program') {
            steps {
                script {
                    if (!(params.PROGRAM ==~ /Q(0[1-9]|1[0-5])[A-Za-z]+/)) {
                        error 'Invalid program selection.'
                    }
                    def command = "java -cp target/java-lab-1.0-SNAPSHOT.jar com.example.${params.PROGRAM}"
                    if (isUnix()) {
                        sh command
                    } else {
                        bat command
                    }
                }
            }
        }

        stage('Save JAR') {
            steps {
                archiveArtifacts artifacts: 'target/java-lab-1.0-SNAPSHOT.jar', fingerprint: true
            }
        }
    }
}
