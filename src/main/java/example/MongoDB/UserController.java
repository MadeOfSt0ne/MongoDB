package example.MongoDB;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
@AllArgsConstructor
public class UserController {

    private final UserService service;

    @GetMapping
    public List<User> fetchAllUsers() {
        return service.getAllUsers();
    }

    @PostMapping
    public User addNewUser(@RequestBody User user) {
        return service.addUser(user);
    }

    @PutMapping
    public User updateUser(@RequestBody User user) {
        return service.addUser(user);
    }

    @DeleteMapping("{id}")
    public void deleteUser(@PathVariable String id) {
        service.deleteUser(id);
    }
}
