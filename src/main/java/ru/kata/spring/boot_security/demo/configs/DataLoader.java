package ru.kata.spring.boot_security.demo.configs;

/*
@Component
public class DataLoader implements CommandLineRunner {


    final RoleDaoImpl roleDao;
    final PasswordEncoder passwordEncoder;
    final UserDao userDao;

    public DataLoader(RoleDaoImpl roleDao, PasswordEncoder passwordEncoder, UserDao userDao) {
        this.userDao = userDao;
        this.roleDao = roleDao;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        Role adminRole = roleDao.findByName("ROLE_ADMIN")
                .orElseGet(() -> {
                    Role role = new Role("ROLE_ADMIN");
                    return roleDao.save(role);

                });

        Role userRole = roleDao.findByName("ROLE_USER")
                .orElseGet(() -> {
                    Role role = new Role("ROLE_USER");
                    return roleDao.save(role);
                });

        User adminUser = userDao.getUserByName("admin")
                .orElseGet(() -> {
                    User user = new User();
                    user.setName("admin");
                    user.setSurname("admin");
                    user.setEmail("admin@mail.com");
                    user.setAge(39);
                    user.setPassword(passwordEncoder.encode("admin"));
                    user.getRoles().add(adminRole);
                    return userDao.save(user);

                });

    }
}
*/




