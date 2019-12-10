pipeline {
    agent {
        label 'Dev'
    }
    triggers {
        pollSCM('H/5 8-23 * * 1-5')
    }
    stages {
        stage('Checkout') {
            steps {
               checkout scm
            }
        }
        stage('Test') {
            steps {
                 sh "./gradlew clean test"
                echo "test"
            }
        }
        stage('Build package') {
            steps {
//                  sh "./gradlew clean build"
                echo "build package"
            }
        }
        stage('Build image') {
            steps {
//                 sh "docker build -t exercise:latest ."
                echo "build image"
            }
        }
        stage('Deploy') {
            steps {
//                 sh "./deploy.sh"
                echo "deploying"
            }
        }
    }
}