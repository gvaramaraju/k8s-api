package org.gvaramaraju;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class APIController {

  @Autowired APIService apiService;

  @GetMapping
  public String greet() throws InterruptedException {
    return apiService.delayThereResponse();
  }
}
