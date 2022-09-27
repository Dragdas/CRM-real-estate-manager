package pl.crm.app.errorHandling;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import pl.crm.app.errorHandling.exceptions.OwnerNotFoundException;
import pl.crm.app.errorHandling.exceptions.RealEstateNotFound;
import pl.crm.app.errorHandling.exceptions.TenantNotFoundException;

@ControllerAdvice
public class GlobalHttpErrorHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(TenantNotFoundException.class)
    public ResponseEntity<Object> handleTitleNotFoundException(TenantNotFoundException exception){
        return new ResponseEntity<>("Tenant with provided ID does not exist in database",
                HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(OwnerNotFoundException.class)
    public ResponseEntity<Object> handleOwnerNotFoundException(OwnerNotFoundException exception) {
        return new ResponseEntity<>("Owner with provided id does not exist in database",
                HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(RealEstateNotFound.class)
    public ResponseEntity<Object> handleRealEstateNotFoundException(RealEstateNotFound exception) {
        return new ResponseEntity<>("Real estate with provided id does not exist in database",
                HttpStatus.BAD_REQUEST);
    }
}
