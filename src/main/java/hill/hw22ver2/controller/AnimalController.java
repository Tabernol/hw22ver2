package hill.hw22ver2.controller;

import hill.hw22ver2.model.Animal;
import hill.hw22ver2.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class AnimalController {
    private final AnimalService animalService;

    @Autowired
    public AnimalController(AnimalService animalService) {
        this.animalService = animalService;
    }

    @GetMapping("/animals")
    public String findAll(Model model) {
        List<Animal> animals = animalService.findAll();
        model.addAttribute("animals", animals);
        return "animal-list";
    }

    @GetMapping("/animal-create")
    public String createAnimalForm(Animal animal) {
        return "animal-create";
    }

    @PostMapping("/animal-create")
    public String createAnimal(Animal animal) {
        animalService.saveAnimal(animal);
        return "redirect:/animals";
    }
    @GetMapping("animal-update/{id}")
    public String updateAnimalForm (@PathVariable("id") Long id, Model model){
        return "/animal-update";

    }

    @GetMapping("animal-delete/{id}")
    public String deleteAnimal(@PathVariable Long id) {
        animalService.deleteById(id);
        return "redirect:/animals";
    }
    @PostMapping("/animal-update")
    public String updateAnimal(Animal animal){
        animalService.saveAnimal(animal);
        return "redirect:/animals";

    }
}
