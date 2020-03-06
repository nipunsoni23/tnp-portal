package ac.in.igdtuw.tnpportal;

import java.io.IOException;
import java.io.FileOutputStream;
import java.util.Base64;
import java.util.List;

import javax.validation.Valid;

import org.bson.BsonBinarySubType;
import org.bson.types.Binary;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/photos")
public class PhotoController {

	@Autowired
	  private PhotoRepository repository;

    public ObjectId addPhoto(MultipartFile file) throws IOException {
        Photo photo = new Photo("06101012016_ProfileImg");
        photo.setImage(new Binary(BsonBinarySubType.BINARY, file.getBytes()));
        photo = repository.insert(photo);
        return photo.get_id();
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String retrievePhoto(@PathVariable("id") ObjectId _id){
    	Photo photo = repository.findBy_id(_id);
        Binary document = photo.getImage();
        if(document != null) {
            FileOutputStream fileOuputStream = null;
            try {
            	//TODO: Modify file name to title of photo
                fileOuputStream = new FileOutputStream("./src/main/resources/static/images/"+ photo.getTitle() + ".jpg");
                fileOuputStream.write(document.getData());
            } catch (Exception e) {
                e.printStackTrace();
                return "failure";
            } finally {
                if (fileOuputStream != null) {
                    try {
                        fileOuputStream.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                        return "failure";
                    }
                }
            }
        }
        return "success";
    }
	
	  @RequestMapping(value = "/", method = RequestMethod.GET)
	  public List<Photo> getAllPhotos() {
	    return repository.findAll();
	  }
	  
	  /*@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	  public Photo getPhotoById(@PathVariable("id") ObjectId _id) {
	    return repository.findBy_id(_id);
	  }*/
	  
	  @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	  public void modifyPhotoById(@PathVariable("id") ObjectId id, @Valid @RequestBody Photo photo) {
	    photo.set_id(id);
	    repository.save(photo);
	  }
	  
	  @RequestMapping(value = "/", method = RequestMethod.POST)
	  public String uploadPhoto(@Valid @RequestParam("image") MultipartFile image) throws IOException {
	    ObjectId id =  addPhoto(image);
	    return retrievePhoto(id);
	  }
	  
	  @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	  public void deletePhoto(@PathVariable ObjectId id) {
	    repository.delete(repository.findBy_id(id));
	  }
}