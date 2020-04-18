package ursu.disertatie.Controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ursu.disertatie.Services.SummaryService;

import java.util.List;

@RestController
public class PushController {

    Logger logger = LoggerFactory.getLogger(PushController.class);

    @Value("${spring.profiles.active}")
    private String varEnv;

    @Value("${message}")
    private String message;

    @Autowired
    SummaryService summary;

    @GetMapping(value = "/")
    String getHelloWorld (){
        logger.info("Called /");
        return message + " " + varEnv + " worldaleDOnde!";
    }

    @GetMapping(value = "/summary")
    List<String> getSummary (){
        logger.info("Called /summary");
        return summary.getSummary();
    }

}


