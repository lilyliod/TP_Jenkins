pipeline {
  agent any
  stages {
<<<<<<< HEAD
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

            waitForQualityGate true
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
=======
    stage('Build') {
      steps {
        bat 'D:\\\\gradle-6.0.1\\\\bin\\\\gradle build'
        bat 'D:\\gradle-6.0.1\\bin\\gradle javadoc'
        archiveArtifacts 'build\\libs\\*'
        archiveArtifacts 'build\\docs\\javadoc\\*'
      }
    }

    stage('Mail') {
      steps {
        mail(subject: 'mail notification', to: 'gm_yousfi@esi.dz', body: 'lkjhgfdsftyuiop', replyTo: 'gm_yousfi@esi.dz')
      }
    }

    stage('code analysis') {
      parallel {
        stage('code analysis') {
          steps {
            withSonarQubeEnv('sonar') {
              bat 'D:\\gradle-6.0.1\\bin\\gradle sonarQube'
            }

          }
        }

        stage('Test reporting ') {
          steps {
            jacoco()
          }
        }

      }
    }

    stage('jacoco') {
      steps {
        jacoco()
      }
    }

    stage('Deploiment') {
      steps {
        bat 'D:\\gradle-6.0.1\\bin\\gradle publish'
      }
    }

    stage('slack') {
      steps {
        slackSend(baseUrl: 'https://hooks.slack.com/services/', channel: 'general', message: 'blabla is sending!', token: 'TRRNQTS4X/BSWF21YG3/NEuc7ZqaQLRTtV9wiBmZNK1Z', teamDomain: 'yousfimeriem', color: 'danger')
      }
    }

>>>>>>> new/master
  }
}