package homework04.service;

import homework04.data.User;

import java.util.List;

public interface UserService<T extends User>{
    void create(T user);
    default void edit(String newSurname, String newFirstname){};
    List<T> all();
}
