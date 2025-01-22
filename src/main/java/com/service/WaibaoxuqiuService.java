package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WaibaoxuqiuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WaibaoxuqiuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WaibaoxuqiuView;


/**
 * 外包需求
 *
 * @author 
 * @email 
 * @date 2022-03-29 16:14:52
 */
public interface WaibaoxuqiuService extends IService<WaibaoxuqiuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WaibaoxuqiuVO> selectListVO(Wrapper<WaibaoxuqiuEntity> wrapper);
   	
   	WaibaoxuqiuVO selectVO(@Param("ew") Wrapper<WaibaoxuqiuEntity> wrapper);
   	
   	List<WaibaoxuqiuView> selectListView(Wrapper<WaibaoxuqiuEntity> wrapper);
   	
   	WaibaoxuqiuView selectView(@Param("ew") Wrapper<WaibaoxuqiuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WaibaoxuqiuEntity> wrapper);
   	

}

