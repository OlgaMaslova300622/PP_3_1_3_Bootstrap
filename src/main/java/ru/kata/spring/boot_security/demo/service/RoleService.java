package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.models.Role;

import java.util.List;

public interface RoleService {
    public List<Role> getAllRoles();

    public Role getRoleByName(String name);

    public void saveRole(Role role);
}
