
package com.qualpro.api.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class HelloController {
    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @GetMapping("/hello")
    public String hello(@RequestParam(defaultValue = "World") String name) {
        logger.info("Received request for /hello with name: {}", name);
        String result = null;
        try {
            logger.debug("About to trigger a NullPointerException for demonstration.");
            result.length(); // This will throw a NullPointerException
            result = "Hello, " + name + "!";
            logger.info("Successfully created greeting: {}", result);
        } catch (Exception e) {
            logger.error("Exception occurred in hello(): {}", e.getMessage(), e);
            return "Error: " + e.getMessage();
        }
        logger.info("Returning result from /hello: {}", result);
        return result;
    }
}