def call(String projectName, String imageTag, String dockerHubUser) {
    echo 'Building Docker image'
    sh "docker build -t ${dockerHubUser}/${projectName}:${imageTag} ."
}
