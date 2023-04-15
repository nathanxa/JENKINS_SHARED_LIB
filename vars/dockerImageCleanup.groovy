def call(String project, String ImageTag, String hubUser){
    sh """
      docker rmi tag ${hubUser}/${project} ${hubUser}/${project}:${ImageTag}
      docker rmi tag ${hubUser}/${project} ${hubUser}/${project}:latest
    """ 
}