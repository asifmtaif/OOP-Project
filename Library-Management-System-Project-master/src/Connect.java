/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Sudhir Kushwaha
 */
public class Connect {
    static Connection con=null;
    public static Connection ConnectToDB() {
        try {
             con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","mitul");
//             con=DriverManager.getConnection("jdbc:mysql://103.174.152.42:3306/gshslit1_sblibrary","gshslit1_sb", "Selfish bitch");

        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
}
}
