def call() {
parameters {
        string defaultValue: '10', description: 'Enter number one', name: 'varOne'
        string defaultValue: '20', description: 'Enter number two', name: 'varTwo'
    }
    stages {
        stage('Add two numbers') {
            steps {
                script {
                    def varOne = params.varOne as int
                    def varTwo = params.varTwo as int
                    def result = varOne + varTwo
                    echo "Result is ${result}"
                }
            }
}
