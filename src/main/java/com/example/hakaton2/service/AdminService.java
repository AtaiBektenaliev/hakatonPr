package com.example.hakaton2.service;


import com.example.hakaton2.entity.Pnr;
import com.example.hakaton2.entity.User;
import com.example.hakaton2.model.UserModel;
import com.example.hakaton2.repository.PnrRepository;
import com.example.hakaton2.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class AdminService {
    UserRepository userRepo;
    PnrRepository pnrRepo;

    public UserModel getUserById(Long id) {
        Optional<User> user = userRepo.findById(id);

        UserModel model = new UserModel();

        if (user.isPresent()) {
            model.setId(user.get().getId());
            model.setLogin(user.get().getLogin());
            model.setPassword(user.get().getPassword());
        }
        return model;
    }

    public User getById(Long id) {
        return userRepo.findById(id).get();
    }

    public Pnr updatePnr(Pnr pnr){
        return pnrRepo.save(pnr);
    }

    public void deleteUserById(Long id){
        User user = getById(id);
        userRepo.save(user);
    }
}
