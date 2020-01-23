pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        bat 'gradle build'
      }
    }

  }
  environment {
    PATH = '%SystemRoot%\\system32'
  }
}