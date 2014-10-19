school-list-spring-rest-app
===========================
1. To deploy clone or download the application
2. install mongo db
3. create db called "schools"
4. import the schools.json into the collection called schools
5. run maven command 
   mvn compile
   mvn package
6. Go to the target directory and copy the WAR file and deploy to application server
7. Go url http://localhost:8080/schoolapp-rest-0.1.0/index.html

//testing rest api
curl -i http://localhost:8080/schoolapp-rest-0.1.0/schools/search/findBySubject?subject=reading

//importing json   
mongoimport   --db schools --collection schools --file schools.json --jsonArray   