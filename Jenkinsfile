pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        bat(script: 'gradle build', returnStatus: true, returnStdout: true)
      }
    }

  }
  environment {
    PATH = 'C:\\Windows\\System32'
  }
}