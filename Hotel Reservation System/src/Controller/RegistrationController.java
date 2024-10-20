
package Controller;

import Model.RegistrationModel;


public class RegistrationController {
    
    private final RegistrationModel model;
    
public RegistrationController(RegistrationModel model) {
        this.model = model;
}

public boolean addEmployeeWithLogin(String firstName, String lastName, String nic, String mobile, String email,
                                        String address, int employeeID, String username, String password) {
        // Step 1: Insert employee details
        boolean isEmployeeInserted = model.insertEmployee(firstName, lastName, nic, mobile, email, address);

        // Step 2: If employee insertion is successful, insert login details
        if (isEmployeeInserted) {
            return model.insertLoginDetails(employeeID, username, password);
        }

        return false;  // Return false if employee insertion failed
    }
}
