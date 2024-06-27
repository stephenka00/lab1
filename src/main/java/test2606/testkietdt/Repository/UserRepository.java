package test2606.testkietdt.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import test2606.testkietdt.Entity.User;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Long> {
    List<User> search(String username,String address);
}
