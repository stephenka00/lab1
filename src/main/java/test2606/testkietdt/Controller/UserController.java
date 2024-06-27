package test2606.testkietdt.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import test2606.testkietdt.DTO.UserDTO;
import test2606.testkietdt.Service.UserService;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/search")
    public ResponseEntity<List<UserDTO>> search(@RequestParam String username
            , @RequestParam String address) {
        List<UserDTO> users = userService.searchUsers(username,address);
        return ResponseEntity.ok(users);
    }

}
