import java.util.*;
import java.io.*;
import bibliopack.*;

public class Bibliotheque {
	
	public static void main(String agrs[]) {
		ArrayList<Abonne> listAbonnes = new ArrayList<Abonne>();
		Abonne abonneRecherche, abonne1;
		ArrayList<Livre> listLivres = new ArrayList<Livre>();
		Livre livre1, livreRecherche = null;
		
		livre1 = new Livre("Tutoriel",234,"theRipper", "John", "Basics of network security", 1);
		abonne1 = new Abonne(2,"Yves Bobson","OUEDRAOGO", 21);
		listLivres.add(livre1);
		int x = 0;
		
		System.out.println("Bienvenu dans notre programme de gestion de biblioteque: Biblio-Gest \n \n");
		do {
			
		System.out.println("********** Programme Biblio-Gest ********** \n");
		System.out.println("1---Ajout de livre ");
		System.out.println("2---Ajout d'abonne(e) ");
		System.out.println("3---Affichage un livre specifique");
		System.out.println("4---Affichage un abonne specifique");
		System.out.println("5---Affichage de les livres ");
		System.out.println("6---Affichage de tous les abonnes ");
		System.out.println("7---Modification d'un livre ");
		System.out.println("8---Modification d'un abonne ");
		System.out.println("9---Retrait d'un livre ");
		System.out.println("10---Retrait d'un abonne ");
		System.out.println("11---Emprunt de livre ");
		System.out.println("12---Remise de livre ");
		System.out.println("13---Rapport Biblio-Gest");
		System.out.println("14---Quitter \n");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Que voulez vous faire?: ");
		int str = sc.nextInt();
		sc.nextLine();
		
		switch(str){
			
		
		default:
			System.out.println("Entrez le numero correspondant a votre choix d'operation a executer");
			
		case 1:
			int x1 = 1;
			while (x1 != 0) {
			Livre l;
			
			System.out.println("********** Ajouter un livre **********\n");
			System.out.println("Entrer le genre du livre: ");
			Scanner sca = new Scanner(System.in);
			String genrel = sca.nextLine();
			System.out.println("Entrer le nombre de pages : ");
			int nbP = sca.nextInt();
			System.out.println("Entrer le prenom de l'auteur :");
			sca.nextLine();
			String auteurPrenom = sca.nextLine();
			System.out.println("Entre le nom de l'auteur :");
			String auteurNom = sca.nextLine();
			System.out.println("Entrer le titre du livre :");
			String titre = sca.nextLine();
			System.out.println("Entrer le code du livre :");
			int isbn = sca.nextInt();
			l = new Livre(genrel.toUpperCase(),nbP,auteurPrenom,auteurNom.toUpperCase(),titre,isbn);
			listLivres.add(l);
			System.out.println("Livre ajoute a la bibliotheque");
			Scanner scx1 = new Scanner(System.in);
			System.out.print("Ajouter un autre livre ? 1 = oui / 0 =non : ");

			 x1 = scx1.nextInt();
			 scx1.nextLine();			}
			break;
			
		case 2:
			int x2 =1;
			while(x2 != 0) {
			Abonne a;
			System.out.println("********** Ajout d'abonne(e) **********\n");
			System.out.println("Entrer l'ID de l'abonne(e): ");
			Scanner scl = new Scanner(System.in);
			int ida = scl.nextInt();
			scl.nextLine();
			System.out.println("Entrer le prenom de l'abonne(e): ");
			String abonnePrenom = scl.nextLine();
			System.out.println("Entrer le nom de l'abonne(e): ");
			String abonneNom = scl.nextLine();
			System.out.println("Entrer le nombre d'ans de l'abonne(e): ");
			int agea = scl.nextInt();
			a = new Abonne(ida,abonnePrenom,abonneNom,agea);
			listAbonnes.add(a);
			System.out.println("Abonne ajoute");
			Scanner scx2 = new Scanner(System.in);
			System.out.print("Ajouter un(e) autre abonne(e) ? 1 = oui / 0 =non : :");
			x2 = scx2.nextInt();
			scx2.nextLine();
			}
			break;
			
		case 3:
			int x3 = 1;
			while(x3 != 0) {
			System.out.println("********** Afficher un livre **********");
			System.out.println("Entrer le numero ISBN du livre a afficher :");			
			Scanner scla = new Scanner(System.in);
			int laa = scla.nextInt();
			for(Livre li : listLivres) {
			  if(li.getIsbn() == laa) {  
				System.out.println("Details sur le livre choisi");
				System.out.println("Numero ISBN : "+ li.getIsbn());
				System.out.println("Titre : "+ li.getTitre());
				System.out.println("Genre : "+ li.getGenre().toUpperCase());
				System.out.println("Nombre de pages : "+ li.getNbPages() + " pages");
				System.out.println("Auteur : "+ li.getAuteurPrenom() + " " + li.getAuteurNom().toUpperCase());
				if(li.getDisponibility()) {
					System.out.println("Livre disponible");
				}else {
					for(Abonne ar : listAbonnes) {
						if(ar.getIdAbonne() == li.getIdAbonne()) {
							System.out.println("Livre pris par "+ar.getAbonnePrenom()+"  "+ar.getAbonneNom().toUpperCase());
						}
					 }
				 }
			  } 
			}
			Scanner scx3 = new Scanner(System.in);
			System.out.print("Afficher les informations d'un autre livre ? 1 = oui / 0 =non : ");
			x3 = scx3.nextInt();
			scx3.nextLine();
			}
			break;
		case 4:
			int x4 = 1;
			while(x4 != 0) {
			System.out.println("********** Afficher un(e) abonne(e) **********\n");
			System.out.println("Entrez l'ID de l'abonne(e) pour afficher ses informations");
			Scanner sc4 = new Scanner(System.in);
			int idr = sc4.nextInt();
			for(Abonne alr : listAbonnes) {
				if(alr.getIdAbonne() == idr) {
					System.out.println("Details de l''abonne(e) numero: "+alr.getIdAbonne());
					System.out.println("Nom :  "+alr.getAbonneNom().toUpperCase());
					System.out.println("Prenom :  "+alr.getAbonnePrenom());
					System.out.println("Age :  "+alr.getAge()+" ans");
					if(alr.getIsbn() == -1) {
						System.out.println("Cet(te) abonne(e) n'a actuellement aucun livre en sa possession");
					} else {
						for(Livre lepa : listLivres) {
							if(alr.getIsbn() == lepa.getIsbn()) {
								System.out.println(alr.getAbonnePrenom()+" "+alr.getAbonneNom()+ " a emprunte le livre "+lepa.getTitre());
							}
						}
					}
				}
			}
			Scanner scx4 = new Scanner(System.in);
			System.out.println("Afficher un(e) autre abonne(e) ? 1 = oui / 0 =non : ");
			x4 = scx4.nextInt();
			scx4.nextLine();
			}
			break;
			
		case 5:
			int x5 = 1;
			while(x5 != 0) {
			System.out.println("********** Tous les livres **********\n");
			for(Livre ldb : listLivres) {
				System.out.println("ISBN : " + ldb.getIsbn() + " : Titre : " + ldb.getTitre()+" : Genre "+ldb.getGenre()+" ; "+ldb.getNbPages()+" pages ; Auteur: "+ldb.getAuteurPrenom()+ " " +ldb.getAuteurNom());
			}
			System.out.print("Afficher encore tous les livres ? 1 = oui / 0 =non : ");
			Scanner scx5 = new Scanner(System.in);
			x5 = scx5.nextInt();
			scx5.nextLine();
			}
			break;
			
		case 6:
			int x6 = 1;
			while(x6 != 0) {
			System.out.println("********** Tous les abonnes **********\n");
			for(Abonne adb : listAbonnes) {
				System.out.println("ID numero : " + adb.getIdAbonne()+ "; "+adb.getAbonnePrenom()+ " " +adb.getAbonneNom()+ "; "+adb.getAge()+" ans");
			}
			System.out.print("Afficher encore les abonnes ? 1 = oui / 0 =non : ");
			Scanner scx6 = new Scanner(System.in);
			x6 = scx6.nextInt();
			scx6.nextLine();
			}
			break;
			
		case 7:
			int x7 = 1;
			while(x7 != 0) {
			System.out.println("********** Modifier un livre **********\n");
			System.out.println("Entrer le code du livre a modifier :");
			Scanner sclam = new Scanner(System.in);
			int idlm = sclam.nextInt();
			boolean exist = false;
			for(Livre lam : listLivres) {
				if(idlm == lam.getIsbn()) {
					exist = true;
					System.out.println("Entrez les informations suivantes\n");
					System.out.println("Genre: ");
					Scanner sc7 = new Scanner(System.in);
					String nGenre = sc7.nextLine();
					lam.setGenre(nGenre.toString());
					System.out.println("Nombre de pages: ");
					int nNbPage = sc7.nextInt();
					lam.setNbPages(nNbPage);
					sc7.nextLine();
					System.out.println("Prenom de l'auteur: ");
					String nAuteurPrenom = sc7.nextLine();
					lam.setAuteurPrenom(nAuteurPrenom);
					System.out.println("Nom de l'auteur: ");
					String nAuteurNom = sc7.nextLine();
					lam.setAuteurNom(nAuteurNom);
					System.out.println("Titre: ");
					String nTitre = sc7.nextLine();
					lam.setTitre(nTitre);
					System.out.println("Nouveau code ISBN: ");
					int nIsbn = sc7.nextInt();
					lam.setIsbn(nIsbn);
					sc7.nextLine();
				}
			}
			if(exist != true) {
				System.out.println("Livre inexistant");
			}
			Scanner scx7 = new Scanner(System.in);
			System.out.print("Modifier un autre livre ? 1 = oui / 0 =non : ");
			x7 = scx7.nextInt();
			scx7.nextLine();
			}
			break;
			
		case 8:
			int x8 = 1;
			while(x8 != 0) {
			System.out.println("********** Modifier un abonne **********\n");
			System.out.println("Entrer l'ID de l'abonne(e) pour modifier ses informations :");
			Scanner scaam = new Scanner(System.in);
			int idaam = scaam.nextInt();
			scaam.nextLine();
			boolean aExiste = false;
			for(Abonne aam : listAbonnes) {
				if(idaam == aam.getIdAbonne()) {
					aExiste = true;
					System.out.println("Entrez les informations suivantes\n");
					System.out.println("Nouvel ID de l'abonne: ");
					int idam = scaam.nextInt();
					aam.setIdAbonne(idam);
					scaam.nextLine();
					System.out.println("Nom: ");
					String nam = scaam.nextLine();
					aam.setAbonneNom(nam);
					System.out.println("Prenom: ");
					String pam = scaam.nextLine();
					aam.setAbonnePrenom(pam);
					System.out.println("Age: ");
					int aaam = scaam.nextInt();
					aam.setAge(aaam);
				}
			}
			System.out.print("Modifier de nouveau un(e) abonne(e) ? 1 = oui / 0 =non : ");
			Scanner sc8 = new Scanner(System.in);
			x8 = sc8.nextInt();
			sc8.nextLine();
			}
			break;
			
		case 9:
			int x9 = 1;
			while(x9 != 0) {
			System.out.println("********** Retirer un livre de la bibliotheque **********\n");
			System.out.println("Entrer le code ISBN du livre a retirer :");


			try{
			Scanner sc9 = new Scanner(System.in);
			int isbnlr = sc9.nextInt();
			boolean lrExiste = false;
			int i = 0;
			ArrayList<Livre> listLivresCopy = listLivres;
			for(Livre lr : listLivresCopy) {
				//i++;
				if(isbnlr == lr.getIsbn()) {
					lrExiste = true;
					listLivresCopy.remove(lr.getIsbn()-1);
				}
			}
			
			if(lrExiste != true) {
				System.out.println("Erreur! Livre inexistant!");
			}
			
			}
			catch (ConcurrentModificationException ignored){
				System.out.println("Retrait de livre effectue.");
				System.out.print("Retirer un autre livre de la bibliotheque ?  1 = oui / 0 =non : ");
				Scanner scx9 = new Scanner(System.in);
				x9 = scx9.nextInt();
				scx9.nextLine();
			}
			}
			break;
			
		case 10:
			int x10 = 1;
			while(x10 != 0) {
			System.out.println("******* Retrait d'un abonne de la bibliotheque *******\n");
			System.out.println("Entrer l'ID de l'abonne(e) :");

			try{
			Scanner scar = new Scanner(System.in);
			int idar = scar.nextInt();
			boolean arExiste = false;
			for(Abonne ar : listAbonnes) {
				if(idar == ar.getIdAbonne()) {
					arExiste = true;
					listAbonnes.remove(ar);
				}
			}
			
			if(arExiste != true) {
				System.out.println("Erreur! Abonne(e) inexistant(e) !");
			}
			
			}
			catch (ConcurrentModificationException ignored){
				System.out.println("Retrait d'un(e) abonne(e) effectue.");
				System.out.print("Retirer un autre abonne de la bibliotheque ?  1 = oui / 0 =non : ");
				Scanner sc10 = new Scanner(System.in);
				x10 = sc10.nextInt();
				sc10.nextLine();
			}
			}
			break;
		case 11:
			int x11 = 1;
			while(x11 != 0) {
			System.out.println("********** Emprunter un livre **********\n");
			System.out.println("Entrer le numero ISBN du livre :");
			Scanner scle = new Scanner(System.in);
			int idle = scle.nextInt();
			boolean leDispo = false;
			boolean aadl1 = false;
			boolean leExiste = false;
			boolean aveExiste = false;
			for(Livre le : listLivres) {
				if(idle == le.getIsbn()) {
					leExiste = true;
					if(le.getDisponibility() == true) {
						leDispo = true;
						System.out.println("Numero ID de l'abonne(e) empuntant le livre :");
						int idave = scle.nextInt();
						for(Abonne ave : listAbonnes) {
							if(idave == ave.getIdAbonne()) {
								aveExiste = true;
								if(ave.getIsbn() == (-1)) {
									aadl1 = true;
								    ave.setIdAbonne(le.getIsbn());
								    le.setDisponibility(false);
								    ave.setIsbn(ave.getIdAbonne());
								    System.out.println("Emprunt effectue");
								}
							}
						}
					}
				}
			}
			if(leExiste != true) {
				System.out.println("Erreur! Livre inexistant !");
			}
			if(aveExiste != true) {
				System.out.println("Erreur! Abonne(e) inexistant !");
			}
			if(aadl1 == false) {
				System.out.println("L'abonne a deje emprunte un livre! Pas d'emprunt possible pour deux livres a la fois !");
			}
			if(leDispo == false) {
				System.out.println("Livre actuellement emprunte! Attendre qu'il soit remis/disponible avant de vouloir l'emprunter");
			}
			System.out.print("Emprunter un autre livre ?  1 = oui / 0 =non : ");
			Scanner sc11 = new Scanner(System.in);
			x11 = sc11.nextInt();
			sc11.nextLine();
			}
			break;
		case 12:
			int x12 = 1;
			while(x12 != 0) {
			System.out.println("*********** Rendre un livre ***********");
			System.out.println("Entrer le numero ISBN du livre a rendre: ");
			Scanner sclr = new Scanner(System.in);
			int idlr = sclr.nextInt();
			sclr.nextLine();
			for(Livre lr : listLivres) {
				if(idlr == lr.getIsbn()) {
					for(Abonne arl : listAbonnes) {
						if(lr.getIdAbonne() == arl.getIdAbonne()) {
							lr.setDisponibility(true);
							lr.setIdAbonne(-1);
							arl.setIsbn(-1);
							System.out.println("Livre remis a la bibliotheque");
							System.out.println(arl.getAbonneNom()+" peut de nouveau emprunter");
						}
					}
				}
			}
			System.out.println("Rendre un autre livre ?  1 = oui / 0 =non : ");
			Scanner sc12 = new Scanner(System.in);
			x12 = sc12.nextInt();
			sc12.nextLine();
			}
			break;
		case 13:
			int x13 = 1;
			while(x13 != 0) {
			System.out.println("*********** Etat de la disponibilite des lvres de la biblioteque ***********");
			ArrayList<String> listGenres = new ArrayList<String>();
			boolean genreDenombre = false;
			for(Livre gdl : listLivres) {
				listGenres.add(gdl.getGenre().toLowerCase());
				String genreActuel = gdl.getGenre().toLowerCase();
				int ld =0;
				int li = 0;
				for(Livre gal : listLivres) {
					for(String genreConcerne : listGenres) {
						if(genreActuel == genreConcerne) {
							genreDenombre = true;
						}
					}
					if(genreDenombre == false) {
					  if(gal.getGenre().toLowerCase() == genreActuel) {
						  if(gal.getDisponibility() == true) {
							  ld++;
						  } else {
							  li++;
						  }
					  }
					}
				}
				System.out.println("Les livres de '"+ genreActuel + "' sont au nombre de " +ld+" disponibles en bibliotheque et "+li+" indisponibles pour emprunt");
			}
			System.out.print("Afficher le rapport a nouveau ?  1 = oui / 0 =non : ");
			Scanner sc13 = new Scanner(System.in);
			x13 = sc13.nextInt();
			sc13.nextLine();
			}
			break;
		case 14:
			System.out.println("Merci d'avoir utilise Biblio-Gest!! A la prochaine");
			System.exit(0);
			break;
		}
		
		} while(x != 1);		
	}
}
