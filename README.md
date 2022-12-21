<h2>Commande pour lancer Consul</h2> 
> consul agent -server -bootstrap-expect=1 -data-dir=consul-data -ui -bind=@ip_du_PC_local <br>
<h2>Commande pour lancer Angular</h2>
> ng serve <br><br>

Registry service (consul) joue le rôle d’annuaire dans une architecture de microservices, c'est-à-dire qu’il fait la correspondance entre le nom du microservice et son adresse. Lorsque le client envoie une requête, celle-ci passe par la passerelle (spring cloud) et cette requête contient le nom du micro-service qui est doit être contacté. La passerelle ne connaissant pas l’adresse du micro-service, contacte le service d’enregistrement qui va faire la correspondance et va retourner l’adresse à la passerelle, qui pourra donc contacter le micro-service souhaité.

Config service est le service technique centralisé qui contient l’ensemble des configurations des micro-services. Lorsqu’un micro-service démarre, la première chose qu’il fait est  d’envoyer une requête au service de configuration pour récupérer sa configuration, et cette configuration contient entre autres l’adresse du registry service que le micro-service va contacter par la suite pour lui communiquer son adresse et son nom.

<h2>Captures</h2> 
![4](https://user-images.githubusercontent.com/33934347/208934879-366b5907-a658-470d-a5dd-a85dd4ce0afe.JPG)<br>
![frontend 1](https://user-images.githubusercontent.com/33934347/208935045-58ed26e6-90d2-4583-a12a-49c8f85112ce.JPG)<br>
![frontend 2](https://user-images.githubusercontent.com/33934347/208935138-e2aa6f91-dab9-4c19-98ea-ea423d4dbb81.JPG)<br>
![frontend 3](https://user-images.githubusercontent.com/33934347/208935154-45358b32-9c33-43d6-bbf1-8a8bf47631b0.JPG)<br>
![frontend 4](https://user-images.githubusercontent.com/33934347/208935167-a9d0def2-a419-4aa7-8d49-3d604bc19c4c.JPG)<br>
