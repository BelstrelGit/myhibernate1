package ru.com.app.dao;

import ru.com.app.model.UsersEntity;

import java.util.List;

public interface UsersDao {
    public void addUsersEntity(UsersEntity usersEntity);

    public void editUsersEntity(UsersEntity usersEntity);

    public List<UsersEntity> getUsersEntityByName(String name);

    public void deleteUsersEntity(int id);

    public UsersEntity getUsersEntityById(int id);

    public List<UsersEntity> getUsersEntityByPage(int pageid, int total);
}
