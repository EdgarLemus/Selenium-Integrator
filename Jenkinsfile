Jenkinsfile (Declarative Pipeline)
pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                sh 'gradle test'
                echo 'Testing Process...'
            }
        }
    }
}