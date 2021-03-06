package com.cheng.weixin.service.user.dao;

import com.cheng.weixin.common.core.dao.BaseDaoMapper;
import com.cheng.weixin.rpc.user.entity.BonusPointRecord;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Desc: 积分记录  记录积分的收支情况
 * Author: cheng
 * Date: 2016/7/7
 */
@Repository
public interface BonusPointRecordDaoMapper extends BaseDaoMapper<BonusPointRecord> {

    /**
     * 根据用户名获取最新一条积分
     * @param bonusPointRecord
     * @return
     */
    BonusPointRecord loadNewByUSerId(BonusPointRecord bonusPointRecord);
    /**
     * 根据用户名获取当前月积分
     * @param bonusPointRecord
     * @return
     */
    List<BonusPointRecord> loadByUSerIdAndCurrentMonth(BonusPointRecord bonusPointRecord);

}
