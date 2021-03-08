pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                sh '''
                    gradle clean compileJava compileTestJava
                '''
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
                sh '''
                    gradle test
                '''
            }
        }
        stage('Package') {
            steps {
                echo 'Packaging....'
                sh '''
                    gradle fatJar
                    cd build/libs
                    ls -la
                '''
            }
        }
    }
}