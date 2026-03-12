pipeline {
    agent any
    tools {
        jdk 'JDK22'   // Matches the Name you gave in Step 1
        maven 'Maven3' // Matches the Name you gave in Step 1
    }
    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/harsha-bharadwaj100/jacoco-lab.git' [cite: 92, 94]
            }
        }
        stage('Build & Test with Coverage') {
            steps {
                sh 'mvn clean test' [cite: 97, 99]
            }
        }
    }
    post {
        always {
            junit '**/target/surefire-reports/*.xml' [cite: 103, 105]
            archiveArtifacts artifacts: 'target/site/jacoco/**', fingerprint: true [cite: 106]
        }
    }
}