package java.com.example.springRush;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.ui.Model;

import static jdk.internal.org.objectweb.asm.util.CheckClassAdapter.verify;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.BDDMockito.given;

@ExtendWith( MockitoExtension.class)
public class LoginControllerUnitTests {

    @Mock
    private Model model;
    @Mock
    private com.example.springRush.processor.LoginProcessor loginProcessor;
    @InjectMocks
    private com.example.springRush.controller.LoginController loginController;

    @Test
    public void loginPostLoginSucceedsTest() {
        given(loginProcessor.login())
                .willReturn(true);
        String result =
                loginController.loginPost("username", "password", model);
        assertEquals("login.html", result);
        verify(model)
                .addAttribute("message", "You are now logged in.");
    }

    @Test
    public void loginPostLoginFailsTest() {
        given(loginProcessor.login())
                .willReturn(false);
        String result =
                loginController.loginPost("username", "password", model);
        assertEquals("login.html", result);
        verify(model)
                .addAttribute("message", "Login failed!");
    }
}
