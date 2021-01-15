pipeline {
  agent {
    docker {
      image '3.6.3-jdk-11-slim'
    }

  }
  stages {
    stage('compile') {
      agent {
        docker {
          image 'docker'
        }

      }
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