package speechrecorder;

/**
 * ISO 639-2 language codes: http://www.loc.gov/standards/iso639-2/php/code_list.php
 * 
 * @author kmaclean
 *
 */
class LabelLocalizer  {
    private String usernamePanelLabel;
    private String usernamePanelText;
    
    private String copyrightName;
    private String gplAccepted;
    
    private String pleaseSelect;
    private String other;
    private String notApplicable;
    
    private String genderPanelLabel;
    private String genderSelection [];
    
    private String ageRangePanelLabel;
    private String ageSelection [];

    private String dialectPanelLabel;
    private String dialectSelection [];
    
    private String microphonePanelLabel;
    private String microphoneSelection [];
    
    private String uploadText;
    private String uploadButtonLabel;
    
    private String moreInfoText;
    private String moreInfoButtonLabel;    

    private String disclaimerText;
    private String aboutButtonLabel;
    
    private String recordButton; 
    private String stopButton; 
    private String playButton; 
    private String peakWarningLabel; 
    private String sampleGraphFileLabel;
    private String sampleGraphLengthLabel;
    private String sampleGraphPositionLabel;
    
    private String uploadingMessageLabel;
    private String uploadCompletedMessageLabel;
	
	public LabelLocalizer (String language) {
		// debug System.err.println("LabelLocalizerLanguage:" + language + ":");
		if (language.equals("EN")) {
			English();
			// debug System.err.println("LabelLocalizerLanguage:" + language + ": equals EN");
		} else if (language.equals("NL")) {
			Dutch();
		} else if (language.equals("DE")) {
			German();
		} else if (language.equals("RU")) {
			Russian();
		} else if (language.equals("IT")) {
			Italian();
		//} else if (language.equals("HB")) {
		//	Hebrew();			
		} else if (language.equals("HE")) {
			Hebrew();
		} else if (language.equals("PT")) {
			Portuguese();
		//} else if (language.equals("PT_BR")) {
		//	Brazilian();			
		} else if (language.equals("ES")) {
			Spanish();
		} else if (language.equals("FR")) {
			French();
		} else if (language.equals("EL")) { // EL = Greece & Cyprus
			Greek();
		} else if (language.equals("TR")) { 
			Turkish();
		} else if (language.equals("BG")) { 
			Bulgarian();
		} else if (language.equals("CA")) { 
			Catalan();
		} else if (language.equals("UK")) { 
			Ukrainian();			
		} else if (language.equals("HR")) { 
			Croatian();			
		} else if (language.equals("SQ")) {
			Albanian();
		} else if (language.equals("BE")) {
			Belarusian();
		} else {
			English();
			// debug System.err.println("LabelLocalizerLanguage:" + language + ": defaults to english");
		}
	}
	
	private void English() {
	     usernamePanelLabel = "Username:";
	     usernamePanelText = "(leave blank to submit anonymously)";
	     
	     copyrightName = "Free Software Foundation";
	     gplAccepted = "Yes";
	    
	     pleaseSelect = "Please Select";
	     notApplicable = "unknown";
	     
	     genderPanelLabel = "Gender:";
	     genderSelection = new String [3];
	     genderSelection[0] = pleaseSelect;   
	     genderSelection[1] = "Male";    
	     genderSelection[2] = "Female"; 
    
	     ageRangePanelLabel = "Age Range:";
	     ageSelection = new String [4];
	     ageSelection[0] = pleaseSelect;  
	     ageSelection[1] = "Youth";  
	     ageSelection[2] = "Adult"; 
	     ageSelection[3] = "Senior"; 
	
	     dialectPanelLabel = "Pronunciation Dialect:";
	     dialectSelection = new String [11];
	     dialectSelection[0] = pleaseSelect;    
	     dialectSelection[1] = "Australian English";    
	     dialectSelection[2] = "American English";    // other
	     dialectSelection[3] = "British English"; 
	     dialectSelection[4] = "Canadian English";      
	     dialectSelection[5] = "European English"; 
	     dialectSelection[6] = "Indian English";
	     dialectSelection[7] = "Irish English"; 
	     dialectSelection[8] = "New Zealand English"; 
	     dialectSelection[9] = "South African English";  
	     dialectSelection[10] = "Other";
	    
	     microphonePanelLabel = "Microphone Type:";
	     microphoneSelection = new String [9];
	     microphoneSelection[0] = pleaseSelect;  
	     microphoneSelection[1] = "Headset mic";    
	     microphoneSelection[2] = "USB Headset mic";   
	     microphoneSelection[3] = "Desktop Boom mic";  
	     microphoneSelection[4] = "USB Desktop Boom mic";  
	     microphoneSelection[5] = "Laptop Built-in mic"; 
	     microphoneSelection[6] = "WebCam mic";      
	     microphoneSelection[7] = "Studio mic"; 
	     microphoneSelection[8] = "Other"; 
	    
	     uploadText = "<html>By clicking the \"Upload\" button, you agree to assign the Copyright to your recorded speech to <br> "
	        + "the Free Software Foundation, and to license your submission under the GNU Public Licence (\"GPL\"):" ;
	     uploadButtonLabel = "Upload";
	    
	     moreInfoText = "For more information on Copyright and GPL, click here:";
	     moreInfoButtonLabel = "More Information";    
	
	     disclaimerText = 
	   	 "<html>VoxForge SpeechSubmission Applet - Copyright (C) 2007-2014 VoxForge<br>"
	   	 +"This program comes with ABSOLUTELY NO WARRANTY; without even the implied<br> "
	   	 +"warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  For<br>" 
	   	 +"more details click the \"About\" button:";
	     aboutButtonLabel = "About";
	    
	     recordButton = "Record"; 
	     stopButton = "Stop"; 
	     playButton = "Play"; 
	     
	     peakWarningLabel =  "Warning: input may be too loud"; 
	     sampleGraphFileLabel = "File: ";
	     sampleGraphLengthLabel = "  Length: ";
	     sampleGraphPositionLabel ="  Position: ";
	     
	     uploadingMessageLabel = "Uploading...";
	     uploadCompletedMessageLabel = "Upload completed... Thank you for your submission!";
 	}

	private void Russian() {
	     usernamePanelLabel = "Имя пользователя:";
	     usernamePanelText = "(можно не указывать)";
	     
	     copyrightName = "Ассоциация свободного ПО";
	     gplAccepted = "Принять";
	    
	     pleaseSelect = "Выберите";
	     notApplicable = "другое";
	     
	     genderPanelLabel = "Пол:";
	     genderSelection = new String [3];
	     genderSelection[0] = pleaseSelect;   
	     genderSelection[1] = "Мужчина";    
	     genderSelection[2] = "Женщина"; 
    
	     ageRangePanelLabel = "Возраст:";
	     ageSelection = new String [4];
	     ageSelection[0] = pleaseSelect;  
	     ageSelection[1] = "до 25";  
	     ageSelection[2] = "до 55"; 
	     ageSelection[3] = "более 55"; 
	
	     dialectPanelLabel = "Регион";
	     dialectSelection = new String [8];
	     dialectSelection[0] = pleaseSelect;    
	     dialectSelection[1] = "Центральный";    
	     dialectSelection[2] = "Южный";    // other
	     dialectSelection[3] = "Северный"; 
	     dialectSelection[4] = "Урал";      
	     dialectSelection[5] = "Сибирь"; 
	     dialectSelection[6] = "Дальний восток"; 
	     dialectSelection[7] = "Другое";
	    
	     microphonePanelLabel = "Тип микрофона:";
	     microphoneSelection = new String [8];
	     microphoneSelection[0] = pleaseSelect;  
	     microphoneSelection[1] = "В гарнитуре";    
	     microphoneSelection[2] = "USB";   
	     microphoneSelection[3] = "Компьютерный";  
	     microphoneSelection[4] = "Встроенный в ноутбук"; 
	     microphoneSelection[5] = "Веб-камера";      
	     microphoneSelection[6] = "Студийный микрофон"; 
	     microphoneSelection[7] = "Другое"; 
	    
	     uploadText = "<html>Нажимая на кнопку \"Загрузить\", Вы передаёте права на записанную информацию <br> "
	        + "Ассоциации Свободного Программного Обеспечения, и позволяете распространять её в терминах лицензии GNU GPL:" ;
	     uploadButtonLabel = "Загрузить";
	    
	     moreInfoText = "Для получения дополнительной информации о правах на запись, прочитайте эту страницу:";
	     moreInfoButtonLabel = "Дополнительная информация";    
	
	     disclaimerText = 
	   	 "<html>Апплет загрузки речи VoxForge - Авторское право (C) 2007-2014 VoxForge<br>"
	   	 +"Это приложение поставляется БЕЗ ГАРАНТИЙ; оно может даже не соответствовать<br> "
	   	 +"предъявляемым к нему требованиям. Для получения дополнительной информации<br>"
	   	 +"нажмите \"О программе\":";
	     aboutButtonLabel = "О программе";
	    
	     recordButton = "Записать"; 
	     stopButton = "Пауза"; 
	     playButton = "Воспроизвести"; 
	     
	     peakWarningLabel =  "ПРЕДУПРЕЖДЕНИЕ: запись слишком громкая"; 
	     sampleGraphFileLabel = "Файл: ";
	     sampleGraphLengthLabel = "  Длина: ";
	     sampleGraphPositionLabel ="  Положение: ";
	     
	     uploadingMessageLabel = "Загрузка записи...";
	     uploadCompletedMessageLabel = "Запись загружена...Спасибо за участие!";
		 	}
	
