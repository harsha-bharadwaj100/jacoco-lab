pipeline {
    agent any
    tools {
        jdk 'JDK22'
        maven 'Maven3'
    }
    stages {
        // We are removing the manual Git checkout stage because 
        // Jenkins handles this automatically for Declarative Pipelines.
        stage('Build & Test with Coverage') {
            steps {
                // This runs the Maven command to test and generate JaCoCo reports
                sh 'mvn clean test' //[cite: 97, 99]
            }
        }
    }
    post {
        always {
            // Records the JUnit test results in the Jenkins UI
            junit '**/target/surefire-reports/*.xml' //[cite: 103, 105]
            // Archives the JaCoCo HTML reports for viewing after the build
            archiveArtifacts artifacts: 'target/site/jacoco/**', fingerprint: true //[cite: 106]
        }
    }
}