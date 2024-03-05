pipeline {
    agent any

    stages {
        stage("build") {
            steps {
                echo 'building the appliccstion...'
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