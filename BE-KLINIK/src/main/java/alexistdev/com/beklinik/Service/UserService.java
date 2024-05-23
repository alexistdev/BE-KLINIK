package alexistdev.com.beklinik.Service;

import alexistdev.com.beklinik.Model.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    User findByUsername(String username);
}
