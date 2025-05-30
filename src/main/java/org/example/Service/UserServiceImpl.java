package org.example.Service;

import lombok.RequiredArgsConstructor;
import org.example.Repository.UserRepository;
import org.example.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User save(User user) {
        throw new UnsupportedOperationException("Метод save ещё не готов");
    }
}
