package pl.crm.app.errorHandling;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import pl.crm.app.errorHandling.exceptions.TenantNotFoundException;

public class GlobalHttpErrorHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(TenantNotFoundException.class)
    public ResponseEntity<Object> handleTitleNotFoundException(TenantNotFoundException exception){
        return new ResponseEntity<>("Tenant with provided ID does not exist in database",
                HttpStatus.NOT_FOUND);
    }


}
