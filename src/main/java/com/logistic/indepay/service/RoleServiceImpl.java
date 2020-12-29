package com.logistic.indepay.service;

import com.logistic.indepay.model.Role;
import com.logistic.indepay.repository.RoleRepository;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class RoleServiceImpl implements IService<Role> {

    @Autowired
    RoleRepository roleRepository;

    @Override
    public Collection<Role> findAll() {
        return roleRepository.findAll();
    }

    @Override
    public Optional<Role> findById(Long id) {
        return roleRepository.findById(id);
    }

    @Override
    public Role saveOrUpdate(Role role) {
        return roleRepository.saveAndFlush(role);
    }

    @Override
    public String deleteById(Long id) {
        JSONObject jsonObject = new JSONObject();
        try
        {
            roleRepository.deleteById(id);
            jsonObject.put("message","role deleted successfully");
        }
        catch (JSONException e)
        {
            e.printStackTrace();;
        }
        return jsonObject.toString();
    }
}
