def call(){
    return sh(returnStdout: true, script: 'git rev-parse --short HEAD')
}