	private void German() {
		usernamePanelLabel = "Benutzername:";
		usernamePanelText = "(für anonymen Beitrag leer lassen)";
		   
	    copyrightName = "Free Software Foundation";
		gplAccepted = "Ja";
		 
	    pleaseSelect = "Bitte wählen";
		notApplicable = "unbekannt";
		   
	    genderPanelLabel = "Geschlecht:";
		genderSelection = new String [3];
		genderSelection[0] = pleaseSelect; 
		genderSelection[1] = "Männlich";  
		genderSelection[2] = "Weiblich";
		  
        ageRangePanelLabel = "Altersgruppe:";
		ageSelection = new String [4];
		ageSelection[0] = pleaseSelect;
		ageSelection[1] = "Jugendlicher";
		ageSelection[2] = "Erwachsener";
		ageSelection[3] = "Senior";
		  
		dialectPanelLabel = "Aussprachevarietät:";
		dialectSelection = new String [10];
		dialectSelection[0] = pleaseSelect;  
		dialectSelection[1] = "Norddeutschland"; 
		dialectSelection[2] = "Westdeutschland";   
		dialectSelection[3] = "Berlin"; 
		dialectSelection[4] = "südl. Ostdeutschland";      
		dialectSelection[5] = "Südwestdeutschland"; 
		dialectSelection[6] = "Bayern";
		dialectSelection[7] = "Schweiz";      
		dialectSelection[8] = "Österreich"; 
		dialectSelection[9] = "anderer Sprachraum";
		 
		microphonePanelLabel = "Mikrofon-Typ:";
		microphoneSelection = new String [9];
		microphoneSelection[0] = pleaseSelect;
		microphoneSelection[1] = "Headset-Mikro (am Kopfhörer)";  
		microphoneSelection[2] = "Headset-Mikro (USB)"; 
		microphoneSelection[3] = "Tisch-Mikro";
		microphoneSelection[4] = "Tisch-Mikro (USB)";
		microphoneSelection[5] = "Eingebautes Laptop-Mikro";
		microphoneSelection[6] = "Webcam-Mikro";    
		microphoneSelection[7] = "Studio-Mikro";
		microphoneSelection[8] = "Anderes Mikro";
		 
	    uploadText = "<html>Durch Ihren Klick auf\"Hochladen\" erklären Sie, dass Sie das Copyright Ihrer Sprachaufnahme<br> "
		   + "auf die Free Software Foundation übertragen und Ihren Beitrag unter der GNU Public Licence (\"GPL\") lizensieren:" ;
		uploadButtonLabel = "Hochladen";
		  
		moreInfoText = "Weitere Informationen zu Copyright und GPL:";
		moreInfoButtonLabel = "Weitere Informationen";  
		  
        disclaimerText =
		            "<html>VoxForge SpeechSubmission Applet - Copyright (C) 2007-2014 VoxForge<br>"
				+"Die Veröffentlichung dieses Programms erfolgt in der Hoffnung, daß es Ihnen<br> "
				+"von Nutzen sein wird, aber OHNE IRGENDEINE GARANTIE, sogar ohne die implizite<br> "
				+"Garantie der MARKTREIFE oder der VERWENDBARKEIT FÜR EINEN BESTIMMTEN ZWECK.<br> "
				+"Details können Sie mit einem Klick auf \"Lizenz\" erhalten.";
		aboutButtonLabel = "Lizenz";
		  
		recordButton = "Aufnahme";
		stopButton = "Stop";
		playButton = "Wiedergabe";
		   
		peakWarningLabel =  "Achtung: Eingabe könnte zu laut sein";
		sampleGraphFileLabel = "Datei: ";
		sampleGraphLengthLabel = "  Länge: ";
		sampleGraphPositionLabel ="  Position: ";
		 
		uploadingMessageLabel = "Wird hochgeladen...";
		uploadCompletedMessageLabel = "Alle Daten hochgeladen...  Danke für Ihren Beitrag!";
	}
		
	private void Dutch() {
	     usernamePanelLabel = "Gebruikersnaam:";
	     usernamePanelText = "(laat leeg voor een anonieme bijdrage)";
	    
	     copyrightName = "Free Software Foundation";
	     gplAccepted = "Yes";
	    
	     pleaseSelect = "Maak een keuze";
	     other = "anders";
	     notApplicable = "unknown";
	    
	     genderPanelLabel = "geslacht:";
	     genderSelection = new String [3];
	     genderSelection[0] = pleaseSelect;   
	     genderSelection[1] = "mannelijk";    
	     genderSelection[2] = "vrouwelijk";
	    
	     ageRangePanelLabel = "leeftijd:";
	     ageSelection = new String [4];
	     ageSelection[0] = pleaseSelect;  
	     ageSelection[1] = "jeugd";  
	     ageSelection[2] = "volwassen"; 
	     ageSelection[3] = "senior"; 
	     
	     dialectPanelLabel = "dialect:"; 
	     dialectSelection = new String [10];
	     dialectSelection[0] = pleaseSelect;    
	     dialectSelection[1] = "algemeen Nederlands";    
	     dialectSelection[2] = "Zuidwestelijk";   
	     dialectSelection[3] = "Noordwestelijk";    
	     dialectSelection[4] = "Noordoostelijk";      
	     dialectSelection[5] = "Noordelijk-centraal";    
	     dialectSelection[6] = "Zuidoostelijk";   
	     dialectSelection[7] = "Surinaams-Nederlands";    
	     dialectSelection[8] = "Antiliaans-Nederlands";   
	     dialectSelection[9] = other;   	     

	     microphonePanelLabel = "type microfoon:";
	     microphoneSelection = new String [9];
	     microphoneSelection[0] = pleaseSelect;  
	     microphoneSelection[1] = "headsetmicrofoon";    
	     microphoneSelection[2] = "headsetmicrofoon (USB)";   
	     microphoneSelection[3] = "bureaumicrofoon";  
	     microphoneSelection[4] = "bureaumicrofoon (USB)";  
	     microphoneSelection[5] = "microfoon in laptop"; 
	     microphoneSelection[6] = "webcam microfoon";      
	     microphoneSelection[7] = "studiomicrofoon"; 
	     microphoneSelection[8] = other;  
	    
	     uploadText = "<html>druk op de knop \"doneren\" om het auteursrecht in de opgenomen  <br>" +
	     		"spraak over te dragen aan de Free Software Foundation en de bijdrage ter beschikking <br>" +
	     		" te stellen onder de GNU Public Licence (\"GPL\") :" ;
	     uploadButtonLabel = "doneren";
	    
	     moreInfoText = "klik op de knop voor meer informatie over ateursrecht en de GPL:";
	     moreInfoButtonLabel = "meer informatie";    
	
	     disclaimerText = 
	    	 "<html>VoxForge Spraakdonatieprogramma - Copyright (C) 2007-2014 VoxForge<br>"
	    	 +"Het onderstaande is een onofficiële vertaling van de originele<br>"
	    	 +"Warranty Disclaimer voor deze software (in geval van twijfel is de<br>"
	    	 +"tekst van de originele Warranty Disclaimer doorslaggevend):<br>"
	    	 +"Dit programma staat ter beschikking ZONDER ENIGE TOEZEGGING OF<br>"
	    	 +"GARANTIE, zonder zelfs de impliciete toezegging dat het GESCHIKT IS<br>"
	    	 +"VOOR DE VERKOOP of VOOR EEN ANDER SPECIFIEK DOEL.<br>";
	     aboutButtonLabel = "meer info";
	    
	     recordButton = "Opnemen"; 
	     stopButton = "Stoppen"; 
	     playButton = "Afspelen"; 

	     peakWarningLabel =  "Waarschuwing: het importvolume staat mogelijk te hoog"; 
	     sampleGraphFileLabel = "Bestand: ";
	     sampleGraphLengthLabel = "  Lengte: ";
	     sampleGraphPositionLabel ="  Positie: ";
	     
	     uploadingMessageLabel = "Aan het uploaden...";
	     uploadCompletedMessageLabel = "Upload voltooid. Bedankt voor de bijdrage!";
	}

