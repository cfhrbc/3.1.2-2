package ru.kata.spring.boot_security.demo.service;

import org.springframework.stereotype.Service;
import ru.kata.spring.boot_security.demo.model.Role;
import ru.kata.spring.boot_security.demo.repository.RoleRepository;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import java.util.List;

@Service
public class RoleServiceImpl implements RoleService{
    private final EntityManager entityManager;

    public RoleServiceImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Role> findAllRoles() {
        return entityManager.createQuery("SELECT r FROM Role r", Role.class)
                .getResultList();
    }

    @Override
    public Role findRoleById(int id) {
        return entityManager.find(Role.class, id);
    }

    @Override
    public void saveRole(Role role) {
        if (role.getId() == null) {
            entityManager.persist(role);
        } else {
            entityManager.merge(role);
        }
    }

    @Override
    public Role findByName(String roleName) {
        try {
            return entityManager.createQuery(
                            "SELECT r FROM Role r WHERE r.name = :roleName", Role.class)
                    .setParameter("roleName", roleName)
                    .getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }
}




/*
@Service
public class RoleServiceImpl implements RoleService {
    private final RoleRepository roleDao;


    public RoleServiceImpl(RoleRepository roleDao) {
        this.roleDao = roleDao;
    }

    @Override
    public List<Role> findAll() {
        return roleDao.findAll();
    }
}

 */

