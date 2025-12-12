package com.nischay.blog.app;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.nischay.blog.app.config.ApplicationConstants;
import com.nischay.blog.app.entity.Role;
import com.nischay.blog.app.repository.RoleRepository;

@SpringBootApplication
public class BlogApplicationSpringbootRestApisApplication implements CommandLineRunner {

    private final RoleRepository roleRepository;

    // Constructor injection only for RoleRepository now
    public BlogApplicationSpringbootRestApisApplication(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(BlogApplicationSpringbootRestApisApplication.class, args);
        System.out.println("Hello");
    }

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

    @Override
    public void run(String... args) throws Exception {

        try {
            Role adminRole = new Role();
            adminRole.setId(ApplicationConstants.ADMIN_USER_ID_HARDCODED_ID_VALUE);
            adminRole.setName("ADMIN_USER");

            Role normalRole = new Role();
            normalRole.setId(ApplicationConstants.NORMAL_USER_ID_HARDCODED_ID_VALUE);
            normalRole.setName("NORMAL_USER");

            List<Role> roles = List.of(adminRole, normalRole);

            List<Role> result = this.roleRepository.saveAll(roles);

            result.forEach(r -> System.out.println(r.getName()));

        } catch (Exception e) {
            // suppress duplicate key exception on restart
        }
    }
}
