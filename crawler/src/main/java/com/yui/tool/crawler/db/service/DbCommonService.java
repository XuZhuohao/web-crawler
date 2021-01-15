package com.yui.tool.crawler.db.service;

import com.yui.tool.crawler.db.repository.BaseRepository;
import com.yui.tool.crawler.dto.ResultBean;

import java.io.Serializable;
import java.util.Optional;

/**
 * @author XuZhuohao
 * @date 2020/9/14
 */
public interface DbCommonService<T, ID extends Serializable> {
    BaseRepository<T, ID> getBaseRepository();

    /**
     * 保存，修改
     * @param entity data
     * @return 结果
     */
    default ResultBean<T> save(T entity){
        return new ResultBean<T>().toSuccess(getBaseRepository().save(entity));
    }

    /**
     * 根据 id 删除
     * @param id id
     * @return 结果
     */
    default ResultBean<T> deleteById(ID id){
        getBaseRepository().deleteById(id);
        return new ResultBean<T>().toSuccess(null);
    }

    /**
     * 根据 id 删除
     * @param entity entity
     * @return 结果
     */
    default ResultBean<T> delete(T entity){
        getBaseRepository().delete(entity);
        return new ResultBean<T>().toSuccess(null);
    }
    /**
     * 根据 id 查找
     * @param id id
     * @return 结果
     */
    default ResultBean<T> findById(ID id){
        Optional<T> data = getBaseRepository().findById(id);
        if (!data.isPresent()) {
            return new ResultBean<T>().toSuccess(null);
        }
        return new ResultBean<T>().toSuccess(data.get());
    }

}
