package com.subhasish.aws.fargate;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Subhasish Sahu
 * @date : 27/03/2020
 **/
@RestController
class Controller {

    @RequestMapping("/api/tests")
    public String helloWorld(HttpServletRequest request)
    {
        return "SpringBoot Application Deployed to AWS Fargate";
    }

}
