pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        bat 'C:\\gradle-6.0.1\\bin\\gradle build'
        bat 'C:\\gradle-6.0.1\\bin\\gradle javadoc'
        archiveArtifacts 'build\\docs\\javadoc\\*'
        archiveArtifacts 'build\\libs\\*'
        archiveArtifacts 'build\\test-results\\test\\*'
      }
    }

    stage('Mail Notification') {
      steps {
        mail(subject: 'Mail Notifs', body: 'I hope it works!', to: 'fl_ait_zerrouk@esi.dz')
      }
    }

  }
  environment {
    PATH = 'C:\\Windows\\System32'
  }
}