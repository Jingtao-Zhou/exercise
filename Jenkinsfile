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
//                 sh "./gradlew clean test"
                echo "test"
            }
        }
        stage('Build package') {
            steps {
//                 sh "./gradlew clean build"
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
        stage('Clean') {
            steps {
              cleanWs(
                  cleanWhenAborted: true,
                  cleanWhenFailure: true,
                  cleanWhenNotBuilt: true,
                  cleanWhenSuccess: true,
                  cleanWhenUnstable: true,
                  cleanupMatrixParent: true,
                  disableDeferredWipeout: true,
                  deleteDirs: true
              )
          	}
        }
    }
}