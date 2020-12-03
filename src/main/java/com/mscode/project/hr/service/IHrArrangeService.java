package com.mscode.project.hr.service;

import java.util.List;
import com.mscode.project.hr.domain.HrArrange;

/**
 * 排班信息Service接口
 * 
 * @author mscode
 * @date 2020-11-17
 */
public interface IHrArrangeService 
{
    /**
     * 查询排班信息
     * 
     * @param id 排班信息ID
     * @return 排班信息
     */
    public HrArrange selectHrArrangeById(Long id);

    /**
     * 查询排班信息列表
     * 
     * @param hrArrange 排班信息
     * @return 排班信息集合
     */
    public List<HrArrange> selectHrArrangeList(HrArrange hrArrange);

    /**
     * 新增排班信息
     * 
     * @param hrArrange 排班信息
     * @return 结果
     */
    public int insertHrArrange(HrArrange hrArrange);

    /**
     * 修改排班信息
     * 
     * @param hrArrange 排班信息
     * @return 结果
     */
    public int updateHrArrange(HrArrange hrArrange);

    /**
     * 批量删除排班信息
     * 
     * @param ids 需要删除的排班信息ID
     * @return 结果
     */
    public int deleteHrArrangeByIds(Long[] ids);

    /**
     * 删除排班信息信息
     * 
     * @param id 排班信息ID
     * @return 结果
     */
    public int deleteHrArrangeById(Long id);
}
