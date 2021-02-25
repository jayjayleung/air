package org.jayjay.air.security.mapper;

import org.jayjay.air.security.entity.SysPermission;
import org.jayjay.air.security.entity.SysRole;
import org.jayjay.air.security.entity.SysUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author JayJay
 * @since 2021-02-24
 */
public interface SysUserMapper extends BaseMapper<SysUser> {
    /**
     * 根据用户ID查询角色
     *
     * @param userId 用户ID
     * @return
     */
    List<SysRole> findRoleByUserId(String userId);

    /**
     * 根据用户ID查询权限
     *
     * @param userId 用户ID
     * @return
     */
    List<SysPermission> findAuthByUserId(String userId);
}
