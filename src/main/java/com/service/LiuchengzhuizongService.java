package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LiuchengzhuizongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LiuchengzhuizongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LiuchengzhuizongView;


/**
 * 流程追踪
 *
 * @author 
 * @email 
 * @date 2022-03-29 16:14:52
 */
public interface LiuchengzhuizongService extends IService<LiuchengzhuizongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LiuchengzhuizongVO> selectListVO(Wrapper<LiuchengzhuizongEntity> wrapper);
   	
   	LiuchengzhuizongVO selectVO(@Param("ew") Wrapper<LiuchengzhuizongEntity> wrapper);
   	
   	List<LiuchengzhuizongView> selectListView(Wrapper<LiuchengzhuizongEntity> wrapper);
   	
   	LiuchengzhuizongView selectView(@Param("ew") Wrapper<LiuchengzhuizongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LiuchengzhuizongEntity> wrapper);
   	

}

