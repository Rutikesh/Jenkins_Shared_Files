def call(String ProjectName, String ImageTag) {
    echo 'Pushing image to Docker Hub'

    withCredentials([
        usernamePassword(
            credentialsId: 'DoDjJe',
            usernameVariable: 'DOCKER_USER',
            passwordVariable: 'DOCKER_PASS'
        )
    ]) {
        sh """
            set -e
            echo "${DOCKER_PASS}" | docker login -u "{$DOCKER_USER}" --password-stdin
            docker tag ${ProjectName}:${ImageTag} ${DOCKER_USER}/${ProjectName}:${ImageTag}
            docker push ${DOCKER_USER}/${ProjectName}:${ImageTag}
        """
    }
}
