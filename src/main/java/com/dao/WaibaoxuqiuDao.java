package com.dao;

import com.entity.WaibaoxuqiuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WaibaoxuqiuVO;
import com.entity.view.WaibaoxuqiuView;


/**
 * 外包需求
 * 
 * @author 
 * @email 
 * @date 2022-03-29 16:14:52
 */
public interface WaibaoxuqiuDao extends BaseMapper<WaibaoxuqiuEntity> {
	
	List<WaibaoxuqiuVO> selectListVO(@Param("ew") Wrapper<WaibaoxuqiuEntity> wrapper);
	
	WaibaoxuqiuVO selectVO(@Param("ew") Wrapper<WaibaoxuqiuEntity> wrapper);
	
	List<WaibaoxuqiuView> selectListView(@Param("ew") Wrapper<WaibaoxuqiuEntity> wrapper);

	List<WaibaoxuqiuView> selectListView(Pagination page,@Param("ew") Wrapper<WaibaoxuqiuEntity> wrapper);
	
	WaibaoxuqiuView selectView(@Param("ew") Wrapper<WaibaoxuqiuEntity> wrapper);
	

}
