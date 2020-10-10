package com.zjrcu.alan.config;

import com.zjrcu.alan.entities.ShiroUser;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class DBCache {
    /**
     * K 用户名
     * V 用户信息
     */
    public static final Map<String, ShiroUser> USERS_CACHE = new HashMap<>();
    /**
     * K 角色ID
     * V 权限编码
     */
    public static final Map<String, Collection<String>> PERMISSIONS_CACHE = new HashMap<>();

    static {
        // TODO 假设这是数据库记录
        USERS_CACHE.put("u1", new ShiroUser(1L, "u1", "p1", "admin", true));
        USERS_CACHE.put("u2", new ShiroUser(2L, "u2", "p2", "admin", false));
        USERS_CACHE.put("u3", new ShiroUser(3L, "u3", "p3", "test", true));

        PERMISSIONS_CACHE.put("admin", Arrays.asList("user:list", "user:add", "user:edit"));
        PERMISSIONS_CACHE.put("test", Collections.singletonList("user:list"));

    }
}
