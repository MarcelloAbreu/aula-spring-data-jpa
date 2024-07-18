package dio.aula;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import dio.aula.model.User; // Adicione esta importação
import dio.aula.repository.UserRepository;

@Component // Anote a classe como um componente Spring
public class StartApp implements CommandLineRunner {

    private final UserRepository repository;

    public StartApp(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setName("Marcello");
        user.setUsername("marcelloh");
        user.setPassword("dio123");
        repository.save(user);

        for (User u : repository.findAll()) {
            System.out.println(u);
        }
    }
}
