package proprio;
import java.sql.*;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;


public class personDriver {
        private Connection connect = dbconnector.connectDb();

    // Méthode de recherche d'utilisateur par nom
    public ObservableList<personClass> findUserByName(String name) {
        ObservableList<personClass> users = FXCollections.observableArrayList();
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            String query = "SELECT * FROM locataire WHERE nom = ?";
            statement = connect.prepareStatement(query);
            statement.setString(1, name);
            resultSet = statement.executeQuery();

            while (resultSet.next()) {
                personClass user = new personClass(resultSet.getString("num_piece"), resultSet.getString("nom"),
                resultSet.getString("prenom"), resultSet.getString("telephone"));
                users.add(user);
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

        return users;
    }

        // Méthode de recherche d'utilisateur par prenom
        public ObservableList<personClass> findUserByPrenom(String name) {
            ObservableList<personClass> users = FXCollections.observableArrayList();
            PreparedStatement statement = null;
            ResultSet resultSet = null;
    
            try {
                String query = "SELECT * FROM locataire WHERE prenom = ?";
                statement = connect.prepareStatement(query);
                statement.setString(1, name);
                resultSet = statement.executeQuery();
    
                while (resultSet.next()) {
                    personClass user = new personClass(resultSet.getString("num_piece"), resultSet.getString("nom"),
                    resultSet.getString("prenom"), resultSet.getString("telephone"));
                    users.add(user);
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
    
            return users;
        }

        // Méthode de recherche d'utilisateur par telephone
        public ObservableList<personClass> findUserByTelephone(String name) {
            ObservableList<personClass> users = FXCollections.observableArrayList();
            PreparedStatement statement = null;
            ResultSet resultSet = null;
    
            try {
                String query = "SELECT * FROM locataire WHERE telephone = ?";
                statement = connect.prepareStatement(query);
                statement.setString(1, name);
                resultSet = statement.executeQuery();
    
                while (resultSet.next()) {
                    personClass user = new personClass(resultSet.getString("num_piece"), resultSet.getString("nom"),
                    resultSet.getString("prenom"), resultSet.getString("telephone"));
                    users.add(user);
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
    
            return users;
        }

    // Méthode de recherche d'utilisateur 
    public ObservableList<personClass> findUserAll() {
        ObservableList<personClass> users = FXCollections.observableArrayList();
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            String query = "SELECT * FROM locataire";
            statement = connect.prepareStatement(query);
            resultSet = statement.executeQuery();

            while (resultSet.next()) {
                personClass user = new personClass(resultSet.getString("num_piece"), resultSet.getString("nom"),
                resultSet.getString("prenom"), resultSet.getString("telephone"));
                users.add(user);
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

        return users;
    }
    
    // Méthode de recherche d'utilisateur par CNI
    public personClass findUserByCNI(String name) {
        personClass user = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            String query = "SELECT * FROM locataire WHERE num_piece = ?";
            statement = connect.prepareStatement(query);
            statement.setString(1, name);
            resultSet = statement.executeQuery();

            while (resultSet.next()) {
                user = new personClass(resultSet.getString("num_piece"), resultSet.getString("nom"),
                resultSet.getString("prenom"), resultSet.getString("telephone"));
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

        return user;
    }
}
