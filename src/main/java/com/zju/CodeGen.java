package com.zju;

import com.zju.meta.Meta;
import com.zju.meta.Table;
import com.zju.meta.TableColumn;
import com.zju.util.FreeMarkerUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.sql.*;

/**
 * @author ted on 16/8/23.
 */
@Service
public class CodeGen {

    @Value("${mysql.driverName}")
    private String driverName;
    @Value("${mysql.url}")
    private String url;
    @Value("${mysql.username}")
    private String username;
    @Value("${mysql.password}")
    private String password;
    @Value("${mysql.tablename}")
    private String tableName;

    public void run(){
        Connection con=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        ResultSetMetaData rsmd=null;
        Table table=new Table(tableName);
        try {
            Class.forName(driverName);
            con= DriverManager.getConnection(url, username, password);
            ps=con.prepareStatement("SELECT * FROM " + tableName + " limit 1");
            rs=ps.executeQuery();
            rsmd=rs.getMetaData();

            for(int i=1;i<rsmd.getColumnCount();++i){
                System.out.println("ColumnName: "+rsmd.getColumnName(i).trim()+" ColumnType: "+rsmd.getColumnTypeName(i).trim());
                table.getColumns().add(new TableColumn(rsmd.getColumnName(i).trim(),rsmd.getColumnTypeName(i).trim()));
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                rs.close();
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        Meta meta=new Meta(table);
        new FreeMarkerUtil().run(meta);
    }
}
