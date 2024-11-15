package com.oyhp.esyu.service;

import com.oyhp.esyu.dao.AddressDao;
import com.oyhp.esyu.pojo.Address;
import com.oyhp.esyu.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {
    @Autowired
    AddressDao addressDao;

    public List<Address> findByUser(User user){
        return addressDao.findByUserOrderByIdDesc(user);
    }

    public void add(Address bean){
        addressDao.save(bean);
    }

    public void delete(int id){
        addressDao.delete(id);
    }

    public Address get(int id){
        return addressDao.getOne(id);
    }

    public void update(Address bean){
        addressDao.save(bean);
    }

}
