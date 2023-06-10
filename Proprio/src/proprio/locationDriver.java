package proprio;
import java.sql.*;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;


public class locationDriver {
        private Connection connect = dbconnector.connectDb();

        public ObservableList<String> fillComboNumPieceAddLocation() {
            ObservableList<String> combo = FXCollections.observableArrayList();
            PreparedStatement statement = null;
            ResultSet resultSet = null;
    
            try {
                String query = "SELECT num_piece FROM locataire";
                statement = connect.prepareStatement(query);
                resultSet = statement.executeQuery();
    
                while (resultSet.next()) {
                    combo.add(resultSet.getString("num_piece"));
                }

            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                // Fermer les ressources JDBC
                if (resultSet != null) {
                    try {
                        resultSet.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
    
                if (statement != null) {
                    try {
                        statement.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }
    
            return combo;
    }

    public ObservableList<String> fillComboLogementAddLocation() {
        ObservableList<String> combo = FXCollections.observableArrayList();
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            String query = "SELECT description FROM type_logement";
            statement = connect.prepareStatement(query);
            resultSet = statement.executeQuery();

            while (resultSet.next()) {
                combo.add(resultSet.getString("description"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Fermer les ressources JDBC
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        return combo;
    }

    public ObservableList<locationClass> findLocationByNumPiece(String name) {
        ObservableList<locationClass> locations = FXCollections.observableArrayList();
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            String query = "SELECT id_location, date_deb, date_fin, num_piece, location.id_logement, type_logement.description FROM location, type_logement WHERE id_type = (SELECT id_type FROM logement WHERE logement.id_logement = location.id_logement AND location.num_piece = ?)";
            statement = connect.prepareStatement(query);
            statement.setString(1, name);
            resultSet = statement.executeQuery();

            while (resultSet.next()) {
                locationClass location = new locationClass(resultSet.getString("date_deb"), 
                resultSet.getString("date_fin"), resultSet.getString("num_piece"),
                resultSet.getString("description"), resultSet.getInt("id_location"),
                resultSet.getInt("id_logement"));
                locations.add(location);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Fermer les ressources JDBC
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        return locations;
    }

    public locationClass findLocationByNumPieceObject(String name) {
        locationClass location = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            String query = "SELECT id_location, date_deb, date_fin, num_piece, location.id_logement, type_logement.description FROM location, type_logement WHERE id_type = (SELECT id_type FROM logement WHERE logement.id_logement = location.id_logement AND location.num_piece = ?)";
            statement = connect.prepareStatement(query);
            statement.setString(1, name);
            resultSet = statement.executeQuery();

            while (resultSet.next()) {
                location = new locationClass(resultSet.getString("date_deb"), 
                resultSet.getString("date_fin"), resultSet.getString("num_piece"),
                resultSet.getString("description"), resultSet.getInt("id_location"),
                resultSet.getInt("id_logement"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Fermer les ressources JDBC
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        return location;
    }    
}