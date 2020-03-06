package ac.in.igdtuw.tnpportal;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PhotoRepository extends MongoRepository<Photo, String> {

	Photo findBy_id(ObjectId _id);
}