package alexistdev.com.beklinik.Controller;

import alexistdev.com.beklinik.Config.JwtService;
import alexistdev.com.beklinik.DTO.AuthRequestDTO;
import alexistdev.com.beklinik.DTO.JwtResponseDTO;
import lombok.Builder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//@Builder
@RestController
@RequestMapping("/v1/auth")
@Slf4j
public class AuthController {
//    private AuthenticationManager authenticationManager;
    private JwtService jwtService;
    public static final String LOGIN = "/login";

    @PostMapping(LOGIN)
    public String AuthenticateAndGetToken(@RequestBody AuthRequestDTO authRequestDTO) throws Exception {
//        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authRequestDTO.getUsername(), authRequestDTO.getPassword()));
//        return JwtResponseDTO.builder()
//                .accessToken(jwtService.GenerateToken(authRequestDTO.getUsername())).build();
        jwtService = new JwtService();
        jwtService.GenerateToken("alexistdev");
        return "testing";
    }



}
