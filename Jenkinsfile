pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        bat 'C:\\\\gradle-6.0.1\\\\bin\\\\gradle build'
        bat 'C:\\\\gradle-6.0.1\\\\bin\\\\gradle javadoc'
      }
    }

  }
  environment {
    PATH = 'C:\\Windows\\System32'
  }
}