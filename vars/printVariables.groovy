def printParams(){
    echo "params: ${params}"
}

def printEnv(){
    echo "env: ${env.COMBINED}"
    echo "env: ${env.STATIC_VALUE}"
}

def jenkinsEnvVariables(){
    echo "BUILD_NUMBER: ${env.BUILD_NUMBER}"
    echo "BUILD_ID: ${env.BUILD_ID}"
    echo "BUILD_URL: ${env.BUILD_URL}"
    echo "JOB_NAME: ${env.JOB_NAME}"
    echo "JOB_BASE_NAME: ${env.JOB_BASE_NAME}"
    echo "BUILD_TAG: ${env.BUILD_TAG}"
    echo "EXECUTOR_NUMBER: ${env.EXECUTOR_NUMBER}"
    echo "NODE_NAME: ${env.NODE_NAME}"
    echo "WORKSPACE: ${env.WORKSPACE}"
    echo "JENKINS_HOME: ${env.JENKINS_HOME}"
    echo "JENKINS_URL: ${env.JENKINS_URL}"
    echo "GIT_COMMIT: ${env.GIT_COMMIT}"
    echo "GIT_BRANCH: ${env.GIT_BRANCH}"
    echo "BRANCH_NAME: ${env.BRANCH_NAME}"
}