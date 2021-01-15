package com.yui.tool.crawler.db.repository;

import com.yui.tool.crawler.db.entity.DownloadInfoEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * @author XuZhuohao
 * @date 2021/1/12
 */
public interface DownloadInfoRepository extends BaseRepository<DownloadInfoEntity, Integer> {
    /**
     * 通过主任务id，分页查询子任务
     * @param id download_job_id
     * @param pageable 分页参数
     * @return 分页结果
     */
    Page<DownloadInfoEntity> findAllByDownloadJobId(int id, Pageable pageable);
}
