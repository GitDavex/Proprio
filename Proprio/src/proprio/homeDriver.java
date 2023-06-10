package proprio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class homeDriver {
    private Connection connect = dbconnector.connectDb();
    
    public ObservableList<String> fillComboEtatAddHome() {
        ObservableList<String> combo = FXCollections.observableArrayList();
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            String query = "SELECT libellé FROM bien";
            statement = connect.prepareStatement(query);
            resultSet = statement.executeQuery();

            while (resultSet.next()) {
                combo.add(resultSet.getString("libellé"));
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

    public ObservableList<String> fillComboAdministrateurAddHome() {
        ObservableList<String> combo = FXCollections.observableArrayList();
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            String query = "SELECT login FROM proprietaire";
            statement = connect.prepareStatement(query);
            resultSet = statement.executeQuery();

            while (resultSet.next()) {
                combo.add(resultSet.getString("login"));
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

    public ObservableList<String> fillComboQuartierAddHome() {
        ObservableList<String> combo = FXCollections.observableArrayList();
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            String query = "SELECT nom FROM quartier";
            statement = connect.prepareStatement(query);
            resultSet = statement.executeQuery();

            while (resultSet.next()) {
                combo.add(resultSet.getString("nom"));
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

    public ObservableList<String> fillComboCommuneAddHome() {
        ObservableList<String> combo = FXCollections.observableArrayList();
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            String query = "SELECT nom FROM commune";
            statement = connect.prepareStatement(query);
            resultSet = statement.executeQuery();

            while (resultSet.next()) {
                combo.add(resultSet.getString("nom"));
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

    public ObservableList<String> fillComboAdresseAddHome() {
        ObservableList<String> combo = FXCollections.observableArrayList();
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            String query = "SELECT libellé FROM adresse";
            statement = connect.prepareStatement(query);
            resultSet = statement.executeQuery();

            while (resultSet.next()) {
                combo.add(resultSet.getString("libellé"));
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

    public ObservableList<String> fillComboDescriptionAddHome() {
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

    public ObservableList<homeClass> findHomeByLoyer(Integer name) {
        ObservableList<homeClass> homes = FXCollections.observableArrayList();
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            String query = "SELECT logement.loyer, logement.superficie, logement.nb_pieces, logement.designation, bien.libellé, proprietaire.login, type_logement.description, adresse.libellé, quartier.nom, commune.nom, logement.id_logement, logement.id_bien, logement.id_type, logement.id_adresse FROM logement, bien, proprietaire, type_logement, adresse, quartier, commune WHERE logement.loyer = ? AND logement.id_bien = bien.id_bien AND bien.id_proprio = proprietaire.id_proprio AND logement.id_type = type_logement.id_type AND logement.id_adresse = adresse.id_adresse AND adresse.id_quartier = quartier.id_quartier AND quartier.id_commune = commune.id_commune;";
            statement = connect.prepareStatement(query);
            statement.setInt(1, name);
            resultSet = statement.executeQuery();

            while (resultSet.next()) {
                homeClass home = new homeClass(resultSet.getString(1), resultSet.getString(2), 
                resultSet.getString(3), resultSet.getString(4),resultSet.getString(5),
                resultSet.getString(6),resultSet.getString(7),resultSet.getString(8), 
                resultSet.getString(9), resultSet.getString(10), resultSet.getInt(11), 
                resultSet.getInt(12), resultSet.getInt(13), resultSet.getInt(14));
                homes.add(home);
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

        return homes;
    }

    public ObservableList<homeClass> findHomeBySuperficie(Double name) {
        ObservableList<homeClass> homes = FXCollections.observableArrayList();
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            String query = "SELECT logement.loyer, logement.superficie, logement.nb_pieces, logement.designation, bien.libellé, proprietaire.login, type_logement.description, adresse.libellé, quartier.nom, commune.nom, logement.id_logement, logement.id_bien, logement.id_type, logement.id_adresse FROM logement, bien, proprietaire, type_logement, adresse, quartier, commune WHERE logement.superficie = ? AND logement.id_bien = bien.id_bien AND bien.id_proprio = proprietaire.id_proprio AND logement.id_type = type_logement.id_type AND logement.id_adresse = adresse.id_adresse AND adresse.id_quartier = quartier.id_quartier AND quartier.id_commune = commune.id_commune;";
            statement = connect.prepareStatement(query);
            statement.setDouble(1, name);
            resultSet = statement.executeQuery();

            while (resultSet.next()) {
                homeClass home = new homeClass(resultSet.getString(1), resultSet.getString(2), 
                resultSet.getString(3), resultSet.getString(4),resultSet.getString(5),
                resultSet.getString(6),resultSet.getString(7),resultSet.getString(8), 
                resultSet.getString(9), resultSet.getString(10), resultSet.getInt(11), 
                resultSet.getInt(12), resultSet.getInt(13), resultSet.getInt(14));
                homes.add(home);
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

        return homes;
    }

    public ObservableList<homeClass> findHomeByNbPieces(Integer name) {
        ObservableList<homeClass> homes = FXCollections.observableArrayList();
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            String query = "SELECT logement.loyer, logement.superficie, logement.nb_pieces, logement.designation, bien.libellé, proprietaire.login, type_logement.description, adresse.libellé, quartier.nom, commune.nom, logement.id_logement, logement.id_bien, logement.id_type, logement.id_adresse FROM logement, bien, proprietaire, type_logement, adresse, quartier, commune WHERE logement.nb_pieces = ? AND logement.id_bien = bien.id_bien AND bien.id_proprio = proprietaire.id_proprio AND logement.id_type = type_logement.id_type AND logement.id_adresse = adresse.id_adresse AND adresse.id_quartier = quartier.id_quartier AND quartier.id_commune = commune.id_commune;";
            statement = connect.prepareStatement(query);
            statement.setInt(1, name);
            resultSet = statement.executeQuery();

            while (resultSet.next()) {
                homeClass home = new homeClass(resultSet.getString(1), resultSet.getString(2), 
                resultSet.getString(3), resultSet.getString(4),resultSet.getString(5),
                resultSet.getString(6),resultSet.getString(7),resultSet.getString(8), 
                resultSet.getString(9), resultSet.getString(10), resultSet.getInt(11), 
                resultSet.getInt(12), resultSet.getInt(13), resultSet.getInt(14));
                homes.add(home);
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

        return homes;
    }

    public ObservableList<homeClass> findHomeByDesignation(Integer name) {
        ObservableList<homeClass> homes = FXCollections.observableArrayList();
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            String query = "SELECT logement.loyer, logement.superficie, logement.nb_pieces, logement.designation, bien.libellé, proprietaire.login, type_logement.description, adresse.libellé, quartier.nom, commune.nom, logement.id_logement, logement.id_bien, logement.id_type, logement.id_adresse FROM logement, bien, proprietaire, type_logement, adresse, quartier, commune WHERE logement.designation = ? AND logement.id_bien = bien.id_bien AND bien.id_proprio = proprietaire.id_proprio AND logement.id_type = type_logement.id_type AND logement.id_adresse = adresse.id_adresse AND adresse.id_quartier = quartier.id_quartier AND quartier.id_commune = commune.id_commune;";
            statement = connect.prepareStatement(query);
            statement.setInt(1, name);
            resultSet = statement.executeQuery();

            while (resultSet.next()) {
                homeClass home = new homeClass(resultSet.getString(1), resultSet.getString(2), 
                resultSet.getString(3), resultSet.getString(4),resultSet.getString(5),
                resultSet.getString(6),resultSet.getString(7),resultSet.getString(8), 
                resultSet.getString(9), resultSet.getString(10), resultSet.getInt(11), 
                resultSet.getInt(12), resultSet.getInt(13), resultSet.getInt(14));
                homes.add(home);
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

        return homes;
    }

    public homeClass findHomeById(Integer name) {
        homeClass home = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            String query = "SELECT logement.loyer, logement.superficie, logement.nb_pieces, logement.designation, bien.libellé, proprietaire.login, type_logement.description, adresse.libellé, quartier.nom, commune.nom, logement.id_logement, logement.id_bien, logement.id_type, logement.id_adresse FROM logement, bien, proprietaire, type_logement, adresse, quartier, commune WHERE logement.id_logement = ? AND logement.id_bien = bien.id_bien AND bien.id_proprio = proprietaire.id_proprio AND logement.id_type = type_logement.id_type AND logement.id_adresse = adresse.id_adresse AND adresse.id_quartier = quartier.id_quartier AND quartier.id_commune = commune.id_commune;";
            statement = connect.prepareStatement(query);
            statement.setInt(1, name);
            resultSet = statement.executeQuery();

            while (resultSet.next()) {
                home = new homeClass(resultSet.getString(1), resultSet.getString(2), 
                resultSet.getString(3), resultSet.getString(4),resultSet.getString(5),
                resultSet.getString(6),resultSet.getString(7),resultSet.getString(8), 
                resultSet.getString(9), resultSet.getString(10), resultSet.getInt(11), 
                resultSet.getInt(12), resultSet.getInt(13), resultSet.getInt(14));
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

        return home;
    }
}
