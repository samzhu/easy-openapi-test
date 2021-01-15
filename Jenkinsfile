pipeline {
  agent {
    docker {
      image 'docker'
    }

  }
  stages {
    stage('compile') {
      agent {
        docker {
          image 'maven:3-alpine'
          args '-v /var/jenkins_home/.m2:/root/.m2'
        }

      }
      steps {
        sh 'ls'
        sh '''./mvnw spring-boot:build-image \\
  -Dspring-boot.build-image.imageName=easy-openapi-test \\
  -Dspring-boot.build-image.builder=gcr.io/buildpacks/builder'''
        sh './mvnw clean package'
      }
    }

  }
}