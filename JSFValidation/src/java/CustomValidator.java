
import com.mum.validator.CustomValidatorBean;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rishi
 */
@FacesValidator("com.mum.brandvalidator")
public class CustomValidator implements Validator {

    @Override
    public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {

        if (value != null) {
            String brand = value.toString();
                        if (brand.equals("BMW") || brand.equals("Mercedes")) {
                //do nothing
            } else {
                            FacesMessage message = new FacesMessage("Invalid Brand");
            message.setSeverity(FacesMessage.SEVERITY_ERROR);
                throw new ValidatorException(message);
            }

        }
    }
}