	private void Italian() {
         usernamePanelLabel = "Nome utente:";
         usernamePanelText = "(lasciare in bianco se si vuole inviare come anonimo)";
         
         copyrightName = "Free Software Foundation";
         gplAccepted = "Si";
        
         pleaseSelect = "Selezionare";
         notApplicable = "non definito";
         
         genderPanelLabel = "Sesso:";
         genderSelection = new String [3];
         genderSelection[0] = pleaseSelect;   
         genderSelection[1] = "Maschio";    
         genderSelection[2] = "Femmina";
    
         ageRangePanelLabel = "Fascia di età:";
         ageSelection = new String [4];
         ageSelection[0] = pleaseSelect;  
         ageSelection[1] = "Giovane";  
         ageSelection[2] = "Adulto";
         ageSelection[3] = "Anziano";
    
         dialectPanelLabel = "Dialetto di pronuncia:";
         dialectSelection = new String [10];
         dialectSelection[0] = pleaseSelect;    
         dialectSelection[1] = "Italiano generico";    
         dialectSelection[2] = "Italiano abruzzese";    
         dialectSelection[3] = "Italiano calabrese";
         dialectSelection[4] = "Italiano ciociaro";      
         dialectSelection[5] = "Italiano milanese";
         dialectSelection[6] = "Italiano pugliese";
         dialectSelection[7] = "Italiano "; 
         dialectSelection[8] = "Dialetto napoletano";           
         dialectSelection[9] = "Altro";
        
         microphonePanelLabel = "Tipo di Microfono:";
         microphoneSelection = new String [9];
         microphoneSelection[0] = pleaseSelect;  
         microphoneSelection[1] = "Headset mic";    
         microphoneSelection[2] = "USB Headset mic";   
         microphoneSelection[3] = "Desktop Boom mic";  
         microphoneSelection[4] = "USB Desktop Boom mic";  
         microphoneSelection[5] = "Laptop Built-in mic";
         microphoneSelection[6] = "WebCam mic";      
         microphoneSelection[7] = "Studio mic";
         microphoneSelection[8] = "Altro";
        
         uploadText = "<html>Cliccando il bottone \"Carica\", si accetta di assegnare il Copyright del parlato registrato a <br> "
            + "la Free Software Foundation, e di rilasciare il tuo contributo nei termini della GNU Public Licence (\"GPL\"):" ;
         uploadButtonLabel = "Carica";
        
         moreInfoText = "Per ulteriori informazioni sul Copyright e la GPL, premere qui:";
         moreInfoButtonLabel = "Ulteriori Informazioni";    
    
         disclaimerText =
            "<html>VoxForge SpeechSubmission Applet - Copyright (C) 2007-2014 VoxForge<br>"
            +"Questo programma e fornito ASSOLUTAMENTE SENZA NESSUNA GARANZIA; neanche senza la sottintesa <br> "
            +"garanzia di COMMERCIABILITA' o di ADEGUATEZZA PER UNO SCOPO PARTICOLARE.  Per<br>"
            +"ulteriori dettagli cliccare il bottone \"Informazioni\" :";
         aboutButtonLabel = "Informazioni";
        
         recordButton = "Registra";
         stopButton = "Ferma";
         playButton = "Ascolta";
         
         peakWarningLabel =  "Attenzione: il volume dell'ingresso potrebbe essere troppo alto";
         sampleGraphFileLabel = "File: ";
         sampleGraphLengthLabel = "  Lunghezza: ";
         sampleGraphPositionLabel ="  Posizione: ";
         
         uploadingMessageLabel = "Caricamento...";
         uploadCompletedMessageLabel = "Caricamento completato... Si ringrazia per il contributo!";
     }
	
	private void Hebrew() {
		usernamePanelLabel = "שם משתמש:";
        usernamePanelText = "(השאר ריק על מנת לשלוח כאנונימי)";
       
        copyrightName = "Free Software Foundation - קרן התוכנה החופשית";
        gplAccepted = "כן";
      
        pleaseSelect = "אנא בחר";
        notApplicable = "לא ידוע";
       
        genderPanelLabel = "מין:";
        genderSelection = new String [3];
        genderSelection[0] = pleaseSelect;  
        genderSelection[1] = "זכר";   
        genderSelection[2] = "נקבה";
  
        ageRangePanelLabel = "קבוצת גיל:";
        ageSelection = new String [4];
        ageSelection[0] = pleaseSelect;
        ageSelection[1] = "צעיר";
        ageSelection[2] = "מבוגר";
        ageSelection[3] = "קשיש";
  
        dialectPanelLabel = "ניב המבטא:";
        dialectSelection = new String [6];
        dialectSelection[0] = pleaseSelect;   
        dialectSelection[1] = "ללא";   
        dialectSelection[2] = "רוסי";    // other
        dialectSelection[3] = "ערבי";
        dialectSelection[4] = "אמריקאי (אנגלית)";  
        dialectSelection[5] = "אחר";
      
        microphonePanelLabel = "סוג המיקרופון:";
        microphoneSelection = new String [9];
        microphoneSelection[0] = pleaseSelect;
        microphoneSelection[1] = "Headset mic";   
        microphoneSelection[2] = "USB Headset mic";  
        microphoneSelection[3] = "Desktop Boom mic";
        microphoneSelection[4] = "USB Desktop Boom mic";
        microphoneSelection[5] = "Laptop Built-in mic";
        microphoneSelection[6] = "WebCam mic";     
        microphoneSelection[7] = "Studio mic";
        microphoneSelection[8] = "Other";
      
        uploadText = "<html>בלחיצה על הלחצן \"העלה\", הנך מסכים/ה לתת את כל הזכויות של הקלטת הקול שלך ל<br> "
           + "Free Software Foundation - קרן התוכנה החופשית, ולספק את הקלטת הקול תחת הרישיון GNU Public Licence (\"GPL\"):" ;
        uploadButtonLabel = "העלה";
      
        moreInfoText = "למידע נוסף אודות זכויות יוצרים ו-GPL, לחץ כאן:";
        moreInfoButtonLabel = "מידע נוסף";   
  
        disclaimerText =
           "<html>VoxForge SpeechSubmission Applet - Copyright (C) 2007-2014 VoxForge<br>"
           +"This program comes with ABSOLUTELY NO WARRANTY; without even the implied<br> "
           +"warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  For<br>"
           +"more details click the \"About\" button:";
        aboutButtonLabel = "About";
      
        recordButton = "הקלט";
        stopButton = "עצור";
        playButton = "השמע";
       
        peakWarningLabel =  "שים לב: ייתכן והקלט יהיה חזק מאוד";
        sampleGraphFileLabel = "קובץ: ";
        sampleGraphLengthLabel = "  אורך: ";
        sampleGraphPositionLabel ="  מיקום: ";

         uploadingMessageLabel = "מעלה...";
        uploadCompletedMessageLabel = "ההעלאה הסתיימה... תודה מקרב לב על עזרתך!";
	}
	
