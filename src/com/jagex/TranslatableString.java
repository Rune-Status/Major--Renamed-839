package com.jagex;

import java.io.EOFException;
import java.util.HashMap;
import java.util.Map;

public class TranslatableString {

	public static TranslatableString RATING;
	public static TranslatableString FULL_FREE_FRIEND_LIST;
	public static TranslatableString DEV_CONSOLE_ACCESS;
	public static TranslatableString UNKNOWN_COMMAND;
	public static TranslatableString CANCEL;
	public static TranslatableString PLEASE_WAIT;
	static TranslatableString MEMBERS_TO_USE_OBJECT;
	static TranslatableString SWAP_NOTE_AT_BANK;
	public static TranslatableString DISCARD_LOAN;
	public static TranslatableString INIT_DEV_CONSOLE = new TranslatableString(
			"This is the developer console. To close, press the ALT-`, ALT-\u00b2 or ALT-\u00a7 keys on your keyboard.",
			"Das ist die Entwicklerkonsole. Zum Schlie\u00dfen, die Tasten ALT+`, ALT+\u00b2 oder ALT+\u00a7 dr\u00fccken.",
			"Ceci est la console de d\u00e9veloppement. Pour la fermer, appuyez sur les touches ALT+`, ALT+\u00b2 ou ALT+\u00a7.",
			"Este \u00e9 o painel de controle do desenvolvedor. Para fechar, pressione ALT-`, ALT-\u00b2 ou ALT-\u00a7.",
			"Esta es la consola de desarrolador. Para cerrarla, pulsa las teclas ALT-`, ALT-\u00b2 or ALT-\u00a7 en tu teclado.");
	static TranslatableString aClass5_27;
	public static TranslatableString GLOW1;
	public static TranslatableString COMBINE;
	static TranslatableString REMOVED_FROM_CHANNEL;
	public static TranslatableString DROP;
	static TranslatableString SUCCESSFUL_TEMP_BAN;
	static TranslatableString SELECT;
	public static TranslatableString FLASH1;
	static TranslatableString INVALID_PLAYER_NAME;
	static TranslatableString LOADING_INTERFACES;
	static TranslatableString SENT_TOO_MANY_REPORTS;
	static TranslatableString CANT_TALK_IN_CHANNEL;
	static TranslatableString SPOT_JMOD_BY_CROWN;
	static TranslatableString CANT_MESSAGE_PLAYER_UNAVAILABLE;
	static TranslatableString RECEIVED_REPORT;
	public static TranslatableString COMMAND_EXEC_ERROR = new TranslatableString(
			"There was an error executing the command.", "Es gab einen Fehler beim Ausf\u00fchren des Befehls.",
			"Une erreur s'est produite lors de l'ex\u00e9cution de la commande.",
			"Houve um erro quando o comando foi executado.", "Se produjo un error al ejecutar el comando.");
	static TranslatableString INVALID_NAME;
	static TranslatableString CANT_REPORT_JMOD_IMPERSONATION;
	static TranslatableString MEMBERS_TO_INTERACT;
	static TranslatableString NOTHING_INTERESTING_HAPPENS;
	static TranslatableString CANT_REACH_THAT;
	static TranslatableString INVALID_TELEPORT;
	static TranslatableString MUST_BE_MEMBERS_SERVER;
	static TranslatableString CANT_BEFRIEND_SYSTEM_BUSY;
	static TranslatableString CANT_BEFRIEND_UNKNOWN_NAME;
	static TranslatableString CANT_ADD_SYSTEM_BUSY;
	static TranslatableString CANT_ADD_UNKNOWN_NAME;
	static TranslatableString TEMP_MUTED;
	static TranslatableString CANT_REPORT_SYSTEM_BUSY;
	static TranslatableString CANT_DELETE_FRIEND_SYSTEM_BUSY;
	public static TranslatableString CONNECTION_LOST;
	static TranslatableString CANT_KICK_USER;
	public static TranslatableString SCROLL;
	static TranslatableString aClass5_60;
	static TranslatableString aClass5_61;
	static TranslatableString JOINING_CHANNEL;
	static TranslatableString DONT_SAY_PASSWORD;
	static TranslatableString CHANGE_PASSWORD;
	public static TranslatableString GLOW3;
	static TranslatableString MEMBERS_TO_USE;
	static TranslatableString PLAYER_MUST_SPEAK_REPORT;
	static TranslatableString FROM;
	static TranslatableString PLAYER_OFFLINE;
	static TranslatableString CANNOT_SEND_QUICK_CHAT;
	static TranslatableString CHANNEL_FULL;
	static TranslatableString OK;
	static TranslatableString CHAT_DISABLED;
	static TranslatableString JOINED_THE_CHANNEL;
	static TranslatableString NOT_IN_FRIENDS_CHANNEL;
	static TranslatableString aClass5_76;
	static TranslatableString ERROR_SENDING_CHANNEL_MESSAGE;
	static TranslatableString PLEASE_WAIT_LEFT_CHANNEL;
	static TranslatableString NOT_IN_CHANNEL;
	public static TranslatableString PROFILING;
	public static TranslatableString PLEASE_WAIT_REESTABLISHING;
	static TranslatableString ALREADY_JOINING_CHANNEL;
	static TranslatableString LEAVING_REQUEST_IN_PROGRESS;
	static TranslatableString INVALID_CHANNEL_NAME;
	static TranslatableString aClass5_85;
	static TranslatableString NOW_TALKING_IN_CHANNEL;
	static TranslatableString NOW_TALKING_IN_CHANNEL_OF;
	static TranslatableString ERROR_JOINING_CHANNEL;
	public static TranslatableString DISCARD_BOUGHT;
	static TranslatableString CANT_JOIN_CHANNEL;
	static TranslatableString CANT_MESSAGE_SYSTEM_BUSY;
	static TranslatableString NO_RANK_CHANNEL;
	static TranslatableString TEMP_BANNED_FROM_CHANNEL;
	static TranslatableString LOADING_ADDITIONAL_FONTS;
	public static TranslatableString WHITE;
	static TranslatableString LEFT_CHANNEL;
	static TranslatableString WAS_KICKED_FROM_CHANNEL;
	static TranslatableString LOADED_ADDITIONAL_FONTS;
	static TranslatableString UNABLE_TO_JOIN_CHANNELS;
	static TranslatableString SELF_LEFT_CHANNEL;
	static TranslatableString REQUESTING_TO_LEAVE_CHANNEL;
	static TranslatableString JOIN_YOUR_CHANNEL;
	static TranslatableString DISABLED_FRIENDS_CHAT;
	public static TranslatableString EXAMINE;
	public static TranslatableString aClass5_105;
	static TranslatableString TEMP_BLOCKED_FROM_CHANNELS;
	static TranslatableString ENABLE_FRIENDS_CHAT;
	public static TranslatableString FLASH3;
	static TranslatableString SYSTEM_UPDATE_IN;
	static TranslatableString THIS_MUTE_LASTS;
	static TranslatableString DAYS;
	static TranslatableString UNMUTED_IN_24_HOURS;
	static TranslatableString TO_PREVENT_FURTHER_MUTES;
	static TranslatableString PERMANENTLY_MUTED;
	public static TranslatableString LOADING_PLEASE_WAIT;
	static TranslatableString FRIENDS_CHAT;
	static TranslatableString aClass5_117;
	static TranslatableString REPORT_UNDER_OTHER_RULE;
	public static TranslatableString CHECKING_FOR_UPDATES;
	public static TranslatableString FETCHING_UPDATES;
	static TranslatableString LOADING_CONFIG;
	static TranslatableString LOADED_CONFIG;
	static TranslatableString LOADING_SPRITES;
	public static TranslatableString FACE_HERE;
	static TranslatableString LOADING_WORDPACK;
	static TranslatableString LOADED_WORDPACK;
	static TranslatableString aClass5_127;
	static TranslatableString LOADED_INTERFACES;
	static TranslatableString LOADING_INTERFACE_SCRIPTS;
	static TranslatableString LOADED_INTERFACE_SCRIPTS;
	public static TranslatableString FULL_MEMBERS_FRIEND_LIST;
	static TranslatableString CANT_KICK_ANYONE;
	static TranslatableString LOADING_WORLD_MAP;
	static TranslatableString LOADED_WORLD_MAP;
	static TranslatableString LOADING_WORLD_LIST;
	static TranslatableString LOADED_WORLD_LIST;
	static TranslatableString KICK_BAN_REQUEST_SUCCESSFUL;
	public static TranslatableString LOADING;
	static TranslatableString CLOSE_INTERFACE_BEFORE_REPORTING;
	public static TranslatableString WAVE2;
	static TranslatableString LOADED_CLIENT_VARS;
	public static TranslatableString HAS_LOGGED_IN;
	public static TranslatableString HAS_LOGGED_OUT;
	public static TranslatableString UNABLE_TO_FIND;
	static TranslatableString USE;
	static TranslatableString CANT_MESSAGE_PLAYER;
	public static TranslatableString ATTACK;
	public static TranslatableString CHOOSE_OPTION;
	public static TranslatableString MORE_OPTIONS;
	static TranslatableString CANT_DELETE_NAME_SYSTEM_BUSY;
	static TranslatableString SELF_KICKED_FROM_CHANNEL;
	public static TranslatableString LEVEL;
	public static TranslatableString SKILL;
	static TranslatableString HASH_PLAYER;
	public static TranslatableString CANT_BEFRIEND_SELF;
	static TranslatableString CLOSE;
	public static TranslatableString aClass5_157;
	public static TranslatableString aClass5_158;
	public static TranslatableString ALREADY_IGNORED;
	public static TranslatableString aClass5_160;
	public static TranslatableString aClass5_161;
	static TranslatableString PLAYER_ON_QUICK_CHAT_WORLD;
	public static TranslatableString SELF;
	public static TranslatableString ALREADY_BEFRIENDED;
	public static TranslatableString FULL_IGNORE_LIST_MEMBERS;
	public static TranslatableString FULL_IGNORE_LIST_FREE;
	public static TranslatableString CONTINUE;
	static TranslatableString USER_NOT_IN_CHANNEL;
	static TranslatableString SET_DISPLAY_NAME;
	static TranslatableString FRIEND_CHAT_CHANGES_TIME;
	public static TranslatableString PLEASE_REMOVE_IGNORE;
	public static TranslatableString FROM_IGNORE_LIST_FIRST;
	public static TranslatableString PLEASE_REMOVE_FRIEND;
	public static TranslatableString FROM_FRIEND_LIST_FIRST;
	static TranslatableString SHARDS_OF_TYPE;
	static TranslatableString LOADED_SPRITES;
	public static TranslatableString GREEN;
	public static TranslatableString CYAN;
	public static TranslatableString PURPLE;
	public static TranslatableString RED;
	static TranslatableString CANT_REPORT_SELF;
	public static TranslatableString FLASH2;
	public static TranslatableString CANT_IGNORE_SELF;
	public static TranslatableString WALK_HERE;
	public static TranslatableString GLOW2;
	public static TranslatableString TAKE;
	public static TranslatableString WAVE;
	public static TranslatableString SLIDE;
	public static TranslatableString SHAKE;
	static TranslatableString CHANNEL_DOESNT_EXIST;
	public static TranslatableString YELLOW;
	static TranslatableString FRIEND;
	public static Archive animations;
	static {
		DEV_CONSOLE_ACCESS = new TranslatableString(
				"The developer console can be accessed with ALT-`, ALT-\u00a7 or ALT-\u00b2.",
				"Die Entwicklerkonsole kann mit ALT+`, ALT+\u00a7 oder ALT+\u00b2 aktiviert werden.",
				"La console de d\u00e9veloppement est accessible gr\u00e2ce aux touches ALT+`, ALT+\u00a7 ou ALT+\u00b2.",
				"O painel de controle do desenvolvedor pode ser acessado com ALT-`, ALT-\u00a7 ou ALT-\u00b2.",
				"Puedes acceder a la consola de desarrollador con ALT-`, ALT-\u00a7 o ALT-\u00b2.");
		UNKNOWN_COMMAND = new TranslatableString("Unknown developer command: ", "Unbekannter Befehl: ",
				"Commande inconnue : ", "Comando desconhecido: ", "Comando desconocido: ");
		CANCEL = new TranslatableString("Cancel", "Abbrechen", "Annuler", "Cancelar", "Cancelar");
		HASH_PLAYER = new TranslatableString("#Player", "#Spieler", "#Joueur", "#Jogador", "#Jugador");
		MEMBERS_TO_USE_OBJECT = new TranslatableString("Login to a members' server to use this object.",
				"Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.",
				"Connectez-vous \u00e0 un serveur d'abonn\u00e9s pour utiliser cet objet.",
				"Acesse um servidor para membros para usar este objeto.",
				"Accede a un servidor para miembros para usar este objeto.");
		SWAP_NOTE_AT_BANK = new TranslatableString("Swap this note at any bank for the equivalent item.",
				"Dieses Zertifikat kann in einer Bank entsprechend eingetauscht werden.",
				"\u00c9changez ce re\u00e7u contre l'objet correspondant dans la banque de votre choix.",
				"V\u00e1 a qualquer banco para trocar esta nota pelo objeto equivalente.",
				"Cambia este vale en cualquier banco por el objeto equivalente.");
		DISCARD_LOAN = new TranslatableString("Discard", "Ablegen", "Jeter", "Descartar", "Descartar");
		DISCARD_BOUGHT = new TranslatableString("Discard", "Ablegen", "Jeter", "Descartar", "Descartar");
		aClass5_27 = new TranslatableString("Combine ", "Kombiniere ", "Vous pouvez combiner ",
				"Voc\u00ea pode trocar ", "Puedes combinar ");
		SHARDS_OF_TYPE = new TranslatableString(" shards of this type to receive a ",
				" dieser Fragmente, um folgenden Gegenstand herzustellen: ",
				" de ces fragments pour obtenir l'objet suivant : ", " desses fragmentos pelo seguinte objeto: ",
				" de estos fragmentos para obtener el siguiente objeto: ");
		COMBINE = new TranslatableString("Combine", "Kombinieren", "Combiner", "Combinar", "Combinar");
		TAKE = new TranslatableString("Take", "Nehmen", "Prendre", "Pegar", "Agarrar");
		DROP = new TranslatableString("Drop", "Fallen lassen", "Poser", "Largar", "Dejar");
		OK = new TranslatableString("Ok", "Okay", "OK", "Ok", "OK");
		SELECT = new TranslatableString("Select", "Ausw\u00e4hlen", "S\u00e9lectionner", "Selecionar", "Seleccionar");
		CONTINUE = new TranslatableString("Continue", "Weiter", "Continuer", "Continuar", "Continuar");
		INVALID_PLAYER_NAME = new TranslatableString("Invalid player name.", "Unzul\u00e4ssiger Charaktername!",
				"Nom de joueur incorrect.", "Nome de jogador inv\u00e1lido.", "Nombre de jugador no v\u00e1lido.");
		CANT_REPORT_SELF = new TranslatableString("You can't report yourself!", "Du kannst dich nicht selbst melden!",
				"Vous ne pouvez pas vous signaler vous-m\u00eame !",
				"Voc\u00ea n\u00e3o pode denunciar a si pr\u00f3prio!", "\u00a1No te puedes denunciar a ti mismo!");
		SENT_TOO_MANY_REPORTS = new TranslatableString(
				"You have sent too many abuse reports today! Do not abuse this system!",
				"Du hast heute schon zu viele Regelverst\u00f6\u00dfe gemeldet! Missbrauch das System nicht!",
				"Vous avez signal\u00e9 trop d\u2019abus pour aujourd\u2019hui. N\u2019abusez pas de ce syst\u00e8me !",
				"Voc\u00ea j\u00e1 denunciou abuso muitas vezes hoje. N\u00e3o abuse do sistema!",
				"\u00a1Ya has denunciado demasiadas infracciones hoy! \u00a1No abuses del sistema!");
		CANT_REPORT_JMOD_IMPERSONATION = new TranslatableString(
				"You cannot report that person for Staff Impersonation, they are Jagex Staff.",
				"Diese Person ist ein Jagex-Mitarbeiter!",
				"Cette personne est un membre du personnel de Jagex, vous ne pouvez pas la signaler pour abus d'identit\u00e9.",
				"Voc\u00ea n\u00e3o pode denunciar essa pessoa por tentar se passar por um membro da equipe Jagex, pois ela faz parte da equipe.",
				"Esa persona es miembro del personal de Jagex, no puedes denunciarla por suplantaci\u00f3n de identidad.");
		SPOT_JMOD_BY_CROWN = new TranslatableString(
				"You can spot a Jagex moderator by the gold crown next to their name.",
				"Jagex-Mitarbeiter haben eine goldene Krone neben ihrem Namen.",
				"Vous pouvez reconna\u00eetre les mod\u00e9rateurs Jagex \u00e0 la couronne dor\u00e9e en regard de leur nom.",
				"Os moderadores da Jagex s\u00e3o identificados por uma coroa dourada ao lado de seu nome.",
				"Los moderadores de Jagex tienen una corona dorada a un lado del nombre.");
		REPORT_UNDER_OTHER_RULE = new TranslatableString("You can report that person under a different rule.",
				"Diese Person kann bez\u00fcglich einer anderen Regel gemeldet werden.",
				"Vous pouvez signaler cette personne pour une autre infraction aux r\u00e8gles.",
				"Voc\u00ea pode denunciar essa pessoa por outro tipo de infra\u00e7\u00e3o.",
				"Puedes denunciar a esa persona por otro tipo de infracci\u00f3n.");
		RECEIVED_REPORT = new TranslatableString("Thank-you, your abuse report has been received.",
				"Vielen Dank, deine Meldung ist bei uns eingegangen.",
				"Merci, nous avons bien re\u00e7u votre rapport d'abus.",
				"Obrigado. Sua den\u00fancia de abuso foi recebida.", "Gracias, hemos recibido tu denuncia.");
		CANT_REPORT_SYSTEM_BUSY = new TranslatableString("Unable to send abuse report - system busy.",
				"Meldung konnte nicht gesendet werden - Systeme \u00fcberlastet",
				"Impossible de signaler un abus - Erreur syst\u00e8me",
				"Sistema ocupado. N\u00e3o foi poss\u00edvel enviar sua den\u00fancia de abuso.",
				"Sistema ocupado. No ha sido posible enviar tu denuncia.");
		INVALID_NAME = new TranslatableString("Invalid name", "Unzul\u00e4ssiger Name!", "Nom incorrect",
				"Nome inv\u00e1lido", "Nombre no v\u00e1lido");
		MEMBERS_TO_USE = new TranslatableString("To use this item please login to a members' server.",
				"Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.",
				"Veuillez vous connecter \u00e0 un serveur d'abonn\u00e9s pour utiliser cet objet.",
				"Acesse um servidor para membros para usar este objeto.",
				"Accede a un servidor para miembros para usar este objeto.");
		MEMBERS_TO_INTERACT = new TranslatableString("To interact with this please login to a members' server.",
				"Logg dich auf einer Mitglieder-Welt ein, um damit zu interagieren.",
				"Veuillez vous connecter \u00e0 un serveur d'abonn\u00e9s pour cette interaction.",
				"Para interagir, acesse um servidor para membros.",
				"Para interactuar, accede a un servidor para miembros.");
		NOTHING_INTERESTING_HAPPENS = new TranslatableString("Nothing interesting happens.",
				"Nichts Interessantes passiert.", "Il ne se passe rien d'int\u00e9ressant.",
				"Nada de interessante acontece.", "No sucede nada interesante.");
		CANT_REACH_THAT = new TranslatableString("You can't reach that.", "Da kommst du nicht hin.",
				"Vous ne pouvez pas l'atteindre.", "Voc\u00ea n\u00e3o consegue alcan\u00e7ar isso.",
				"No puedes alcanzar eso.");
		INVALID_TELEPORT = new TranslatableString("Invalid teleport!", "Unzul\u00e4ssiger Teleport!",
				"T\u00e9l\u00e9portation non valide !", "Teleporte inv\u00e1lido!",
				"\u00a1Teletransporte no v\u00e1lido!");
		MUST_BE_MEMBERS_SERVER = new TranslatableString("To go here you must login to a members' server.",
				"Du musst auf einer Mitglieder-Welt sein, um dort hinzukommen.",
				"Vous devez vous connecter \u00e0 un serveur d'abonn\u00e9s pour aller \u00e0 cet endroit.",
				"Para entrar aqui, acesse um servidor para membros.",
				"Para entrar aqu\u00ed, debes acceder a un servidor para miembros.");
		CANT_BEFRIEND_SYSTEM_BUSY = new TranslatableString("Unable to add friend - system busy.",
				"Der Freund konnte nicht hinzugef\u00fcgt werden, das System ist derzeit ausgelastet.",
				"Impossible d'ajouter un ami - syst\u00e8me occup\u00e9.",
				"N\u00e3o foi poss\u00edvel adicionar o amigo. O sistema est\u00e1 ocupado.",
				"Sistema ocupado. No es posible a\u00f1adir a un amigo.");
		CANT_BEFRIEND_UNKNOWN_NAME = new TranslatableString("Unable to add friend - unknown player.",
				"Spieler konnte nicht hinzugef\u00fcgt werden - Spieler unbekannt.",
				"Impossible d'ajouter l'ami - joueur inconnu.",
				"N\u00e3o foi poss\u00edvel adicionar esse amigo - jogador desconhecido.",
				"Jugador desconocido. No es posible a\u00f1adir a ese amigo.");
		CANT_ADD_SYSTEM_BUSY = new TranslatableString("Unable to add name - system busy.",
				"Der Name konnte nicht hinzugef\u00fcgt werden, das System ist derzeit ausgelastet.",
				"Impossible d'ajouter un nom - syst\u00e8me occup\u00e9.",
				"N\u00e3o foi poss\u00edvel adicionar o nome. O sistema est\u00e1 ocupado.",
				"Sistema ocupado. No es posible a\u00f1adir el nombre.");
		CANT_ADD_UNKNOWN_NAME = new TranslatableString("Unable to add name - unknown player.",
				"Name konnte nicht hinzugef\u00fcgt werden - Spieler unbekannt.",
				"Impossible d'ajouter le nom - joueur inconnu.",
				"N\u00e3o foi poss\u00edvel adicionar esse nome - jogador desconhecido.",
				"Jugador desconocido. No es posible a\u00f1adir el nombre.");
		FULL_MEMBERS_FRIEND_LIST = new TranslatableString("Your friends list is full (400 names maximum)",
				"Deine Freunde-Liste ist voll, du hast das Maximum von 400 erreicht.",
				"Votre liste d'amis est pleine (400 noms maximum).",
				"Sua lista de amigos est\u00e1 cheia. O limite \u00e9 de 400 nomes.",
				"Tu lista de amigos est\u00e1 llena. El l\u00edmite es de 400 amigos.");
		FULL_FREE_FRIEND_LIST = new TranslatableString("Your friends list is full (200 names maximum)",
				"Deine Freunde-Liste ist voll, du hast das Maximum von 200 erreicht.",
				"Votre liste d'amis est pleine (200 noms maximum).",
				"Sua lista de amigos est\u00e1 cheia. O limite \u00e9 de 200 nomes.",
				"Tu lista de amigos est\u00e1 llena. El l\u00edmite es de 200 amigos.");
		CANT_DELETE_FRIEND_SYSTEM_BUSY = new TranslatableString("Unable to delete friend - system busy.",
				"Der Freund konnte nicht entfernt werden, das System ist derzeit ausgelastet.",
				"Impossible de supprimer un ami - syst\u00e8me occup\u00e9.",
				"N\u00e3o foi poss\u00edvel excluir o amigo. O sistema est\u00e1 ocupado.",
				"Servidor ocupado. No es posible borrar al amigo.");
		CANT_DELETE_NAME_SYSTEM_BUSY = new TranslatableString("Unable to delete name - system busy.",
				"Name konnte nicht gel\u00f6scht werden - Systemfehler.",
				"Impossible d'effacer le nom - syst\u00e8me occup\u00e9.",
				"N\u00e3o foi poss\u00edvel deletar o nome - sistema ocupado.",
				"Sistema ocupado. No es posible borrar el nombre.");
		CANT_MESSAGE_SYSTEM_BUSY = new TranslatableString("Unable to send message - system busy.",
				"Deine Nachricht konnte nicht verschickt werden, das System ist derzeit ausgelastet.",
				"Impossible d'envoyer un message - syst\u00e8me occup\u00e9.",
				"N\u00e3o foi poss\u00edvel enviar a mensagem. O sistema est\u00e1 ocupado.",
				"Sistema ocupado. No es posible enviar el mensaje.");
		CANT_MESSAGE_PLAYER_UNAVAILABLE = new TranslatableString("Unable to send message - player unavailable.",
				"Deine Nachricht konnte nicht verschickt werden,",
				"Impossible d'envoyer un message - joueur indisponible.",
				"N\u00e3o foi poss\u00edvel enviar a mensagem. O jogador n\u00e3o est\u00e1 dispon\u00edvel.",
				"No es posible enviar el mensaje, el jugador no est\u00e1 disponible.");
		aClass5_60 = new TranslatableString(null, "der Spieler ist momentan nicht verf\u00fcgbar.", null, null, null);
		CANT_MESSAGE_PLAYER = new TranslatableString("Unable to send message - player not on your friends list.",
				"Nachricht kann nicht geschickt werden,",
				"Impossible d'envoyer un message - joueur non inclus dans votre liste d'amis.",
				"N\u00e3o foi poss\u00edvel enviar a mensagem. O jogador n\u00e3o est\u00e1 na sua lista de amigos.",
				"No es posible enviar el mensaje. El jugador no est\u00e1 en tu lista de amigos.");
		aClass5_76 = new TranslatableString(null, "Spieler nicht auf deiner Freunde-Liste.", null, null, null);
		DONT_SAY_PASSWORD = new TranslatableString(
				"You appear to be telling someone your password - please don't!",
				"Willst du jemandem dein Passwort verraten? Das darfst du nicht! Falls das",
				"Il semble que vous r\u00e9v\u00e9liez votre mot de passe \u00e0 quelqu'un - ne faites jamais \u00e7a !",
				"Parece que voc\u00ea est\u00e1 revelando sua senha a algu\u00e9m. N\u00e3o fa\u00e7a isso!",
				"Parece que le est\u00e1s revelando a alguien tu contrase\u00f1a. \u00a1No debes hacerlo!");
		CHANGE_PASSWORD = new TranslatableString(
				"If you are not, please change your password to something more obscure!",
				"nicht der Fall ist, \u00e4ndere dein Passwort zu einem ungew\u00f6hnlicheren Begriff!",
				"Si ce n'est pas le cas, remplacez votre mot de passe par une formule moins \u00e9vidente !",
				"Caso n\u00e3o esteja, altere sua senha para algo mais obscuro!",
				"\u00a1Si no es as\u00ed, cambia tu contrase\u00f1a por una menos evidente!");
		SET_DISPLAY_NAME = new TranslatableString(
				"Unable to send message - set your display name first by logging into the game.",
				"Nachricht konnte nicht gesendet werden.  Bitte richte erst deinen Charakternamen ein, ",
				"Impossible d'envoyer le message - enregistrez un nom de personnage en vous connectant au jeu.",
				"N\u00e3o \u00e9 poss\u00edvel enviar a mensagem. Defina um nome de personagem primeiro, fazendo login no jogo.",
				"No es posible enviar el mensaje. Registra primero un nombre de personaje conect\u00e1ndote al juego.");
		aClass5_117 = new TranslatableString(null, "indem du dich ins Spiel einloggst.", null, null, null);
		PLAYER_MUST_SPEAK_REPORT = new TranslatableString(
				"For that rule you can only report players who have spoken or traded recently.",
				"Mit dieser Option k\u00f6nnen nur Spieler gemeldet werden,",
				"Cette r\u00e8gle n'est invocable que pour les discussions ou \u00e9changes r\u00e9cents.",
				"Para essa regra, voc\u00ea s\u00f3 pode denunciar jogadores com quem tenha falado ou negociado recentemente.",
				"S\u00f3lo puedes denunciar por esa regla a jugadores que hayan hablado o comerciado recientemente.");
		aClass5_127 = new TranslatableString(null, "die k\u00fcrzlich gesprochen oder gehandelt haben.", null, null,
				null);
		PLAYER_OFFLINE = new TranslatableString("That player is offline, or has privacy mode enabled.",
				"Dieser Spieler ist offline oder hat den Privatsph\u00e4ren-Modus aktiviert.",
				"Ce joueur est d\u00e9connect\u00e9 ou en mode priv\u00e9.",
				"O jogador est\u00e1 offline ou est\u00e1 com o modo de privacidade ativado.",
				"Este jugador est\u00e1 desconectado o activ\u00f3 el modo de privacidad.");
		CANNOT_SEND_QUICK_CHAT = new TranslatableString(
				"You cannot send a quick chat message to a player on this world at this time.",
				"Einem Spieler auf dieser Welt k\u00f6nnen derzeit keine Direktchat-Nachrichten",
				"Impossible d'envoyer un message rapide \u00e0 un joueur de ce serveur \u00e0 l'heure actuelle.",
				"Voc\u00ea n\u00e3o pode enviar uma mensagem de papo r\u00e1pido para um jogador neste mundo neste momento.",
				"En estos momentos no puedes enviar un mensaje r\u00e1pido de chat a un jugador en este mundo.");
		aClass5_85 = new TranslatableString(null, "geschickt werden.", null, null, null);
		PLAYER_ON_QUICK_CHAT_WORLD = new TranslatableString(
				"This player is on a quick chat world and cannot receive your message.",
				"Der Spieler kann auf einer Direktchat-Welt keine Nachrichten empfangen.",
				"Ce joueur est sur un serveur \u00e0 messagerie rapide et ne peut pas recevoir votre message.",
				"Este jogador n\u00e3o pode receber sua mensagem porque est\u00e1 em um mundo de papo r\u00e1pido.",
				"Este jugador no puede recibir su mensaje porque est\u00e1 en un mundo de chat r\u00e1pido.");
		CHAT_DISABLED = new TranslatableString("Chat disabled", "Deaktiviert", "Messagerie d\u00e9sactiv\u00e9e",
				"Bate-papo desativado", "Chat desactivado");
		FRIENDS_CHAT = new TranslatableString("friends_chat", "friends_chat", "friends_chat", "friends_chat",
				"friends_chat");
		NOT_IN_FRIENDS_CHANNEL = new TranslatableString("You are not currently in a friends chat channel.",
				"Du befindest dich derzeit nicht in einem Freundes-Chatraum.",
				"Vous ne faites pas partie d'un canal de discussion.",
				"No momento, voc\u00ea n\u00e3o est\u00e1 no bate-papo entre amigos.",
				"Actualmente no est\u00e1s en un canal de chat entre amigos.");
		CANT_TALK_IN_CHANNEL = new TranslatableString("You are not allowed to talk in this friends chat channel.",
				"Du darfst in diesem Freundes-Chatraum nicht reden.",
				"Vous n'\u00eates pas autoris\u00e9 \u00e0 parler dans ce canal de discussion.",
				"Voc\u00ea n\u00e3o est\u00e1 autorizado a falar neste bate-papo entre amigos.",
				"No est\u00e1s autorizado a hablar en este canal de chat entre amigos.");
		ERROR_SENDING_CHANNEL_MESSAGE = new TranslatableString(
				"Error sending message to friends chat - please try again later!",
				"Fehler beim Versenden der Nachricht - bitte versuch es sp\u00e4ter erneut.",
				"Erreur lors de l'envoi de ce message \u2013 veuillez r\u00e9essayer ult\u00e9rieurement !",
				"Erro ao enviar mensagem para bate-papo entre amigos - tente novamente mais tarde!",
				"Se ha producido un error al enviar un mensaje al chat entre amigos, por favor, int\u00e9ntalo m\u00e1s tarde.");
		PLEASE_WAIT_LEFT_CHANNEL = new TranslatableString(
				"Please wait until you are logged out of your previous channel.",
				"Bitte warte, bis du den vorherigen Chatraum verlassen hast.",
				"Veuillez attendre d'\u00eatre d\u00e9connect\u00e9(e) de votre canal pr\u00e9c\u00e9dent.",
				"Aguarde at\u00e9 se desconectar do canal anterior.",
				"Por favor, espera hasta haberte desconectado del anterior chat.");
		NOT_IN_CHANNEL = new TranslatableString("You are not currently in a channel.",
				"Du befindest dich derzeit nicht in einem Chatraum.",
				"Vous n'\u00eates dans aucun canal \u00e0 l'heure actuelle.",
				"No momento voc\u00ea n\u00e3o est\u00e1 em um canal.", "En este momento no est\u00e1s en un canal.");
		JOINING_CHANNEL = new TranslatableString("Attempting to join channel...", "Chatraum wird betreten...",
				"Tentative de connexion au canal...", "Tentando acessar canal...", "Intentando acceder a un canal...");
		REQUESTING_TO_LEAVE_CHANNEL = new TranslatableString("Sending request to leave channel...",
				"Chatraum wird verlassen...", "Envoi de la demande de sortie du canal...",
				"Enviando solicita\u00e7\u00e3o para sair do canal...", "Enviando solicitud para abandonar el canal...");
		ALREADY_JOINING_CHANNEL = new TranslatableString("Already attempting to join a channel - please wait...",
				"Du versuchst bereits, einem Chatraum beizutreten - bitte warte.",
				"Tentative de connexion au canal d\u00e9j\u00e0 en cours - veuillez patienter...",
				"J\u00e1 h\u00e1 uma tentativa de entrar em um canal. Aguarde...",
				"Ya est\u00e1s intentando unirte a un canal. Por favor, espera...");
		LEAVING_REQUEST_IN_PROGRESS = new TranslatableString("Leave request already in progress - please wait...",
				"Du versuchst bereits, einen Chatraum zu verlassen - bitte warte.",
				"Demande de sortie d\u00e9j\u00e0 effectu\u00e9e - veuillez patienter...",
				"Solicita\u00e7\u00e3o de sa\u00edda j\u00e1 em andamento. Aguarde...",
				"La salida del canal est\u00e1 proces\u00e1ndose. Por favor, espera...");
		INVALID_CHANNEL_NAME = new TranslatableString("Invalid channel name entered!",
				"Ung\u00fcltiger Chatraum-Name angegeben.", "Nom de canal incorrect !", "Nome de canal inv\u00e1lido!",
				"\u00a1Nombre de canal no valido!");
		UNABLE_TO_JOIN_CHANNELS = new TranslatableString(
				"Unable to join friends chat at this time - please try again later!",
				"Freundes-Chatraum kann nicht betreten werden - bitte versuch es sp\u00e4ter erneut.",
				"Vous ne pouvez pas rejoindre ce canal de discussion pour le moment - veuillez r\u00e9essayer ult\u00e9rieurement !",
				"N\u00e3o foi poss\u00edvel entrar no bate-papo entre amigos - tente novamente mais tarde!",
				"Ahora mismo no es posible unirse al chat entre amigos. \u00a1Por favor, int\u00e9ntalo m\u00e1s tarde!");
		NOW_TALKING_IN_CHANNEL = new TranslatableString("Now talking in friends chat channel ", "Freundes-Chatraum: ",
				"Vous participez actuellement au canal de discussion : ", "Falando agora no bate-papo entre amigos: ",
				"Hablando ahora en el chat entre amigos: ");
		NOW_TALKING_IN_CHANNEL_OF = new TranslatableString("Now talking in friends chat channel of player: ",
				"Freundes-Chat dieses Spielers beigetreten: ",
				"Vous participez actuellement au canal de discussion du joueur : ",
				"Falando agora no bate-papo entre amigos do jogador: ",
				"Hablando ahora en el canal de chat entre amigos del jugador: ");
		ERROR_JOINING_CHANNEL = new TranslatableString("Error joining friends chat channel - please try again later!",
				"Fehler beim Betreten des Freundes-Chatraums - bitte versuch es sp\u00e4ter erneut.",
				"Erreur lors de la connexion au canal de discussion - veuillez r\u00e9essayer ult\u00e9rieurement !",
				"Erro ao participar do bate-papo entre amigos - tente novamente mais tarde!",
				"Se ha producido un error al acceder al canal de chat entre amigos. \u00a1Por favor, int\u00e9ntalo m\u00e1s tarde!");
		TEMP_BLOCKED_FROM_CHANNELS = new TranslatableString(
				"You are temporarily blocked from joining channels - please try again later!",
				"Du darfst derzeit keine Chatr\u00e4ume betreten - bitte versuch es sp\u00e4ter.",
				"Vous \u00eates temporairement exclu des canaux - veuillez r\u00e9essayer ult\u00e9rieurement.",
				"Voc\u00ea est\u00e1 temporariamente impedido de entrar em canais. Tente novamente mais tarde!",
				"De momento tienes bloqueado el acceso a los canales chat. \u00a1Int\u00e9ntalo de nuevo m\u00e1s tarde!");
		CHANNEL_DOESNT_EXIST = new TranslatableString("The channel you tried to join does not exist.",
				"Der von dir gew\u00fcnschte Chatraum existiert nicht.",
				"Le canal que vous essayez de rejoindre n'existe pas.",
				"O canal que voc\u00ea tentou acessar n\u00e3o existe.", "El canal al que intentas unirte no existe.");
		CHANNEL_FULL = new TranslatableString("The channel you tried to join is currently full.",
				"Der von dir gew\u00fcnschte Chatraum ist derzeit \u00fcberf\u00fcllt.",
				"Le canal que vous essayez de rejoindre est plein.",
				"O canal que voc\u00ea tentou acessar est\u00e1 cheio no momento.",
				"El canal al que intentas unirte est\u00e1 lleno en estos momentos.");
		NO_RANK_CHANNEL = new TranslatableString(
				"You do not have a high enough rank to join this friends chat channel.",
				"Dein Rang reicht nicht aus, um diesen Freundes-Chatraum zu betreten.",
				"Votre rang n'est pas assez \u00e9lev\u00e9 pour rejoindre ce canal de discussion.",
				"Voc\u00ea n\u00e3o tem uma classifica\u00e7\u00e3o alta o suficiente para participar deste bate-papo entre amigos.",
				"No tienes rango suficiente para unirte a este canal de chat entre amigos.");
		TEMP_BANNED_FROM_CHANNEL = new TranslatableString("You are temporarily banned from this friends chat channel.",
				"Du wurdest tempor\u00e4r von diesem Freundes-Chatraum gesperrt.",
				"Vous avez \u00e9t\u00e9 exclu temporairement de ce canal de discussion.",
				"Voc\u00ea foi temporariamente banido deste bate-papo entre amigos.",
				"Tienes bloqueado temporalmente el acceso a este chat entre amigos.");
		CANT_JOIN_CHANNEL = new TranslatableString("You are not allowed to join this user's friends chat channel.",
				"Du darfst den Freundes-Chatraum dieses Benutzers nicht betreten.",
				"Vous n'\u00eates pas autoris\u00e9 \u00e0 rejoindre le canal de discussion de cet utilisateur.",
				"Voc\u00ea n\u00e3o pode entrar nesse bate-papo entre amigos deste usu\u00e1rio.",
				"No tienes permiso para acceder al canal de chat entre amigos de este usuario.");
		JOINED_THE_CHANNEL = new TranslatableString(" joined the channel.", " hat den Chatraum betreten.",
				" a rejoint le canal.", " entrou no canal.", " se ha unido al canal.");
		LEFT_CHANNEL = new TranslatableString(" left the channel.", " hat den Chatraum verlassen.",
				" a quitt\u00e9 le canal.", " saiu do canal.", " ha abandonado el canal.");
		WAS_KICKED_FROM_CHANNEL = new TranslatableString(" was kicked from the channel.",
				" wurde aus dem Chatraum rausgeworfen.", " a \u00e9t\u00e9 expuls\u00e9 du canal.",
				" foi expulso do canal.", " ha sido expulsado del canal.");
		SELF_KICKED_FROM_CHANNEL = new TranslatableString("You have been kicked from the channel.",
				"Du wurdest aus dem Chatraum rausgeworfen.", "Vous avez \u00e9t\u00e9 expuls\u00e9 du canal.",
				"Voc\u00ea foi expulso do canal.", "Se te ha expulsado del canal.");
		REMOVED_FROM_CHANNEL = new TranslatableString("You have been removed from this channel.",
				"Du wurdest aus dem Chatraum entfernt.", "Vous avez \u00e9t\u00e9 supprim\u00e9 de ce canal.",
				"Voc\u00ea foi retirado desse canal.", "Se te ha eliminado de este canal.");
		SELF_LEFT_CHANNEL = new TranslatableString("You have left the channel.", "Du hast den Chatraum verlassen.",
				"Vous avez quitt\u00e9 le canal.", "Voc\u00ea saiu do canal.", "Has salido del canal.");
		ENABLE_FRIENDS_CHAT = new TranslatableString("Your friends chat channel has now been enabled!",
				"Dein Freundes-Chat ist jetzt eingeschaltet.",
				"Votre canal de discussion est maintenant activ\u00e9 !", "O seu bate-papo entre amigos foi ativado!",
				"\u00a1Tu canal de chat entre amigos est\u00e1 activado!");
		JOIN_YOUR_CHANNEL = new TranslatableString("Join your channel by clicking 'Join Chat' and typing: ",
				"Klick auf 'Betreten' und gib ein: ",
				"Pour rejoindre votre canal, cliquez sur \u00ab Participer \u00bb et entrez : ",
				"Para entrar no seu canal, clique em \"Acessar bate-papo\" e digite: ",
				"Para entrar en tu canal, haz clic sobre 'Participar' e introduce: ");
		DISABLED_FRIENDS_CHAT = new TranslatableString("Your friends chat channel has now been disabled!",
				"Dein Freundes-Chat ist jetzt ausgeschaltet.",
				"Votre canal de discussion est maintenant d\u00e9sactiv\u00e9 !",
				"O seu bate-papo entre amigos foi desativado!",
				"\u00a1Tu canal de chat entre amigos ha sido desactivado!");
		CANT_KICK_ANYONE = new TranslatableString("You do not have permission to kick users in this channel.",
				"Du darfst keine Benutzer aus diesem Chatraum rauswerfen.",
				"Vous n'\u00eates pas autoris\u00e9 \u00e0 expulser des utilisateurs de ce canal.",
				"Voc\u00ea n\u00e3o tem permiss\u00e3o para expulsar usu\u00e1rios neste canal.",
				"No tienes autorizaci\u00f3n para expulsar a usuarios de este canal.");
		CANT_KICK_USER = new TranslatableString("You do not have permission to kick this user.",
				"Du darfst diesen Benutzer nicht rauswerfen.",
				"Vous n'\u00eates pas autoris\u00e9 \u00e0 expulser cet utilisateur.",
				"Voc\u00ea n\u00e3o tem permiss\u00e3o para expulsar este usu\u00e1rio.",
				"No tienes autorizaci\u00f3n para expulsar a este usuario.");
		USER_NOT_IN_CHANNEL = new TranslatableString("That user is not in this channel.",
				"Dieser Benutzer befindet sich nicht in diesem Chatraum.", "Cet utilisateur n'est pas dans ce canal.",
				"Esse usu\u00e1rio n\u00e3o est\u00e1 no canal.", "Ese usuario no est\u00e1 en este canal.");
		KICK_BAN_REQUEST_SUCCESSFUL = new TranslatableString("Your request to kick/ban this user was successful.",
				"Der Rauswurf/die Sperrung war erfolgreich.",
				"Votre demande d'exclusion de ce joueur a \u00e9t\u00e9 accept\u00e9e.",
				"Seu pedido para expulsar/suspender este jogador foi bem sucedido.",
				"Tu petici\u00f3n de expulsar/suspender a este usuario ha sido aceptada.");
		SUCCESSFUL_TEMP_BAN = new TranslatableString(
				"Your request to refresh this user's temporary ban was successful.",
				"Die Verl\u00e4ngerung der tempor\u00e4ren Sperrung dieses Spielers war erfolgreich.",
				"Le renouvellement d'exclusion temporaire de ce joueur a \u00e9t\u00e9 accept\u00e9.",
				"Seu pedido para reiniciar a suspens\u00e3o tempor\u00e1ria deste jogador foi bem sucedido.",
				"Tu petici\u00f3n de prolongar la suspensi\u00f3n temporal de este usuario ha sido aceptada.");
		TEMP_MUTED = new TranslatableString(
				"You have been temporarily muted due to breaking a rule.",
				"Aufgrund eines Regelversto\u00dfes wurdest du vor\u00fcbergehend stumm geschaltet.",
				"La messagerie instantan\u00e9e a \u00e9t\u00e9 temporairement bloqu\u00e9e suite \u00e0 une infraction.",
				"Voc\u00ea foi temporariamente vetado por ter violado uma regra.",
				"Se te ha vetado temporalmente por haber violado una regla.");
		THIS_MUTE_LASTS = new TranslatableString("This mute will remain for a further ",
				"Diese Stummschaltung gilt f\u00fcr weitere ", "Votre acc\u00e8s restera bloqu\u00e9 encore ",
				"Este veto permanecer\u00e1 por mais ", "Este veto permancere\u00e1 activo todav\u00eda durante ");
		DAYS = new TranslatableString(" days.", " Tage.", " jours.", " dias.", " d\u00edas.");
		UNMUTED_IN_24_HOURS = new TranslatableString("You will be un-muted within 24 hours.",
				"Du wirst innerhalb der n\u00e4chsten 24 Stunden wieder sprechen k\u00f6nnen.",
				"Vous aurez \u00e0 nouveau acc\u00e8s \u00e0 la messagerie instantan\u00e9e dans 24 heures.",
				"O veto ser\u00e1 retirado dentro de 24 horas.",
				"Tu veto se retirar\u00e1 dentro de las pr\u00f3ximas 24 horas.");
		TO_PREVENT_FURTHER_MUTES = new TranslatableString("To prevent further mutes please read the rules.",
				"Um eine erneute Stummschaltung zu verhindern, lies bitte die Regeln.",
				"Pour \u00e9viter un nouveau blocage, lisez le r\u00e8glement.",
				"Para evitar outros vetos, leia as regras.", "Para evitar otro veto, consulta el reglamento.");
		PERMANENTLY_MUTED = new TranslatableString(
				"You have been permanently muted due to breaking a rule.",
				"Du wurdest permanent stumm geschaltet, da du gegen eine Regel versto\u00dfen hast.",
				"L'acc\u00e8s \u00e0 la messagerie instantan\u00e9e vous a d\u00e9finitivement \u00e9t\u00e9 retir\u00e9 suite \u00e0 une infraction.",
				"Voc\u00ea foi permanentemente vetado por ter violado uma regra.",
				"Se te ha vetado permanentemente por haber violado una regla.");
		LOADING_PLEASE_WAIT = new TranslatableString("Loading - please wait.", "Ladevorgang - bitte warte.",
				"Chargement en cours. Veuillez patienter.", "Carregando. Aguarde.", "Cargando. Por favor, espera.");
		PROFILING = new TranslatableString("Profiling...", "Profiling...", "Profilage...", "Definindo perfil...",
				"Obteniendo perfil...");
		CONNECTION_LOST = new TranslatableString("Connection lost.", "Verbindung abgebrochen.", "Connexion perdue.",
				"Conex\u00e3o perdida.", "Conexi\u00f3n perdida.");
		PLEASE_WAIT_REESTABLISHING = new TranslatableString("Please wait - attempting to reestablish.",
				"Bitte warte - es wird versucht, die Verbindung wiederherzustellen.",
				"Veuillez patienter - tentative de r\u00e9tablissement.",
				"Tentando reestabelecer conex\u00e3o. Aguarde.",
				"Estamos intentando restablecer la conexi\u00f3n. Por favor, espera.");
		CHECKING_FOR_UPDATES = new TranslatableString("Checking for updates", "Suche nach Updates",
				"V\u00e9rification des mises \u00e0 jour", "Verificando atualiza\u00e7\u00f5es",
				"Buscando actualizaciones");
		FETCHING_UPDATES = new TranslatableString("Fetching Updates", "Lade Update", "Chargement des MAJ",
				"Carregando atualiza\u00e7\u00f5es", "Cargando actualizaciones");
		LOADING_CONFIG = new TranslatableString("Loading config - ", "Lade Konfiguration - ",
				"Chargement des fichiers config - ", "Carregando config - ", "Cargando configuraci\u00f3n - ");
		LOADED_CONFIG = new TranslatableString("Loaded config", "Konfig geladen.", "Fichiers config charg\u00e9s",
				"Config carregada", "Configuraci\u00f3n cargada");
		LOADING_SPRITES = new TranslatableString("Loading sprites - ", "Lade Sprites - ", "Chargement des sprites - ",
				"Carregando sprites - ", "Cargando sprites - ");
		LOADED_SPRITES = new TranslatableString("Loaded sprites", "Sprites geladen.", "Sprites charg\u00e9s",
				"Sprites carregados", "Sprites cargados");
		LOADING_WORDPACK = new TranslatableString("Loading wordpack - ", "Lade Wordpack - ",
				"Chargement du module texte - ", "Carregando pacote de palavras - ",
				"Cargando el m\u00f3dulo de texto - ");
		LOADED_WORDPACK = new TranslatableString("Loaded wordpack", "Wordpack geladen.", "Module texte charg\u00e9",
				"Pacote de palavras carregado", "M\u00f3dulo de texto cargado");
		LOADING_INTERFACES = new TranslatableString("Loading interfaces - ", "Lade Benutzeroberfl\u00e4che - ",
				"Chargement des interfaces - ", "Carregando interfaces - ", "Cargando interfaces - ");
		LOADED_INTERFACES = new TranslatableString("Loaded interfaces", "Benutzeroberfl\u00e4che geladen.",
				"Interfaces charg\u00e9es", "Interfaces carregadas", "Interfaces cargadas");
		LOADING_INTERFACE_SCRIPTS = new TranslatableString("Loading interface scripts - ", "Lade Interface-Skripte - ",
				"Chargement des interfaces - ", "Carregando scripts de interface - ",
				"Cargando gui\u00f3n de interfaz - ");
		LOADED_INTERFACE_SCRIPTS = new TranslatableString("Loaded interface scripts", "Interface-Skripte geladen",
				"Interfaces charg\u00e9es", "Script de interface carregados", "Guiones de interfaz cargados");
		LOADING_ADDITIONAL_FONTS = new TranslatableString("Loading additional fonts - ", "Lade Zusatzschriftarten - ",
				"Chargement de polices secondaires - ", "Carregando fontes adicionais - ",
				"Cargando fuentes adicionales - ");
		LOADED_ADDITIONAL_FONTS = new TranslatableString("Loaded additional fonts", "Zusatzschriftarten geladen",
				"Polices secondaires charg\u00e9es", "Fontes adicionais carregadas", "Fuentes adicionales cargadas");
		LOADING_WORLD_MAP = new TranslatableString("Loading world map - ", "Lade Weltkarte - ",
				"Chargement de la mappemonde - ", "Carregando mapa-m\u00fandi - ", "Cargando mapamundi - ");
		LOADED_WORLD_MAP = new TranslatableString("Loaded world map", "Weltkarte geladen", "Mappemonde charg\u00e9e",
				"Mapa-m\u00fandi carregado", "Mapamundi cargado");
		LOADING_WORLD_LIST = new TranslatableString("Loading world list data", "Lade Liste der Welten",
				"Chargement de la liste des serveurs", "Carregando dados da lista de mundos",
				"Cargando datos de la lista de mundos");
		LOADED_WORLD_LIST = new TranslatableString("Loaded world list data", "Liste der Welten geladen",
				"Liste des serveurs charg\u00e9e", "Dados da lista de mundos carregados",
				"Datos de la lista de mundos cargados");
		LOADED_CLIENT_VARS = new TranslatableString("Loaded client variable data", "Client-Variablen geladen",
				"Variables du client charg\u00e9es", "As vari\u00e1veis do sistema foram carregadas",
				"Variables de cliente cargadas");
		LOADING = new TranslatableString("Loading...", "Lade...", "Chargement en cours...", "Carregando...",
				"Cargando...");
		CLOSE_INTERFACE_BEFORE_REPORTING = new TranslatableString(
				"Please close the interface you have open before using 'Report Abuse'.",
				"Bitte schlie\u00df die momentan ge\u00f6ffnete Benutzeroberfl\u00e4che,",
				"Fermez l'interface que vous avez ouverte avant d'utiliser le bouton \u00ab Signaler un abus \u00bb.",
				"Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".",
				"Cierra la interfaz que tienes abierta antes de usar el bot\u00f3n 'Denunciar abuso'.");
		aClass5_61 = new TranslatableString(null, "bevor du die Option 'Regelversto\u00df melden' benutzt.", null,
				null, null);
		SYSTEM_UPDATE_IN = new TranslatableString("System update in: ", "System-Update in: ",
				"Mise \u00e0 jour syst\u00e8me dans : ", "Atualiza\u00e7\u00e3o do sistema em: ",
				"Actualizaci\u00f3n del sistema en: ");
		HAS_LOGGED_IN = new TranslatableString(" has logged in.", " loggt sich ein.", " s'est connect\u00e9.",
				" entrou no jogo.", " se ha conectado.");
		HAS_LOGGED_OUT = new TranslatableString(" has logged out.", " loggt sich aus.", " s'est d\u00e9connect\u00e9.",
				" saiu do jogo.", " se ha desconectado.");
		UNABLE_TO_FIND = new TranslatableString("Unable to find ", "Spieler kann nicht gefunden werden: ",
				"Impossible de trouver ", "N\u00e3o foi poss\u00edvel encontrar ", "No es posible encontrar a ");
		USE = new TranslatableString("Use", "Benutzen", "Utiliser", "Usar", "Usar");
		EXAMINE = new TranslatableString("Examine", "Untersuchen", "Examiner", "Examinar", "Examinar");
		ATTACK = new TranslatableString("Attack", "Angreifen", "Attaquer", "Atacar", "Atacar");
		CHOOSE_OPTION = new TranslatableString("Choose Option", "W\u00e4hl eine Option", "Choisir une option",
				"Selecionar op\u00e7\u00e3o", "Seleccionar opci\u00f3n");
		MORE_OPTIONS = new TranslatableString(" more options", " weitere Optionen", " autres options",
				" mais op\u00e7\u00f5es", " m\u00e1s opciones");
		WALK_HERE = new TranslatableString("Walk here", "Hierhin gehen", "Atteindre", "Caminhar para c\u00e1",
				"Venir ac\u00e1");
		FACE_HERE = new TranslatableString("Face here", "Hierhin drehen", "Regarder dans cette direction",
				"Virar para c\u00e1", "Girar hacia ac\u00e1");
		LEVEL = new TranslatableString("level: ", "Stufe: ", "niveau ", "n\u00edvel: ", "nivel: ");
		SKILL = new TranslatableString("skill: ", "Fertigkeit: ", "comp\u00e9tence ", "habilidade: ", "habilidad: ");
		RATING = new TranslatableString("rating: ", "Kampfstufe: ", "classement ", "qualifica\u00e7\u00e3o: ",
				"clasificaci\u00f3n: ");
		PLEASE_WAIT = new TranslatableString("Please wait...", "Bitte warte...", "Veuillez attendre", "Aguarde...",
				"Por favor, espera...");
		CLOSE = new TranslatableString("Close",
				"Bitte schlie\u00df die momentan ge\u00f6ffnete Benutzeroberfl\u00e4che,",
				"Fermez l'interface que vous avez ouverte avant d'utiliser le bouton \u00ab Signaler un abus \u00bb.",
				"Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".",
				"Cierra la interfaz que tienes abierta antes de usar el bot\u00f3n 'Denunciar abuso'.");
		aClass5_157 = new TranslatableString(" ", ": ", " ", " ", " ");
		aClass5_158 = new TranslatableString("M", "M", "M", "M", "M");
		aClass5_105 = new TranslatableString("M", "M", "M", "M", "M");
		aClass5_160 = new TranslatableString("K", "T", "K", "K", "K");
		aClass5_161 = new TranslatableString("K", "T", "K", "K", "K");
		FROM = new TranslatableString("From", "Von:", "De", "De", "De");
		SELF = new TranslatableString("Self", "Mich", "Moi", "Eu", "M\u00ed");
		ALREADY_BEFRIENDED = new TranslatableString(" is already on your friends list.",
				" steht bereits auf deiner Freunde-Liste!", " est d\u00e9j\u00e0 dans votre liste d'amis.",
				" j\u00e1 est\u00e1 na sua lista de amigos.", " ya est\u00e1 en tu lista de amigos.");
		FULL_IGNORE_LIST_MEMBERS = new TranslatableString("Your ignore list is full. Max of 400 users.",
				"Deine Ignorieren-Liste ist voll, du kannst nur 400 Spieler darauf eintragen.",
				"Votre liste noire est pleine (400 noms maximum).",
				"Sua lista de ignorados est\u00e1 cheia. O limite \u00e9 de 400 usu\u00e1rios.",
				"Tu lista de jugadores ignorados est\u00e1 llena, el l\u00edmite es de 400.");
		FULL_IGNORE_LIST_FREE = new TranslatableString("Your ignore list is full. Max of 100 users.",
				"Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.",
				"Votre liste noire est pleine (100 noms maximum).",
				"Sua lista de ignorados est\u00e1 cheia. O limite \u00e9 de 100 usu\u00e1rios.",
				"Tu lista de jugadores ignorados est\u00e1 llena, el l\u00edmite es de 100.");
		ALREADY_IGNORED = new TranslatableString(" is already on your ignore list.",
				" steht bereits auf deiner Ignorieren-Liste!", " est d\u00e9j\u00e0 dans votre liste noire.",
				" j\u00e1 est\u00e1 na sua lista de ignorados.", " ya est\u00e1 en tu lista de ignorados.");
		CANT_BEFRIEND_SELF = new TranslatableString("You can't add yourself to your own friends list.",
				"Du kannst dich nicht auf deine eigene Freunde-Liste setzen!",
				"Vous ne pouvez pas ajouter votre nom \u00e0 votre liste d'amis.",
				"Voc\u00ea n\u00e3o pode adicionar a si pr\u00f3prio \u00e0 sua lista de amigos.",
				"No puedes a\u00f1adirte a tu propia lista de amigos.");
		CANT_IGNORE_SELF = new TranslatableString("You can't add yourself to your own ignore list.",
				"Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!",
				"Vous ne pouvez pas ajouter votre nom \u00e0 votre liste noire.",
				"Voc\u00ea n\u00e3o pode adicionar a si pr\u00f3prio \u00e0 sua lista de ignorados.",
				"No puedes a\u00f1adirte a tu propia lista de ignorados.");
		FRIEND_CHAT_CHANGES_TIME = new TranslatableString(
				"Changes will take effect on your friends chat in the next 60 seconds.",
				"Die \u00c4nderungen am Freundes-Chat werden innerhalb von 60 Sekunden \u00fcbernommen.",
				"Les modifications seront apport\u00e9es \u00e0 votre canal de discussion dans les 60 prochaines secondes.",
				"As mudan\u00e7as acontecer\u00e3o em seu bate-papo entre amigos nos pr\u00f3ximos 60 segundos.",
				"Los cambios en tu chat de amigos se realizar\u00e1n en los pr\u00f3ximos 60 segundos.");
		PLEASE_REMOVE_IGNORE = new TranslatableString("Please remove ", "Bitte entferne ",
				"Veuillez commencer par supprimer ", "Remova ", "Elimina primero a ");
		FROM_IGNORE_LIST_FIRST = new TranslatableString(" from your ignore list first.",
				" zuerst von deiner Ignorieren-Liste!", " de votre liste noire.",
				" da sua lista de ignorados primeiro.", " de tu lista de ignorados.");
		PLEASE_REMOVE_FRIEND = new TranslatableString("Please remove ", "Bitte entferne ",
				"Veuillez commencer par supprimer ", "Remova ", "Elimina primero a ");
		FROM_FRIEND_LIST_FIRST = new TranslatableString(" from your friends list first.",
				" zuerst von deiner Freunde-Liste!", " de votre liste d'amis.", " da sua lista de amigos primeiro.",
				" de tu lista de amigos.");
		YELLOW = new TranslatableString("yellow:", "gelb:", "jaune:", "amarelo:", "amarillo:");
		RED = new TranslatableString("red:", "rot:", "rouge:", "vermelho:", "rojo:");
		GREEN = new TranslatableString("green:", "gr\u00fcn:", "vert:", "verde:", "verde:");
		CYAN = new TranslatableString("cyan:", "blaugr\u00fcn:", "cyan:", "ciano:", "cian:");
		PURPLE = new TranslatableString("purple:", "lila:", "violet:", "roxo:", "violeta:");
		WHITE = new TranslatableString("white:", "weiss:", "blanc:", "branco:", "blanco:");
		FLASH1 = new TranslatableString("flash1:", "blinken1:", "clignotant1:", "flash1:", "parpadeante1:");
		FLASH2 = new TranslatableString("flash2:", "blinken2:", "clignotant2:", "flash2:", "parpadeante2:");
		FLASH3 = new TranslatableString("flash3:", "blinken3:", "clignotant3:", "flash3:", "parpadeante3:");
		GLOW1 = new TranslatableString("glow1:", "leuchten1:", "brillant1:", "brilho1:", "brillante1:");
		GLOW2 = new TranslatableString("glow2:", "leuchten2:", "brillant2:", "brilho2:", "brillante2:");
		GLOW3 = new TranslatableString("glow3:", "leuchten3:", "brillant3:", "brilho3:", "brillante3:");
		WAVE = new TranslatableString("wave:", "welle:", "ondulation:", "onda:", "onda:");
		WAVE2 = new TranslatableString("wave2:", "welle2:", "ondulation2:", "onda2:", "onda2:");
		SHAKE = new TranslatableString("shake:", "sch\u00fctteln:", "tremblement:", "tremor:", "temblor:");
		SCROLL = new TranslatableString("scroll:", "scrollen:", "d\u00e9roulement:", "rolagem:", "desplazar:");
		SLIDE = new TranslatableString("slide:", "gleiten:", "glissement:", "deslizamento:", "deslizar:");
		FRIEND = new TranslatableString("Friend", "Freund", "Ami", "Amigo", "Amigo");
	}

