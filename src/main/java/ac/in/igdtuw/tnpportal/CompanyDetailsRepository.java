package ac.in.igdtuw.tnpportal;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CompanyDetailsRepository extends MongoRepository<CompanyDetails, String> {
	
	CompanyDetails findByCode(String code);
	CompanyDetails findBy_id(ObjectId _id);
}