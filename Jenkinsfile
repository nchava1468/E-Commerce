pipeline {
    agent any

    stages {

        stage('Checkout') {
            steps {
                git 'https://github.com/nchava1468/E-Commerce.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Deploy') {
            steps {
                sh '''
                scp -i ~/E-Commerce.pem target/*.jar ec2-user@3.22.114.199:/home/ec2-user/app/app.jar
                ssh -i ~/E-Commerce.pem ec2-user@3.22.114.199 "pkill -f app.jar || true"
                ssh -i ~/E-Commerce.pem ec2-user@3.22.114.199 "nohup java -jar /home/ec2-user/app/app.jar > app.log 2>&1 &"
                '''
            }
        }
    }
}
