node {
    stage('Clone') {
     git branch: 'main', url: 'https://github.com/bertrandmb/ansible.git'
    
    }
     stage('Build') {
         sh label: '',  script: 'javac Main.java'
    
    }
     stage('Run') {
         sh label:'',  script: 'java Main'
    
    }
}
