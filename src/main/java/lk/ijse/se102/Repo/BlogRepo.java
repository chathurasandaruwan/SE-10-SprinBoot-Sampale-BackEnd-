package lk.ijse.se102.Repo;

import lk.ijse.se102.Entity.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BlogRepo extends JpaRepository<Blog,Integer> {

//   List<Blog> findAll();
   @Query(value = "SELECT * FROM Blog",nativeQuery = true)
      List<Blog> findAll();
}
