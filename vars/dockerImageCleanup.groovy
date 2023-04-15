// def call(String project, String ImageTag, String hubUser){
//     sh """
//       docker rmi tag ${hubUser}/${project} ${hubUser}/${project}:${ImageTag}
//       docker rmi tag ${hubUser}/${project} ${hubUser}/${project}:latest
//     """ 
// }

def call(String project, String ImageTag, String hubUser){
    sh """
      docker rmi ${aws_account_id}.dkr.ecr.${region}.amazonaws.com/${ecr_repoName}:latest
      
    """ 
}