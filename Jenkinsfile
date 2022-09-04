pipeline {
    agent any
    environment {
        PATH = "/opt/maven/bin:$PATH"
    }
    stage('CLONE') {
        git branch: 'main', credentialsId: 'b4f19490-eca4-448c-9d0c-9140f3367fff', url: 'https://github.com/Firemontaigu/home_test.git'
    }     
    stage('CLEAN') {
        sh 'mvn clean install'
    } 
    stage('ARCHIV') {
        archiveArtifacts 'target/*'
    } 
    stage('DEPLOY') {
        deploy adapters: [tomcat9(credentialsId: 'b809c03b-0420-4e49-9b2b-f00a976f8945', path: '', url: 'http://127.0.0.1:8080/')], contextPath: 'TomcatJimmy', war: '**/*.war'
    } 
}
