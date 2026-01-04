def call(){
    echo 'Deploying application using Docker Compose'
    sh 'docker compose up -d'
}
