pipeline {
    agent any

    stages {
        stage('CompileJob') {
            steps {
		echo 'code validate'
		sh 'mvn validate'
            }
        }
        stage('UnitTest') {
            steps {
		echo 'code test'
		sh 'mvn test'
            }
        }
        stage('SonarAnalysis') {
            steps {
		 echo 'code analysis'
		sh 'mvn sonar:sonar -Dsonar.host.url=http://http://13.127.8.245:9000 -Dsonar.login=d2063a5d032bf063b79ab0674cfc242e4d12dc9a'
            }
        }
    }
}
