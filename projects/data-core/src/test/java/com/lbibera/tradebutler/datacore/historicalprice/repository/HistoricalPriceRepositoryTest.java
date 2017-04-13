package com.lbibera.tradebutler.datacore.historicalprice.repository;

import static org.junit.Assert.*;

import com.lbibera.tradebutler.datacore.historicalprice.model.HistoricalPrice;
import com.lbibera.tradebutler.datacore.historicalprice.rest.HistoricalPriceRestRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
@Sql
public class HistoricalPriceRepositoryTest {

    @Autowired
    HistoricalPriceRestRepository restRepository;

    @Test
    public void findAllWithFirstPageShouldReturnAll() {
        Page<HistoricalPrice> allHistoricalPrice = restRepository.findAll(PageRequest.of(0, 10));

        assertEquals("There should be 5 Historical Prices", 5, allHistoricalPrice.getTotalElements());
    }
}
