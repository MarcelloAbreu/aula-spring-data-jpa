package dio.aula;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import dio.aula.model.User;
import dio.aula.repository.UserRepository;

public class StartApp implements CommandLineRunner {

    @Autowired
    private UserRepository repository;

    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setName("Marcello");
        user.setUsername("marcelloh");
        user.setPassword("dio123");
        repository.save(user);

        for(User u: repository.findAll()){
            System.out.println(u);
        }
    }

}
