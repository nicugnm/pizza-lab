package pizzalab.rest.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import pizzalab.PantryService;
import pizzalab.domain.Menu;

@RestController
class MenuController {

  @Autowired
  PantryService pantryService;

  @GetMapping("/menu")
  public Menu getMenu() {
    return pantryService.listMenu();
  }
}

