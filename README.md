## Below is the information about the POC.

•	The application runs on 8082 port.

•	Mongodb database with name “payloaddb” must be created.

•	Collection with the name “Payload” must be created.

•	It Exposes 2 Apis.
  
      - Post Api that accepts the payload body and creates the document in mongo db collection.
      - Put Api that fetches all documents from mongodb which has status “inprogress”. Does some processing and changes the status to “complete” and save the document back to db.

•	I will attach the postman collection that can be used to test these APIs. 

•	I will also expose the APIs through swagger ui. We can use this URL also to see the APIs exposed by the application. We must first start the application before using the swagger URL
http://localhost:8082/swagger-ui.html
