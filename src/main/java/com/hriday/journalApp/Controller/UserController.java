package com.hriday.journalApp.Controller;

import com.hriday.journalApp.entity.JournalEntry;
import com.hriday.journalApp.entity.User;
import com.hriday.journalApp.service.JournalEntryService;
import com.hriday.journalApp.service.UserService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

@Autowired
    private UserService userService;

@GetMapping
public List<User> getAllUsers(){
    return userService.getAll();
}

@PostMapping
    public void createUser(@RequestBody User user){
    userService.saveEntry(user);
}

@PutMapping("/{userName}")
    public ResponseEntity<?> updateUser(@RequestBody User user, @PathVariable String userName){
    User userInDb = userService.findByUserName(userName);
    if(userInDb !=null){
        userInDb.setUserName(user.getUserName());
        userInDb.setPassword(user.getPassword());
        userService.saveEntry(userInDb);
    }
    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
}
}
