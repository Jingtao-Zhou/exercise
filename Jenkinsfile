pipeline {
    agent {
        label 'Dev'
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
            }
        }
        stage('Build package') {
            steps {
                sh "./gradlew clean build"
            }
        }
        stage('Build image') {
            steps {
                sh "docker build -t exercise:latest ."
            }
        }
        stage('Deploy') {
            steps {
                sh "./deploy.sh"
            }
        }
    }
}