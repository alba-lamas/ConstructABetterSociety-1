package ConstructABetterSociety.repository;

import ConstructABetterSociety.domain.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@RepositoryRestResource
public interface UserRepository extends PagingAndSortingRepository<User, String> {
    User findByEmail(String email);
}
