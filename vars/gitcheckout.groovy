def call(Map stageparams)
{
checkout([
    $class: 'GitSCM', 
    branches: [[name:  stageParams.branch]], 
    doGenerateSubmoduleConfigurations: false, 
    extensions: [], 
    submoduleCfg: [], 
    userRemoteConfigs: [[url: stageParams.url]]
    ])
}
