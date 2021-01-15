pipeline {
  agent any
  stages {
    stage('compile') {
      steps {
        sh 'ls'
        sh 'docker ps'
        sh './mvnw package'
        sh '''./mvnw spring-boot:build-image \\
  -Dspring-boot.build-image.imageName=easy-openapi-test \\
  -Dspring-boot.build-image.builder=gcr.io/buildpacks/builder'''
      }
    }

  }
}