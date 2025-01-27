package com.restapi.example.rest_web_services.DAOService;

import com.restapi.example.rest_web_services.exception.UserNotFoundException;
import com.restapi.example.rest_web_services.model.User;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class UserDaoService {

    private static List<User> users = new ArrayList<>();

    private static int usersCount = 0;

    static {
        users.add(new User(++usersCount,"Adam", LocalDate.now().minusYears(30)));
        users.add(new User(++usersCount,"Eve",LocalDate.now().minusYears(25)));
        users.add(new User(++usersCount,"Jim",LocalDate.now().minusYears(20)));
    }

    public List<User> retreiveAllUsers(){
        return users;
    }

    public User findbyId(int id){
        return users.stream()
                .filter(user -> user.getId() == id)
                .findFirst()
                .orElseThrow(() -> new UserNotFoundException("User with ID: "+id+" Not Found"));
    }

    public User saveUser(User user){
        user.setId(++usersCount);
        users.add(user);
        return user;
    }
}
