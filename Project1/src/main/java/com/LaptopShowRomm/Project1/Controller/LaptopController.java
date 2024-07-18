package com.LaptopShowRomm.Project1.Controller;

import com.LaptopShowRomm.Project1.Entity.LaptopEntity;
import com.LaptopShowRomm.Project1.Service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Laptop")
public class LaptopController {

    @Autowired
    private LaptopService laptopService;

    @PostMapping("/addLaptop")
    public String addLaptop(@RequestBody LaptopEntity laptopDetails){
        laptopService.addLaptop(laptopDetails);
        return "Added Successfully";
    }


    @GetMapping("/getAllLaptops")
    public List<LaptopEntity> getAllLaptop(){
         return laptopService.getAllLaptop();
    }

    @GetMapping("/getByLaptopNumber/{laptopNumber}")
    public Optional<LaptopEntity> getLaptop(@PathVariable int laptopNumber){
        return laptopService.getLaptop(laptopNumber);
    }

    @PutMapping("/updateLaptop/{laptopNumber}")
    public String putLaptop(@PathVariable int laptopNumber, @RequestBody LaptopEntity laptopEntity){
        return laptopService.putLaptop(laptopEntity,laptopNumber);
    }


    @DeleteMapping("/deleteLaptop/{laptopNumber}")
    public String deleteLaptop(@PathVariable int laptopNumber){
        laptopService.deleteLaptop(laptopNumber);
        return "Delete Successfully";
    }


}
