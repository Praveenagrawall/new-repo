package com.git.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class EmployeeController {

    @RestController
    @RequestMapping("/user")
    public class employeeController {

        GetMapping("/employee")
        public String getEmployee(){
            return "Hello User";
        }

    }
}
