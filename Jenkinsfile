pipeline {
    agent any
    tools {
        jdk 'JDK22'
        maven 'Maven3'
    }
    stages {
        stage('Build & Test with Coverage') {
            steps {
                // Changed 'sh' to 'bat' because your Jenkins is running on Windows [cite: 99]
                bat 'mvn clean test'
            }
        }
    }
    post {
        always {
            // Records the JUnit test results [cite: 105]
            junit '**/target/surefire-reports/*.xml'
            // Archives the JaCoCo HTML reports [cite: 106]
            archiveArtifacts artifacts: 'target/site/jacoco/**', fingerprint: true
        }
    }
}