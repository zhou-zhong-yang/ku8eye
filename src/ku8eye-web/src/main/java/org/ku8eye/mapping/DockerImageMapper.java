package org.ku8eye.mapping;

import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;
import org.ku8eye.domain.DockerImage;

public interface DockerImageMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table docker_image
     *
     * @mbggenerated
     */
    @Delete({
        "delete from docker_image",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);
 
    
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table docker_image
     *
     * @mbggenerated
     */
    @Insert({
        "insert into docker_image (ID, TITLE, ",
        "IMAGE_NAME, VERSION, ",
        "VERSION_TYPE, PUBLIC_IMAGE, ",
        "category, CLUSTER_ID, ",
        "REGISTRY_ID, IMAGE_ICON_URL, ",
        " AUTO_BUILD_COMMAND, ",
        " NOTE, ",
        "LAST_UPDATED, BUILD_FILE,SIZE)",
        "values (#{id,jdbcType=INTEGER}, #{title,jdbcType=VARCHAR}, ",
        "#{imageName,jdbcType=VARCHAR}, #{version,jdbcType=VARCHAR}, ",
        "#{versionType,jdbcType=TINYINT}, #{publicImage,jdbcType=TINYINT}, ",
        "#{category,jdbcType=VARCHAR}, #{clusterId,jdbcType=INTEGER}, ",
        "#{registryId,jdbcType=INTEGER}, #{imageIconUrl,jdbcType=VARCHAR}, ",
        " #{autoBuildCommand,jdbcType=VARCHAR}, ",
        " #{note,jdbcType=VARCHAR}, ",
        "#{lastUpdated,jdbcType=TIMESTAMP}, #{buildFile,jdbcType=LONGVARCHAR}, #{size,jdbcType=INTEGER})"
    })
    int insert(DockerImage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table docker_image
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "ID, TITLE, IMAGE_NAME, VERSION, VERSION_TYPE, PUBLIC_IMAGE, category, CLUSTER_ID, ",
        "REGISTRY_ID,IMAGE_URL, IMAGE_ICON_URL, STATUS, AUTO_BUILD_COMMAND, AUTO_BUILD, NOTE, LAST_UPDATED, ",
        "BUILD_FILE,SIZE",
        "from docker_image",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="TITLE", property="title", jdbcType=JdbcType.VARCHAR),
        @Result(column="IMAGE_NAME", property="imageName", jdbcType=JdbcType.VARCHAR),
        @Result(column="VERSION", property="version", jdbcType=JdbcType.VARCHAR),
        @Result(column="VERSION_TYPE", property="versionType", jdbcType=JdbcType.TINYINT),
        @Result(column="PUBLIC_IMAGE", property="publicImage", jdbcType=JdbcType.TINYINT),
        @Result(column="category", property="category", jdbcType=JdbcType.VARCHAR),
        @Result(column="CLUSTER_ID", property="clusterId", jdbcType=JdbcType.INTEGER),
        @Result(column="REGISTRY_ID", property="registryId", jdbcType=JdbcType.INTEGER),
        @Result(column="IMAGE_URL", property="imageUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="IMAGE_ICON_URL", property="imageIconUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="STATUS", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="AUTO_BUILD_COMMAND", property="autoBuildCommand", jdbcType=JdbcType.VARCHAR),
        @Result(column="AUTO_BUILD", property="autoBuild", jdbcType=JdbcType.TINYINT),
        @Result(column="NOTE", property="note", jdbcType=JdbcType.VARCHAR),
        @Result(column="LAST_UPDATED", property="lastUpdated", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="BUILD_FILE", property="buildFile", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="SIZE", property="size", jdbcType=JdbcType.INTEGER)
    })
    DockerImage selectByPrimaryKey(Integer id);
    
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table docker_image
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "ID, TITLE, IMAGE_NAME, VERSION, VERSION_TYPE, PUBLIC_IMAGE, category, CLUSTER_ID, ",
        "REGISTRY_ID, IMAGE_ICON_URL, STATUS, AUTO_BUILD_COMMAND, AUTO_BUILD, NOTE, LAST_UPDATED, ",
        "BUILD_FILE,SIZE",
        "from docker_image",
        "where IMAGE_NAME like  #{imageName,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="TITLE", property="title", jdbcType=JdbcType.VARCHAR),
        @Result(column="IMAGE_NAME", property="imageName", jdbcType=JdbcType.VARCHAR),
        @Result(column="VERSION", property="version", jdbcType=JdbcType.VARCHAR),
        @Result(column="VERSION_TYPE", property="versionType", jdbcType=JdbcType.TINYINT),
        @Result(column="PUBLIC_IMAGE", property="publicImage", jdbcType=JdbcType.TINYINT),
        @Result(column="category", property="category", jdbcType=JdbcType.VARCHAR),
        @Result(column="CLUSTER_ID", property="clusterId", jdbcType=JdbcType.INTEGER),
        @Result(column="REGISTRY_ID", property="registryId", jdbcType=JdbcType.INTEGER),
        @Result(column="IMAGE_ICON_URL", property="imageIconUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="STATUS", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="AUTO_BUILD_COMMAND", property="autoBuildCommand", jdbcType=JdbcType.VARCHAR),
        @Result(column="AUTO_BUILD", property="autoBuild", jdbcType=JdbcType.TINYINT),
        @Result(column="NOTE", property="note", jdbcType=JdbcType.VARCHAR),
        @Result(column="LAST_UPDATED", property="lastUpdated", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="BUILD_FILE", property="buildFile", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="SIZE", property="size", jdbcType=JdbcType.INTEGER)
    })
    List<DockerImage> selectByPrimary(String imageName);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table docker_image
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "ID, TITLE, IMAGE_NAME, VERSION, VERSION_TYPE, PUBLIC_IMAGE, category, CLUSTER_ID, ",
        "REGISTRY_ID, IMAGE_ICON_URL, STATUS, AUTO_BUILD_COMMAND, AUTO_BUILD, NOTE, LAST_UPDATED, ",
        "BUILD_FILE",
        "from docker_image"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="TITLE", property="title", jdbcType=JdbcType.VARCHAR),
        @Result(column="IMAGE_NAME", property="imageName", jdbcType=JdbcType.VARCHAR),
        @Result(column="VERSION", property="version", jdbcType=JdbcType.VARCHAR),
        @Result(column="VERSION_TYPE", property="versionType", jdbcType=JdbcType.TINYINT),
        @Result(column="PUBLIC_IMAGE", property="publicImage", jdbcType=JdbcType.TINYINT),
        @Result(column="category", property="category", jdbcType=JdbcType.VARCHAR),
        @Result(column="CLUSTER_ID", property="clusterId", jdbcType=JdbcType.INTEGER),
        @Result(column="REGISTRY_ID", property="registryId", jdbcType=JdbcType.INTEGER),
        @Result(column="IMAGE_ICON_URL", property="imageIconUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="STATUS", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="AUTO_BUILD_COMMAND", property="autoBuildCommand", jdbcType=JdbcType.VARCHAR),
        @Result(column="AUTO_BUILD", property="autoBuild", jdbcType=JdbcType.TINYINT),
        @Result(column="NOTE", property="note", jdbcType=JdbcType.VARCHAR),
        @Result(column="LAST_UPDATED", property="lastUpdated", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="BUILD_FILE", property="buildFile", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="SIZE", property="size", jdbcType=JdbcType.INTEGER)
    })
    List<DockerImage> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table docker_image
     *
     * @mbggenerated
     */
    @Update({
        "update docker_image",
        "set TITLE = #{title,jdbcType=VARCHAR},",
          "IMAGE_NAME = #{imageName,jdbcType=VARCHAR},",
          "VERSION = #{version,jdbcType=VARCHAR},",
          "VERSION_TYPE = #{versionType,jdbcType=TINYINT},",
          "PUBLIC_IMAGE = #{publicImage,jdbcType=TINYINT},",
          "category = #{category,jdbcType=VARCHAR},",
          "CLUSTER_ID = #{clusterId,jdbcType=INTEGER},",
          "REGISTRY_ID = #{registryId,jdbcType=INTEGER},",
          "IMAGE_ICON_URL = #{imageIconUrl,jdbcType=VARCHAR},",
          "STATUS = #{status,jdbcType=TINYINT},",
          "AUTO_BUILD_COMMAND = #{autoBuildCommand,jdbcType=VARCHAR},",
          "AUTO_BUILD = #{autoBuild,jdbcType=TINYINT},",
          "NOTE = #{note,jdbcType=VARCHAR},",
          "LAST_UPDATED = #{lastUpdated,jdbcType=TIMESTAMP},",
          "BUILD_FILE = #{buildFile,jdbcType=LONGVARCHAR}",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(DockerImage record);
}