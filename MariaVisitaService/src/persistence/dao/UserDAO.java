package persistence.dao;

import org.bson.Document;

import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Projections;

public class UserDAO extends DAO {

	public UserDAO() {
		super("user");
	}

	public String login(String registration, String password) {
		Document doc = findOne(Filters.and(Filters.eq("registration", registration), Filters.eq("password", password)),
				Projections.include("_id"));
		
		if (doc == null) {
			return null;
		} else {
			return doc.getObjectId("_id").toString();
		}
	}
	
	public boolean isloged(String id) {
		return findById(id, Projections.include("_id")) != null;
	}
	
}