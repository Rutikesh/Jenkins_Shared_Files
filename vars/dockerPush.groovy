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
            docker login -u "${DOCKER_USER}" -p "${DOCKER_PASS}"
            docker tag ${ProjectName}:${ImageTag} ${DOCKER_USER}/${ProjectName}:${ImageTag}
            docker push ${DOCKER_USER}/${ProjectName}:${ImageTag}
        """
    }
}
