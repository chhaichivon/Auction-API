/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.khmeracademy.btb.auc.pojo.service;

import java.util.ArrayList;
import org.khmeracademy.btb.auc.pojo.entity.User;

/**
 *
 * @author KUYLIM
 */
public interface userService {
    ArrayList<User> getUsers();
    boolean remove(int id);
    boolean save(User usr);
    boolean update(User usr);
    User search(int id);  
}
