pipeline {
    agent any
    stages {
        stage ('Compile Stage') {

            steps {
                    bat 'mvn clean compile'
            }
        }
        stage ('Testing Stage') {

            steps {
                    bat 'mvn test'
            }
        }
        stage ('Pitest result') {
                    steps {
                            bat 'mvn org.pitest:pitest-maven:mutationCoverage'
                    }
         }

        stage ('Install Stage') {
            steps {
                    bat 'mvn install'
            }
        }
    }
}