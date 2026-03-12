pipeline {
    agent any
    tools {
        jdk 'JDK22'   // Ensure this matches your Jenkins tool name
        maven 'Maven3'
    }
    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/harsha-bharadwaj100/jacoco-lab.git' [cite: 94]
            }
        }
        stage('Build & Test with Coverage') {
            steps {
                sh 'mvn clean test' [cite: 99]
            }
        }
    }
    post {
        always {
            junit '**/target/surefire-reports/*.xml' [cite: 105]
            archiveArtifacts artifacts: 'target/site/jacoco/**', fingerprint: true [cite: 106]
        }
    }
}