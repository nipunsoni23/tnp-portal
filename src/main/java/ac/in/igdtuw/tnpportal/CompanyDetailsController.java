package ac.in.igdtuw.tnpportal;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import javax.validation.Valid;

@RestController
@RequestMapping("/companies")
public class CompanyDetailsController {
  @Autowired
  private CompanyDetailsRepository repository;
  
  @RequestMapping(value = "/", method = RequestMethod.GET)
  public List<CompanyDetails> getAllCompanies() {
    return repository.findAll();
  }

  @RequestMapping(value = "/{id}", method = RequestMethod.GET)
  public CompanyDetails getCompanyDetailsById(@PathVariable("id") ObjectId id) {
    return repository.findBy_id(id);
  }
  
  @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
  public void modifyCompanyDetailsById(@PathVariable("id") ObjectId id, @Valid @RequestBody CompanyDetails company) {
    company.set_id(id);
    repository.save(company);
  }
  
  @RequestMapping(value = "/", method = RequestMethod.POST)
  public CompanyDetails createCompanyDetails(@Valid @RequestBody CompanyDetails company) {
    company.set_id(ObjectId.get());
    repository.save(company);
    return company;
  }
  
  @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
  public void deleteCompanyDetails(@PathVariable ObjectId id) {
    repository.delete(repository.findBy_id(id));
  }
}
