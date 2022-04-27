package peaksoft.service;

import peaksoft.dao.UserDaoHibernateImpl;
import peaksoft.dao.UserDaoJdbcImpl;
import peaksoft.model.User;

import java.util.List;

public class UserServiceImpl implements UserService {
    UserDaoJdbcImpl userDaoJdbc = new UserDaoJdbcImpl();
    UserDaoHibernateImpl userDaoHibernate = new UserDaoHibernateImpl();

    public void createUsersTable() {
        userDaoHibernate.createUsersTable();
//        userDaoJdbc.createUsersTable();
    }

    public void dropUsersTable() {
        userDaoHibernate.dropUsersTable();
//        userDaoJdbc.dropUsersTable();
    }

    public void saveUser(String name, String lastName, byte age) {
//        userDaoJdbc.saveUser(name, lastName, (byte) age);
        userDaoHibernate.saveUser(name, lastName, age);
    }

    public void removeUserById(long id) {
//        userDaoJdbc.removeUserById(id);
        userDaoHibernate.removeUserById(id);
    }

    public List<User> getAllUsers() {
        return userDaoHibernate.getAllUsers();
    }

    public void cleanUsersTable() {
        userDaoHibernate.cleanUsersTable();
    }
}
