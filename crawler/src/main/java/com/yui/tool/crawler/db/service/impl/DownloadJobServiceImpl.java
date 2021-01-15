package com.yui.tool.crawler.db.service.impl;

import com.yui.tool.crawler.db.entity.DownloadJobEntity;
import com.yui.tool.crawler.db.repository.BaseRepository;
import com.yui.tool.crawler.db.repository.DownloadJobRepository;
import com.yui.tool.crawler.db.service.DownloadJobService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author XuZhuohao
 * @date 2021/1/15
 */
public class DownloadJobServiceImpl implements DownloadJobService {
    @Autowired
    private DownloadJobRepository repository;
    @Override
    public BaseRepository<DownloadJobEntity, Integer> getBaseRepository() {
        return repository;
    }
}
