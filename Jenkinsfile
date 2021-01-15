pipeline {
  agent any
  stages {
    stage('check out') {
      steps {
        git(url: 'git@github.com:samzhu/easy-openapi-test.git', branch: 'main')
        echo 'Successfully check out'
      }
    }

    stage('compile') {
      steps {
        sh 'ls'
        sh 'docker ps'
      }
    }

  }
}