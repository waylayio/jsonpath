#!groovy
// `Jenkinsfile` is a groovy script DSL for defining CI/CD workflows for Jenkins

pipeline {

  agent { node { label 'scala' } }

  options {
    timeout(time: 20, unit: 'MINUTES')
    buildDiscarder(logRotator(numToKeepStr: '200'))
    ansiColor('xterm')
  }

  stages {
    stage('Build') {
      steps {
        sh "sbt -Dsbt.color=always clean test"
      }
    }
  }


  post {
    always {
      // archive "**/target/**/*"
      junit '**/target/test-reports/*.xml'
    }
    failure {
      mail(
              body: "${BUILD_URL}",
              //from: "jenkins@waylay.io",
              replyTo: "dev@waylay.io",
              subject: "Build failed in Jenkins: ${JOB_NAME} #${BUILD_NUMBER}",
              to: "dev-scala@waylay.io")
    }
  }

}
