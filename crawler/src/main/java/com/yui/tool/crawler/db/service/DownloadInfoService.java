package com.yui.tool.crawler.db.service;

import com.yui.tool.crawler.db.entity.DownloadInfoEntity;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * @author XuZhuohao
 * @date 2020/9/29
 */
public interface DownloadInfoService extends DbCommonService<DownloadInfoEntity, Integer> {
    /**
     * 通过主任务id，分页查询子任务
     * @param id download_job_id
     * @param pageNumber 页面数量
     * @param pageSize 页面大小
     * @return 分页结果
     */
    Page<DownloadInfoEntity> findByDownloadInfoIdOfPage(int id, int pageNumber, int pageSize);

    /**
     * 批量保存
     * @param entities
     */
    void saveAll(List<DownloadInfoEntity> entities);

}
