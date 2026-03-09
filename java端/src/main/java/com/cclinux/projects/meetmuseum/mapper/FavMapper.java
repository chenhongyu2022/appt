package com.cclinux.projects.meetmuseum.mapper;

import com.cclinux.framework.core.mapper.ProjectBaseMapper;
import com.cclinux.projects.meetmuseum.model.FavModel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Repository("MeetMuseumFavMapper")
@Mapper
public interface FavMapper extends ProjectBaseMapper<FavModel> {
}
