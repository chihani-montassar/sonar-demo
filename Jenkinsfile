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
            mvn clean package -DskipTests sonar:sonar \
              -Dsonar.host.url=http://host.docker.internal:9000 \
              -Dsonar.projectKey=atelier-sonar \
              -Dsonar.projectName=atelier-sonar
          '''
        }
      }
    }
  }
}
