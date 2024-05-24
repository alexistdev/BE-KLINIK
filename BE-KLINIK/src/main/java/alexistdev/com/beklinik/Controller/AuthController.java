package alexistdev.com.beklinik.Controller;

import alexistdev.com.beklinik.DTO.AuthRequestDTO;
import alexistdev.com.beklinik.Model.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//@Builder
@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @PostMapping
    public String create(@RequestBody AuthRequestDTO user){
//        User userq = new User();
//        userq.setUsername(user.getUsername());
        return "okay";
    }



}
