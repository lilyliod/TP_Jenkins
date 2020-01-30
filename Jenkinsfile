pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        bat 'C:\\gradle-6.0.1\\bin\\gradle build'
        bat 'C:\\gradle-6.0.1\\bin\\gradle javadoc'
        archiveArtifacts 'build\\docs\\javadoc\\*'
        archiveArtifacts 'build\\libs\\*'
        junit 'build\\test-results\\test\\*'
      }
    }

    stage('Mail Notification') {
      steps {
        mail(subject: 'Mail Notifs', body: 'I hope it works!', to: 'fl_ait_zerrouk@esi.dz')
      }
    }

    stage('Code Analysis') {
      parallel {
        stage('Code Analysis') {
          steps {
            withSonarQubeEnv('sonar') {
              bat 'C:\\gradle-6.0.1\\bin\\gradle sonarqube'
            }

          }
        }

        stage('Test Reporting') {
          steps {
            jacoco()
          }
        }

      }
    }

    stage('Deployment') {
      steps {
        bat 'C:\\gradle-6.0.1\\bin\\gradle'
      }
    }

    stage('Slack Notification') {
      steps {
        slackSend(baseUrl: 'https://hooks.slack.com/services/', channel: 'tp-gradle', message: 'It\'s updated !', token: 'TRPDUDA3W/BTDCS7E95/68VfVLTBHzO2SDJEBC8eWCiL', teamDomain: 'esi-kqe6415')
      }
    }

  }
  environment {
    PATH = 'C:\\Windows\\System32'
  }
}