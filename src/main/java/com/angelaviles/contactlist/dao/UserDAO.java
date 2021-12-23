package com.angelaviles.contactlist.dao;

import org.springframework.data.repository.CrudRepository;

import com.angelaviles.contactlist.modals.User;

public interface UserDAO extends CrudRepository<User, String>{

}
