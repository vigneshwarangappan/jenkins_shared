def call(){
    sh """
     docker image build -t javaapp:latest .
    """
}
