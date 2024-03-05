def gv

pipeline {
    agent any
    
    environment {
        MY_NAME = "Michael"
    }
    parameters {
        choice(name: 'VERSION', choices: ['1.1.0', '1.2.0', '1.3.0'], description: 'Select version')
        booleanParam(name: 'executeTests', defaultValue: true, description: 'Please check')
    }

    stages {
        stage("build") {
            steps {
                script {
                    gv.buildApp()
                }
            }
        }
        stage("test") {
            when {
                expression {//Only run if executeTests is true
                    params.executeTests
                }
            }
            steps {
                script {
                    gv.testApp()
                }
            }
        }
        stage("deploy") {
            steps {
                script {
                    gv.deployApp()
                }
            }
        }
    }
}