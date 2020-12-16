package com.TP.Locy.connexion;
import org.springframework.beans.factory.annotation.Value;
import java.sql.*;
import com.mysql.cj.jdbc.Driver;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


public class MainConnexion {

		private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
		private static final String PROTOCOLE = "jdbc:mysql:";
		private static final String LOCALHOST = "localhost";
		private static final String PORT = "3306";
		private static final String DATABASE_NAME = "java?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC" ;
		private static final String USER_NAME = "java";
		private static final String USER_PWD = "rPVxI00HOqCLMQtx";

		public  static  void main (String[] args) {
		       try {
		          // chargement de la classe par son nom
		         Class c = Class.forName(JDBC_DRIVER) ;
		         Driver pilote = (Driver)c.newInstance() ;
		          // enregistrement du pilote aupr�s du DriverManager
		         DriverManager.registerDriver(pilote);
		          // Protocole de connexion
		         String protocole =  PROTOCOLE ;
		          // Adresse IP de l�h�te de la base et port
		         String ip =  LOCALHOST ;  // d�pend du contexte
		         String port =  PORT ;  // port MySQL par d�faut
		          // Nom de la base ;
		         String nomBase =  DATABASE_NAME;
		          // Cha�ne de connexion
		         String conString = protocole +  "//" + ip +  ":" + port +  "/" + nomBase ;
		          // Identifiants de connexion et mot de passe
		         String nomConnexion =  USER_NAME ;  // d�pend du contexte
		         String motDePasse =  USER_PWD ;  // d�pend du contexte
		          // Connexion
		         Connection con = DriverManager.getConnection(
		            conString, nomConnexion, motDePasse) ;

		          // Envoi d�un requ�te g�n�rique
		         String sql =  "select * from Annonces" ;
		         Statement smt = con.createStatement() ;
		         ResultSet rs = smt.executeQuery(sql) ;
		          while (rs.next()) {
		            System.out.println("------ NOM ----------- : \n" + rs.getString("titre")) ;
		            System.out.println("------- PRENOM --------- : \n" + rs.getString("description")) ;
		            System.out.println("-------- EMAIL --------  : \n" + rs.getString("prix")) ;
		            System.out.println("hbuybnuhuy") ;
		         }
		      }  catch (Exception e) {
		          // gestion des exceptions
		    	  System.out.println("CA NE MARCHE PAS !!!") ;
		      }
		   }
}
