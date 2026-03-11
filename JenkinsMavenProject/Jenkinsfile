pipeline {

    agent any

    tools {
        maven 'Maven'
        jdk 'JDK21'
    }

    stages {

        stage('Checkout') {
            steps {
             git branch: 'main',url: 'https://github.com/SubhomoyGanguly/calculatormaven'
            }
        }

        stage('Build') {
            steps {
		dir('JenkinsMavenProject') {
                bat 'mvn clean compile'
		}
            }
         
        }

        stage('Run JUnit Tests') {
            steps {
		
		dir('JenkinsMavenProject'){
                bat 'mvn test'
		}
            }
        }

       stage('SonarQube Analysis') {
          steps {
	  dir('JenkinsMavenProject') {
          withSonarQubeEnv('SonarServer') {
            bat 'mvn clean verify sonar:sonar'
        }
	}
    }
}

    }
}