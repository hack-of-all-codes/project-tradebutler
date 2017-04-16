package com.lbibera.tradebutler.datacore.stock.repository;

import com.lbibera.tradebutler.datacore.stock.model.Stock;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.transaction.Transactional;

import static org.junit.Assert.assertEquals;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@Transactional
public class StockRepositoryTest {

    @Autowired
    StockRestRepository repository;

    @Test
    @Sql
    public void findAllWithFirstPageShouldReturnFirstPage() {
        Pageable page = new PageRequest(0, 10);
        Page<Stock> firstPage = repository.findAll(page);

        assertEquals("There should be 2 entries", 2, firstPage.getTotalElements());
    }
}
