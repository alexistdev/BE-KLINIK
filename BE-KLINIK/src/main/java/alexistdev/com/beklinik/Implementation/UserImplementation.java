package alexistdev.com.beklinik.Implementation;

import alexistdev.com.beklinik.Model.User;
import alexistdev.com.beklinik.Repository.UserRepository;
import alexistdev.com.beklinik.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserImplementation implements UserService {

    @Autowired
    public UserRepository userRepository;

    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}