	//private void Brazilian() {
	private void Portuguese() {
	     usernamePanelLabel = "Usuário:";
	     usernamePanelText = "(deixe em branco para submeter anonimamente)";
	     
	     copyrightName = "Fundação de Software Livre";
	     gplAccepted = "Sim";
	    
	     pleaseSelect = "Selecione";
	     notApplicable = "desconhecido";
	     
	     genderPanelLabel = "Sexo:";
	     genderSelection = new String [3];
	     genderSelection[0] = pleaseSelect;   
	     genderSelection[1] = "Masculino";    
	     genderSelection[2] = "Feminino"; 
   
	     ageRangePanelLabel = "Faixa Etária:";
	     ageSelection = new String [4];
	     ageSelection[0] = pleaseSelect;  
	     ageSelection[1] = "Jovem";  
	     ageSelection[2] = "Adulto"; 
	     ageSelection[3] = "Idoso"; 
	
	     dialectPanelLabel = "Dialeto de pronunciacão:";
         dialectSelection = new String [12];
         dialectSelection[0] = pleaseSelect;   
         dialectSelection[1] = "Portugês de Angola";
		 dialectSelection[2] = "Portugês do Brasil";
		 dialectSelection[3] = "Portugês de Cabo Verde";
		 dialectSelection[4] = "Portugês do Timor Leste";
		 dialectSelection[5] = "Portugês de Guiné-Bissau";
		 dialectSelection[6] = "Portugês da Guinea Equatorial";
		 dialectSelection[7] = "Portugês de Macau";
		 dialectSelection[8] = "Portugês de Mozambique";
		 dialectSelection[9] = "Portugês de Portugal";
		 dialectSelection[10] = "Portugês de São Tomé e Príncipe";
		 dialectSelection[11] = "Outro";
	    
	     microphonePanelLabel = "Tipo de Microfone:";
	     microphoneSelection = new String [9];
	     microphoneSelection[0] = pleaseSelect;  
	     microphoneSelection[1] = "Fone de Ouvido com Microfone";    
	     microphoneSelection[2] = "Fone de Ouvido USB com Microfone";   
	     microphoneSelection[3] = "Microfone de Mesa";  
	     microphoneSelection[4] = "Microfone de Mesa USB";  
	     microphoneSelection[5] = "Microfone de Laptop"; 
	     microphoneSelection[6] = "Microfone de WebCam";      
	     microphoneSelection[7] = "Microfone de Estúdio"; 
	     microphoneSelection[8] = "Outro"; 
	    
	     uploadText = "<html>Clicando no botão \"Submeter\", você concorda em ceder o Copyright de seu discurso gravado para <br> "
	        + "a Free Software Foundation e licenciar sua submissão sob a Licença Pública GNU (\"GPL\"):" ;
	     uploadButtonLabel = "Submeter";
	    
	     moreInfoText = "Para mais informações sobre Copyright e GPL, clique aqui:";
	     moreInfoButtonLabel = "Mais informações";    
	
	     disclaimerText = 
	   	 "<html>VoxForge SpeechSubmission Applet - Copyright (C) 2007-2014 VoxForge<br>"
	   	 +"Este programa vem com ABSOLUTAMENTE NENHUMA GARANTIA; nem mesmo as garantias<br> "
	   	 +"implícitas de COMERCIABILIDADE ou ADEQUAÇÃO A UM PROPÓSITO EM PARTICULAR.  Para<br>" 
	   	 +"mais detalhes clique no botão \"Sobre\":";
	     aboutButtonLabel = "Sobre";
	    
	     recordButton = "Gravar"; 
	     stopButton = "Parar"; 
	     playButton = "Tocar"; 
	     
	     peakWarningLabel =  "Aviso: a entrada pode ser muito barulhenta"; 
	     sampleGraphFileLabel = "Arquivo: ";
	     sampleGraphLengthLabel = "  Tamanho: ";
	     sampleGraphPositionLabel ="  Posição: ";
	     
	     uploadingMessageLabel = "Submetendo...";
	     uploadCompletedMessageLabel = "Submissão completada... Obrigado por sua submissão!";
	}
	
	private void Spanish() {
	     usernamePanelLabel = "Nombre de Usuario:";
	     usernamePanelText = "(dejar en blanco para enviar anonimamente)";
	     
	     copyrightName = "Free Software Foundation";
	     gplAccepted = "Si";
	    
	     pleaseSelect = "Por favor Seleccione";
	     notApplicable = "desconocido";
	     
	     genderPanelLabel = "Genero:";
	     genderSelection = new String [3];
	     genderSelection[0] = pleaseSelect;   
	     genderSelection[1] = "Masculino";    
	     genderSelection[2] = "Femenino"; 
   
	     ageRangePanelLabel = "Rango de Edad:";
	     ageSelection = new String [4];
	     ageSelection[0] = pleaseSelect;  
	     ageSelection[1] = "Niño";  
	     ageSelection[2] = "Adulto"; 
	     ageSelection[3] = "Tercera Edad"; 
	
	     dialectPanelLabel = "Dialecto de Pronunciación:";
	     dialectSelection = new String [7];
	     dialectSelection[0] = pleaseSelect;    
	     dialectSelection[1] = "Español España";    
	     dialectSelection[2] = "Español Mexicano";    
	     dialectSelection[3] = "Español Argentina"; 
	     dialectSelection[4] = "Español Chile";      
	     dialectSelection[5] = "Español Latinoamerica"; //other 
	     dialectSelection[6] = "Otro";
	    
	     microphonePanelLabel = "Tipo de Microfono:";
	     microphoneSelection = new String [9];
	     microphoneSelection[0] = pleaseSelect;  
	     microphoneSelection[1] = "Micrófono Auricular";    
	     microphoneSelection[2] = "Micrófono Auricular USB";   
	     microphoneSelection[3] = "Micrófono de Escritorio";  
	     microphoneSelection[4] = "Micrófono de Escritorio USB";  
	     microphoneSelection[5] = "Micrófono de Notebook incorporado"; 
	     microphoneSelection[6] = "Micrófono de Cámara Web";      
	     microphoneSelection[7] = "Micrófono de Estudio (Profesional)"; 
	     microphoneSelection[8] = "Otro"; 
	    
	     uploadText = "<html>Haciendo click en el boton \"Subir\", usted esta de acuerdo en entregar los derechos (Copyright) de su voz grabada a <br> "
	        + "la Free Software Foundation (Fundación del Software Libre), y de licenciar lo subido bajo la Licencia Pública GNU (GNU Public Licence)   			(\"GPL\"):" ;

	     uploadButtonLabel = "Subir";
	    
	     moreInfoText = "Para más información sobre los derechos (Copyright) GPL, click aqui:";
	     moreInfoButtonLabel = "Más Información";    
	
	     disclaimerText = 
	   	 "<html>VoxForge Applet para donación de voz - Copyright (C) 2008 VoxForge<br>"
	   	 +"This program comes with ABSOLUTELY NO WARRANTY; without even the implied<br> "
	   	 +"warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  For<br>" 
	   	 +"more details click the \"Acerca\" button:";
	     aboutButtonLabel = "Acerca";
	    
	     recordButton = "Grabar"; 
	     stopButton = "Parar"; 
	     playButton = "Reproducir"; 
	     
	     peakWarningLabel =  "Advertencia: entrada tal vez muy alta"; 
	     sampleGraphFileLabel = "Archivo: ";
	     sampleGraphLengthLabel = "  Largo: ";
	     sampleGraphPositionLabel ="  Posición: ";
	     
	     uploadingMessageLabel = "Subiendo...";
	     uploadCompletedMessageLabel = "Entrega completada... Gracias por su entrega!";
	}
	
	private void French() {
        usernamePanelLabel = "Nom d'utilisateur:";
        usernamePanelText = "(ne pas remplir pour un envoi anonyme)";
      
        copyrightName = "Free Software Foundation";
        gplAccepted = "Oui";
     
        pleaseSelect = "Sélectionnez";
        notApplicable = "inconnu";
      
        genderPanelLabel = "Sexe:";
        genderSelection = new String [3];
        genderSelection[0] = pleaseSelect; 
        genderSelection[1] = "Masculin";  
        genderSelection[2] = "Féminin";
 
        ageRangePanelLabel = "Tranche d'âge:";
        ageSelection = new String [4];
        ageSelection[0] = pleaseSelect;
        ageSelection[1] = "Jeune";
        ageSelection[2] = "Adulte";
        ageSelection[3] = "Senior";
 
        dialectPanelLabel = "Variante régionale:";
        dialectSelection = new String [7];
        dialectSelection[0] = pleaseSelect;  
        dialectSelection[1] = "Français Belgique";  
        dialectSelection[2] = "Français Suisse";    // other
        dialectSelection[3] = "Français France";
        dialectSelection[4] = "Français Québécois";    
        dialectSelection[5] = "Français d'Afrique";
        dialectSelection[6] = "Autre";
     
        microphonePanelLabel = "Type de micro:";
        microphoneSelection = new String [9];
        microphoneSelection[0] = pleaseSelect;
        microphoneSelection[1] = "Casque micro";  
        microphoneSelection[2] = "Casque micro USB"; 
        microphoneSelection[3] = "Micro de bureau";
        microphoneSelection[4] = "Micro de bureau USB";
        microphoneSelection[5] = "Micro de portable";
        microphoneSelection[6] = "Micro de webcam";    
        microphoneSelection[7] = "Micro de studio";
        microphoneSelection[8] = "Autre";
     
        uploadText = "<html>En cliquant sur le bouton \"Envoyer\", vous acceptez de céder le droit d'auteur de vos enregistrements à <br> "
           + "la Free Software Foundation et de les placer sous la licence GNU Public Licence (\"GPL\"):" ;
        uploadButtonLabel = "Envoyer";
     
        moreInfoText = "Pour de plus amples renseignements sur le droit d'auteur et la licence GPL, cliquez ici:";
        moreInfoButtonLabel = "Plus d'informations";  
 
        disclaimerText =
           "<html>VoxForge SpeechSubmission Applet - Copyright (C) 2007-2014 VoxForge<br>"
           +"Ce programme est livré SANS AUCUNE GARANTIE; sans même la garantie implicite de<br> "
           +"COMMERCIALISTION ou D'ADAPTATION A UN OBJET PARTICULIER. Pour<br>"
           +"plus de détails, cliquez sur le bouton \"A propos de\" :";
        aboutButtonLabel = "A propos de";
     
        recordButton = "Enregistrer";
        stopButton = "Arrêter";
        playButton = "Lecture";
      
        peakWarningLabel =  "Attention: volume d'entrée micro peut-être trop fort";
        sampleGraphFileLabel = "Fichier: ";
        sampleGraphLengthLabel = "  Longueur: ";
        sampleGraphPositionLabel ="  Position: ";
      
        uploadingMessageLabel = "Envoi en cours...";
        uploadCompletedMessageLabel = "Envoi terminé... Merci de votre participation !";
    } 

