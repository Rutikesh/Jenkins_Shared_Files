def call(String Projectname, String ImageTag, String DockerHubUser){
    echo 'Building Docker image'
    sh "docker build -t ${DockerHubUser}/${Projectname}:${ImageTag}"
