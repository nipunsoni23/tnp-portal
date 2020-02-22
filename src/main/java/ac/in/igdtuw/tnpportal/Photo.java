package ac.in.igdtuw.tnpportal;

import org.bson.types.Binary;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "photos")
public class Photo {
    
    @Id
    private ObjectId _id;
    
    private String title;
        
    private Binary image;

    public Photo(String title) {
        super();
        //TODO: set title equal to student enrollment number + profile_pic
        this.title = title;
    }

    public ObjectId get_id() {
		return _id;
	}

	public void set_id(ObjectId _id) {
		this._id = _id;
	}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Binary getImage() {
        return image;
    }

    public void setImage(Binary image) {
        this.image = image;
    }
    
}