	private void Greek() {
        usernamePanelLabel = "Όνομα χρήστη:";
        usernamePanelText = "(Αφήστε το κενό αν θέλετε να στείλετε τα αρχεία ανώνυμα)";
      
        copyrightName = "Free Software Foundation";
        gplAccepted = "Ναί";
     
        pleaseSelect = "Παρακαλώ Επιλέξτε";
        notApplicable = "άγνωστο";
      
        genderPanelLabel = "Γένος:";
        genderSelection = new String [3];
        genderSelection[0] = "Παρακαλώ Επιλέξτε"; 
        genderSelection[1] = "Άνδρας";  
        genderSelection[2] = "Γυναίκα";
 
        ageRangePanelLabel = "Ηλικιακή Ομάδα:";
        ageSelection = new String [4];
        ageSelection[0] = "Παρακαλώ Επιλέξτε";
        ageSelection[1] = "Νεαρός";
        ageSelection[2] = "Ενήλικας";
        ageSelection[3] = "Υπερήλικας";
 
        dialectPanelLabel = "Προφορά Διαλέκτου:";
        dialectSelection = new String [7];
        dialectSelection[0] = "Παρακαλώ Επιλέξτε";  
        dialectSelection[1] = "Ελληνική Κοινή";  
        dialectSelection[2] = "Ελληνική Βορ. Ελλάδος";    // other
        dialectSelection[3] = "Ελληνική Κρητική";
        dialectSelection[4] = "Ελληνική Κύπρου";    
        dialectSelection[5] = "Ελληνική Αγγλική";
        dialectSelection[6] = "Άλλη";
     
        microphonePanelLabel = "Τύπος Μικροφώνου:";
        microphoneSelection = new String [9];
        microphoneSelection[0] = "Παρακαλώ Επιλέξτε";
        microphoneSelection[1] = "Ακουστικά με ενσωμ. μικρόφωνο";  
        microphoneSelection[2] = "USB Ακουστικά με ενσωμ. μικρόφωνο"; 
        microphoneSelection[3] = "Επιτραπέζιο μικρόφωνο";
        microphoneSelection[4] = "USB επιτραπέζιο μικρόφωνο";
        microphoneSelection[5] = "Μικρόφωνο Ενσωματωμένο σε Laptop";
        microphoneSelection[6] = "Μικρόφωνο WebCam";    
        microphoneSelection[7] = "Μικρόφωνο Studio";
        microphoneSelection[8] = "Άλλο";
     
        uploadText = 
             "<html>Κάνοντας κλικ στο κουμπί \"Αποστολή \" , συμφωνείτε να εκχωρήσετε το δικαίωμα του<br>" 
           + "δημιουργού (Copyright) για την καταγεγραμένη ομιλία σας στο Free Software Foundation,<br>"
           + "και δίνεται την άδεια σας για την υποβολή της,υπό την GNU Public Licence (\" GPL \"):";

        uploadButtonLabel = "Αποστολή";
     
        moreInfoText = "<html>Για περισσότερες πληροφορίες σχετικά με τα δικαιώματα<br> δημιουργού (Copyright) και το GPL επιλέξτε εδώ:";
        moreInfoButtonLabel = "<html>Για περισσότερες<br> πληροφορίες";  
 
        disclaimerText =           
           "<html>VoxForge Applet Συλλογής Ομιλίας - Copyright (C) 2007-2014 VoxForge<br>"
            +"Αυτό το πρόγμαμμα ΔΕΝ ΕΧΕΙ ΑΠΟΛΥΤΟΣ ΚΑΜΙΑ ΕΓΓΥΗΣΗ,ούτε καν την υπονοούμενη <br> "
            +"εγγύηση ΕΜΠΟΡΕΥΣΙΜΟΤΗΤΑΣ ή ΚΑΤΑΛΛΗΛΟΤΗΤΑΣ ΓΙΑ ΣΥΓΚΕΚΡΙΜΕΝΟ ΣΚΟΠΟ.<br>"
            +"για περισσότερες πληροφορίες πατήστε το κουμπί \"Σχετικά\":";
        aboutButtonLabel = "Σχετικά";
     
        recordButton = "Εγγραφή";
        stopButton = "Διακοπή";
        playButton = "Αναπαραγωγή";
      
        peakWarningLabel =  "Προειδοποίηση: Το σήμα εισόδου ίσως είναι πολύ δυνατό";
        sampleGraphFileLabel = "Αρχείο: ";
        sampleGraphLengthLabel = "  Μήκος: ";
        sampleGraphPositionLabel ="  Θέση: ";

         uploadingMessageLabel = "Αποστολή...";
        uploadCompletedMessageLabel = "Η αποστολή ολοκληρώθηκε... Ευχαριστούμε για την συμμετοχή σας!";
    } 
	
	private void Turkish() {
	     usernamePanelLabel = "Kullanıcı adı:";
	     usernamePanelText = "(anonim olarak yollamak için boş bırakın)";
	     
	     copyrightName = "Özgür Yazılım Vakfı";
	     gplAccepted = "Evet";
	    
	     pleaseSelect = "Lütfen Seçin";
	     notApplicable = "bilinmiyor";
	     
	     genderPanelLabel = "Cinsiyet:";
	     genderSelection = new String [3];
	     genderSelection[0] = pleaseSelect;   
	     genderSelection[1] = "Erkek";    
	     genderSelection[2] = "Kadın"; 
    
	     ageRangePanelLabel = "Yaş Aralığı";
	     ageSelection = new String [4];
	     ageSelection[0] = pleaseSelect;  
	     ageSelection[1] = "Genç";  
	     ageSelection[2] = "Yetişkin"; 
	     ageSelection[3] = "Yaşlı"; 
	
	     dialectPanelLabel = "Telaffuz lehçesi:";
	     dialectSelection = new String [3];
 	     dialectSelection[0] = pleaseSelect;  
	     dialectSelection[1] = "İstanbul Türkçesi";   
	     dialectSelection[2] = "Diğer";
	    
	     microphonePanelLabel = "Mikrofon türü:";
	     microphoneSelection = new String [9];
	     microphoneSelection[0] = pleaseSelect;  
	     microphoneSelection[1] = "Kulaklıklı mikrofon";    
	     microphoneSelection[2] = "USB Kulaklıklı mikrofon";   
	     microphoneSelection[3] = "Masaüstü mikrofon";  
	     microphoneSelection[4] = "USB Masaüstü mikrofon";  
	     microphoneSelection[5] = "Dizüstü bilgisayar mikrofonu"; 
	     microphoneSelection[6] = "Webcam mikrofonu";      
	     microphoneSelection[7] = "Stüdyo mikrofon"; 
	     microphoneSelection[8] = "Diğer"; 
	    
	     uploadText = "<html>\"Yükle\" düğmesine bastığınızda ses kaydınızın telif hakkını <br> " +
	     		"Özgür Yazılım Vakfına devretmeyi ve GNU Kamu Lisansı (\"GPL\") ile " +
	     		"lisansladığınızı kabul etmiş olacaksınız:";
	     uploadButtonLabel = "Yükle";
	     
	     moreInfoText = "Telif hakkı ve GPL hakkında detaylı bilgi için buraya tıklayın:";
	     moreInfoButtonLabel = "Daha Fazla Bilgi";    
	
	     disclaimerText = 
	   	 "<html>VoxForge SpeechSubmission Applet - Copyright (C) 2007-2014 VoxForge<br> Bu programın " +
	   	 "KESİNLİKLE HİÇBİR GARANTİSİ YOKTUR; PAZARLANABİLİRLİK yahut <br> " +
	   	 "BELLİ BİR AMAÇ İÇİN UYGUNLUK garantisi dahi yoktur.<br>Daha fazla bilgi için " +
	   	 "\"Hakkında\" düğmesine basın:";
	     aboutButtonLabel = "Hakkında";
	    
	     recordButton = "Kaydet"; 
	     stopButton = "Dur"; 
	     playButton = "Oynat"; 
	     
	     peakWarningLabel =  "Uyarı: girdi çok yüksek sesli olabilir"; 
	     sampleGraphFileLabel = "Dosya: ";
	     sampleGraphLengthLabel = "  Uzunluk: ";
	     sampleGraphPositionLabel ="  Pozisyon: ";
	     
	     uploadingMessageLabel = "Gönderiliyor...";
	     uploadCompletedMessageLabel = "Yükleme tamamlandı... Gönderdiğiniz için teşekkür ederiz.";
    } 

