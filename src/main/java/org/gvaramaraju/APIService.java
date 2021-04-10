package org.gvaramaraju;

import io.opentelemetry.extension.annotations.WithSpan;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class APIService {

    @WithSpan("delayThereResponse")
    public String delayThereResponse() throws InterruptedException {
        Thread.sleep(3000);
        RestTemplate restTemplate = new RestTemplate();
        String fooResourceUrl
                = "https://jsonplaceholder.typicode.com/posts";
        ResponseEntity<String> response
                = restTemplate.getForEntity(fooResourceUrl + "/1", String.class);
        return "Hello from the other side !!";
    }
}
