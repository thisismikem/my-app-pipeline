def buildApp() {
    echo "building the appliccstion... My Name is ${MY_NAME} - VERSION ${params.VERSION}"
}

def testApp() {
    echo "testing the applicatio... Test ${params.executeTests}"
}

def deployApp() {
    echo "deploying the application..."
}

return this