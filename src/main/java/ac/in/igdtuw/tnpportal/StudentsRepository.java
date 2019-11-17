package ac.in.igdtuw.tnpportal;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentsRepository extends MongoRepository<Students, String> {

	Students findBy_id(ObjectId _id);
}
