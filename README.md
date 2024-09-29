A simple java example running in docker

Steps to run:

1. run "mvn package" to package
2. run "docker build -t xxx/my-docker-app:0.0.1 ." to build image
3. run "docker run -it -v your-volume:/app/ xxx/my-docker-app:0.0.1 my-docker-app"
4. run "docker exec ..." to access container to check the output in /app, you can see a file named abc.txt there and the
   content in this file is "Hello, this is java."