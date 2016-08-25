public interface HolidayDao {
    int deleteByPrimaryKey(Long id);
    int insert(Holiday record);
    Holiday selectByPrimaryKey(Long id);
    int updateByPrimaryKey(Holiday record);
}