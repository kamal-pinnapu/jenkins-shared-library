package org.devops
class Build {
def steps 
Build(steps) {this.steps = steps}
  def buildMvn(mvnPath) 
    {
    steps.sh "mvn clean install -f ${mvnPath}"
    }
} 