	public static Class55 method554() {
		DiskFile preferences = null;
		try {
			Class55 class55;
			try {
				preferences = PriorityQueueIterator.getPreferences("3", Client.game.domain, false);
				byte[] data = new byte[(int) preferences.length()];
				int in;

				for (int offset = 0; offset < data.length; offset += in) {
					in = preferences.read(data, offset, data.length - offset);
					if (-1 == in) {
						throw new EOFException();
					}
				}

				class55 = new Class55(new Buffer(data));
			} catch (Exception exception) {
				Class55 class55_6_ = new Class55();
				try {
					if (null != preferences) {
						preferences.close();
					}
				} catch (Exception exception_7_) {

				}
				return class55_6_;
			}

			try {
				preferences.close();
			} catch (Exception exception) {

			}

			return class55;
		} catch (Exception object) {
			try {
				if (null != preferences) {
					preferences.close();
				}
			} catch (Exception exception) {

			}
		}

		return null;
	}

	public static void openJsUrl(String url, boolean stayLoggedIn, boolean forceJs) {
		HitbarDefinition.openUrl(url, stayLoggedIn, "openjs", forceJs);
	}

	static final void method559(Mob mob, boolean bool) {
		int speed = MovementType.aClass624_8025.id;
		int i_12_ = 0;

		if (-589638007 * mob.anInt11560 > Client.tick) {
			HashTableIterator.method13669(mob);
		} else if (-1506188915 * mob.anInt11522 >= Client.tick) {
			Class188.method3749(mob);
		} else {
			Class290_Sub1.method15204(mob, bool);
			speed = Class279.anInt3145 * -2018339177;
			i_12_ = 1897950229 * Class22.anInt322;
		}

		Class397 class397 = mob.method10164().aClass397_4507;
		if ((int) class397.x < 512 || (int) class397.z < 512
				|| (int) class397.x >= (Client.aClass460_10760.method7680() - 1) * 512
				|| (int) class397.z >= (Client.aClass460_10760.method7707() - 1) * 512) {
			mob.aClass650_11526.update(-1);

			for (int i_13_ = 0; i_13_ < mob.aClass468Array11520.length; i_13_++) {
				mob.aClass468Array11520[i_13_].graphic = 738188555;
				mob.aClass468Array11520[i_13_].aClass650_6484.update(-1);
			}

			mob.anIntArray11538 = null;
			mob.anInt11560 = 0;
			mob.anInt11522 = 0;
			speed = MovementType.aClass624_8025.id;
			i_12_ = 0;
			mob.method10170(mob.pathX[0] * 512 + mob.boundSize() * 256, class397.y,
					512 * mob.pathZ[0] + mob.boundSize() * 256);
			mob.method17985();
		}

		if (Client.localPlayer == mob
				&& ((int) class397.x < 6144 || (int) class397.z < 6144
						|| (int) class397.x >= (Client.aClass460_10760.method7680() - 12) * 512 || (int) class397.z >= (Client.aClass460_10760
						.method7707() - 12) * 512)) {
			mob.aClass650_11526.update(-1);

			for (int i_14_ = 0; i_14_ < mob.aClass468Array11520.length; i_14_++) {
				mob.aClass468Array11520[i_14_].graphic = 738188555;
				mob.aClass468Array11520[i_14_].aClass650_6484.update(-1);
			}

			mob.anIntArray11538 = null;
			mob.anInt11560 = 0;
			mob.anInt11522 = 0;
			speed = MovementType.aClass624_8025.id;
			i_12_ = 0;
			mob.method10170(mob.pathX[0] * 512 + mob.boundSize() * 256, class397.y,
					512 * mob.pathZ[0] + mob.boundSize() * 256);
			mob.method17985();
		}

		int i_15_ = KeyRecorder.method8899(mob);
		Class330.method5807(mob);
		IncomingFrameMeta.method6298(mob, speed, i_12_, i_15_);
		Class24.method776(mob, speed);
		Class449.method7388(mob);
		Class395 class395 = Class395.create();
		class395.method6413(Class373.method6114(mob.yaw.value()), Class373.method6114(mob.pitch.value()),
				Class373.method6114(mob.roll.value()));
		mob.method10179(class395);
		class395.cache();
	}

	Map<Language, String> translations = new HashMap<Language, String>(7);

	TranslatableString(String english, String german, String french, String portuguese, String latinSpanish) {
		translations.put(Language.ENGLISH, english);
		translations.put(Language.GERMAN, german);
		translations.put(Language.FRENCH, french);
		translations.put(Language.PORTUGUESE, portuguese);
		translations.put(Language.LATIN_SPANISH, latinSpanish);
	}

	public String translate(Language language) {
		return translations.get(language);
	}

}