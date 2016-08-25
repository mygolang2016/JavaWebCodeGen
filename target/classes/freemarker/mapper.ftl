<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE mapper PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN" "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
<mapper namespace="com.netease.dao.BackendUserDao">
    <resultMap id="BaseResultMap" type="com.netease.entity.BackendUserInfo">
        <id column="id" jdbcType="BIGINT" property="id" />
        <#list meta.fields as fields>
            <result column="${fields.databaseName}" jdbcType="${fields.databaseTyep}" property="${fields.camelCaseName?uncap_first}" />
        </#list>
    </resultMap>
    <select id="selectByPrimaryKey" parameterType="java.lang.Long" resultMap="BaseResultMap">
        select
        <include refid="Base_Column_List" />
        from backend_user
        where id = #{id,jdbcType=BIGINT}  and status = 0 and account_status != -1
    </select>
    <delete id="deleteByPrimaryKey" parameterType="java.lang.Long">
        delete from backend_user
        where id = #{id,jdbcType=BIGINT}
    </delete>
    <insert id="insert" parameterType="com.netease.entity.BackendUserInfo">
        insert into backend_user (id, corp_email, nick_name,
        password, local_token, account_status,
        account_role, create_time, status,
        db_update_time)
        values (#{id,jdbcType=BIGINT}, #{corpEmail,jdbcType=VARCHAR}, #{nickName,jdbcType=VARCHAR},
    #{password,jdbcType=VARCHAR}, #{localToken,jdbcType=VARCHAR}, #{accountStatus,jdbcType=TINYINT},
    #{accountRole,jdbcType=TINYINT}, #{createTime,jdbcType=TIMESTAMP}, #{status,jdbcType=TINYINT},
    #{dbUpdateTime,jdbcType=TIMESTAMP})
    </insert>
    <update id="updateByPrimaryKey" parameterType="com.netease.entity.BackendUserInfo">
        update backend_user
        set corp_email = #{corpEmail,jdbcType=VARCHAR},
        nick_name = #{nickName,jdbcType=VARCHAR},
        password = #{password,jdbcType=VARCHAR},
        local_token = #{localToken,jdbcType=VARCHAR},
        account_status = #{accountStatus,jdbcType=TINYINT},
        account_role = #{accountRole,jdbcType=TINYINT},
        create_time = #{createTime,jdbcType=TIMESTAMP},
        status = #{status,jdbcType=TINYINT},
        db_update_time = #{dbUpdateTime,jdbcType=TIMESTAMP}
        where id = #{id,jdbcType=BIGINT}
    </update>
</mapper>