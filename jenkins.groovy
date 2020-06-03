def buildApp() {
    echo "build stage"
}

def testApp() {
    echo "test stage"
}

def deployApp() {
    echo "deploy success"
    echo "deploy version ${params.VERSION}"
}

return this