package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;

import java.util.List;

public class UserServiceImpl implements UserService {
    UserDao userdao = new UserDaoHibernateImpl();



    public void createUsersTable() {
        userdao.createUsersTable();
    }

    public void dropUsersTable() {
        userdao.dropUsersTable();
    }

    public void saveUser(String name, String lastName, byte age) {
        userdao.saveUser(name, lastName, age);
        System.out.println("User с именем " + name + " добавлен в базу данных");
    }

    public void removeUserById(long id) {
        userdao.removeUserById(id);
    }

    public List<User> getAllUsers() {
        List<User> users = userdao.getAllUsers();
        for (User user : users) {
            System.out.println(user);
        }
        return users;
    }

    public void cleanUsersTable() {
        userdao.cleanUsersTable();
    }
}
