package com.nischay.blog.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nischay.blog.app.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

}
