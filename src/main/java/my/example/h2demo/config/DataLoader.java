package my.example.h2demo.config;

import my.example.h2demo.repository.UserRepository;
import my.example.h2demo.repository.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        User user1 = new User();
        user1.setName("Ivan");
        User user2 = new User();
        user2.setName("Nik");

        userRepository.save(user1);
        userRepository.save(user2);
    }
}
