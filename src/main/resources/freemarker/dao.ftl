public interface ${meta.tableName}Dao {
    int deleteByPrimaryKey(Long id);
    int insert(${meta.tableName} record);
    ${meta.tableName} selectByPrimaryKey(Long id);
    int updateByPrimaryKey(${meta.tableName} record);
}