package com.yui.tool.crawler.service;

/**
 * @author XuZhuohao
 * @date 2021/1/15
 */
public interface ZhihuService {
    /**
     * 下载附件
     * @param questionUrl 问题url
     * @param offset 游标：开始 index
     * @param answerCount 答案数目
     */
    void downloadFile(String questionUrl, int offset, int answerCount);
}
