package lk.ijse.se102.Controller;


import lk.ijse.se102.Entity.Blog;
import lk.ijse.se102.Repo.BlogRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/blog")
@CrossOrigin
public class BlogController {

    @Autowired
    private BlogRepo blogRepo;


    @GetMapping("/getAll")
    public List<Blog> GetAllPost(){
        return blogRepo.findAll();
    }

    @GetMapping("/getOne/{id}")
    public String GetOnePost(@PathVariable String id){
        return "ID: " + id;
    }

    @PostMapping("/save")
    public Blog save(@RequestBody Blog blog){
      return blogRepo.save(blog);
    }

    @PutMapping("/update")
    public Blog update(@RequestBody Blog blog){
        return blogRepo.save(blog);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id){
        blogRepo.deleteById(id);
    }

}
