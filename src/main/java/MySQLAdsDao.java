import com.mysql.cj.jdbc.Driver;
import jdbc.Config;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads {

    private Connection connection = null;

    public MySQLAdsDao (Config config) {
        try{
        DriverManager.registerDriver(new Driver());
        connection = DriverManager.getConnection(
                config.getUrl(),
                config.getUser(),
                config.getPassword()
        );
    }catch (SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public List<Ad> all() {


        List<Ad> ads = new ArrayList<>();

        try {
            Statement stat = connection.createStatement();
            ResultSet rs = stat.executeQuery("select * from ads");

            while (rs.next()){

                ads.add(new Ad(
                  rs.getLong("id"),
                  rs.getLong("user_id"),
                        rs.getString("title"),
                        rs.getString("description")
                ));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return ads;
    }

    @Override
    public Long insert(Ad ad) {

        String query = String.format("insert into ads (user_id, title description) values(%s, '%s', '%s')", ad.getUserId(), ad.getTitle(), ad.getDescription());

        try {
            Statement stat = connection.createStatement();
            stat.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = stat.getGeneratedKeys();
            return rs.getLong(1);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


        return null;
    }
}
