pipeline {
  agent {
    docker { image 'maven:3.9-eclipse-temurin-17' }
  }

  stages {
    stage('Build + SonarQube Analysis') {
      steps {
        withSonarQubeEnv('SonarQube') {
          sh '''
            mvn -v
            mvn clean verify sonar:sonar \
              -Dsonar.projectKey=atelier-sonar \
              -Dsonar.projectName=atelier-sonar
          '''
        }
      }
    }
  }
}
