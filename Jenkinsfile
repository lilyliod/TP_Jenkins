pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        bat(script: 'C:\\gradle-6.0.1\\bin\\gradle build', returnStatus: true, returnStdout: true)
      }
    }

  }
  environment {
    PATH = 'C:\\Windows\\System32'
  }
}