package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZuopindingdanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZuopindingdanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZuopindingdanView;


/**
 * 作品订单
 *
 * @author 
 * @email 
 * @date 2022-03-29 16:14:52
 */
public interface ZuopindingdanService extends IService<ZuopindingdanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZuopindingdanVO> selectListVO(Wrapper<ZuopindingdanEntity> wrapper);
   	
   	ZuopindingdanVO selectVO(@Param("ew") Wrapper<ZuopindingdanEntity> wrapper);
   	
   	List<ZuopindingdanView> selectListView(Wrapper<ZuopindingdanEntity> wrapper);
   	
   	ZuopindingdanView selectView(@Param("ew") Wrapper<ZuopindingdanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZuopindingdanEntity> wrapper);
   	

}

