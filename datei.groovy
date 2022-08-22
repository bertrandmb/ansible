pipeline {
  agent any {
    stages {
      stage('clone') {
        steps {
            sh "rm -rf *"
            sh "git clone https://github.com/bertrandmb/ansible"
        }
      }
      stage('build') {
        steps {
            sh "cd ansible/ && javac Main.java"
        }
      }
      stage('run') {
        steps {
            sh "cd ansible/ && java Main"
        }
      }
    }
  }
