/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controle;

import java.util.ArrayList;
import model.User;

/**
 *
 * @author salahdin
 */
public class UserBeans {
    User user = new User();
    ArrayList<User>userlijst = new ArrayList<User>();

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ArrayList<User> getUserlijst() {
        return userlijst;
    }

    public void setUserlijst(ArrayList<User> userlijst) {
        this.userlijst = userlijst;
    }   
}
