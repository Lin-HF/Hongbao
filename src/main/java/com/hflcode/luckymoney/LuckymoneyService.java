package com.hflcode.luckymoney;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

@Service
public class LuckymoneyService {

    @Autowired
    private LuckymoneyRepository repository;

    @Transactional
    public void createTwo() {
        Luckymoney luckymoney = new Luckymoney();
        luckymoney.setProducer("廖师兄");
        luckymoney.setMoney(new BigDecimal("520"));
        repository.save(luckymoney);

        Luckymoney luckymoney2 = new Luckymoney();
        luckymoney2.setProducer("廖师兄");
        luckymoney2.setMoney(new BigDecimal("1314"));
        repository.save(luckymoney2);
    }
}