	private void Bulgarian () {
		  usernamePanelLabel = "потребителско  име:"; 
	         usernamePanelText = "(оставете празно, за да попълните анонимно)"; 
	          
	         copyrightName = "Асоциация за свободен софтуеър"; 
	         gplAccepted = "Да"; 
	         
	         pleaseSelect = "Изберете"; 
	         notApplicable = "неизвестен"; 
	          
	         genderPanelLabel = "Пол:"; 
	         genderSelection = new String [3]; 
	         genderSelection[0] = pleaseSelect;    
	         genderSelection[1] = "Мъж";     
	         genderSelection[2] = "Жена";  
	     
	         ageRangePanelLabel = "Възраст:"; 
	         ageSelection = new String [4]; 
	         ageSelection[0] = pleaseSelect;   
	         ageSelection[1] = "Младеж/Девойка";   
	         ageSelection[2] = "Възрастен";  
	         ageSelection[3] = "Трета Възраст";  
	     
	         dialectPanelLabel = " Регион:"; 
	         dialectSelection = new String [4]; 
	         
	         dialectSelection[0] = pleaseSelect; 
	         dialectSelection[1] = "Източни говори (на изток  от 'я'-товата граница – на 'я')";     
	         dialectSelection[2] = "Западни говори  (на запад от 'я'-товата граница – на 'е')";    
	         dialectSelection[3] = "Други"; 
	         
	         microphonePanelLabel = "Тип микрофон:"; 
	         microphoneSelection = new String [9]; 
	         microphoneSelection[0] = pleaseSelect;   
	         microphoneSelection[1] = "Микрофон интегриран в слушалки";     
	         microphoneSelection[2] = "USB микрофон интегриран в слушалки";    
	         microphoneSelection[3] = "Настолен компютърен микрофон";   
	         microphoneSelection[4] = "USB настолен компютърен микрофон";   
	         microphoneSelection[5] = "Вграден в лаптопа микрофон";  
	         microphoneSelection[6] = "Уеб камера-микрофон";       
	         microphoneSelection[7] = "Студиен микрофон";  
	         microphoneSelection[8] = "Друг";  
	         
	         uploadText = "<html>С натискане на бутона \"Upload\", Вие преотстъпвате авторското си право върху записаната реч на <br> " 
	            + "Асоциацията за свободен софтуеър, и лицензирате вашия запис със GNU Public Licence (\"GPL\"):" ; 
	         uploadButtonLabel = "Качи"; 
	         
	         moreInfoText = "За повече информация за авторски права и GPL, натиснете тук:"; 
	         moreInfoButtonLabel = "За повече информация";     
	     
	         disclaimerText =  
	            "<html>VoxForge SpeechSubmission Applet - Copyright (C) 2007-2014 VoxForge<br>" 
	            +"Тази програма се разпространява без АБСОЛЮТНО НИКАКВА ГАРАНЦИЯ; дори без подразбиращата се <br> " 
	            +"гаранция за ПРОДАВАЕМОСТ или В СЪОТВЕТСТВИЕ С ОПРЕДЕЛЕНИ ЦЕЛИ .  За<br>"  
	            +" повече информация натиснете бутона \"Лиценз\":"; 
	         aboutButtonLabel = "Лиценз"; 
	         
	         recordButton = "Запис";  
	         stopButton = "Стоп";  
	         playButton = "Прослушване";  
	          
	         peakWarningLabel =  "Внимание: входният сигнал може да е твърде силен";  
	         sampleGraphFileLabel = "Файл: "; 
	         sampleGraphLengthLabel = "  Продължителност: "; 
	         sampleGraphPositionLabel ="  Позиция: ";    

	      uploadingMessageLabel = "Качване..."; 
	         uploadCompletedMessageLabel = "Качването завършено... Благодарим ви за записа!"; 
	}
	
	/**
	 * Labels for Ukrainian localization.
	 * @author Bossly
	 * */
	private void Ukrainian()
	{
	     usernamePanelLabel = "Користувач:";
	     usernamePanelText = "(залишити пустим, щоб залити анонімно)";
	     
	     copyrightName = "Асоціація Вільного Програмного Забезпечення";
	     gplAccepted = "Так";
	    
	     pleaseSelect = "Оберіть:";
	     notApplicable = "невідомо";
	     
	     genderPanelLabel = "Стать:";
	     genderSelection = new String [3];
	     genderSelection[0] = pleaseSelect;   
	     genderSelection[1] = "Чоловік";    
	     genderSelection[2] = "Жінка"; 
    
	     ageRangePanelLabel = "Вік:";
	     ageSelection = new String [4];
	     ageSelection[0] = pleaseSelect;  
	     ageSelection[1] = "До 25 років";  
	     ageSelection[2] = "До 55 років"; 
	     ageSelection[3] = "Від 55 років і більше"; 
	
	     dialectPanelLabel = "Діалект";
	     dialectSelection = new String [5];
	     dialectSelection[0] = pleaseSelect;    
	     dialectSelection[1] = "Північне(Чернігів,Житомир,Рівне,Волинь)";    
	     dialectSelection[2] = "Південно-західне(Закарпаття,Луцьк,Львів,Вінниця)";
	     dialectSelection[3] = "Південно-східне(Донецьк,Крим,Київ,Суми,Одеса)"; 
	     dialectSelection[4] = "Інший"; // other
	    
	     microphonePanelLabel = "Тип мікрофона:";
	     microphoneSelection = new String [9];
	     microphoneSelection[0] = pleaseSelect;  
	     microphoneSelection[1] = "Ручний мікрофон";    
         microphoneSelection[2] = "Ручний мікрофон через USB";   
         microphoneSelection[3] = "Настільний мікрофон";  
         microphoneSelection[4] = "Настільний мікрофон через USB";  
         microphoneSelection[5] = "Вбудований мікрофон"; 
         microphoneSelection[6] = "Мікрофон з камери";      
         microphoneSelection[7] = "Студійний мікрофон"; 
         microphoneSelection[8] = "Інший"; 
	    
         uploadText = "<html>Нажимаючи кнопку \"Відправити\", ви передаєте права на записану інформацію<br> "
             + "Асоціації Вільного Програмного Забезпечення, та дозволяєте поширювати її в рамках GNU Public Licence (\"GPL\"):" ;
         uploadButtonLabel = "Відправити";
         
         moreInfoText = "Для додаткової інформації про Авторське право та GPL, натисніть тут:";
         moreInfoButtonLabel = "Додаткова інформація";

         disclaimerText = 
             "<html>VoxForge SpeechSubmission Applet - Авторське право© 2007-2014 VoxForge<br>"
             +"Ця програма поставляється БЕЗ БУДЬ-ЯКИХ ГАРАНТІЙ; він може не видповідати<br> "
             +"заявленим до нього вимогам..  Для отримання детальнішої інформації</br>" 
             +"натисніть кнопку \"Про програму\":";
         aboutButtonLabel = "Про програму";
         
         recordButton = "Записати"; 
         stopButton = "Зупинити"; 
         playButton = "Відтворити"; 
          
         peakWarningLabel =  "Обережно: записаний звук може бути дуже гучний"; 
         sampleGraphFileLabel = "Файл: ";
         sampleGraphLengthLabel = "  Довжина: ";
         sampleGraphPositionLabel ="  Позиція: ";
         
         uploadingMessageLabel = "Відправляється...";
         uploadCompletedMessageLabel = "Відправлено... Дякуємо за допомогу!";
    }
	
