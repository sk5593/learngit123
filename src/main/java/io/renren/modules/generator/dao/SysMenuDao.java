package io.renren.modules.generator.dao;

import io.renren.modules.generator.entity.SysMenuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 菜单管理
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2019-07-12 18:31:33
 */
@Mapper
public interface SysMenuDao extends BaseMapper<SysMenuEntity> {

}
