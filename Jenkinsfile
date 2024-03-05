pipeline {
    agent any
    
    environment {
        MY_VERSION = "1.23"
    }

    stages {
        stage("build") {
            steps {
                echo "building the appliccstion... version ${MY_VERSION}"
            }
        }

        stage("test") {
            when {
                expression {
                    env.BRANCH_NAME == 'dev' || env.BRANCH_NAME == 'master'
                }
            }
            steps {
                echo 'testing the applicatio...'
            }
        }

        stage("deploy") {
            steps {
                echo 'deploying the application...'
            }
        }
    }
}