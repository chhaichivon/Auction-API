/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.khmeracademy.btb.auc.pojo.service.impl;

import java.util.ArrayList;
import org.khmeracademy.btb.auc.pojo.entity.User;
import org.khmeracademy.btb.auc.pojo.repository.userRepository;
import org.khmeracademy.btb.auc.pojo.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author KUYLIM
 */
@Service
public class userServiceImpl implements userService{
    
    @Autowired
    private userRepository userRepo;

    @Override
    public ArrayList<User> getUsers() {
        return userRepo.getUsers();
    }

    @Override
    public boolean remove(int id) {
        return userRepo.remove(id);
    }

    @Override
    public boolean save(User usr) {
        return userRepo.add(usr);
    }

    @Override
    public boolean update(User usr) {
        return userRepo.update(usr);
    }

    @Override
    public User search(int id) {
        return userRepo.search(id);
    }
}
