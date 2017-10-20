sudo docker stop app
sudo docker rm app
sudo docker rmi atividade/app
cd postgres/
sh run.sh
cd ../
mvn clean install
sudo docker build -t atividade/app .
sudo docker run -d --name app --link banco:host-banco atividade/app
