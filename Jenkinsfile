pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building...'
            }
        }

        stage('Compile') {
            steps {
                bat 'javac Factorial.java TestFactorial.java'
            }
        }

        stage('Test') {
            steps {
                bat 'java TestFactorial'
            }
        }

        stage('Run') {
            steps {
                bat 'java Factorial'
            }
        }

        stage('Package JAR') {
            steps {
                bat 'jar cfm factorial.jar manifest.txt Factorial.class'
            }
        }

        stage('Archive JAR') {
            steps {
                archiveArtifacts artifacts: 'factorial.jar'
            }
        }
    }

    post {
        success {
            echo 'Build, test, run, and JAR file creation succeeded. Artifact is ready!'
        }

        failure {
            echo 'Pipeline failed.'
        }
    }
}
