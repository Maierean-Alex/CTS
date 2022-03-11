package ro.ase.acs.nosql;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;

public class CreateMongoDb {

	MongoClient mongoClient = new MongoClient("localhost", 27017);
	MongoDatabase mongoDb = mongoClient.getDatabase("test");
	{

		if (mongoDb.getCollection("employees") != null) {
			mongoDb.getCollection("employees").drop();
		}

		mongoDb.createCollection("employees");

	}
	
	
	
}
