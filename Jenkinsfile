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
                echo "building the appliccstion... My Name is ${MY_NAME} - VERSION ${VERSION}"
            }
        }
        stage("test") {
            when {
                expression {//Only run on dev or master branch
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