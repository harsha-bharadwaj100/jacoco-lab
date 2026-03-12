pipeline {
    agent any
    tools {
        jdk 'JDK22'
        maven 'Maven3'
    }
    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/harsha-bharadwaj100/jacoco-lab.git'
            }
        }
        stage('Build & Test with Coverage') {
            steps {
                sh 'mvn clean test'
            }
        }
    }
    post {
        always {
            // Records the JUnit test results in Jenkins [cite: 105]
            junit '**/target/surefire-reports/*.xml'
            // Archives the JaCoCo HTML reports for viewing [cite: 106]
            archiveArtifacts artifacts: 'target/site/jacoco/**', fingerprint: true
        }
    }
}