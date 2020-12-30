package com.logistic.indepay.service;

import com.logistic.indepay.model.Role;
import com.logistic.indepay.model.User;
import com.logistic.indepay.repository.UserRepository;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class UserServiceImpl implements IService<User>{

    @Autowired
    UserRepository userRepository;
    @Autowired
    IService<Role> roleService;

    @Override
    public Collection<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> findById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public User saveOrUpdate(User user) {
        Role role = new Role();
        role.setName("admin");
        roleService.saveOrUpdate(role);
        String storePass = user.getPassword();
        user.setPassword(new BCryptPasswordEncoder().encode(storePass));
        user.setRole(role);
        return userRepository.saveAndFlush(user);
    }

    @Override
    public String deleteById(Long id) {
        JSONObject jsonObject = new JSONObject();
        try
        {
            userRepository.deleteById(id);
            jsonObject.put("message","user deleted successfully");
        }
        catch (JSONException e)
        {
            e.printStackTrace();;
        }
        return jsonObject.toString();
    }
}
