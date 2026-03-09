package com.cclinux.projects.meetmuseum.mapper;

import com.cclinux.framework.core.mapper.ProjectBaseMapper;
import com.cclinux.projects.meetmuseum.model.UserModel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository("MeetMuseumUserMapper")
@Mapper
public interface UserMapper extends ProjectBaseMapper<UserModel> {
}
