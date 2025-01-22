package com.dao;

import com.entity.LiuchengzhuizongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LiuchengzhuizongVO;
import com.entity.view.LiuchengzhuizongView;


/**
 * 流程追踪
 * 
 * @author 
 * @email 
 * @date 2022-03-29 16:14:52
 */
public interface LiuchengzhuizongDao extends BaseMapper<LiuchengzhuizongEntity> {
	
	List<LiuchengzhuizongVO> selectListVO(@Param("ew") Wrapper<LiuchengzhuizongEntity> wrapper);
	
	LiuchengzhuizongVO selectVO(@Param("ew") Wrapper<LiuchengzhuizongEntity> wrapper);
	
	List<LiuchengzhuizongView> selectListView(@Param("ew") Wrapper<LiuchengzhuizongEntity> wrapper);

	List<LiuchengzhuizongView> selectListView(Pagination page,@Param("ew") Wrapper<LiuchengzhuizongEntity> wrapper);
	
	LiuchengzhuizongView selectView(@Param("ew") Wrapper<LiuchengzhuizongEntity> wrapper);
	

}
