package ac.in.igdtuw.tnpportal;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsersRepository extends MongoRepository<Users, String> {
	
	Users findByUsername(String username);
	Users findBy_id(ObjectId _id);
}