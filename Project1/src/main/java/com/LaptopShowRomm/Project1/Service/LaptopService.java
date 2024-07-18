package com.LaptopShowRomm.Project1.Service;

import com.LaptopShowRomm.Project1.Entity.LaptopEntity;
import com.LaptopShowRomm.Project1.Repo.LaptopRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LaptopService {
    @Autowired
    private LaptopRepo laptopRepo;

    public void addLaptop(LaptopEntity laptopDetails){
       laptopRepo.save(laptopDetails);
    }

    public List<LaptopEntity> getAllLaptop(){
        return laptopRepo.findAll();
    }

    public Optional<LaptopEntity> getLaptop(int laptopNumber) {
        return laptopRepo.findById(laptopNumber);
    }

    public String putLaptop(LaptopEntity laptopEntity, int laptopNumber){

        LaptopEntity newCar=laptopRepo.findById(laptopNumber).orElse(null);
        if(newCar!=null){
            newCar.setBrand(laptopEntity.getBrand());
            newCar.setModel(laptopEntity.getModel());
            newCar.setPrice(laptopEntity.getPrice());
            newCar.setColour(laptopEntity.getColour());
            laptopRepo.save(newCar);
            return "Update Successfully";
        }
        return "Give Proper LaptopNumber";
    }


    public void deleteLaptop(int laptopNumber) {
        laptopRepo.deleteById(laptopNumber);
    }
}

