package hdnguyen.controller;


import hdnguyen.dao.UserDao;
import hdnguyen.dto.ResponseObject;
import hdnguyen.dto.auth.AuthenticateRequest;
import hdnguyen.dto.auth.RegisterRequest;
import hdnguyen.service.AuthService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin("*")
@RequiredArgsConstructor
@RequestMapping("api/v1/auth")
public class AuthController {
    private final AuthService authService;

    @PostMapping("register")
    @ResponseStatus(HttpStatus.OK)
    public ResponseObject register (@RequestBody RegisterRequest registerRequest) throws Exception {
        return authService.register(registerRequest);
    }

    @PostMapping("login")
    @ResponseStatus(HttpStatus.OK)
    public ResponseObject authenticate (@RequestBody AuthenticateRequest authenticateRequest) {
        return authService.authenticate(authenticateRequest);
    }

    // thông tin đó vẫn còn => gửi về thông tin người dùng





}
