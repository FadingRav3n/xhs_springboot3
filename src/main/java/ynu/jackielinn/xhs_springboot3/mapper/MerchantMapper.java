package ynu.jackielinn.xhs_springboot3.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import ynu.jackielinn.xhs_springboot3.entity.po.Merchant;

@Mapper
public interface MerchantMapper extends BaseMapper<Merchant> {
}
