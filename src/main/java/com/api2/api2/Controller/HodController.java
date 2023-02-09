package com.api2.api2.Controller;

import com.api2.api2.Models.HOD;
import com.api2.api2.Service.HodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/HOD")
public class HodController {
    @Autowired
    HodService hodService;

    @PostMapping("/add")
    public String addHod(@RequestBody HOD hod){
       return hodService.addHod(hod);
    }
    @GetMapping("hod_having_max_passing_students")
    public String getHodMob(){
       return hodService.getHodMobile();
    }
}
