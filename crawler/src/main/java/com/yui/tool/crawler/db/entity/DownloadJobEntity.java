package com.yui.tool.crawler.db.entity;

import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

/**
 * @author XuZhuohao
 * @date 2021/1/15
 */
@Data
@Accessors(chain = true)
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "download_job")
public class DownloadJobEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    /**
     * 任务名称
     */
    private String name;

    @CreatedDate
    private Timestamp createTime;
    /**
     * 0 - 未开始
     * 1 - 运行中
     * 2 - 结束
     * 3 - 等待重新运行（运行子任务失败的数据）
     * 4 - 强制全部重新运行
     */
    private byte status;
}
