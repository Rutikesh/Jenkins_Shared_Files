def call(String con_name){
    echo 'Building Docker image'
    sh "docker build -t ${con_name} ."
}
