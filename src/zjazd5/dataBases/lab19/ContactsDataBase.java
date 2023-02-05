package zjazd5.dataBases.lab19;

import java.sql.*;

public class ContactsDataBase {

    //private static final String SQL_FIND_LASTNAME = "select FirstName, LastName, EmailAddress from AdventureWorks.Person.Contact where LastName like ' ? %' ";
    public static void main(String[] args) {
        //Napisz program, który korzystając z bazy danych AdventureWorks wyświetli podstawowe dane 10. pierwszych osób (Person.Contact), którzy mają na nazwisko „Anderson”.
        //Dokonaj modyfikacji powyższego programu, aby można było wyszukiwać osoby podając początek nazwiska.



        String connectionUrl = "jdbc:sqlserver://morfeusz.wszib.edu.pl;encrypt=true;databaseName=AdventureWorks;user=kanowory;password=*;trustServerCertificate=true;";

        try (Connection con = DriverManager.getConnection(connectionUrl)) {


            String sql = "select top 10 FirstName, LastName, EmailAddress from AdventureWorks.Person.Contact where LastName like ?";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, args[0] + "%");
            ResultSet rs = ps.executeQuery();

            if(!rs.next()) {
                System.out.println("Nie znaleziono żadnych osób.");
            } else {
                do {
                    System.out.println(rs.getString("FirstName") + " " +rs.getString("LastName") + " " + rs.getString("EmailAddress"));
                } while(rs.next());
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
