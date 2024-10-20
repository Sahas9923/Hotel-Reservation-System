
package Controller;

import Model.LoginModel;

public class LoginController {
    
    private final LoginModel model;
    
public LoginController(LoginModel model) {
        this.model = model;
}

public boolean login(String username, String password) {
        return model.validateLogin(username, password);
    }
}