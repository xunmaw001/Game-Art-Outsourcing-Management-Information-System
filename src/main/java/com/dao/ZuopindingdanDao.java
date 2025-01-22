package com.dao;

import com.entity.ZuopindingdanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZuopindingdanVO;
import com.entity.view.ZuopindingdanView;


/**
 * 作品订单
 * 
 * @author 
 * @email 
 * @date 2022-03-29 16:14:52
 */
public interface ZuopindingdanDao extends BaseMapper<ZuopindingdanEntity> {
	
	List<ZuopindingdanVO> selectListVO(@Param("ew") Wrapper<ZuopindingdanEntity> wrapper);
	
	ZuopindingdanVO selectVO(@Param("ew") Wrapper<ZuopindingdanEntity> wrapper);
	
	List<ZuopindingdanView> selectListView(@Param("ew") Wrapper<ZuopindingdanEntity> wrapper);

	List<ZuopindingdanView> selectListView(Pagination page,@Param("ew") Wrapper<ZuopindingdanEntity> wrapper);
	
	ZuopindingdanView selectView(@Param("ew") Wrapper<ZuopindingdanEntity> wrapper);
	

}
