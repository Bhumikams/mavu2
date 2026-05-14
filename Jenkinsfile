pipeline{
  agent any
  tools{
    maven 'Maven'
    jdk 'JDK21'
  }
  stages{
    stage('checkout'){
      steps{
        git branch:'main',url:'https://github.com/Bhumikams/mavu2.git',
        credentialsId:'github-tocken'
      }
    }
    stage('build'){
      steps{
        sh 'mvn clean compile'
      }
    }
    stage('Test'){
      steps{
        sh 'mvn test'
      }
    }
    stage('package'){
      steps{
        sh 'mvm package'
      }
    }
    stage('run'){
      steps{
        sh 'mvn exec:java -Dexec.mainClass="com.example.app.App"'
      }
    }
  }
}
