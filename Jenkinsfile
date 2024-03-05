pipeline {
    agent any
    
    environment {
        MY_VERSION = "1.23"
    }

    tools {
        maven 'maven'
    }

    parameters {
        choice(name: 'VERSION', choices: ['1.1.0', '1.2.0', '1.3.0'], description: '')
        booleanParam(name: 'executeTests', defaultValue: true, description: '')
    }
    

    stages {
        stage("build") {
            steps {
                echo "building the appliccstion... version ${MY_VERSION} - VERSION ${VERSION}"
            }
        }

        stage("test") {
            when {
                expression {
                    env.BRANCH_NAME == 'dev' || env.BRANCH_NAME == 'master'
                }
            }
            steps {
                echo "testing the applicatio... Test ${executeTests}"
            }
        }

        stage("deploy") {
            steps {
                echo "deploying the application..."
            }
        }
    }
}