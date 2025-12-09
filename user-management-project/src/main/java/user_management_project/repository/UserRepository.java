package user_management_project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import user_management_project.entity.User;

public interface UserRepository extends JpaRepository<User,Long> {

}
