package com.lbibera.tradebutler.datacore.historicalprice.repository;

import com.lbibera.tradebutler.datacore.historicalprice.model.HistoricalPrice;
import org.springframework.data.repository.PagingAndSortingRepository;


public interface HistoricalPriceRestRepository extends PagingAndSortingRepository<HistoricalPrice, Long> {
}
