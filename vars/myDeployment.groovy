def call(Map pipelineParams) {
  
  pipeline
  {
    agent any 
    stages
    {
      stage('from jenkinsfile')
      {
          steps
          {
            echo "from jenkinsfile..."
            echo "pipelineParams.NAME"
          }
      }
      stage('from lib')
      {
          steps
          {
            fromLibarary()
            //fromTestBranch()
            echo "HELLLLOOO"
          }
      }
    }
  }
  
}
