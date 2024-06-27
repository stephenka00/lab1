package test2606.testkietdt.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test2606.testkietdt.DTO.UserDTO;
import test2606.testkietdt.Entity.User;
import test2606.testkietdt.Mapper.UserMapper;
import test2606.testkietdt.Repository.UserRepository;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserMapper userMapper = UserMapper.INSTANCE;
    public List<UserDTO> searchUsers(String username,String address){
        List<User> users = userRepository.search(username,address);
        return users.stream().map(userMapper::toUserDTO).collect(Collectors.toList());
    }
}
