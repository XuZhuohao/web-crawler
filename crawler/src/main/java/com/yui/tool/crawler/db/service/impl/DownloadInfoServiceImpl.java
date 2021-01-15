package com.yui.tool.crawler.db.service.impl;

import com.yui.tool.crawler.db.entity.DownloadInfoEntity;
import com.yui.tool.crawler.db.repository.BaseRepository;
import com.yui.tool.crawler.db.repository.DownloadInfoRepository;
import com.yui.tool.crawler.db.service.DownloadInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @author XuZhuohao
 * @date 2021/1/15
 */
public class DownloadInfoServiceImpl implements DownloadInfoService {
    @Autowired
    private DownloadInfoRepository repository;

    @Override
    public BaseRepository<DownloadInfoEntity, Integer> getBaseRepository() {
        return repository;
    }

    @Override
    public Page<DownloadInfoEntity> findByDownloadInfoIdOfPage(int id, int pageNumber, int pageSize) {
        Pageable pageable = PageRequest.of(pageNumber, pageSize);
        return repository.findAllByDownloadJobId(id, pageable);
    }

    @Override
    public void saveAll(List<DownloadInfoEntity> entities) {
        this.repository.saveAll(entities);
    }
}
