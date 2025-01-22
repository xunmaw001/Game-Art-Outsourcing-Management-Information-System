package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.LiuchengzhuizongDao;
import com.entity.LiuchengzhuizongEntity;
import com.service.LiuchengzhuizongService;
import com.entity.vo.LiuchengzhuizongVO;
import com.entity.view.LiuchengzhuizongView;

@Service("liuchengzhuizongService")
public class LiuchengzhuizongServiceImpl extends ServiceImpl<LiuchengzhuizongDao, LiuchengzhuizongEntity> implements LiuchengzhuizongService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LiuchengzhuizongEntity> page = this.selectPage(
                new Query<LiuchengzhuizongEntity>(params).getPage(),
                new EntityWrapper<LiuchengzhuizongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LiuchengzhuizongEntity> wrapper) {
		  Page<LiuchengzhuizongView> page =new Query<LiuchengzhuizongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<LiuchengzhuizongVO> selectListVO(Wrapper<LiuchengzhuizongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public LiuchengzhuizongVO selectVO(Wrapper<LiuchengzhuizongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<LiuchengzhuizongView> selectListView(Wrapper<LiuchengzhuizongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LiuchengzhuizongView selectView(Wrapper<LiuchengzhuizongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
