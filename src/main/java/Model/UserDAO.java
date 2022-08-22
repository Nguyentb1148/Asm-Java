/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tranbaonguyen
 */
public class UserDAO {
    List<User> ls =new ArrayList<>();
    public  UserDAO(){
        ls.add(new User("admin","1212",true));
        ls.add(new User("admin1","1212",true));
    }
    public boolean checkLogin(String userName,String passWord){
        for(User u:ls){
            if (u.getUserName().equals(userName)&& u.getPassWord().equals(passWord)){
                return  true;
            }
        }
        return false;
    }
}

