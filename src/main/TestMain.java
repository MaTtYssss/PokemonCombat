package main;

import java.io.IOException;
import java.util.Arrays;

import creationcsv.CreationCsvPok;
import dresseur.DresseurIA;
import dresseur.StrategyAleatoire;
import org.json.simple.parser.ParseException;

import capacite.Capacite;
import pokedex.Pokedex;
//import pokedex.Pokedex;
import pokemon.Espece;
import pokemon.Pokemon;
import type.Type;

public class TestMain {

	public static void main(String[] args) throws ParseException, IOException, java.text.ParseException, InterruptedException {


		Pokedex pok = new Pokedex(); // Initialise un pokedex

		pok.afficheIntroPokemon();
		System.out.println("\n");
		/// -----------CLASSE-ESPECE-----------------
		Espece esp = new Espece(); // Cree une espece esp
		Espece espB = new Espece(); // Cree une espece espB

		esp.setNom("Magikarp"); // Initialise le de l'espece esp "caterpie"
		espB.setNom("Bulbasaur"); // Initialise le de l'espece espB "Mewtwo"*/
		/*
		esp.getCapSet(); // Affiche les capacites de l'espece esp
		esp.toString(); // Affiche les infos de l'espece esp
		esp.afficheEsp(); // Affiche le nom de l'espece
		esp.getBaseStat(); // Affiche les stats de base de l'espece
		esp.getNom(); // Affiche le nom de l'espece
		esp.getNiveauDepart(); // Affiche le niveau de depart de esp
		esp.getBaseExp(); // Affiche l'experience de base de l'espece esp
		esp.getCapSet(); // Renvoie un tableau de capacites qui sont les capacites de base
		esp.getEvolution(); // Affiche l'evolution de esp
		esp.getEvolution(50); // Affiche l'evolution de esp si il y en a une apres le niveau 50
		esp.getTypes(); // Renvoie un tableau de type qui est les types de esp
		esp.getNiveauMutation(); // Renvoie le niveau au quel esp peu evoluer
		esp.setType1(Type.Dragon); // Modifie et set le premier type du pokemon
		esp.setType1(Type.Water); // Modifie et set le second type du pokemon
		*/
		/// -----------CLASSE-POKEDEX----------------

		pok.initializeFromCSVRecupInfoEspece("listePokemon1G.csv"); // initialise les infos des especes
		/*
		pok.getInfo("Mewtwo");// affiche les informations du pokemon "Bulbasaur" depuis le pokedex

		pok.getNivMutation(); // affiche le niveau de mutation de
		*/

		pok.initialiseFromCsvMoves("listeCapacites.csv"); // initialise les infos des capacites
		/*
		pok.getCapacite(36); // affiche les informations de la capacite 36
		/*
		pok.getCapacite("tackle"); // affiche les informations de la capacite "tackle"
		pok.getPokeInfoNom().get("Bulbasaur").getEvolution(16); // affiche les informations de l'evolution de "Bulbasaur"("Ivysaur")
		*/
		pok.initialiseFromCsvEfficacity("efficacites.csv"); // initialise le tableau des efficacites
		System.out.println(pok.getEfficacite(Type.Bug, Type.Normal));
		/*
		System.out.println(pok.getEfficacite(Type.Fighting, Type.Dragon)); // affiche le double (soit 0, soit 0.5, soit 1, soit 2)
		/*
		System.out.println(pok.engendreRanch()[5]); // affiche le pokemon engendre par engendreRanch
		pok.getPokeInfoIndice(); //
		*/


		/// -----------CLASSE-POKEMON----------------
		/*





		//pokemon.subitAttaqueDe(pokemonB, capB); // retire a pokemonB le nombre de pv qui eqivaut aux degats infliges par capB
		pokemon.vaMuterEn(espB);// change l'espece de pokemon en espB
		pokemon.getCapacitesApprises(); // Affiche les capacites apprises de pokemon
		pokemon.getExperience(); // Renvoie l'experience de pokemon
		pokemon.toString(); // Affiche pokemon et ses attributs
		pokemon.getStat(); // Renvoie les stats de pokemon
		pokemon.getNiveau(); // Renvoie le niveau de pokemon
		pokemon.getId(); // Renvoie l'id de pokemon
		pokemon.getNom(); // Renvoie le nom de pokemon
		pokemon.getPourcentagePV(); // Renvoie le pourcentage des pv restants de pokemon
		pokemon.getEspece(); // Renvoie l'espece de pokemon
		pokemon.vaMuterEn(pokemon.getEspece()); // Renvoie l'espece Evoluante de pokemon
		pokemon.getCapacitesApprises(); // Renvoie les capacites apprises de pokemon
		pokemon.gagneExperienceDe(pokemonB); // Renvoie l'experience gagnee dans le combat entre pokemon et pokemonB
		pokemon.estEvanoui();// Renvoie si pokemon est evanoui
		pokemon.aChangeNiveau();// Renvoie si pokemon a receement chage de niveau
		pokemon.peutMuter();// Renvoie si pokemon peut evoluer
		pokemon.soigne();// soigne pokemon
		pokemon.getPvMax();// renvoie les pv max de pokemon
		pokemon.setPvMax(pokemon.getPvMax());// set les pvmax de pokemon
		*/


		esp = (Espece) pok.getInfo(esp.getNom());
		espB = (Espece) pok.getInfo(espB.getNom());
		Pokemon pokemon = new Pokemon(esp); // Avec l'espece creee, creer un pokemon "pokemon" apartenant a cette espece
		Pokemon pokemonB = new Pokemon(espB); // Avec l'espece creee, creer un pokemon "pokemonB" apartenant a cette espece

/*
		CreationCsvPok csvCap = new CreationCsvPok();
		csvCap.remplirCsv();
/*
        System.out.println(pokemon);
		System.out.println(esp);
		System.out.println(pok.getCapacite("tackle"));

 */
/*
		Capacite[] cap = pok.remplirTabDeCapacite();


		System.out.println("-------------------------------------------------\n");


		System.out.println(Arrays.toString(esp.getCapSet()));

		StrategyAleatoire strat = null;
		DresseurIA dressIA = new DresseurIA("", strat);
		strat = new StrategyAleatoire(dressIA);
		dressIA.setRanch((Pokemon[]) pok.engendreRanch());

		dressIA.getPokemon(0).apprendCapacites(cap);
		dressIA.getPokemon(1).apprendCapacites(cap);
		dressIA.getPokemon(2).apprendCapacites(cap);
		dressIA.getPokemon(3).apprendCapacites(cap);
		dressIA.getPokemon(4).apprendCapacites(cap);
		dressIA.getPokemon(5).apprendCapacites(cap);

		/*
		DresseurExpert dressIAExpert = new DresseurExpert("",strat);
		StrategyIAExpert strat = new StrategyIAExpert(dressIAExpert,dressIA);



		dressIAExpert.setRanch((Pokemon[]) pok.engendreRanch());


		dressIAExpert.getPokemon(0).apprendCapacites(cap);
		dressIAExpert.getPokemon(1).apprendCapacites(cap);
		dressIAExpert.getPokemon(2).apprendCapacites(cap);
		dressIAExpert.getPokemon(3).apprendCapacites(cap);
		dressIAExpert.getPokemon(4).apprendCapacites(cap);
		dressIAExpert.getPokemon(5).apprendCapacites(cap);

		StrategyIAExpert strat = new StrategyIAExpert(dressIAExpert,dressIA);


		strat.afficheRanch();
		System.out.println("Puissance du ranch de d1 : " + strat.calculPuissanceCapRanch(dressIA));
		System.out.println("Puissance du Cap set du premier pokémon : " + strat.calculCapPokemon((Pokemon) dressIA.getPokemon(0)));
		System.out.println(strat.etatDuJeu());
*/




		/*
		pokemon.apprendCapacites(cap);


		System.out.println(Arrays.toString(pokemon.getCapacitesApprises()));



		System.out.println("********************************************************************");
		*/


	/*

		pokemonB.apprendCapacites(cap);

		System.out.println(Arrays.toString(pokemonB.getCapacitesApprises()) );
	*/


/*
		DresseurIA ia = new DresseurIA("");



		ia.setRanch((Pokemon[]) pok.engendreRanch());

	//Initialize les capacites du ranch de l'ia aleatoire



				ia.getPokemon(0).apprendCapacites(cap);
				ia.getPokemon(1).apprendCapacites(cap);
				ia.getPokemon(2).apprendCapacites(cap);
				ia.getPokemon(3).apprendCapacites(cap);
				ia.getPokemon(4).apprendCapacites(cap);
				ia.getPokemon(5).apprendCapacites(cap);







		System.out.println(ia.getNom());
		ia.setPokemon(ia.choisitCombattant());
		System.out.println(ia.getPokemonIA().getNom() + " \n") ;


		ImagesPokemon images = new ImagesPokemon();



		DresseurHumain dresHumain = new DresseurHumain("");



		dresHumain.setRanch((Pokemon[]) pok.engendreRanch());

	//Initialize les capacites du ranch du dresseur humain

		System.out.println("Veulleiz attendre quelques instants \n");
		dresHumain.getPokemon(0).apprendCapacites(cap);
		dresHumain.getPokemon(1).apprendCapacites(cap);
		dresHumain.getPokemon(2).apprendCapacites(cap);
		dresHumain.getPokemon(3).apprendCapacites(cap);
		dresHumain.getPokemon(4).apprendCapacites(cap);
		dresHumain.getPokemon(5).apprendCapacites(cap);





		dresHumain.setPokemon(dresHumain.choixPokemonCombat());


		System.out.println("------------------------------------------------------------------------------------------------------ \n");

		Combat sisi = new Combat(dresHumain,ia);

		sisi.commence();
	}
*/

	}
}