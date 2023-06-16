package com.mycompany.honey;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HoneyDataService {
    @Autowired HoneyData honeyData;

    public List<HoneySorts> listAll() {
        return (List<HoneySorts>) honeyData.findAll();
    }

    public void saveData(HoneySorts sorts) {
        honeyData.save(sorts);
    }
}
