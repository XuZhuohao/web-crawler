package com.yui.tool.crawler.db.entity;

import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

/**
 * 下载详细信息
 *
 * @author XuZhuohao
 * @date 2021/1/15
 */
@Data
@Accessors(chain = true)
@Entity
@Table(name = "download_job")
public class DownloadInfoEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    /**
     * 主任务id
     */
    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name = "download_job_id", foreignKey = @ForeignKey(name = "none",value = ConstraintMode.NO_CONSTRAINT))
    private DownloadJobEntity downloadJobEntity;

    @Column(name = "download_job_id")
    private int downloadJobId;
    /**
     * 请求地址
     */
    private String url;
    /**
     * 附件名称
     */
    private String name;
    /**
     * 说明- -一般为失败原因，或者成功
     */
    private String into;
    /**
     * 0 - 未开始
     * 1 - 运行中
     * 2 - 结束
     * 3 - 等待重新运行
     */
    private byte status;
}
