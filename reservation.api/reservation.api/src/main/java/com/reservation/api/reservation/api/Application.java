package com.reservation.api.reservation.api;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.reservation.api.reservation.api.model.Client;
import com.reservation.api.reservation.api.model.Film;
import com.reservation.api.reservation.api.model.Reservation;
//import com.reservation.api.reservation.api.model.Client;
//import com.reservation.api.reservation.api.model.Client;
//import com.reservation.api.reservation.api.model.Reservation;
import com.reservation.api.reservation.api.model.Spectateur;
import com.reservation.api.reservation.api.service.ClientService;
import com.reservation.api.reservation.api.service.FilmService;
import com.reservation.api.reservation.api.service.ReservationService;
//import com.reservation.api.reservation.api.service.ClientService;
//import com.reservation.api.reservation.api.service.ReservationService;
import com.reservation.api.reservation.api.service.SpectateurService;

@SpringBootApplication
public class Application implements CommandLineRunner {
   @Autowired
   private ReservationService reservationService ;
	
	
   @Autowired
  private SpectateurService spectateurService;
   
   @Autowired
   private ClientService clientService ;
   
   @Autowired 
   
  private  FilmService filmService ;

	public static void main(String[] args) {
				
	SpringApplication.run(Application.class, args);
	}
	
	@Transactional
   @Override
	public void run(String... args) throws Exception {		
		
		/*
		 * UN A PLUSIEUR ENTRE RESERVATION ET SPECTATEUR 
		 * 
		 * Iterable<Spectateur> spectateurs = spectateurservice.getSpectateur();                        
		spectateurs.forEach(spectateur->System.out.println(spectateur.getNonSpectateur()));
	
	    System.out.println("");
		Optional <Reservation> choixReservations = reservationService.getReservationById(2);
		
		Reservation reservation1 = choixReservations.get();
		
	    System.out.println(reservation1.getDateReservation());
	    
	     reservation1.getSpectateurs().forEach
	     (spectateur ->System.out.println(spectateur.getPrenomSpectateur()));
	     FIN UN A PLUSIEURS ENTRE RESERVATION ET SPECTATEUR
	     
	     */
		
	     Iterable<Client> clients = clientService.getAllClient();
	     
	    clients.forEach(client->System.out.println(client.getEmailClient()));
	    
	    Optional<Client> optClient = clientService.getClienById(3);
	    
	    
	    System.out.println("le numero du clien 3");
	    System.out.println("");
	    Client client1 = optClient.get();
	    System.out.println(client1.getTelClient());
	  
	/*    
	    // Ajouter un client avec ces attributs 
	   Client newclient = new Client(); // instencier  modifier persister 
	   newclient.setEmailClient("wade@mail.com");
	   newclient.setAgeClient(12);
	   newclient.setTelClient("02 25 87 45 65");
	   newclient.setNomClient("Wade");
	   newclient.setAgeClient(25);
	   newclient.setPrenomClient("Fatou");
	   newclient.setClientId(4);
	   //newclient.addclient(newclient);
	   newclient = clientService.addClient(newclient); // persister en appelant la methode addClient ou SaveClient
	   
	   
	   clientService.getAllClient().forEach(client->System.out.println(client.getTelClient()));// client parametre de getAllclient
	   
	   clients.forEach(client->System.out.println(client.getEmailClient()));
	   
	   client1.getReservations().forEach( 
			   
			reservation-> System.out.println(reservation.getDateReservation()));
	   
	   // Metre à jour  un client  un et un seul client ?
	   */
	   Client exClient = clientService.getClienById(2).get(); 
	   
	   System.out.println(exClient.getNomClient());
	   
	       exClient.setNomClient("Wade");
	   
	       exClient = clientService.addClient(exClient);
	        
	        System.out.println(exClient.getNomClient());
	        
	        
	        // Ajout d'un nouveau film
	       
	        Film newfilm = new Film(); 
	        
	        newfilm.setFilmId(6);
	        newfilm.setTitre("Film dans un film");
	        newfilm.setDuree("1h 45h");
	        
	        newfilm=filmService.addFilm(newfilm);
	        
	        filmService.getAllFilm().forEach(
	        		film-> System.out.println(film.getDuree()));
	      
	        // Ajout d'une nouvelle reservation
	     Reservation newReservation = new Reservation();
	     
	     newReservation.setReservationId(2);
	     newReservation.setDateReservation("25/10/2022");
	     newReservation.setNombreBillet(25);
	     newReservation.setPrixBillet("85 £");
	     newReservation.setClientId(4);
	     newReservation.setFilmId(5);
	     
	     newReservation = reservationService.addReservation(newReservation);
	        
	
	   // Ajout d'un nouveau client      
	        Client newClient = new Client();
	        
	        newClient.setClientId(1);
	        newClient.setNomClient("Lamine");
	        newClient.setPrenomClient("Ndiaye");
	       
	        newClient.setAgeClient(25);
	        newClient.setEmailClient("new@gmail.com");
	        newClient.setTelClient("25");
	      // newClient.setReservations(null);
	        newClient = clientService.saveClient(newClient);
	        
	        
	        
	       
	        //clientService.deleteClientById(4);
	       // filmService.diletFilmById(2);
	        
	   
	      // reservationService.deleteReservationById(2);
	       
	       
	       
	       // Ca marche mais suprime un téléspectateur ?
	       
	     //  spectateurService.deleteSpectateurById(1);
	       
	       
	   
	   //clientService.deleteClientById(2);
	   
	   
   }
   // Methode CREATE 
	

   
   
   
   
}




	



 