	private void Catalan() {
	     usernamePanelLabel = "Nom d'usuari:";
	     usernamePanelText = "(deixeu-lo buit per remandre anònim)";
	     
	     copyrightName = "Free Software Foundation";
	     gplAccepted = "Sí";
	    
	     pleaseSelect = "Trieu-ne un";
	     notApplicable = "desconegut";
	     
	     genderPanelLabel = "Gènere:";
	     genderSelection = new String [3];
	     genderSelection[0] = pleaseSelect;   
	     genderSelection[1] = "Masculí";    
	     genderSelection[2] = "Femení"; 
   
	     ageRangePanelLabel = "Edat:";
	     ageSelection = new String [4];
	     ageSelection[0] = pleaseSelect;  
	     ageSelection[1] = "Jove";  
	     ageSelection[2] = "Adult"; 
	     ageSelection[3] = "Tercera edat"; 
	
	     dialectPanelLabel = "Dialecte:";
	     dialectSelection = new String [7];
	     dialectSelection[0] = pleaseSelect;    
	     dialectSelection[1] = "Central";
            dialectSelection[2] = "Nord-occidental";
	     dialectSelection[3] = "Valencià";
	     dialectSelection[4] = "Baleàric";
	     dialectSelection[5] = "Septentrional (rosellonès)"; 
	     dialectSelection[6] = "Altre";
	    
	     microphonePanelLabel = "Tipus de micròfon:";
	     microphoneSelection = new String [9];
	     microphoneSelection[0] = pleaseSelect;  
	     microphoneSelection[1] = "Micròfon d'auriculars";    
	     microphoneSelection[2] = "Micròfon d'auriculars USB";   
	     microphoneSelection[3] = "Micròfon d'escriptori";
	     microphoneSelection[4] = "Micròfon d'escriptori USB";
	     microphoneSelection[5] = "Micròfon incorporat al portàtil"; 
	     microphoneSelection[6] = "Micròfon de càmera web";  
	     microphoneSelection[7] = "Micròfon d'estudi"; 
	     microphoneSelection[8] = "Altre"; 
	    
	     uploadText = "<html>Fent clic al botó \"Penja\", consentiu a assignar els drets d'autor de les vostres gravacions a <br> "
	        + "la Free Software Foundation i cediu la vostra tramesa sota la Llicència Pública General de GNU (\"GPL\"):" ;
	     uploadButtonLabel = "Penja";
	    
	     moreInfoText = "Per a més informació en quant a drets d'autor i la GPL, feu clic aquí:";
	     moreInfoButtonLabel = "Més informació";
	
	     disclaimerText = 
	   	 "<html>VoxForge SpeechSubmission Applet - Copyright (C) 2007-2014 VoxForge<br>"
	   	 +"Aquest programa es distribueix SENSE CAP GARANTIA; ni tant sols amb la garantia de<br> "
	   	 +"COMERCIALITZABILITAT O APTITUD PER A PROPÒSITS DETERMINATS.  Per a més<br>" 
	   	 +"detalls feu clic al botó \"Quant a\":";
	     aboutButtonLabel = "Quant a";
	    
	     recordButton = "Enregistra"; 
	     stopButton = "Atura"; 
	     playButton = "Reprodueix"; 
	     
	     peakWarningLabel =  "Avís: pot ser que el volum sigui massa elevat"; 
	     sampleGraphFileLabel = "Fitxer: ";
	     sampleGraphLengthLabel = "  Durada: ";
	     sampleGraphPositionLabel ="  Posició: ";
	     
	     uploadingMessageLabel = "S'està penjant les gravacions...";
	     uploadCompletedMessageLabel = "Càrrega completada... Gràcies per la vostra contribució!";
	}
	
	private void Croatian() {
	     usernamePanelLabel = "Korisničko ime";
	     usernamePanelText = "(ako želite biti anonimni ostavite prazno)";
	     
	     copyrightName = "Free Software Foundation";
	     gplAccepted = "Da";
	    
	     pleaseSelect = "Odaberite";
	     notApplicable = "nepoznato";
	     
	     genderPanelLabel = "Spol:";
	     genderSelection = new String [3];
	     genderSelection[0] = pleaseSelect;   
	     genderSelection[1] = "Muško";    
	     genderSelection[2] = "Žensko"; 
   
	     ageRangePanelLabel = "Dobna skupina:";
	     ageSelection = new String [4];
	     ageSelection[0] = pleaseSelect;  
	     ageSelection[1] = "Djeca";  
	     ageSelection[2] = "Odrasli"; 
	     ageSelection[3] = "Stari"; 
	
	     dialectPanelLabel = "Dijalekt:";
	     dialectSelection = new String [5];
	     dialectSelection[0] = pleaseSelect;    
	     dialectSelection[1] = "Štokavsko narječje";    
	     dialectSelection[2] = "Kajkajvsko narječje";    // other
	     dialectSelection[3] = "Čakavsko narječje";  
	     dialectSelection[4] = "Other";
	    
	     microphonePanelLabel = "Tip mikrofona:";
	     microphoneSelection = new String [9];
	     microphoneSelection[0] = pleaseSelect;  
	     microphoneSelection[1] = "Headset mikorfon";    
	     microphoneSelection[2] = "USB Headset mikoron";   
	     microphoneSelection[3] = "Desktop Boom mic";  
	     microphoneSelection[4] = "USB Desktop Boom mic";  
	     microphoneSelection[5] = "Laptop Built-in mic"; 
	     microphoneSelection[6] = "WebCam mikrofon";      
	     microphoneSelection[7] = "Studio mifrofon"; 
	     microphoneSelection[8] = "Other"; 
	    
	     uploadText = "<html> Ako kliknete \"Upload\" gumb, vi  se slažete da će te postpisati autorsko pravo (Copyright)  za vaš snimljeni audio zapis na <br> "
	        + "Free Software Foundation, i da će lincenca vašeg snimlčjenog audio zapisa biti pod GNU Public Licence (\"GPL\"):" ;
	     uploadButtonLabel = "Slanje";
	    
	     moreInfoText = "Za više informacija o autorskom pravu (Copyright) i GPL, kliknite ovdje:";
	     moreInfoButtonLabel = "Više informacija";    
	
	     disclaimerText = 
	   	 "<html>VoxForge SpeechSubmission Applet - Copyright (C) 2007-2014 VoxForge<br>"
	   	 +"Ovaj program dolazi bez ikakve odgovrnosti i garancije;<br> "
	   	 +"jamstva od prodaje ili prikladnosti ZA ODREĐENU SVRHU. Za<br>" 
	   	 +"više detalja kliknite gumb \"Više\":";
	     aboutButtonLabel = "Više";
	    
	     recordButton = "Snimaj"; 
	     stopButton = "Stani"; 
	     playButton = "Počni"; 
	     
	     peakWarningLabel =  "Upozorenje: preglasno	"; 
	     sampleGraphFileLabel = "Datoteka: ";
	     sampleGraphLengthLabel = "  Dužina: ";
	     sampleGraphPositionLabel ="  Pozicija: ";
	     
	     uploadingMessageLabel = "Slanje...";
	     uploadCompletedMessageLabel = "Slanje završeno... Hvala vam na pomoći!";
	}

