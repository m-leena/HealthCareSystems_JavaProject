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
		sh 'mvn sonar:sonar -Dsonar.host.url=http://3.110.32.19:9000/ -Dsonar.login=5812a36cd78356e10d309fb4b996f856a2dad1b4'
            }
        }
    }
}
