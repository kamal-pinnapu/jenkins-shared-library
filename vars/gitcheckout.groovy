def call(Map stageparams)
{
checkout([
    $class: 'GitSCM', 
    branches: [[name: env.GIT_BRANCH]], 
    doGenerateSubmoduleConfigurations: false, 
    extensions: [], 
    submoduleCfg: [], 
    userRemoteConfigs: [[url: 'env.GIT_URL']]
    ])
}
