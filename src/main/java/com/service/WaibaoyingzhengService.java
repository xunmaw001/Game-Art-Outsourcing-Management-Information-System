package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WaibaoyingzhengEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WaibaoyingzhengVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WaibaoyingzhengView;


/**
 * 外包应征
 *
 * @author 
 * @email 
 * @date 2022-03-29 16:14:52
 */
public interface WaibaoyingzhengService extends IService<WaibaoyingzhengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WaibaoyingzhengVO> selectListVO(Wrapper<WaibaoyingzhengEntity> wrapper);
   	
   	WaibaoyingzhengVO selectVO(@Param("ew") Wrapper<WaibaoyingzhengEntity> wrapper);
   	
   	List<WaibaoyingzhengView> selectListView(Wrapper<WaibaoyingzhengEntity> wrapper);
   	
   	WaibaoyingzhengView selectView(@Param("ew") Wrapper<WaibaoyingzhengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WaibaoyingzhengEntity> wrapper);
   	

}

