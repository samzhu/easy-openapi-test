pipeline {
  agent none
  stages {
    stage('compile') {
      agent {
        docker {
          image 'maven:3-alpine'
          args '-v $HOME/.m2:/root/.m2'
        }

      }
      steps {
        sh 'ls'
        sh './mvnw package'
        sh '''./mvnw spring-boot:build-image \\
  -Dspring-boot.build-image.imageName=easy-openapi-test \\
  -Dspring-boot.build-image.builder=gcr.io/buildpacks/builder'''
      }
    }

  }
}