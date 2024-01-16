pipeline {
    agent any
    stages {
        stage ('Compile Stage') {

            steps {
                withMaven(maven : 'Maven3') {
                    bat 'mvn clean compile'
                }
            }
        }
        stage ('Testing Stage') {

            steps {
                withMaven(maven : 'Maven3') {
                    bat 'mvn test'
                }
            }
        }
        stage ('Pitest result') {
                    steps {
                        withMaven(maven : 'Maven3') {
                            bat 'mvn org.pitest:pitest-maven:mutationCoverage'
                        }
                    }
                }
        stage ('Install Stage') {
            steps {
                withMaven(maven : 'Maven3') {
                    bat 'mvn install'
                }
            }
        }
    }
}