	private void Albanian() {
		usernamePanelLabel = "Emri i përdoruesit:";
		usernamePanelText = "(lëre bosh për t'u paraqitur në mënyrë anonime)";
		
		copyrightName = "Free Software Foundation";
		gplAccepted = "Po";
		
		pleaseSelect = "Ju letemi zgjedhni";
		notApplicable = "i panjohur";
		
		genderPanelLabel = "Gjinia:";
		genderSelection = new String [3];
		genderSelection[0] = pleaseSelect;
		genderSelection[1] = "Mashkull";
		genderSelection[2] = "Femër";
		
		ageRangePanelLabel = "Mosha:";
		ageSelection = new String [4];
		ageSelection[0] = pleaseSelect;
		ageSelection[1] = "I mitur";
		ageSelection[2] = "I rritur";
		ageSelection[3] = "I moshuar";
		
		dialectPanelLabel = "Dialekti:";
		dialectSelection = new String [2];
		dialectSelection[0] = pleaseSelect;
		dialectSelection[1] = "Gjuhë standarde";
		
		microphonePanelLabel = "Lloji i mikrofonit:";
		microphoneSelection = new String [9];
		microphoneSelection[0] = pleaseSelect;
		microphoneSelection[1] = "Kufje";
		microphoneSelection[2] = "USB kufje";
		microphoneSelection[3] = "Desktop Boom";
		microphoneSelection[4] = "USB Desktop Boom";
		microphoneSelection[5] = "Llaptop Built-in";
		microphoneSelection[6] = "WebCam";
		microphoneSelection[7] = "Studio";
		microphoneSelection[8] = "Tjeter";
		
		uploadText = "<html>Duke klikuar butonin \"Ngarko\", ju pajtoheni që Fondacioni Free Software të ketë të drejtë autorësie mbi fjalimin tuaj të regjistruar <br> "
		+ "dhe lejoni që ky fjalim të licensohet sipas Licencës Publike GNU (\"GPL\"):" ;
		uploadButtonLabel = "Ngarko";
		
		moreInfoText = "Për më shumë informacion mbi të drejtat e autorit dhe GPL, klikoni këtu:";
		moreInfoButtonLabel = "Më shumë informacion";
		
		disclaimerText =
		"<html>VoxForge SpeechSubmission Applet - Copyright (C) 2007-2014 VoxForge<br>"
		+"Ky program vjen ABSOLUTISHT PA ASNJË lloj autorizimi; madje edhe pa autorizimin për ta shitur ose<br>"
		+"përdorur për ndonjë qëllim të caktuar<br> "
		+"Për më shumë detaje klikoni butonin: \"Më shumë\" ";
		aboutButtonLabel = "Më shumë";
		
		recordButton = "Regjistro";
		stopButton = "Ndal";
		playButton = "Fillo";
		
		peakWarningLabel = "Kujdes: zëri mund të jetë shumë ilartë";
		sampleGraphFileLabel = "Skedari: ";
		sampleGraphLengthLabel = " Gjatësia: ";
		sampleGraphPositionLabel =" Pozicioni: ";
		
		uploadingMessageLabel = "Duke u ngarkuar...";
		uploadCompletedMessageLabel = "Ngarkimi përfundoi...Ju faleminderit për kontributin tuaj!";
		}
	
	/**
	 * Labels for Belarusian localization.
	 * @author begemotv2718
	 * */
	private void Belarusian()
	{
		usernamePanelLabel = "Карыстальнік:";
		usernamePanelText = "(пакінуць пустым, каб зайсці ананімна)";
		
		copyrightName = "Фонд вольнага праграмнага забеспячэння";
		gplAccepted = "Так";
		
		pleaseSelect = "Абярыце:";
		notApplicable = "невядома";
		
		genderPanelLabel = "Пол:";
		genderSelection = new String [3];
		genderSelection[0] = pleaseSelect;   
		genderSelection[1] = "Мужчынскі";	  
		genderSelection[2] = "Жаночы"; 
	
		ageRangePanelLabel = "Узрост:";
		ageSelection = new String [4];
		ageSelection[0] = pleaseSelect;  
		ageSelection[1] = "Да 25 гадоў";  
		ageSelection[2] = "Да 55 гадоў"; 
		ageSelection[3] = "Больш за 55 гадоў"; 
	
		dialectPanelLabel = "Дыялект (вымаўленне)";
		dialectSelection = new String [5];
		dialectSelection[0] = pleaseSelect;	
		dialectSelection[1] = "Сярэднебеларускі";	  
		dialectSelection[2] = "Палескі";
		dialectSelection[3] = "Паўночна-усходні (Віцебск)";
		dialectSelection[3] = "Паўднёва-заходні (Брэст)";
		dialectSelection[4] = "Іншы"; // other
		
		microphonePanelLabel = "Тып мікрафона:";
		microphoneSelection = new String [9];
		microphoneSelection[0] = pleaseSelect;  
		microphoneSelection[1] = "Гарнітура";	  
		microphoneSelection[2] = "USB гарнітура";	 
		microphoneSelection[3] = "Настольны мікрафон";  
		microphoneSelection[4] = "Настольны мікрафон праз USB";  
		microphoneSelection[5] = "Убудаваны мікрофон ноўтбука"; 
		microphoneSelection[6] = "Мікрафон ад вэбкамеры";		
		microphoneSelection[7] = "Студыйны мікрафон"; 
		microphoneSelection[8] = "Іншы"; 
		
		uploadText = "<html>Націскаючы кнопку \"Даслаць\", вы передаеце права на запiсаную інфармацыю<br> "
		    + "Фонду Вольнага Праграмнага Забеспячэння, а таксама дазваляеце распаўсюджваць яе ў межах GNU Public Licence (\"GPL\"):" ;
		uploadButtonLabel = "Даслаць";
		
		moreInfoText = "Каб атрымаць дадатковаю інфармацыю пра Аўтарскае права ці GPL, націснуць тут:";
		moreInfoButtonLabel = "Дадатковая інфармацыя";

		disclaimerText = 
		    "<html>VoxForge SpeechSubmission Applet - © 2007-2014 VoxForge<br>"
		    +"Гэта праграма распаўсюджваецца БЕЗ ГАРАНТЫЙ; яна нават можа не адпавядаць<br> "
		    +"абвешчанай у яе назве мэце.. Каб атрымаць дадатковую інфармацыю</br>" 
		    +"націсніце кнопку \"Аб праграме\":";
		aboutButtonLabel = "Аб праграме";
		
		recordButton = "Запісаць"; 
		stopButton = "Спыніць"; 
		playButton = "Прайграць"; 
		 
		peakWarningLabel =  "Асцярожна: запіс можа быць занадта гучным!"; 
		sampleGraphFileLabel = "Файл: ";
		sampleGraphLengthLabel = "  Даўжыня: ";
		sampleGraphPositionLabel ="  Пазіцыя: ";
		
		uploadingMessageLabel = "Дасылаецца...";
		uploadCompletedMessageLabel = "Даслана... Дзякуем за дапамогу!!";
	}
	
	public String getUsernamePanelLabel() {
		return usernamePanelLabel;
	}

	public String getUsernamePanelText() {
		return usernamePanelText;
	}

	public String getCopyrightName() {
		return copyrightName;
	}

	public String getGplAccepted() {
		return gplAccepted;
	}

	public String getPleaseSelect() {
		return pleaseSelect;
	}

	public String getNotApplicable() {
		return notApplicable;
	}

	public String getGenderPanelLabel() {
		return genderPanelLabel;
	}

	public String[] getGenderSelection() {
		return genderSelection;
	}

	public String getAgeRangePanelLabel() {
		return ageRangePanelLabel;
	}

	public String[] getAgeSelection() {
		return ageSelection;
	}

	public String getDialectPanelLabel() {
		return dialectPanelLabel;
	}

	public String[] getDialectSelection() {
		return dialectSelection;
	}

	public String getMicrophonePanelLabel() {
		return microphonePanelLabel;
	}

	public String[] getMicrophoneSelection() {
		return microphoneSelection;
	}

	public String getUploadText() {
		return uploadText;
	}

	public String getUploadButtonLabel() {
		return uploadButtonLabel;
	}

	public String getMoreInfoText() {
		return moreInfoText;
	}

	public String getMoreInfoButtonLabel() {
		return moreInfoButtonLabel;
	}

	public String getDisclaimerText() {
		return disclaimerText;
	}

	public String getAboutButtonLabel() {
		return aboutButtonLabel;
	}

	public String getRecordButton() {
		return recordButton;
	}

	public String getStopButton() {
		return stopButton;
	}

	public String getPlayButton() {
		return playButton;
	}

	public String getPeakWarningLabel() {
		return peakWarningLabel;
	}

	public String getSampleGraphFileLabel() {
		return sampleGraphFileLabel;
	}

	public String getSampleGraphLengthLabel() {
		return sampleGraphLengthLabel;
	}

	public String getSampleGraphPositionLabel() {
		return sampleGraphPositionLabel;
	}
	
	public String getUploadingMessageLabel() {
		return uploadingMessageLabel;
	}
	public String getUploadCompletedMessageLabel() {
		return uploadCompletedMessageLabel;
	}
}

